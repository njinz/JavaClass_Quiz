package com.human.ex;

public class Girl {

	protected String name;
	void show() {
		System.out.println("�׳�� �ڹ� �ʺ��̴�.");
	};
	
	Girl(String name){
		this.name = name;
	}
}
class GoodGirl extends Girl{
	void show() {
		System.out.println( name+ "��(��) �ڹٸ� �߾ȴ�.");
	}
	GoodGirl(String name){
		super(name);
	}
}
class BestGirl extends GoodGirl{
	void show() {
		System.out.println(name +"��(��) �ڹٸ� �����ϰ� �߾ȴ�.");
	}
	BestGirl(String name){
		super(name);
	}
}