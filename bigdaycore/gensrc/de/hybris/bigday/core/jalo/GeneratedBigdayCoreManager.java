/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at May 5, 2016 2:04:26 PM                      ---
 * ----------------------------------------------------------------
 *  
 * [y] hybris Platform
 *  
 * Copyright (c) 2000-2011 hybris AG
 * All rights reserved.
 *  
 * This software is the confidential and proprietary information of hybris
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with hybris.
 *  
 */
package de.hybris.bigday.core.jalo;

import de.hybris.bigday.core.constants.BigdayCoreConstants;
import de.hybris.bigday.core.jalo.ApparelProduct;
import de.hybris.bigday.core.jalo.ApparelSizeVariantProduct;
import de.hybris.bigday.core.jalo.ApparelStyleVariantProduct;
import de.hybris.bigday.core.jalo.CronJobMailProcess;
import de.hybris.bigday.core.jalo.ElectronicsColorVariantProduct;
import de.hybris.bigday.core.jalo.GetACall;
import de.hybris.bigday.core.jalo.Store;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.JaloSystemException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.extension.Extension;
import de.hybris.platform.jalo.product.Product;
import de.hybris.platform.jalo.security.Principal;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.jalo.type.JaloGenericCreationException;
import de.hybris.platform.jalo.user.User;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type <code>BigdayCoreManager</code>.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedBigdayCoreManager extends Extension
{
	protected static final Map<String, Map<String, AttributeMode>> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, Map<String, AttributeMode>> ttmp = new HashMap();
		Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put("title", AttributeMode.INITIAL);
		tmp.put("category", AttributeMode.INITIAL);
		tmp.put("valid", AttributeMode.INITIAL);
		tmp.put("phno", AttributeMode.INITIAL);
		ttmp.put("de.hybris.platform.jalo.product.Product", Collections.unmodifiableMap(tmp));
		tmp = new HashMap<String, AttributeMode>();
		tmp.put("mobileNumber", AttributeMode.INITIAL);
		tmp.put("gender", AttributeMode.INITIAL);
		ttmp.put("de.hybris.platform.jalo.user.User", Collections.unmodifiableMap(tmp));
		DEFAULT_INITIAL_ATTRIBUTES = ttmp;
	}
	@Override
	public Map<String, AttributeMode> getDefaultAttributeModes(final Class<? extends Item> itemClass)
	{
		Map<String, AttributeMode> ret = new HashMap<>();
		final Map<String, AttributeMode> attr = DEFAULT_INITIAL_ATTRIBUTES.get(itemClass.getName());
		if (attr != null)
		{
			ret.putAll(attr);
		}
		return ret;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.category</code> attribute.
	 * @return the category
	 */
	public String getCategory(final SessionContext ctx, final Product item)
	{
		return (String)item.getProperty( ctx, BigdayCoreConstants.Attributes.Product.CATEGORY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.category</code> attribute.
	 * @return the category
	 */
	public String getCategory(final Product item)
	{
		return getCategory( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.category</code> attribute. 
	 * @param value the category
	 */
	public void setCategory(final SessionContext ctx, final Product item, final String value)
	{
		item.setProperty(ctx, BigdayCoreConstants.Attributes.Product.CATEGORY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.category</code> attribute. 
	 * @param value the category
	 */
	public void setCategory(final Product item, final String value)
	{
		setCategory( getSession().getSessionContext(), item, value );
	}
	
	public ApparelProduct createApparelProduct(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( BigdayCoreConstants.TC.APPARELPRODUCT );
			return (ApparelProduct)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating ApparelProduct : "+e.getMessage(), 0 );
		}
	}
	
	public ApparelProduct createApparelProduct(final Map attributeValues)
	{
		return createApparelProduct( getSession().getSessionContext(), attributeValues );
	}
	
	public ApparelSizeVariantProduct createApparelSizeVariantProduct(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( BigdayCoreConstants.TC.APPARELSIZEVARIANTPRODUCT );
			return (ApparelSizeVariantProduct)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating ApparelSizeVariantProduct : "+e.getMessage(), 0 );
		}
	}
	
	public ApparelSizeVariantProduct createApparelSizeVariantProduct(final Map attributeValues)
	{
		return createApparelSizeVariantProduct( getSession().getSessionContext(), attributeValues );
	}
	
	public ApparelStyleVariantProduct createApparelStyleVariantProduct(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( BigdayCoreConstants.TC.APPARELSTYLEVARIANTPRODUCT );
			return (ApparelStyleVariantProduct)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating ApparelStyleVariantProduct : "+e.getMessage(), 0 );
		}
	}
	
	public ApparelStyleVariantProduct createApparelStyleVariantProduct(final Map attributeValues)
	{
		return createApparelStyleVariantProduct( getSession().getSessionContext(), attributeValues );
	}
	
	public CronJobMailProcess createCronJobMailProcess(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( BigdayCoreConstants.TC.CRONJOBMAILPROCESS );
			return (CronJobMailProcess)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating CronJobMailProcess : "+e.getMessage(), 0 );
		}
	}
	
	public CronJobMailProcess createCronJobMailProcess(final Map attributeValues)
	{
		return createCronJobMailProcess( getSession().getSessionContext(), attributeValues );
	}
	
	public ElectronicsColorVariantProduct createElectronicsColorVariantProduct(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( BigdayCoreConstants.TC.ELECTRONICSCOLORVARIANTPRODUCT );
			return (ElectronicsColorVariantProduct)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating ElectronicsColorVariantProduct : "+e.getMessage(), 0 );
		}
	}
	
	public ElectronicsColorVariantProduct createElectronicsColorVariantProduct(final Map attributeValues)
	{
		return createElectronicsColorVariantProduct( getSession().getSessionContext(), attributeValues );
	}
	
	public GetACall createGetACall(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( BigdayCoreConstants.TC.GETACALL );
			return (GetACall)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating GetACall : "+e.getMessage(), 0 );
		}
	}
	
	public GetACall createGetACall(final Map attributeValues)
	{
		return createGetACall( getSession().getSessionContext(), attributeValues );
	}
	
	public Store createStore(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( BigdayCoreConstants.TC.STORE );
			return (Store)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating Store : "+e.getMessage(), 0 );
		}
	}
	
	public Store createStore(final Map attributeValues)
	{
		return createStore( getSession().getSessionContext(), attributeValues );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>User.gender</code> attribute.
	 * @return the gender
	 */
	public String getGender(final SessionContext ctx, final User item)
	{
		return (String)item.getProperty( ctx, BigdayCoreConstants.Attributes.User.GENDER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>User.gender</code> attribute.
	 * @return the gender
	 */
	public String getGender(final User item)
	{
		return getGender( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>User.gender</code> attribute. 
	 * @param value the gender
	 */
	public void setGender(final SessionContext ctx, final User item, final String value)
	{
		item.setProperty(ctx, BigdayCoreConstants.Attributes.User.GENDER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>User.gender</code> attribute. 
	 * @param value the gender
	 */
	public void setGender(final User item, final String value)
	{
		setGender( getSession().getSessionContext(), item, value );
	}
	
	@Override
	public String getName()
	{
		return BigdayCoreConstants.EXTENSIONNAME;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>User.mobileNumber</code> attribute.
	 * @return the mobileNumber
	 */
	public String getMobileNumber(final SessionContext ctx, final User item)
	{
		return (String)item.getProperty( ctx, BigdayCoreConstants.Attributes.User.MOBILENUMBER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>User.mobileNumber</code> attribute.
	 * @return the mobileNumber
	 */
	public String getMobileNumber(final User item)
	{
		return getMobileNumber( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>User.mobileNumber</code> attribute. 
	 * @param value the mobileNumber
	 */
	public void setMobileNumber(final SessionContext ctx, final User item, final String value)
	{
		item.setProperty(ctx, BigdayCoreConstants.Attributes.User.MOBILENUMBER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>User.mobileNumber</code> attribute. 
	 * @param value the mobileNumber
	 */
	public void setMobileNumber(final User item, final String value)
	{
		setMobileNumber( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.phno</code> attribute.
	 * @return the phno
	 */
	public String getPhno(final SessionContext ctx, final Product item)
	{
		return (String)item.getProperty( ctx, BigdayCoreConstants.Attributes.Product.PHNO);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.phno</code> attribute.
	 * @return the phno
	 */
	public String getPhno(final Product item)
	{
		return getPhno( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.phno</code> attribute. 
	 * @param value the phno
	 */
	public void setPhno(final SessionContext ctx, final Product item, final String value)
	{
		item.setProperty(ctx, BigdayCoreConstants.Attributes.Product.PHNO,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.phno</code> attribute. 
	 * @param value the phno
	 */
	public void setPhno(final Product item, final String value)
	{
		setPhno( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.title</code> attribute.
	 * @return the title
	 */
	public String getTitle(final SessionContext ctx, final Product item)
	{
		return (String)item.getProperty( ctx, BigdayCoreConstants.Attributes.Product.TITLE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.title</code> attribute.
	 * @return the title
	 */
	public String getTitle(final Product item)
	{
		return getTitle( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.title</code> attribute. 
	 * @param value the title
	 */
	public void setTitle(final SessionContext ctx, final Product item, final String value)
	{
		item.setProperty(ctx, BigdayCoreConstants.Attributes.Product.TITLE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.title</code> attribute. 
	 * @param value the title
	 */
	public void setTitle(final Product item, final String value)
	{
		setTitle( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.valid</code> attribute.
	 * @return the valid
	 */
	public Date getValid(final SessionContext ctx, final Product item)
	{
		return (Date)item.getProperty( ctx, BigdayCoreConstants.Attributes.Product.VALID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.valid</code> attribute.
	 * @return the valid
	 */
	public Date getValid(final Product item)
	{
		return getValid( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.valid</code> attribute. 
	 * @param value the valid
	 */
	public void setValid(final SessionContext ctx, final Product item, final Date value)
	{
		item.setProperty(ctx, BigdayCoreConstants.Attributes.Product.VALID,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.valid</code> attribute. 
	 * @param value the valid
	 */
	public void setValid(final Product item, final Date value)
	{
		setValid( getSession().getSessionContext(), item, value );
	}
	
}
