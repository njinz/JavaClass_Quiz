package com.human.ex;

public class Girl {

	protected String name;
	void show() {
		System.out.println("그녀는 자바 초보이다.");
	};
	
	Girl(String name){
		this.name = name;
	}
}
class GoodGirl extends Girl{
	void show() {
		System.out.println( name+ "은(는) 자바를 잘안다.");
	}
	GoodGirl(String name){
		super(name);
	}
}
class BestGirl extends GoodGirl{
	void show() {
		System.out.println(name +"은(는) 자바를 무지하게 잘안다.");
	}
	BestGirl(String name){
		super(name);
	}
}