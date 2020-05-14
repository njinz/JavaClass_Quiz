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
		System.out.println("���[ �̸�:" +name + "����:"+ age+"]");
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
		
		System.out.println("�л�[�̸�:" +name + "����:"+ age+ "�й�:"+ MyStudentId+"]" );
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
		
		System.out.println("���л�[�̸�:" +name + "����:"+ age+ "�й�:"+ MyStudentId + "����:"+ nationality+"]");
	}
	
}
