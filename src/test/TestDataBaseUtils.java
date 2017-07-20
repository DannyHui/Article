package test;

import java.sql.Connection;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

import bean.User;
import util.DataBaseUtils;

public class TestDataBaseUtils {

	public static void main(String[] args) {
		//数据库连接
		Connection conn = DataBaseUtils.getConnection();
		System.out.println(conn);
		//添加数据
		String id = UUID.randomUUID().toString().replace("-", "");
		String createTime = new SimpleDateFormat("yyyy-MM-dd").format(new Date());
		DataBaseUtils.update("INSERT INTO t_user(id,username,password,sex,create_time,is_delete,address,telephone) "
				+ " VALUES (?, ?, ?, ?, ?, ?, ?, ?)", id, "张三", 123456, 3, createTime, 0, "保密", "保密");
		//查询数据
		User user = DataBaseUtils.queryForBean("select * from t_user limit 1", User.class);
		System.out.println(user.getUsername());
	}
}
