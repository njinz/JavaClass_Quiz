package com.human.ex;

public class Vehicle {
	String color;
	int speed;
	public Vehicle(String color, int speed) {
		super();
		this.color = color;
		this.speed = speed;
	}
	
	Vehicle(){}
	void show() {
		System.out.println("�ڵ��� ����: "+color);
		System.out.println("�ڵ��� �ӵ�: "+speed);
	}
	
}
class Car extends Vehicle{
	int displacement;
	int gears;
	
	Car(){}

	public Car(String color, int speed,int displacement, int gears) {
		super(color, speed);
		this.displacement = displacement;
		this.gears = gears;
	}
	
	void show() {
		System.out.println("�ڵ��� ��ⷮ: "+displacement);
		System.out.println("�ڵ��� ��� �ܼ�: "+gears);
	}
}
