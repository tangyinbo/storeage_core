package cn.cowboy.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBTest {
	
	public static void main(String[] args) throws Exception {
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/store_sys", "root", "root");
		System.out.println(con);
		PreparedStatement ps =con.prepareStatement("select * from t_sys_user");
		ResultSet rs = ps.executeQuery();
		while(rs.next()){
			System.out.println(rs.getObject(2));
		}
	}
}
