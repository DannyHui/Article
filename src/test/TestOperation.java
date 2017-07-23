package test;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import org.junit.Test;

import bean.Category;
import bean.Comment;
import service.CategoryService;
import util.DataBaseUtils;
import util.TableUtils;

public class TestOperation {
	@Test
	public void TestInsertArticle() {
		String sql = "INSERT INTO t_article(id,header,name,content,author,"
				+ "description,is_published,is_delete,create_time,update_time"
				+ ",user_id,category_id) VALUES (?,?,?,?,?,?,?,?,?,?,?,?) ";
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
		String nowDate=df.format(new Date());// 获取当前系统时间
		String id = UUID.randomUUID().toString().replace("-", ""); // 主键
		String header = "Java Web实用技术";
		String name="tomcat安装教程";
		String content = "我们经常会在网上下载一些开源项目，或者从别的地方迁移一些项目进来，但经常会发现导入后各种报错。这是初学java肯定会遇到的问题，本文对一些常见的处理方案做一个总结。（本文将MyEclipse项目导入eclipse的过程为例，其他情况也可参考这个流程）";
		String author = "Danny";
		String description = "解决项目导入的冲突问题...";
		int isPublished = 1;
		int isDelete = 0;
		String create_time = nowDate;
		String update_time = nowDate;
		String userId = "1cdead89d5ec452197523e642063294c";
		int categoryId = 2;
		DataBaseUtils.update(sql, id, header, name, content, author, description, isPublished, isDelete, create_time,
				update_time, userId, categoryId);
		System.out.println("新增成功！");
	}
	/**
	 * 插入分类数据
	 */
	@Test
	public void insertCategory(){
	    DataBaseUtils.update("insert into t_category set name = ?", "连载小说");
	    DataBaseUtils.update("insert into t_category set name = ?", "编程代码类");
	    DataBaseUtils.update("insert into t_category set name = ?", "生活感悟");
	}
	/**
	 * 获取分类列表
	 */
	@Test
	public void getCategoryList(){
	    String sql = "select * from t_category where 1 = 1";
	    List list = DataBaseUtils.queryForList(sql);
	    System.out.println(list);
	}
	@Test 
	public void getCreateTableSql()
	{
		String sql=TableUtils.getCreateTableSQl(Comment.class);
		System.out.println(sql);
	}
}
