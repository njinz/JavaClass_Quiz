package com.human.ex;
interface Human {
	void eat();
	static void echo() {
		System.out.println("��ȣ!!!");
	}
}
class Worker implements Human{

	@Override
	public void eat() {
		System.out.println("���� �Խ��ϴ�.");
		
	}
	
}
class Student implements Human{
	int age =0;
	@Override
	public void eat() {
		System.out.println("���ö��� �Խ��ϴ�");
		
	}
	public void print() {
		System.out.println("�л��Դϴ�.");
	}
	public Student(int age) {
		this.age = age;
	}
	
}
class Person extends Worker{

	public void print() {
		System.out.println("�ΰ��Դϴ�.");
	}
	
}
