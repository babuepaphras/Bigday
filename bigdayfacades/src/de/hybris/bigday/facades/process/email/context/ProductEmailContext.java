/**
 *
 */
package de.hybris.bigday.facades.process.email.context;

import de.hybris.bigday.core.model.CronJobMailProcessModel;
import de.hybris.platform.acceleratorservices.model.cms2.pages.EmailPageModel;
import de.hybris.platform.acceleratorservices.process.email.context.AbstractEmailContext;
import de.hybris.platform.basecommerce.model.site.BaseSiteModel;
import de.hybris.platform.commercefacades.product.data.ProductData;
import de.hybris.platform.core.model.c2l.LanguageModel;
import de.hybris.platform.core.model.product.ProductModel;
import de.hybris.platform.core.model.user.CustomerModel;
import de.hybris.platform.servicelayer.dto.converter.Converter;


/**
 * @author Ranjithrao
 *
 */
public class ProductEmailContext extends AbstractEmailContext<CronJobMailProcessModel>
{
	private Converter<ProductModel, ProductData> productConverter;
	private ProductData productData;
	private String productName;
	private String productNameFromData;

	/**
	 * @return the prodcutConverter
	 */

	@Override
	public void init(final CronJobMailProcessModel cronJobMailProcessModel, final EmailPageModel emailPageModel)
	{
		super.init(cronJobMailProcessModel, emailPageModel);
		productData = getProductConverter().convert(cronJobMailProcessModel.getProduct());
		productName = "MY PRODUCT NAME from Productmodel: " + cronJobMailProcessModel.getProduct().getName();
		productNameFromData = "MY PRODUCT NAME from ProductData: " + productData.getName();
		System.out.println(productName + " %%%%%%% " + productNameFromData);
	}

	public Converter<ProductModel, ProductData> getProductConverter()
	{
		return productConverter;
	}


	/**
	 * @param prodcutConverter
	 *           the prodcutConverter to set
	 */
	public void setProductConverter(final Converter<ProductModel, ProductData> productConverter)
	{
		this.productConverter = productConverter;
	}


	/**
	 * @return the productData
	 */
	public ProductData getProductData()
	{
		return productData;
	}


	/**
	 * @param productData
	 *           the productData to set
	 */
	public void setProductData(final ProductData productData)
	{
		this.productData = productData;
	}



	/*
	 * (non-Javadoc)
	 *
	 * @see de.hybris.platform.acceleratorservices.process.email.context.AbstractEmailContext#getSite(de.hybris.platform.
	 * processengine.model.BusinessProcessModel)
	 */
	@Override
	protected BaseSiteModel getSite(final CronJobMailProcessModel businessProcessModel)
	{
		// YTODO Auto-generated method stub
		return null;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * de.hybris.platform.acceleratorservices.process.email.context.AbstractEmailContext#getCustomer(de.hybris.platform.
	 * processengine.model.BusinessProcessModel)
	 */
	@Override
	protected CustomerModel getCustomer(final CronJobMailProcessModel businessProcessModel)
	{
		// YTODO Auto-generated method stub
		return null;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see de.hybris.platform.acceleratorservices.process.email.context.AbstractEmailContext#getEmailLanguage(de.hybris.
	 * platform.processengine.model.BusinessProcessModel)
	 */
	@Override
	protected LanguageModel getEmailLanguage(final CronJobMailProcessModel businessProcessModel)
	{
		// YTODO Auto-generated method stub
		return null;
	}

}
