package com.human.ex;

public class Phone {
protected String owner;
Phone(){}
Phone(String owner){
	this.owner = owner;
}
public void talk() {
	System.out.println(owner + "�� ��ȭ ���̴�.");
}

}

class Telephone extends Phone{
	private String when;
	Telephone(){}
	Telephone(String owner,String when){
		super.owner = owner;
		this.when = when;
	}
	public void autoAnswering() {
		System.out.println(owner+"�� ����."+ when+ "��ȭ �ٷ�.");
	}
}

class Smartphone extends Phone{
	private String game;
	Smartphone(){}
	Smartphone(String owner,String game){
		super.owner= owner;
		this.game = game;
	}
	public void playGame() {
		System.out.println(owner + "�̰� " + game + "������ �ϴ� ���̴�.");
	}
}
