/**
 *
 */
package de.hybris.bigday.core.event;

import de.hybris.bigday.core.model.CronJobMailProcessModel;
import de.hybris.platform.processengine.BusinessProcessService;
import de.hybris.platform.servicelayer.event.impl.AbstractEventListener;
import de.hybris.platform.servicelayer.model.ModelService;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;


/**
 * @author Balagani
 *
 */
public class CronJobMailEventListener extends AbstractEventListener<CronJobMailEvent>
{

	static final private Logger LOG = Logger.getLogger(CronJobMailEventListener.class);


	@Autowired
	private ModelService modelService;
	private BusinessProcessService businessProcessService;

	protected BusinessProcessService getBusinessProcessService()
	{
		return businessProcessService;
	}

	@Required
	public void setBusinessProcessService(final BusinessProcessService businessProcessService)
	{
		this.businessProcessService = businessProcessService;
	}

	/**
	 * @return the modelService
	 */
	protected ModelService getModelService()
	{
		return modelService;
	}

	/**
	 * @param modelService
	 *           the modelService to set
	 */
	@Required
	public void setModelService(final ModelService modelService)
	{
		this.modelService = modelService;
	}


	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * de.hybris.platform.servicelayer.event.impl.AbstractEventListener#onEvent(de.hybris.platform.servicelayer.event
	 * .events.AbstractEvent)
	 */
	@Override
	protected void onEvent(final CronJobMailEvent event)
	{
		final CronJobMailProcessModel cronJobMailProcessModel = (CronJobMailProcessModel) getBusinessProcessService().createProcess(
				"ProductConfirmationEmailProcess-" + event.getProduct().getCode() + "-" + System.currentTimeMillis(),
				"ProductConfirmationEmailProcess");

		cronJobMailProcessModel.setProduct(event.getProduct());
		/*
		 * cronJobMailProcessModel.setProduct(event.getProduct()); cronJobMailProcessModel.
		 * getProduct().getCatalogVersion()
		 */
		cronJobMailProcessModel.setSite(event.getSite());
		/*
		 * cronJobMailProcessModel.setCustomer(event.getCustomer());
		 * cronJobMailProcessModel.setLanguage(event.getLanguage());
		 * cronJobMailProcessModel.setCurrency(event.getCurrency());
		 */
		cronJobMailProcessModel.setStore(event.getBaseStore());




		getModelService().save(cronJobMailProcessModel);
		System.out.println("cronJobMailProcessModel.getProductCode() before save" + cronJobMailProcessModel.getProduct());
		//System.out.println(cronJobMailProcessModel.getStore() + " get Store from basestore. catalogs:"
		//		+ cronJobMailProcessModel.getStore().getCatalogs());
		System.out.println("cronJobMailProcessModel.getProductCode()=========" + cronJobMailProcessModel.getProduct());

		getBusinessProcessService().startProcess(cronJobMailProcessModel);
	}
}