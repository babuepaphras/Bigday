/**
 *
 */
package de.hybris.bigday.core.dao.adds;

import de.hybris.platform.core.model.product.ProductModel;

import java.util.List;



public interface PostAddDao
{
	List<ProductModel> selectAdd();
}
