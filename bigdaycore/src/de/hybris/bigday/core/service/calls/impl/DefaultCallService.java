package de.hybris.bigday.core.service.calls.impl;


import de.hybris.bigday.core.model.GetACallModel;
import de.hybris.bigday.core.model.StoreModel;
import de.hybris.bigday.core.service.calls.CallService;
import de.hybris.platform.servicelayer.model.ModelService;
import de.hybris.platform.servicelayer.search.FlexibleSearchService;
import de.hybris.platform.servicelayer.search.SearchResult;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Required;


/**
 * @author admin
 *
 */
public class DefaultCallService implements CallService
{
	@Resource(name = "modelService")
	ModelService modelService;
	String cuid;
	String userName;
	String email;
	Long Phno;
	FlexibleSearchService flexibleSearchService;

	/**
	 * @return the modelService
	 */
	public ModelService getModelService()
	{
		return modelService;
	}

	/**
	 * @param modelService
	 *           the modelService to set
	 */
	public void setModelService(final ModelService modelService)
	{
		this.modelService = modelService;
	}

	/**
	 * @return the cuid
	 */
	public String getCuid()
	{
		return cuid;
	}

	/**
	 * @param cuid
	 *           the cuid to set
	 */
	public void setCuid(final String cuid)
	{
		this.cuid = cuid;
	}

	/**
	 * @return the userName
	 */
	public String getUserName()
	{
		return userName;
	}

	/**
	 * @param userName
	 *           the userName to set
	 */
	public void setUserName(final String userName)
	{
		this.userName = userName;
	}

	/**
	 * @return the email
	 */
	public String getEmail()
	{
		return email;
	}



	/**
	 * @param email
	 *           the email to set
	 */
	public void setEmail(final String email)
	{
		this.email = email;
	}


	/**
	 * @return the phno
	 */
	public Long getPhno()
	{
		return Phno;
	}

	/**
	 * @param phno
	 *           the phno to set
	 */
	public void setPhno(final Long phno)
	{
		Phno = phno;
	}

	@Override
	@Required
	public void setFlexibleSearchService(final FlexibleSearchService flexibleSearchService)
	{
		this.flexibleSearchService = flexibleSearchService;
	}

	@Override
	@SuppressWarnings("boxing")
	public void insertUserService(final String name, final String uid)
	{
		final GetACallModel modl = modelService.create(GetACallModel.class);
		System.out.println("in service................" + modelService);
		System.out.println("in service................" + name);
		System.out.println("in service................" + uid);

		System.out.println("in service   GetACallModel  ................" + modl);

		email = "kvrpscmr@gmail.com";
		Phno = (long) 8186915;
		userName = name;
		cuid = uid;

		modl.setUid(cuid);
		modl.setName(name);
		modl.setUsername(userName);
		modl.setPhno(Phno);
		modl.setEmail(email);


		modelService.save(modl);

		System.out.println("in service   GetACallModel  ................" + modl);

	}

	final StringBuilder stringBuilder = new StringBuilder();

	public List<StoreModel> getStoreDetails()
	{
		/* final FlexibleSearchQuery query = new FlexibleSearchQuery(stringBuilder.toString()); */
		final String query = "SELECT {" + StoreModel.PHNO + "} FROM {" + StoreModel._TYPECODE + "}";
		final SearchResult<StoreModel> searchResult = flexibleSearchService.search(query);
		return searchResult.getResult();
	}

}
