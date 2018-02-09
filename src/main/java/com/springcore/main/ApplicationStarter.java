package com.springcore.main;

import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springcore.beans.User;
import com.springcore.beans.User.Sample;

public class ApplicationStarter {

	public static void main(String[] args){
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Map<String,User> beanMap = (Map<String,User>)context.getBeansOfType(com.springcore.beans.User.class);
		System.out.println("All Beans in xml");
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
		System.out.println("Inner bean sample "+sampleBean.getInnerName());
	}
}
