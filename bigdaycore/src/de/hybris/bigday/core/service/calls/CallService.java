/**
 *
 */
package de.hybris.bigday.core.service.calls;

import de.hybris.bigday.core.model.StoreModel;
import de.hybris.platform.servicelayer.search.FlexibleSearchService;

import java.util.List;


/**
 * @author Chinni
 *
 */
public interface CallService
{
	public void setFlexibleSearchService(final FlexibleSearchService flexibleSearchService);

	public void insertUserService(final String name, final String uid);

	public List<StoreModel> getStoreDetails();
}
