package com.chhaileng.kps.shape;

public class Drawing {
	
	Shape shape;

	public void setShape(Shape shape) {
		this.shape = shape;
	}
	
	public void drawShape() {
		shape.draw();
	}

}
