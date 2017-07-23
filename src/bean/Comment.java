package bean;

import annotation.Column;
import annotation.Table;

@Table(tableName = "t_comment",description="评论表")
public class Comment {
	
	@Column(type = "varchar(100)" ,field = "id" ,primaryKey = true ,defaultNull = false,description="评论ID")
	private String id;		  
	
	@Column(type = "VARCHAR(100)", field = "user_id",description="评论者的ID")
	private String userId; 
	
	@Column(type = "VARCHAR(600)", field = "content",description="评论内容")
	private String content; 
	
	@Column(type = "VARCHAR(100)", field = "article_id",description="文章ID")
	private String articleId; 
	
	@Column(type = "datetime", field = "create_time",description="创建时间")
	private String createTime;
	
	@Column(type = "timestamp", field = "update_time",description="最后更新时间")
	private String updateTime;
	
	@Column(type = "int(1)", field = "is_delete",description="删除状态: 0未删除  1删除")
	private Integer isDelete; 

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getCreateTime() {
		return createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	public String getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(String updateTime) {
		this.updateTime = updateTime;
	}

	public Integer getIsDelete() {
		return isDelete;
	}

	public void setIsDelete(Integer isDelete) {
		this.isDelete = isDelete;
	}

	public String getArticleId() {
		return articleId;
	}

	public void setArticleId(String articleId) {
		this.articleId = articleId;
	}
	
}
