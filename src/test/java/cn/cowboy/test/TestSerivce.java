package cn.cowboy.test;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class TestSerivce {
	public static void main(String[] args) throws SQLException {
		ApplicationContext context =new ClassPathXmlApplicationContext(new String[]{"classpath:spring.xml","classpath:spring-mybatis.xml"});
	/*	UserService us =(UserService) context.getBean("userService");
		List<User> users = us.getAllUser();
		for(Iterator<User> it = users.iterator();it.hasNext();){
			User u= it.next();
			System.out.println(u);
		}*/
		DataSource ds =(DataSource) context.getBean("dataSource");
		Connection con =ds.getConnection();
		System.out.println(con);
	}
}
