/**
 *
 */
package de.hybris.bigday.facades.calls.impl;

import de.hybris.bigday.core.model.StoreModel;
import de.hybris.bigday.core.service.calls.CallService;
import de.hybris.bigday.facades.calls.CallFacade;
import de.hybris.platform.commercefacades.customer.CustomerFacade;
import de.hybris.platform.commercefacades.user.data.CustomerData;
import de.hybris.platform.commerceservices.strategies.CustomerNameStrategy;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;


/**
 * @author Chinni
 *
 */
public class DefaultCallFacade implements CallFacade
{
	@Resource(name = "customerFacade")
	protected CustomerFacade customerFacade;


	@Autowired
	CallService callService;


	/**
	 * @return the customerFacade
	 */
	public CustomerFacade getCustomerFacade()
	{
		return customerFacade;
	}

	/**
	 * @param customerFacade
	 *           the customerFacade to set
	 */
	public void setCustomerFacade(final CustomerFacade customerFacade)
	{
		this.customerFacade = customerFacade;
	}

	/**
	 * @return the callService
	 */
	public CallService getCallService()
	{
		return callService;
	}

	/**
	 * @param callService
	 *           the callService to set
	 */
	public void setCallService(final CallService callService)
	{
		this.callService = callService;
	}

	/**
	 * @return the customerNameStrategy
	 */
	public CustomerNameStrategy getCustomerNameStrategy()
	{
		return customerNameStrategy;
	}

	/**
	 * @param customerNameStrategy
	 *           the customerNameStrategy to set
	 */
	public void setCustomerNameStrategy(final CustomerNameStrategy customerNameStrategy)
	{
		this.customerNameStrategy = customerNameStrategy;
	}

	@Autowired
	private CustomerNameStrategy customerNameStrategy;

	@Override
	public void insertUser()
	{
		final CustomerData customerData = customerFacade.getCurrentCustomer();
		final String name = customerNameStrategy.getName(customerData.getFirstName(), customerData.getLastName());
		/* final String uid = customerData.getUid(); */
		System.out.println(name);
		callService.insertUserService(name, customerFacade.generateGUID());
	}

	@Override
	public List getStoreDetails()
	{
		final List<StoreModel> list = callService.getStoreDetails();
		return list;
	}

}
