package com.human.ex;

public class Tree extends Countable {
	
	public Tree(String name,int num){
		super(name,num);
	}
	@Override
	public void count() {
		System.out.println(name+ "��(��) " + num + " �׷� �ִ�.");
	}
	public void ripen() {
		System.out.println(num+"�׷�"+ name+ "�� ���Ű� �� �;���." );
	}
}
