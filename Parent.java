package com.human.ex;

public class Parent {
	String name ="����";
	Parent(){}
	Parent(String name){
		this.name = name;
	}
	void print() {
		System.out.println(name);
	}
}
class Child extends Parent{
	String name = "�絵����";
	Child(){}
	Child(String name){
		this.name = name;
	}
	@Override
	void print() {
		super.print();
		System.out.println("����" + name + "�̴�.");
	}

}