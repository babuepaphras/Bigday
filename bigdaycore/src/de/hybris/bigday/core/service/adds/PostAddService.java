/**
 *
 */
package de.hybris.bigday.core.service.adds;

import de.hybris.platform.commercefacades.user.data.PostAddData;
import de.hybris.platform.core.model.product.ProductModel;

import java.util.List;


/**
 * @author Chinni
 *
 */
public interface PostAddService
{
	public void insertAdd(final PostAddData data);

	public List<ProductModel> selectAdd();
}
