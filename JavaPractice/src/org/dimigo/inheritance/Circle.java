package org.dimigo.inheritance;

public class Circle extends Figure {
	private int radius;
	
	public Circle() {
		// TODO Auto-generated constructor stub
	}
	
	public Circle(int radius) {
		super(0, 0);
		this.radius = radius;
	}
	
	public Circle(int centerX, int centerY, int radius) {
		super(centerX, centerY);
		this.radius = radius;
	}
	
	protected double calcArea() {
		return radius * radius * Math.PI;
	}
	
	protected void printCenter() {
		System.out.print("원 ");
		super.printCenter();
	}
}
