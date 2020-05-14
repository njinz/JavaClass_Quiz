package com.human.ex;

public class Phone {
protected String owner;
Phone(){}
Phone(String owner){
	this.owner = owner;
}
public void talk() {
	System.out.println(owner + "가 통화 중이다.");
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
		System.out.println(owner+"가 없다."+ when+ "전화 줄래.");
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
		System.out.println(owner + "이가 " + game + "게임을 하는 중이다.");
	}
}
