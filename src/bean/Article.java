package bean;

import java.util.Date;

import annotation.Column;
import annotation.Table;

@Table(tableName = "t_article", description = "文章表")
public class Article {

	@Column(field = "id", type = "varchar(32)", primaryKey = true, defaultNull = false, description = "文章ID")
	private String id;

	@Column(field = "header", type = "varchar(100)", description = "标题")
	private String header;

	@Column(field = "name", type = "varchar(60)", description = "文章名称")
	private String name;

	@Column(field = "content", type = "text", description = "文章内容")
	private String content;

	@Column(field = "author", type = "varchar(30)", description = "作者")
	private String author;

	@Column(field = "description", type = "varchar(100)", description = "概要")
	private String description;

	@Column(field = "is_published", type = "int(1)", description = "是否发布: 0未发布; 1发布")
	private Integer isPublished;

	@Column(field = "is_delete", type = "int(1)", description = "是否删除: 0未删除 ;1已删除")
	private Integer isDelete;

	@Column(field = "create_time", type = "datetime", description = "创建时间")
	private Date createTime;

	@Column(field = "update_time", type = "timestamp", defaultNull = false, description = "最后更新时间")
	private Date updateTime;

	@Column(field = "user_id", type = "varchar(100)", defaultNull = false, description = "作者ID")
	private String userId;

	@Column(field = "category_id", type = "int(2)", defaultNull = false, description = "分类ID")
	private Integer categoryId;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getHeader() {
		return header;
	}

	public void setHeader(String header) {
		this.header = header;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getIsPublished() {
		return isPublished;
	}

	public void setIsPublished(Integer isPublished) {
		this.isPublished = isPublished;
	}

	public Integer getIsDelete() {
		return isDelete;
	}

	public void setIsDelete(Integer isDelete) {
		this.isDelete = isDelete;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public Integer getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(Integer categoryId) {
		this.categoryId = categoryId;
	}

}
