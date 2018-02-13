package com.springcore.main;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springcore.beans.ExampleBean;
import com.springcore.beans.User;

public class ApplicationStarter {

	@Autowired
	private ExampleBean exampleBean;
	
	public static void main(String[] args){
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Map<String,User> beanMap = (Map<String,User>)context.getBeansOfType(com.springcore.beans.User.class);
		/*System.out.println("All Beans in xml");
		for(String key:beanMap.keySet()){
			System.out.println("User with key "+key+" value of username "+beanMap.get(key).getUserName()+" ");
		}
		System.out.println("Alias for userone");
		String[] arr = context.getAliases("userone");
		for(String str:arr){
			System.out.println(str);
		}
		System.out.println("Alias for tempthree");
		arr = context.getAliases("tempthree");
		for(String str:arr){
			System.out.println(str);
		}
		Sample sampleBean = (Sample)context.getBean("innerBean");
		System.out.println("Inner bean sample "+sampleBean.getInnerName());*/
/*		PrimaryUser primaryUser = (PrimaryUser)context.getBean("primaryUser");
		System.out.println("Number of Dishes "+primaryUser.getDishes().size()+" number of sweets "+primaryUser.getSweets());*/
		/*User user = (User)context.getBean("normalUser");
		System.out.println(user.getAddress().toString());*/
		/*SecondaryUser secondaryUser = (SecondaryUser)context.getBean("secondaryUser");
		System.out.println(secondaryUser.getGoodieTypeMap());*/
		/*PrimaryUser primaryUserFromFactory = (PrimaryUser)context.getBean("beanFactory");	
		System.out.println(primaryUserFromFactory.getClass());*/
		/*PrimaryUser primaryUserFromFactory = (PrimaryUser)context.getBean("primarybeanFactory");	
		System.out.println(primaryUserFromFactory.getClass());
		SecondaryUser secondaryUserFromFactory = (SecondaryUser)context.getBean("secondarybeanFactory");	
		System.out.println(secondaryUserFromFactory.getClass());*/
		
		
		//scope of beans 
		
		//1) singleton only one instance is created and hence,one code is generated everytime
	/*	SecondaryUser secondaryUser = (SecondaryUser)context.getBean("secondaryUser");
		System.out.println(System.identityHashCode(secondaryUser));
		SecondaryUser secondaryUser1 = (SecondaryUser)context.getBean("secondaryUser");
		System.out.println(System.identityHashCode(secondaryUser1));*/
		
		
		//2)prototype only one instance is created on each request and hence,new code is generated everytime
		/*SecondaryUser secondaryUser = (SecondaryUser)context.getBean("secondarypUser");
		System.out.println(System.identityHashCode(secondaryUser));
		SecondaryUser secondaryUser1 = (SecondaryUser)context.getBean("secondarypUser");
		System.out.println(System.identityHashCode(secondaryUser1));
		SecondaryUser secondaryUser2 = (SecondaryUser)context.getBean("secondarypUser");
		System.out.println(System.identityHashCode(secondaryUser2));*/
		
		//using ref of singleton in prototype bean
		/*User user = (User)context.getBean("normalUser");
		System.out.println(System.identityHashCode(user.getAddress())+" "+System.identityHashCode(user));
		User user1 = (User)context.getBean("normalUser1");
		System.out.println(System.identityHashCode(user1.getAddress())+" "+System.identityHashCode(user1));
		User user2 = (User)context.getBean("normalUser2");
		System.out.println(System.identityHashCode(user2.getAddress())+" "+System.identityHashCode(user2));*/
		
		
		
		// session,global-session and request scopes used with  web-aware Spring ApplicationContext implementation
		
//		ExampleBean bean = (ExampleBean)context.getBean("exampleBean");
		
		System.out.println(new ApplicationStarter().exampleBean);
		
	}
}
