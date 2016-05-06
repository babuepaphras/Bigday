/**
 *
 */
package de.hybris.bigday.core.event;

import de.hybris.platform.core.model.product.ProductModel;
import de.hybris.platform.servicelayer.event.events.AbstractEvent;


/**
 * @author Balagani
 *
 */
public class CronJobMailEvent extends AbstractEvent
{
	private ProductModel product;

	/**
	 * 
	 */
	public CronJobMailEvent()
	{
		// YTODO Auto-generated constructor stub
	}

	/**
	 * @return the product
	 */
	public ProductModel getProduct()
	{
		return product;
	}

	public void setProduct(final ProductModel product)
	{
		this.product = product;
	}


	public CronJobMailEvent(final ProductModel product)
	{
		super();
		this.product = product;

	}







}
