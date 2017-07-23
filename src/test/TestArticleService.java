package test;

import java.util.List;
import java.util.Map;

import org.junit.Test;

import service.ArticleService;

public class TestArticleService {
	ArticleService articleService=new ArticleService();
	@Test
	public void getArticlesByCategoryIdTest()
	{	
		List result=articleService.getArticlesByCategoryId(2,0,10);
		System.out.println(result);
	}

	@Test
	public void getContentByArticleIdTest()
	{
		String id="80a4f2fd55644de999f1de7d3e438372";
		Map<String,Object> result=articleService.getContentByArticleId(id);
		System.out.println(result);
	}
}
