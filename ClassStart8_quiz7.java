package com.human.ex;
class Golfclub{
	public int a=0;
	public String str="";
	
	
    public Golfclub() {
    	a=7;
    }
	public Golfclub(int a) {
		this.a=a;
	}
	public Golfclub(String str) {
		a=0;
		this.str=str;
	}
	public void print() {
		if(a==0) {
		System.out.println(str+"입니다.");
		}
		else {
			System.out.println(a+"번 아이언입니다.");
		}
	}
	
	
}
public class ClassStart8_quiz7 {

	public static void main(String[] args) {
		Golfclub g1=new Golfclub();
		g1.print();
		Golfclub g2=new Golfclub(8);
		g2.print();
		Golfclub g3=new Golfclub("퍼터");
		g3.print();
	}

}
