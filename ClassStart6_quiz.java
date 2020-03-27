//클래스 문제1
package com.human.ex;
class Person{
	public static int age=0;
	public static String name="";
	public static boolean isMarried=true;
	public static int child=0;
	
	public Person() {
	}
	
	public Person(int age,String name,boolean isMarried,int child) {
		this.age=age;
		this.name=name;
		this.isMarried=isMarried;
		this.child=child;
	}
	public static String whoAreYou() {
		return age+"세\n"+name+"\n"+child+"명";
	}
}
public class ClassStart6_quiz {

	public static void main(String[] args) {
		Person p1=new Person(40,"JAMES",true,3);
		if(Person.isMarried=true) {
			System.out.println("결혼했음");
		}
		System.out.println(p1.whoAreYou());
	}

}
