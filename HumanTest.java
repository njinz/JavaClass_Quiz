package com.human.ex;

public class HumanTest {

	public static void main(String[] args) {
		Human.echo();
		
		Student s = new Student(20);
		s.print();
		s.eat();
		
		MyPerson p = new MyPerson();
//		p.print();
//		p.eat();
	}

}
