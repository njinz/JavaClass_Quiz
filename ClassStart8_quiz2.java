package com.human.ex;
class Triangle{
	private double width=0.0;
	public double height=0.0;
	
	public void setWidth(double width) {
		if(width<0) {
			width=0;
		}else {
		this.width=width;
		}
	}
	public double getWidth() {
		return this.width;
	}
	public Triangle() {}
	public Triangle(double w,double h) {
		this.width=w;
		this.height=h;
	}
	public double findArea() {
		if(width<0) {
			width=0;
		}else {
		this.width=width;
		}
		return this.width*height/2;
	}
	public boolean isSameArea(Triangle t) {  //두 삼각형의 넓이 동일 한지 판별하는 메소드 어떻게??
		return findArea()==t.findArea();
	}
	
}

public class ClassStart8_quiz2 {

	public static void main(String[] args) {
		Triangle t=new Triangle(10.0,5.0);
//		t.setWidth(3.0);
		System.out.println("삼각형의 넓이는: "+ t.findArea());
		Triangle t2=new Triangle(5.0,10.0);
		Triangle t3=new Triangle(8.0,8.0);
		
		System.out.println(t.isSameArea(t2));
		System.out.println(t.isSameArea(t3));

	}

}
