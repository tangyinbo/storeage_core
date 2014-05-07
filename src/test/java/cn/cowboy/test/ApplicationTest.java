package cn.cowboy.test;

import org.junit.runner.RunWith;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class ApplicationTest {
		public static void main(String[] args) {
			ApplicationContext context =new ClassPathXmlApplicationContext("classpath:spring.xml");
			TestClass tc =context.getBean(TestClass.class);
			tc.say();
		}
}
