package com.human.ex;
//원의 넓이와 둘레를 구하는 프로그램 구현해보자.

class Circle{
	private static double pi=3.14;  //(나중에 main class에서 접근가능하도록 static)
	
	public static void changePi(double pi) {    //프로그램 중간에 pi를 3.141592로 넣어보자. 
		Circle.pi=pi;
	}
	
	public double r=0;
	public Circle() {}
	public Circle(double r) {
		this.r=r;
	}
	public double border() {
		return 2*pi*r;
	}
	public double area() {
		return pi*Math.pow(r, 2);
	}
	public void display() {
		System.out.println("넓이:"+area()+ " 둘레:"+border());
	}
	
}

public class ClassStart91 {

	public static void main(String[] args) {
		double r=5;
		Circle c=new Circle(r);
		c.display();
		
		//Circle.pi=3.141592;  //클래스 이름.pi=변경값으로 바꿔준다. 
		Circle.changePi(3.141592);
	    double r1=6;
	    Circle c1=new Circle(r1);
	
	    c1.display();
	    
	    double r2=7;
	    Circle c2=new Circle(r2);
	
	    c2.display();
	    
	    
	}

}
