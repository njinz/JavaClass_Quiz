package com.human.ex;
class Cat{          
	public String name="이름";//인스턴스 필드(인스턴스 변수)
	public int age=0; //생성자 메소드
	//(중요)생성자 메소드 특징 :인스턴스 변수의 값을 초기화하는데 사용
	//1.리턴값이 없다.
	//2.클래스명과 이름이 동일하다. 
	
	public Cat() {
		 System.out.println("기본생성자함수 실행"); //안사용하더라도 만들어두는게 좋다. 
	}
	public Cat(String name) {
		this(name,1);  //오버로딩이 가능하다. 같은 클래스 명 으로 여러개 쓸수 있음. cat() cat(String name) string(string name, int age) 처럼.
		
	}
	public Cat(String name,int age) {
		this.name=name; //this 는 인스턴스 필드를 초기화해주는 역할. 여기서 name은 인스턴스 필드의 name을 의미. 
		this.age=age;  //변수접근순서 1.지역변수 2.인스턴스 필드 3.클래스필드
	}
	
	//접근제한자:
	//public default protected private
	//default, protected 쓰지 않는게 좋다. 
	//public : 같은 클래스,다른 클래스,같은 패키지(폴더),상속받은 클래스 에서 다 사용가능.
	//private: 같은 클래스 안에서만 사용가능. (line3 public->private으로 바꾸면 line50에러남. 서로 클래스가 다르기때문) Cat!=ClassStart
	public void catPrint() { //인스턴스메소드=멤버메소드(static이 없음)
		System.out.println(name+":"+age); //객체 안에 함수를 넣은것.
	}
	public void catAddAge(int a) {
		age=age+a;
	}

}

public class ClassStart {
//	public static void catPrint(Cat c) {
//		System.out.println(c.name+":"+c.age);
//		}
	
	public static void main(String[] args) { //클래스 메소드=static method=정적 메소드(static을 붙임)
//		Cat c1=new Cat();
//		c1.name="고1";
//		c1.age=12;
//		Cat c2=new Cat();
//		c2.name="고2";
//		c2.age=13;
//		Cat c3=new Cat();
//		c3.name="고3";
//		c3.age=14;
		
		Cat c1=new Cat("고1",12);
		c1.age=16;
		Cat c2=new Cat("고2",13);
		Cat c3=new Cat("고3",14);
		Cat c4=new Cat();
		Cat c5=new Cat("고5");
		c1.catAddAge(5); //고양이 나이를 매개변수 만큼 증가시키거나 감소시키는 함수를 만들어보자. 12->17로 출력됨.
						 //catAddAge
		
		c1.catPrint(); //인스턴스 메소드 출력 방법.
		c2.catPrint();
		c3.catPrint();
		c4.catPrint();
		c5.catPrint();
		
//		System.out.println(c1.name+":"+c1.age);
//		System.out.println(c2.name+":"+c2.age);   <-절차적방식(매번 복사해줘야 하는 번거로움)
//		catPrint(c1);
//		catPrint(c2);                          //<- 함수적 방식
//		catPrint(c3);
		
		
	}

}
