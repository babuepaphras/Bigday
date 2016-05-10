/**
 *
 */
package de.hybris.bigday.facades.store;

import de.hybris.bigday.core.model.StoreModel;
import de.hybris.platform.commercefacades.user.data.StoreRegisterData;
import de.hybris.platform.servicelayer.model.ModelService;

import org.springframework.beans.factory.annotation.Autowired;


/**
 * @author cas
 *
 */
public class StoreRegisterFacadeImpl implements StoreRegisterFacade
{
	@Autowired
	private ModelService modelService;


	/**
	 * @return
	 */
	private ModelService getModelService()
	{
		// YTODO Auto-generated method stub
		return null;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * de.hybris.bigday.facades.store.StoreRegisterFacade#storeregisterdata(de.hybris.platform.commercefacades.user.data.
	 * StoreRegisterData)
	 */
	@Override
	public void storeregisterdata(final StoreRegisterData data)
	{

		final StoreModel sm = getModelService().create(StoreModel.class);
		sm.setStoreName(data.getStorename());
		sm.setEmail(data.getEmail());
		sm.setPhno(data.getPhno());
		getModelService().save(sm);

	}




}
