package bean;

import annotation.Column;
import annotation.Table;

@Table(tableName = "t_user",description="用户表")
public class User {
	@Column(type = "varchar(32)", field = "id", description = "用户ID", primaryKey = true, defaultNull = false)
	private String id;
	@Column(type = "VARCHAR(20)", field = "username", description = "用户名")
	private String username;
	@Column(type = "VARCHAR(20)", field = "password", description = "密码")
	private String password;
	@Column(type = "VARCHAR(60)", field = "headerPic", description = "头像")
	private String headerPic;
	@Column(type = "VARCHAR(60)", field = "email", description = "电子邮箱")
	private String email;
	@Column(type = "int(1)", field = "sex", description = "性别: 1男 2女 3保密")
	private Integer sex;
	@Column(type = "datetime", field = "create_time", description = "创建时间")
	private String createTime;
	@Column(type = "timestamp", field = "update_time", description = "最后更新时间")
	private String updateTime;
	@Column(type = "int(1)", field = "is_delete", description = "删除状态: 0未删除 1删除")
	private Integer isDelete;
	@Column(type = "VARCHAR(200)", field = "address", description = "地址")
	private String address;
	@Column(type = "VARCHAR(15)", field = "telephone", description = "电话")
	private String telephone;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getHeaderPic() {
		return headerPic;
	}

	public void setHeaderPic(String headerPic) {
		this.headerPic = headerPic;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getSex() {
		return sex;
	}

	public void setSex(Integer sex) {
		this.sex = sex;
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
}
