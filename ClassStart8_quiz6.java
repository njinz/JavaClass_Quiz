//1)util u=new Util;
//2)s.i=3,o.i=1
//3)this()는 제일 처음 선언해야 한다.
//4)static추가

package com.human.ex;
class Complex{
	public double a=0.0;
	public double b=0.0;
	
	public Complex() {}
	public Complex(double a) {
		this.a=a;
	}
	public Complex(double a,double b) {
		this.a=a;
		this.b=b;
	}
	public String print() {
		String str="";
		str=a+"+"+b+"i";
		return str;
	}
}
	


public class ClassStart8_quiz6 {

	public static void main(String[] args) {
		Complex c=new Complex(2.0);
		Complex c1=new Complex(1.5,2.5);
		System.out.println(c.print());
		System.out.println(c1.print());
	}

}
