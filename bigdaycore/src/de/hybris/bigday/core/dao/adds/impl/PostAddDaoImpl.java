/**
 *
 */
package de.hybris.bigday.core.dao.adds.impl;

import de.hybris.bigday.core.dao.adds.PostAddDao;
import de.hybris.bigday.core.model.PostaddModel;
import de.hybris.platform.servicelayer.search.FlexibleSearchService;
import de.hybris.platform.servicelayer.search.SearchResult;

import java.util.List;

import org.springframework.beans.factory.annotation.Required;


/**
 * @author Chinni
 *
 */
public class PostAddDaoImpl implements PostAddDao
{
	@SuppressWarnings("unused")
	private FlexibleSearchService flexiblesearchservice;


	@Required
	public void setFlexiblesearchservice(final FlexibleSearchService flexiblesearchservice)
	{
		this.flexiblesearchservice = flexiblesearchservice;
	}


	@Override
	public List<PostaddModel> selectAdd()
	{
		final String query = "select {title},{category},{description},{valid},{phno} from {postadd}";
		// Flexible search service injected by Spring

		final SearchResult<PostaddModel> searchResult = flexiblesearchservice.search(query);
		final List result = searchResult.getResult();


		return result;
	}

}
