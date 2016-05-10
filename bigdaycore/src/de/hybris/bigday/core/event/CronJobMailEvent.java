/**
 *
 */
package de.hybris.bigday.core.event;

import de.hybris.platform.commerceservices.event.AbstractCommerceUserEvent;
import de.hybris.platform.core.model.product.ProductModel;


/**
 * @author Balagani
 *
 */
public class CronJobMailEvent extends AbstractCommerceUserEvent
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
