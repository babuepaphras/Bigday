/**
 *
 */
package de.hybris.bigday.facades.adds.impl;

import de.hybris.bigday.core.service.adds.PostAddService;
import de.hybris.bigday.facades.adds.AddPostFacade;
import de.hybris.platform.commercefacades.user.data.PostAddData;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;


/**
 * @author Chinni
 *
 */
public class AddPostFacadeImpl implements AddPostFacade
{
	@Autowired
	public PostAddService postaddservice;

	/**
	 * @return the postaddservice
	 */
	public PostAddService getPostaddservice()
	{
		return postaddservice;
	}

	/**
	 * @param postaddservice
	 *           the postaddservice to set
	 */
	public void setPostaddservice(final PostAddService postaddservice)
	{
		this.postaddservice = postaddservice;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * de.hybris.bigday.facades.adds.AddPostFacade#insertAdd(de.hybris.platform.commercefacades.user.data.PostAddData)
	 */
	@Override
	public void insertAdd(final PostAddData data)
	{
		System.out.println("insertAdd()  in Facade...........");

		postaddservice.insertAdd(data);

	}

	/*
	 * (non-Javadoc)
	 *
	 * @see de.hybris.bigday.facades.adds.AddPostFacade#selectAdd()
	 */
	@Override
	public List selectAdd()
	{
		final List searchresult = postaddservice.selectAdd();
		return searchresult;
	}



}
