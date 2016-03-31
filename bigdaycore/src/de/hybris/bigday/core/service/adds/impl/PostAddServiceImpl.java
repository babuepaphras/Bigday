/**
 *
 */
package de.hybris.bigday.core.service.adds.impl;

import de.hybris.bigday.core.dao.adds.PostAddDao;
import de.hybris.bigday.core.dao.adds.impl.PostAddDaoImpl;
import de.hybris.bigday.core.model.PostaddModel;
import de.hybris.bigday.core.service.adds.PostAddService;
import de.hybris.platform.commercefacades.user.data.PostAddData;
import de.hybris.platform.servicelayer.model.ModelService;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;


/**
 * @author Chinni
 *
 */
public class PostAddServiceImpl implements PostAddService
{
	@Resource(name = "modelService")
	ModelService modelService;


	public ModelService getModelService()
	{
		return modelService;
	}


	public void setModelService(final ModelService modelService)
	{
		this.modelService = modelService;
	}

	@Autowired
	PostAddDao postAddDao;

	/**
	 * @return the postAddDao
	 */
	public PostAddDao getPostAddDao()
	{
		return postAddDao;
	}


	/**
	 * @param postAddDao
	 *           the postAddDao to set
	 */
	public void setPostAddDao(final PostAddDao postAddDao)
	{
		this.postAddDao = postAddDao;
	}


	@Override
	public void insertAdd(final PostAddData data)
	{
		System.out.println(" before model Service ----");
		final PostaddModel model = modelService.create(PostaddModel.class);
		System.out.println("Service ----");
		System.out.println("Service ----" + data.getAdtitle());
		model.setTitle(data.getAdtitle());
		model.setCategory(data.getCatgory());
		model.setDescription(data.getDescription());
		model.setValid(data.getValid());
		model.setPhno(data.getPhno());
		System.out.println("service class before c");
		modelService.save(model);
	}

	@Override
	public List<PostaddModel> selectAdd()
	{
		final PostAddDaoImpl dao = new PostAddDaoImpl();
		final List result = dao.selectAdd();
		return result;
	}

}
