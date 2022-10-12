package kodlama�OHW3.dataAccess;

import java.util.ArrayList;

import kodlama�OHW3.core.logging.ILogger;
import kodlama�OHW3.entities.Category;

public class HibernateCategoryDao implements CategoryDao{
	@Override
	public void add(Category category) {
		System.out.println("Kategori H�BERNATE veritaban�na eklendi : " + category.getCategoryName());
		
	}
	
	@Override
	public ArrayList<Category> getCategories() {
		ArrayList<Category> categories = new ArrayList<>();
		categories.add(new Category("T�m�"));
		categories.add(new Category("C# Angular"));
		categories.add(new Category("JAVA * REACT"));
		categories.add(new Category("Java Script"));
		categories.add(new Category("Senior .NET"));
		categories.add(new Category("JAVA"));
		categories.add(new Category("Programlamaya Giri� i�in Temel Kurs"));
		return categories;
	}
}
