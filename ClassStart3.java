package com.human.ex;
//용어정리
//class Card생성후 card의 높이,너비,모양,숫자 담아보자.
//class Card{
//클래스 안에 생성한 것들
//1.인스턴스필드(변수=멤버변수) 2.클래스필드(변수=static변수,정적변수) 3.인스턴스메소드 4.클래스메소드 5.생성자메소드

//}

//<인스턴스필드와 클래스필드의 차이점>
//인스턴스필드:각각의 인스턴스들이 값을 따로 가지는 변수. 사용시 new로 선언해 새롭게 힙에 공간 할당 필요. 
//클래스필드: 모든 인스턴스에서 값을 공유하는 변수
//
//Card c1=new Card(); ->c1이인스턴스화되었다.
//Card c2=new Card();

//인스턴스:객체가 사용할수 있도록 메모리에 올라간 형태 : c1,c2
//클래스:실제 프로그램에서 객체구현시 사용하는 키워드:Card
class Card{
	public static int width=100; //값을 공유하므로 클래스필드로 선언.
	public static int height=200;
	public String shape="스페이드";//인스턴스필드로 선언.
	public String number="2";
	//카드에 넓이를 리턴하는 함수를 만들어보자. 
	//클래스메소드
	public static int area() {
		return Card.height*Card.width; //앞에 클래스 이름 적어주기(같은 클래스내에 있다면 생략가능)
		
	}
	//인스턴스메소드. static(클래스메소드)과 달리 .new로 따로 할당하여 heap에 저장이필요.
	public String cardDisplay() {
		return shape+number;
	}
	public Card() {
		
	}    //기본생성자 메소드
	public Card(String shape,String number) {  //생성자 메소드
		this.shape=shape;
		this.number=number;
	}

}
public class ClassStart3 {

	public static void main(String[] args) {
		System.out.println(Card.area());
		Card c=new Card(); //c를 참조변수라고 한다. 그 안에 들은 값을 참조값이라고 한다.(메모리주소가 값이 됨.)
		System.out.println(c.cardDisplay());
	}
	
}
