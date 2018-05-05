package com.controller;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class TestControl {
public static void main(String args[]){
	Resource resource=new ClassPathResource("applicationContext.xml");
	BeanFactory bean=new XmlBeanFactory(resource);
	HomeControl control=(HomeControl)bean.getBean("home");
	control.display();
}
}
