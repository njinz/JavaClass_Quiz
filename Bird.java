package com.human.ex;

public class Bird extends Countable {
	
	public Bird(String name,int num){
		super(name,num);
	}
	
	@Override
	public void count() {
		System.out.println(name+ " ��(��) " + num + " ���� �ִ�.");
		
	}
	public void fly() {
		System.out.println(num + "���� " + name + " ��(��) ���ư���." );
	}
	
	
}
