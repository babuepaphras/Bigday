/**
 *
 */
package de.hybris.bigday.core.service.adds;

import de.hybris.bigday.core.model.PostaddModel;
import de.hybris.platform.commercefacades.user.data.PostAddData;

import java.util.List;


/**
 * @author Chinni
 *
 */
public interface PostAddService
{
	public void insertAdd(final PostAddData data);

	public List<PostaddModel> selectAdd();
}
