package com.human.ex;
interface Human {
	void eat();
	static void echo() {
		System.out.println("야호!!!");
	}
}
class Worker implements Human{

	@Override
	public void eat() {
		System.out.println("빵을 먹습니다.");
		
	}
	
}
class Student implements Human{
	int age =0;
	@Override
	public void eat() {
		System.out.println("도시락을 먹습니다");
		
	}
	public void print() {
		System.out.println("학생입니다.");
	}
	public Student(int age) {
		this.age = age;
	}
	
}
class Person extends Worker{

	public void print() {
		System.out.println("인간입니다.");
	}
	
}
