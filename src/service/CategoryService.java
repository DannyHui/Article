package service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import bean.Category;
import util.DataBaseUtils;

public class CategoryService {
	/**
	 * 获取文章分类信息
	 * @return
	 */
	public List<Category> getCategoryArticleInfo(){
		List<Category> listCategory=new ArrayList<Category>();
		String sql = "select * from t_category";
		List<Map<String,Object>> categoryList = DataBaseUtils.queryForList(sql);
		ArticleService articleService=new ArticleService();
		for (Map<String, Object> m : categoryList)
		{
			Category ctg=new Category();
			int categoryid=Integer.parseInt(m.get("id").toString());
			ctg.setId(categoryid);
			ctg.setName(m.get("name").toString());
			List<Map<String,Object>> articleList=articleService.getArticlesByCategoryId(categoryid, 0, 6);
			ctg.setArticleList(articleList);
			listCategory.add(ctg);
		}
		return listCategory;
	}
}
