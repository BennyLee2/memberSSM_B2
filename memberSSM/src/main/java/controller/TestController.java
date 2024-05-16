package controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import vo.Member;
import service.impl.MemberServiceImpl;

public class TestController {

	public static void main(String[] args) {
		ApplicationContext a=new ClassPathXmlApplicationContext("applicationContext.xml");
		System.out.println(a);
		
		MemberServiceImpl m=(MemberServiceImpl) a.getBean("ms");
		System.out.println(m);
		
		m.memberAdd(new Member("a","u","1"));
	}

}
