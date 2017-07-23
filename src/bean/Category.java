package bean;

import java.util.List;
import java.util.Map;

import annotation.Column;
import annotation.Table;

@Table(tableName = "t_category",description="分类表")
public class Category {
	@Column(type = "int(11)", field = "id", description = "分类ID", primaryKey = true, defaultNull = false)
	private Integer id;
	@Column(type = "VARCHAR(20)", field = "name", description = "分类名称")
	private String name;
	
	private List<Map<String,Object>> ArticleList;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Map<String,Object>> getArticleList() {
		return ArticleList;
	}
	public void setArticleList(List<Map<String,Object>> articleList) {
		ArticleList = articleList;
	}
}