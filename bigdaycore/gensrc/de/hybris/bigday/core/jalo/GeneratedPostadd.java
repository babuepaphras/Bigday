/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Mar 21, 2016 5:15:45 PM                     ---
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
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem postadd}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedPostadd extends GenericItem
{
	/** Qualifier of the <code>postadd.title</code> attribute **/
	public static final String TITLE = "title";
	/** Qualifier of the <code>postadd.category</code> attribute **/
	public static final String CATEGORY = "category";
	/** Qualifier of the <code>postadd.description</code> attribute **/
	public static final String DESCRIPTION = "description";
	/** Qualifier of the <code>postadd.valid</code> attribute **/
	public static final String VALID = "valid";
	/** Qualifier of the <code>postadd.phno</code> attribute **/
	public static final String PHNO = "phno";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(TITLE, AttributeMode.INITIAL);
		tmp.put(CATEGORY, AttributeMode.INITIAL);
		tmp.put(DESCRIPTION, AttributeMode.INITIAL);
		tmp.put(VALID, AttributeMode.INITIAL);
		tmp.put(PHNO, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>postadd.category</code> attribute.
	 * @return the category
	 */
	public String getCategory(final SessionContext ctx)
	{
		return (String)getProperty( ctx, CATEGORY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>postadd.category</code> attribute.
	 * @return the category
	 */
	public String getCategory()
	{
		return getCategory( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>postadd.category</code> attribute. 
	 * @param value the category
	 */
	public void setCategory(final SessionContext ctx, final String value)
	{
		setProperty(ctx, CATEGORY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>postadd.category</code> attribute. 
	 * @param value the category
	 */
	public void setCategory(final String value)
	{
		setCategory( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>postadd.description</code> attribute.
	 * @return the description
	 */
	public String getDescription(final SessionContext ctx)
	{
		return (String)getProperty( ctx, DESCRIPTION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>postadd.description</code> attribute.
	 * @return the description
	 */
	public String getDescription()
	{
		return getDescription( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>postadd.description</code> attribute. 
	 * @param value the description
	 */
	public void setDescription(final SessionContext ctx, final String value)
	{
		setProperty(ctx, DESCRIPTION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>postadd.description</code> attribute. 
	 * @param value the description
	 */
	public void setDescription(final String value)
	{
		setDescription( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>postadd.phno</code> attribute.
	 * @return the phno
	 */
	public Integer getPhno(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, PHNO);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>postadd.phno</code> attribute.
	 * @return the phno
	 */
	public Integer getPhno()
	{
		return getPhno( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>postadd.phno</code> attribute. 
	 * @return the phno
	 */
	public int getPhnoAsPrimitive(final SessionContext ctx)
	{
		Integer value = getPhno( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>postadd.phno</code> attribute. 
	 * @return the phno
	 */
	public int getPhnoAsPrimitive()
	{
		return getPhnoAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>postadd.phno</code> attribute. 
	 * @param value the phno
	 */
	public void setPhno(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, PHNO,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>postadd.phno</code> attribute. 
	 * @param value the phno
	 */
	public void setPhno(final Integer value)
	{
		setPhno( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>postadd.phno</code> attribute. 
	 * @param value the phno
	 */
	public void setPhno(final SessionContext ctx, final int value)
	{
		setPhno( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>postadd.phno</code> attribute. 
	 * @param value the phno
	 */
	public void setPhno(final int value)
	{
		setPhno( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>postadd.title</code> attribute.
	 * @return the title
	 */
	public String getTitle(final SessionContext ctx)
	{
		return (String)getProperty( ctx, TITLE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>postadd.title</code> attribute.
	 * @return the title
	 */
	public String getTitle()
	{
		return getTitle( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>postadd.title</code> attribute. 
	 * @param value the title
	 */
	public void setTitle(final SessionContext ctx, final String value)
	{
		setProperty(ctx, TITLE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>postadd.title</code> attribute. 
	 * @param value the title
	 */
	public void setTitle(final String value)
	{
		setTitle( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>postadd.valid</code> attribute.
	 * @return the valid
	 */
	public String getValid(final SessionContext ctx)
	{
		return (String)getProperty( ctx, VALID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>postadd.valid</code> attribute.
	 * @return the valid
	 */
	public String getValid()
	{
		return getValid( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>postadd.valid</code> attribute. 
	 * @param value the valid
	 */
	public void setValid(final SessionContext ctx, final String value)
	{
		setProperty(ctx, VALID,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>postadd.valid</code> attribute. 
	 * @param value the valid
	 */
	public void setValid(final String value)
	{
		setValid( getSession().getSessionContext(), value );
	}
	
}
