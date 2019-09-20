package com.sumitaccess007.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

import com.sumitaccess007.beans.WishMessageGenerator;

public class SetterInjectionTest {

	public static void main(String[] args) {
		Resource res = null;
		BeanFactory factory = null;
		Object obj = null;
		WishMessageGenerator generator = null;
		
		
		// 1. Locate spring bean config file
		res = new FileSystemResource("src/com/sumitaccess007/cfgs/applicationContext.xml");
		// Now resource object is representing spring bean config file
		
		// 2. Create IOC Container (BeanFactoryContainer or ApplicationContextContainer)
		// In realtime ApplicationContextConatiner is used (BeanFactoryConatiner is deprecated)
		factory = new XmlBeanFactory(res); //It is an implementation class of BeanFactory interface
		
		// 3. Get Bean (We will get main bean not the dependent bean)
		obj = factory.getBean("wish");
		
		// 4. Type Casting
		// (Because using the Object class reference variable we cannot call the methods of Main bean)
		generator = (WishMessageGenerator)obj;
		// Call/invoke the business method now
		System.out.println("Message:::::"+generator.generateWishMessage("Sumit Sharma"));
	}

}
