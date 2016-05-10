/**
 *
 */
package de.hybris.bigday.storefront.controllers.pages;



import de.hybris.bigday.facades.store.StoreRegisterFacade;
import de.hybris.platform.acceleratorstorefrontcommons.controllers.pages.AbstractPageController;
import de.hybris.platform.acceleratorstorefrontcommons.forms.StoreRegisterForm;
import de.hybris.platform.cms2.exceptions.CMSItemNotFoundException;
import de.hybris.platform.commercefacades.user.data.StoreRegisterData;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.annotation.Scope;
import org.springframework.security.web.savedrequest.HttpSessionRequestCache;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;


/**
 * @author cas
 *
 */
@Controller
@Scope("tenant")
@RequestMapping(value = "/registerstore")
public class StoreRegisterController extends AbstractPageController
{

	@Resource(name = "storeRegisterFacade")
	private StoreRegisterFacade storeRegisterFacade;

	private HttpSessionRequestCache httpSessionRequestCache;



	@RequestMapping(value = "/storeget", method = RequestMethod.GET)
	public String dostoreRegister(final Model model, final HttpServletRequest request, final StoreRegisterForm form)
			throws CMSItemNotFoundException
	{
		System.out.println("Get Method");


		storeCmsPageInModel(model, getContentPageForLabelOrId("storeregister"));
		setUpMetaDataForContentPage(model, getContentPageForLabelOrId("storeregister"));


		return getViewForPage(model);
		//return ControllerConstants.Views.Pages.Store.StoreRegisterPage;
	}



	@RequestMapping(value = "/storereg", method = RequestMethod.GET)
	public String dostoreRegister(
			/* final HttpServletRequest request, final HttpServletResponse response */ final StoreRegisterForm form,
			final BindingResult bindingResult, final Model model, final HttpServletRequest req, final HttpServletResponse response,
			final RedirectAttributes redirectModel) throws CMSItemNotFoundException
	{
		System.out.println("GET Method");

		model.addAttribute(form);

		final StoreRegisterData data = new StoreRegisterData();
		final String storename = req.getParameter("storename");
		final Double phno = Double.parseDouble(req.getParameter("phno"));
		final String email = req.getParameter("email");

		System.out.println("insertAdd()..........." + storename);
		System.out.println("insertAdd()..........." + phno);
		System.out.println("insertAdd()..........." + email);

		data.setStorename(storename);
		data.setPhno(phno);
		data.setEmail(email);

		getStoreRegisterFacade().storeregisterdata(data);

		storeCmsPageInModel(model, getContentPageForLabelOrId("storeregistersuccess"));
		setUpMetaDataForContentPage(model, getContentPageForLabelOrId("storeregistersuccess"));


		return getViewForPage(model);
	}

	/**
	 * @return
	 */
	protected StoreRegisterFacade getStoreRegisterFacade()
	{
		System.out.println("StoreRegisterFacade");
		return storeRegisterFacade;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see de.hybris.platform.acceleratorstorefrontcommons.controllers.pages.AbstractRegisterPageController#getCmsPage()
	 */
	/*
	 * @Override protected AbstractPageModel getCmsPage() throws CMSItemNotFoundException { // YTODO Auto-generated
	 * method stub System.out.println("AbstractPageModel"); return getContentPageForLabelOrId("storeregister"); }
	 */
	/*
	 * (non-Javadoc)
	 *
	 * @see de.hybris.platform.acceleratorstorefrontcommons.controllers.pages.AbstractRegisterPageController#
	 * getSuccessRedirect(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
	 */
	/*
	 * @Override protected String getSuccessRedirect(final HttpServletRequest request, final HttpServletResponse
	 * response) { // YTODO Auto-generated method stub System.out.println("getSuccessRedirect");
	 *
	 * if (httpSessionRequestCache.getRequest(request, response) != null) { return
	 * httpSessionRequestCache.getRequest(request, response).getRedirectUrl(); } return
	 * ControllerConstants.Views.Pages.Store.StoreRegisterSuccessPage; }
	 */

	/*
	 * (non-Javadoc)
	 *
	 * @see de.hybris.platform.acceleratorstorefrontcommons.controllers.pages.AbstractRegisterPageController#getView()
	 */
	/*
	 * @Override protected String getView() { // YTODO Auto-generated method stub System.out.println("Getview"); return
	 * null; }
	 */

	/*
	 * @Resource(name = "httpSessionRequestCache") public void setHttpSessionRequestCache(final HttpSessionRequestCache
	 * accHttpSessionRequestCache) { System.out.println("setHttpSessionRequestCache"); this.httpSessionRequestCache =
	 * accHttpSessionRequestCache; }
	 */
}