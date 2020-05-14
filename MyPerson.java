package com.human.ex;

class MyPerson {

	public String name;
	public int age;
	
	public MyPerson() {}
	public MyPerson(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public void show() {
		System.out.println("사람[ 이름:" +name + "나이:"+ age+"]");
	}
	

}

class MyStudent extends MyPerson{
	public int MyStudentId;
	
	MyStudent(){}
	public MyStudent(String name, int age, int MyStudentId) {
		super.name = name;
		super.age = age;
		this.MyStudentId = MyStudentId;
	}

	
	public void show() {
		
		System.out.println("학생[이름:" +name + "나이:"+ age+ "학번:"+ MyStudentId+"]" );
	}
	
}

class ForeignMyStudent extends MyStudent{
	public String nationality;
	ForeignMyStudent (){}

	public ForeignMyStudent(String name, int age, int MyStudentId, String nationality ) {
		super(name,age,MyStudentId);
		this.nationality = nationality;
	}
	

	public void show() {
		
		System.out.println("유학생[이름:" +name + "나이:"+ age+ "학번:"+ MyStudentId + "국적:"+ nationality+"]");
	}
	
}
