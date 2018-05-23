package com.chhaileng.kps.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.chhaileng.kps.shape.Circle;
import com.chhaileng.kps.shape.Drawing;
import com.chhaileng.kps.shape.Rectangle;

@Configuration
public class BeanConfiguration {

	private Circle c;
	@Autowired
	private Rectangle r;
	
	@Autowired
	public void setCircle(@Qualifier("circle1") Circle c) {
		this.c = c;
	}
	
	@Bean(name = "circle1")
	public Circle circle() {
		return new Circle();
	}
	
	@Bean(name = "circle2")
	public Circle circleTest() {
		return new Circle();
	}
	
	@Bean
	public Rectangle rectangle() {
		return new Rectangle();
	}
	
	@Bean
	public Drawing drawing() {
		Drawing d = new Drawing();
		d.setShape(r);
		return d;
	}
	
}
