package kodlamaÝOHW3.dataAccess;

import java.util.ArrayList;

import kodlamaÝOHW3.core.logging.ILogger;
import kodlamaÝOHW3.entities.Category;

public class HibernateCategoryDao implements CategoryDao{
	@Override
	public void add(Category category) {
		System.out.println("Kategori HÝBERNATE veritabanýna eklendi : " + category.getCategoryName());
		
	}
	
	@Override
	public ArrayList<Category> getCategories() {
		ArrayList<Category> categories = new ArrayList<>();
		categories.add(new Category("Tümü"));
		categories.add(new Category("C# Angular"));
		categories.add(new Category("JAVA * REACT"));
		categories.add(new Category("Java Script"));
		categories.add(new Category("Senior .NET"));
		categories.add(new Category("JAVA"));
		categories.add(new Category("Programlamaya Giriþ için Temel Kurs"));
		return categories;
	}
}
