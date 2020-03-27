package com.human.ex;
class Member{
	private String name="";
	private String id="";
	private int password=0;
	private int age=0;
	
	public void setName(String name) {
		this.name=name;
	}
	public void setId(String id) {
		this.id=id;
	}
	public void setPassword(int password) {
		this.password=password;
	}
	public void setAge(int age) {
		this.age=age;
	}
	public String getName() {
		return this.name;
	}
	public String getId() {
		return this.id;
	}
	public int getPassword() {
		return this.password;
	}
	public int getAge() {
		return this.age;
	}
	
	public Member() {}
	public Member(String name,String id,int password,int age) {
		if(age<=0) {
			age=0;
		}else {
			this.age=age;
		}
		this.name=name;
		this.id=id;
		this.password=password;
	}
	public void MemberManage() {
		display();
	}
	public void display() {
		System.out.println("이름:"+name);
		System.out.println("id:"+id);
		System.out.println("password:"+password);
		System.out.println("나이:"+age);
	}
	
}
public class ClassStart8_quiz3 {

	public static void main(String[] args) {
		Member m=new Member("홍길동","hong1234",2455,30);
		m.MemberManage();
		Member[] marr=new Member[3];
		marr[0]=m;
		marr[1]=new Member("김나나","nana1234",20102,10);
		m.setAge(20);
		
	}

}
