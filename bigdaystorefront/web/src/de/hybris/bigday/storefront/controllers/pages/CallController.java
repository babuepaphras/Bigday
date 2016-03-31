
package de.hybris.bigday.storefront.controllers.pages;

import de.hybris.bigday.facades.calls.CallFacade;
import de.hybris.platform.acceleratorstorefrontcommons.annotations.RequireHardLogIn;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
@Scope("tenant")
public class CallController
{
	@Autowired
	CallFacade callFacade;

	@RequestMapping(value = "/store/getacall", method = RequestMethod.GET)
	@RequireHardLogIn
	public String getUserDetails()
	{

		System.out.println("controller-----------");
		callFacade.insertUser();
		return "userdata1";

	}



	@RequestMapping(value = "/store/giveacall", method = RequestMethod.GET)
	public String getMyModal(final ModelMap model)
	{
		final List list = callFacade.getStoreDetails();
		model.addAttribute("phno", list);
		return "userdata2";
	}

}
