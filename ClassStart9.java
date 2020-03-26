package com.human.ex;
//사각형의 넓이와 둘레 구하는 프로그램 구현


class MyRectangle {
	private int width = 0;  //캡슐화: 다른 클래스에서 접근 불가능하도록 막아놓음. 
	private int height = 0;

	// setter getter 생성해주기(값을 변경해주는 메소드)
	public void setWidth(int width) {
		if (width < 0) {
			this.width = 0;
		} else {
			this.width = width;
		}

	}

	public int getWidth() {
		return this.width;
	}

	public void setHeight(int height) {
		if (height < 0) {
			this.height = 0;
		} else {
			this.height = height;
		}

	}

	public int getHeight() {
		return this.height;
	}

	public MyRectangle() {
	}

	public MyRectangle(int length) {
		this(length, length);
	}

	public MyRectangle(int width, int height) {
		if (width < 0 || height < 0) {
			this.width = 0;
			this.height = 0;
		}
		this.width = width;
		this.height = height;
	}

	public int area() {
		return this.width * this.height;
	}

	public int border() {
		return 2 * (this.width + this.height);
	}

	
	//static으로 넓이, 둘레 선언해보기(static에서는 인스턴스필드로 접근불가, 반대는 가능)
	
	public static int area(int w,int h) {
		return w * h;
	}

	public static int border(int w,int h) {
		return 2 * (w+h);
	}

}

public class ClassStart9 {

	public static void main(String[] args) {
		int x = 10;
		int y = 20;
		MyRectangle re = new MyRectangle(x, y);
		re.setWidth(-10);
		int area = re.area();
		int border = re.border();
		System.out.println("넓이:" + area + " 둘레:" + border);
		
	    //static으로 만든 함수 결과 찍기
		System.out.println("넓이:" + MyRectangle.area(15, 11) + " 둘레:" + MyRectangle.border(10, 5));
	}

}
