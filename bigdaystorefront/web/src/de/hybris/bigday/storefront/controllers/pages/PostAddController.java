/**
 *
 */
package de.hybris.bigday.storefront.controllers.pages;

import de.hybris.bigday.facades.adds.AddPostFacade;
import de.hybris.bigday.storefront.controllers.ControllerConstants;
import de.hybris.platform.acceleratorstorefrontcommons.controllers.pages.AbstractPageController;
import de.hybris.platform.acceleratorstorefrontcommons.forms.PostAddForm;
import de.hybris.platform.cms2.exceptions.CMSItemNotFoundException;
import de.hybris.platform.commercefacades.user.data.PostAddData;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


/**

 *
 */
@Controller
/* @RequestMapping(value = "/postadd") */
public class PostAddController extends AbstractPageController
{
	@Autowired
	AddPostFacade addPostFacade;


	/**
	 * @return the addPostFacade
	 */
	public AddPostFacade getAddPostFacade()
	{
		return addPostFacade;
	}

	@RequestMapping(value = "/postadd", method = RequestMethod.GET)
	public String postad(final Model model) throws CMSItemNotFoundException
	{
		storeCmsPageInModel(model, getContentPageForLabelOrId("postadd"));
		setUpMetaDataForContentPage(model, getContentPageForLabelOrId("postadd"));
		System.out.println("model return");
		return getViewForPage(model);
	}

	/**
	 * @param addPostFacade
	 *           the addPostFacade to set
	 */
	public void setAddPostFacade(final AddPostFacade addPostFacade)
	{
		this.addPostFacade = addPostFacade;
	}



	/*
	 * @RequestMapping(value = "/postadd", method = RequestMethod.GET) public String postadd() throws
	 * CMSItemNotFoundException {
	 *
	 * System.out.println("postadd()...........");
	 *
	 *
	 * return ControllerConstants.Views.Pages.Adds.PostAddPage; }
	 */

	@RequestMapping(value = "/insertpost", method = RequestMethod.GET)
	public String insertAdd(final PostAddForm form, final BindingResult bindingResult, final Model model)
			throws CMSItemNotFoundException
	{
		System.out.println("insertAdd()...........");
		if (bindingResult.hasErrors())
		{
			return ControllerConstants.Views.Pages.Add.PostAddPage;
		}
		else
		{

			final PostAddData data = new PostAddData();

			/*
			 * final String code = form.getCode(); final String typeofadd = form.getTypeofadd();
			 */
			final String title = form.getAdtitle();
			final String category = form.getCatgory();
			final String description = form.getDescription();
			final String valid = form.getValid();
			final Integer phno = form.getPhno();


			/*
			 * data.setCode(code); data.setTypeofadd(typeofadd);
			 */
			data.setAdtitle(title);
			data.setCatgory(category);
			data.setDescription(description);
			data.setPhno(phno);
			data.setValid(valid);
			System.out.println("insertAdd()....ikjvgbh......." + data.getDescription());
			System.out.println(data.getCatgory());
			addPostFacade.insertAdd(data);
			storeCmsPageInModel(model, getContentPageForLabelOrId("postsuccess"));
			setUpMetaDataForContentPage(model, getContentPageForLabelOrId("postsuccess"));
			System.out.println("model return");
			return getViewForPage(model);
		}
	}



}