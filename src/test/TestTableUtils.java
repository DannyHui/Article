package test;

import bean.User;
import util.TableUtils;

public class TestTableUtils {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sql=TableUtils.getCreateTableSQl(User.class);
		System.out.println(sql);
	}

}
