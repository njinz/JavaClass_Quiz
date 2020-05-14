package com.human.ex;

interface Printable{
	public void a();
}
class A4 implements Printable{
	public void a() {
		System.out.println("A4");
	}
}
class B4 implements Printable{
	public void a() {
		System.out.println("B4");
	}
}
class Call {
	public void invoke(Printable p) {
		p.a();
	}
}
public class PrintableTest {

	public static void main(String[] args) {
		Printable p = new B4();
		Call c = new Call();
		c.invoke(p);

	}

}
