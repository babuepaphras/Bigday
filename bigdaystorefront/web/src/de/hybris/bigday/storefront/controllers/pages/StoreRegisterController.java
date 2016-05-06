/**
 *
 */
package de.hybris.bigday.storefront.controllers.pages;



import de.hybris.bigday.facades.store.StoreRegisterFacade;
import de.hybris.bigday.storefront.controllers.ControllerConstants;
import de.hybris.platform.acceleratorstorefrontcommons.controllers.pages.AbstractRegisterPageController;
import de.hybris.platform.acceleratorstorefrontcommons.forms.StoreRegisterForm;
import de.hybris.platform.cms2.exceptions.CMSItemNotFoundException;
import de.hybris.platform.cms2.model.pages.AbstractPageModel;
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
@RequestMapping(value = "/store")
public class StoreRegisterController extends AbstractRegisterPageController
{

	@Resource(name = "storeRegisterFacade")
	private StoreRegisterFacade storeRegisterFacade;

	private HttpSessionRequestCache httpSessionRequestCache;



	@RequestMapping(value = "/storeget", method = RequestMethod.GET)
	public String dostoreRegister(final Model model, final HttpServletRequest request, final StoreRegisterForm form)
			throws CMSItemNotFoundException
	{
		System.out.println("Get Method");
		/*
		 * final StoreRegisterData data = new StoreRegisterData();
		 *
		 * model.addAttribute(form);
		 *
		 * data.setStorename(form.getStorename()); data.setContactperson(form.getContactperson());
		 * data.setContactpersonphonenumber(form.getContactpersonphonenumber());
		 * data.setStorenumber(form.getStorenumber()); data.setAddress(form.getAddress());
		 *
		 *
		 *
		 *
		 * final String storename = request.getParameter("storename"); final String contactperson =
		 * request.getParameter("contactperson"); final String contactpersonphonenumber =
		 * request.getParameter("contactpersonphonenumber"); final String storenumber =
		 * request.getParameter("storenumber"); final String address = request.getParameter("address");
		 *
		 *
		 *
		 * data.setStorename("storename"); data.setContactperson("contactperson");
		 * data.setContactpersonphonenumber("contactpersonphonenumber"); data.setStorenumber("storenumber");
		 * data.setAddress("address");
		 *
		 * getStoreRegisterFacade().storeregisterdata(data);
		 */
		/*
		 * storeCmsPageInModel(model, getContentPageForLabelOrId("postsuccess")); setUpMetaDataForContentPage(model,
		 * getContentPageForLabelOrId("postsuccess")); System.out.println("model return"); return getViewForPage(model);
		 */
		return ControllerConstants.Views.Pages.Store.StoreRegisterPage;
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
		final String contactperson = req.getParameter("contactperson");
		final String contactpersonnumber = req.getParameter("contactpersonphonenumber");
		final String storenumber = req.getParameter("storenumber");
		final String address = req.getParameter("address");

		System.out.println("insertAdd()..........." + storename);
		System.out.println("insertAdd()..........." + contactperson);
		System.out.println("insertAdd()..........." + contactpersonnumber);
		System.out.println("insertAdd()..........." + storenumber);
		System.out.println("insertAdd()..........." + address);

		data.setStorename(storename);
		/*
		 * data.setContactperson(contactperson); data.setContactpersonphonenumber(contactpersonnumber);
		 * data.setStorenumber(storenumber); data.setAddress(address);
		 */

		getStoreRegisterFacade().storeregisterdata(data);

		/*
		 * storeCmsPageInModel(model, getContentPageForLabelOrId("postsuccess")); setUpMetaDataForContentPage(model,
		 * getContentPageForLabelOrId("postsuccess")); System.out.println("model return"); return getViewForPage(model);
		 */
		return getSuccessRedirect(req, response);
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
	@Override
	protected AbstractPageModel getCmsPage() throws CMSItemNotFoundException
	{
		// YTODO Auto-generated method stub
		System.out.println("AbstractPageModel");
		return getContentPageForLabelOrId("postadd");
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see de.hybris.platform.acceleratorstorefrontcommons.controllers.pages.AbstractRegisterPageController#
	 * getSuccessRedirect(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
	 */
	@Override
	protected String getSuccessRedirect(final HttpServletRequest request, final HttpServletResponse response)
	{
		// YTODO Auto-generated method stub
		System.out.println("getSuccessRedirect");

		if (httpSessionRequestCache.getRequest(request, response) != null)
		{
			return httpSessionRequestCache.getRequest(request, response).getRedirectUrl();
		}
		return ControllerConstants.Views.Pages.Store.StoreRegisterSuccessPage;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see de.hybris.platform.acceleratorstorefrontcommons.controllers.pages.AbstractRegisterPageController#getView()
	 */
	@Override
	protected String getView()
	{
		// YTODO Auto-generated method stub
		System.out.println("Getview");
		return null;
	}

	@Resource(name = "httpSessionRequestCache")
	public void setHttpSessionRequestCache(final HttpSessionRequestCache accHttpSessionRequestCache)
	{
		System.out.println("setHttpSessionRequestCache");
		this.httpSessionRequestCache = accHttpSessionRequestCache;
	}

}