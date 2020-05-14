package com.human.ex;

public class Color {
	public int radius;
	public String color;
	
	public Color() {}
	
	public Color(int radius) {
		this.radius = radius;
	}
	
	public Color(int radius,String color){
		this.radius = radius;
		this.color = color;
		}
	
	public void show() {}
}

class Circle extends Color{

	Circle(int radius){
		super(radius);
	}
	public void show() {
		System.out.println("반지름이" + radius + "인 원이다.");
	}
	
}

class ColoredCircle extends Color{
	
	
	public ColoredCircle(int radius, String color) {
		this.radius = radius;
		this.color = color;
	}

	@Override
	public void show() {
		System.out.println("반지름이" + radius + "인" + color + "원이다.");
	}
	
}