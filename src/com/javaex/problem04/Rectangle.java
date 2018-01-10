package com.javaex.problem04;

public class Rectangle extends Shape implements Resizeable{

	double width;
	double height;
	
	
	
	public Rectangle(double width, double height) {
		super();
		this.width = width;
		this.height = height;
	}

	@Override
	public double getArea() {
		
		return width*height;
	}

	@Override
	public double getPerimeter() {
		
		return (width+height)*2;
	}

	@Override
	public void resize(double s) {
		this.width = width*s;
		this.height = height*s;
		
	}

}
