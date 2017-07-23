package service;

import bean.User;
import util.DataBaseUtils;

/**
 * 登录服务类
 * 
 * @author zhangyah
 *
 */

public class LoginService {

	public User getUser(String username) {
		String sql = "select * from t_user where username = ?";
		User user = DataBaseUtils.queryForBean(sql, User.class, username);
		return user == null ? null : user;
	}
}
