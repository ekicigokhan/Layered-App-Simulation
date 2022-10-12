package kodlama›OHW3.business;

import java.util.ArrayList;
import java.util.List;

import kodlama›OHW3.core.logging.ILogger;
import kodlama›OHW3.dataAccess.CategoryDao;
import kodlama›OHW3.entities.Category;

public class CategoryManager {

	private CategoryDao categoryDao;
	private ILogger[] loggers;
	private ArrayList<Category> categories;

	public CategoryManager(CategoryDao categoryDao, ILogger[] loggers) {
		this.categoryDao = categoryDao;
		this.loggers = loggers;
		this.categories = categoryDao.getCategories();
	}

	private boolean isThereCategory(Category category) throws Exception {
		for (Category inDbCategory : categories) {
			if (inDbCategory.getCategoryName().equalsIgnoreCase(category.getCategoryName())) {
				throw new Exception("This category name defined anyway. Please add a new category.");
			}
		}

		return true;
	}

	public void add(Category category) throws Exception {

		if (isThereCategory(category)) {
			
			categoryDao.add(category);
		}

		for (ILogger iLogger : loggers) {
			iLogger.log(category.getCategoryName());
		}

	}

}
