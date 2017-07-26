package test;

import java.util.List;

import org.junit.Test;

import bean.Category;
import service.CategoryService;

public class TestCategoryService {
	@Test
	public void getCategoryArticleInfo()
	{
		CategoryService categoryService=new CategoryService();
		List<Category> list = categoryService.getCategoryArticleInfo();
		for(Category category : list) {
			  System.out.println(category.getName()+"\n");
			}
	}
}
