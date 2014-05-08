package cn.cowboy.dao;

import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cn.cowboy.domain.User;
import cn.cowboy.service.UserService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:spring.xml","classpath:spring-mybatis.xml"})
public class UserDaoTest {
	@Autowired
	private UserService userService;
	@Test
	public void test1(){
		User user = new User();
		user.setName("wujianyuan5");
		user.setName("heheheh5");
		user.setRegDate(new Date());
		user.setPasswd("123456");
		int a = userService.addUser(user);
	}
}
