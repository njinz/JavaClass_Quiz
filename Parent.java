package com.human.ex;

public class Parent {
	String name ="영조";
	Parent(){}
	Parent(String name){
		this.name = name;
	}
	void print() {
		System.out.println(name);
	}
}
class Child extends Parent{
	String name = "사도세자";
	Child(){}
	Child(String name){
		this.name = name;
	}
	@Override
	void print() {
		super.print();
		System.out.println("나는" + name + "이다.");
	}

}