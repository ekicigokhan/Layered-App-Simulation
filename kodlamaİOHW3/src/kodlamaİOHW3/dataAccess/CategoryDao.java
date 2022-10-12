package kodlama›OHW3.dataAccess;

import java.util.ArrayList;

import kodlama›OHW3.entities.Category;

public interface CategoryDao {
	void add(Category category);
	ArrayList<Category> getCategories();
}
