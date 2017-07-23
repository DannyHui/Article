package test;

import java.sql.Connection;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import bean.User;
import util.DataBaseUtils;

public class TestDataBaseUtils {

	public static void main(String[] args) throws SQLException {
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
		//queryForList
		List list=DataBaseUtils.queryForList("select * from t_user");
		System.out.println(list.toString());
		//queryForMap
		Map map = DataBaseUtils.queryForMap("select * from t_user where id = ?","1cdead89d5ec452197523e642063294c");
		System.out.println(map);
	}
}
