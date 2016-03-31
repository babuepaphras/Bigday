/**
 *
 */
package de.hybris.bigday.facades.adds;

import de.hybris.platform.commercefacades.user.data.PostAddData;

import java.util.List;


/**
 * @author Chinni
 *
 */
public interface AddPostFacade
{
	public void insertAdd(final PostAddData data);

	public List selectAdd();
}
