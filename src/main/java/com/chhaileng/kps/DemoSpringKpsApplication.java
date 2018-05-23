package com.chhaileng.kps;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.chhaileng.kps.shape.Drawing;

@SpringBootApplication
public class DemoSpringKpsApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(DemoSpringKpsApplication.class, args);
	
		Drawing d = context.getBean(Drawing.class);
//		d.drawShape();
		
		String [] beans = context.getBeanDefinitionNames();
		
		for(int i = 0 ; i<beans.length ; i++) 
			System.out.println(beans[i]);
		
		System.out.println(context.getBeanDefinitionCount());
		
		
	}
}
