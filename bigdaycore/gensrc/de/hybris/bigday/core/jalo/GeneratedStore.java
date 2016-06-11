/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Jun 8, 2016 6:52:23 PM                      ---
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
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem Store}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedStore extends GenericItem
{
	/** Qualifier of the <code>Store.storeName</code> attribute **/
	public static final String STORENAME = "storeName";
	/** Qualifier of the <code>Store.phno</code> attribute **/
	public static final String PHNO = "phno";
	/** Qualifier of the <code>Store.email</code> attribute **/
	public static final String EMAIL = "email";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(STORENAME, AttributeMode.INITIAL);
		tmp.put(PHNO, AttributeMode.INITIAL);
		tmp.put(EMAIL, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Store.email</code> attribute.
	 * @return the email
	 */
	public String getEmail(final SessionContext ctx)
	{
		return (String)getProperty( ctx, EMAIL);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Store.email</code> attribute.
	 * @return the email
	 */
	public String getEmail()
	{
		return getEmail( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Store.email</code> attribute. 
	 * @param value the email
	 */
	public void setEmail(final SessionContext ctx, final String value)
	{
		setProperty(ctx, EMAIL,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Store.email</code> attribute. 
	 * @param value the email
	 */
	public void setEmail(final String value)
	{
		setEmail( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Store.phno</code> attribute.
	 * @return the phno
	 */
	public Double getPhno(final SessionContext ctx)
	{
		return (Double)getProperty( ctx, PHNO);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Store.phno</code> attribute.
	 * @return the phno
	 */
	public Double getPhno()
	{
		return getPhno( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Store.phno</code> attribute. 
	 * @return the phno
	 */
	public double getPhnoAsPrimitive(final SessionContext ctx)
	{
		Double value = getPhno( ctx );
		return value != null ? value.doubleValue() : 0.0d;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Store.phno</code> attribute. 
	 * @return the phno
	 */
	public double getPhnoAsPrimitive()
	{
		return getPhnoAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Store.phno</code> attribute. 
	 * @param value the phno
	 */
	public void setPhno(final SessionContext ctx, final Double value)
	{
		setProperty(ctx, PHNO,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Store.phno</code> attribute. 
	 * @param value the phno
	 */
	public void setPhno(final Double value)
	{
		setPhno( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Store.phno</code> attribute. 
	 * @param value the phno
	 */
	public void setPhno(final SessionContext ctx, final double value)
	{
		setPhno( ctx,Double.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Store.phno</code> attribute. 
	 * @param value the phno
	 */
	public void setPhno(final double value)
	{
		setPhno( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Store.storeName</code> attribute.
	 * @return the storeName
	 */
	public String getStoreName(final SessionContext ctx)
	{
		return (String)getProperty( ctx, STORENAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Store.storeName</code> attribute.
	 * @return the storeName
	 */
	public String getStoreName()
	{
		return getStoreName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Store.storeName</code> attribute. 
	 * @param value the storeName
	 */
	public void setStoreName(final SessionContext ctx, final String value)
	{
		setProperty(ctx, STORENAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Store.storeName</code> attribute. 
	 * @param value the storeName
	 */
	public void setStoreName(final String value)
	{
		setStoreName( getSession().getSessionContext(), value );
	}
	
}
