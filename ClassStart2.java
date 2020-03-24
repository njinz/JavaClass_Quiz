//Q. 우리 주변의 사물을 객체로 만들어 출력하는 프로그램을 만들어보자. (핸드폰,TV,엘리베이터+하나 추가) 이름,가격->상태:필드(인스턴스변수)가 된다. 
//핸드폰 정보 출력,전화걸기.메시지보내기(본인핸드폰 번호,받는사람 핸드폰 번호,내용)->행동: 메소드가 된다. 
package com.human.ex;
class Phone{
	public String name="";
	public int price=0;
	public String from="";
	public String to="";
	public String text="";
	
	public Phone() {
		}
	
	public Phone(String name,int price) {
		this.name=name;
		this.price=price;
	}
	public String spec() {
		return name+price;
	}
	public Phone(String from,String to,String text) {
		this.from=from;
		this.to=to;
		this.text=text;
	}
	public String msg() {
		return "보내는 사람:"+from+"\n받는 사람:"+to+"\n"+"내용:\n"+text;
	}
	
}
class Tv{
	public String name="";
	public String company="";
	public int channel=0;
	public String program="";

	public Tv() {
		
	}
	public Tv(String name,String company) {
		this.name=name;
		this.company=company;
	}
	public String info() {
		return "제품이름: "+name+"\n제조회사:"+company;
	}
	public Tv(int channel,String program) {
		this.channel=channel;
		this.program=program;
	}
	public String channel() {
		return channel+":"+program;
	}
}
class Elevator{
	public String name="";
	public double year=0;
	public int floor=0;
	public String place="";
	
	public Elevator() {
		
	}
	public Elevator(String name,double year) {
		this.name=name;
		this.year=year;
	}
	public String getInfo() {
		return "이름: "+name+"\n제조연월:"+year;
	}
	public Elevator(int floor,String place) {
		this.floor=floor;
		this.place=place;
	}
	public String fInfo() {
		return floor+"층:"+place;
	}
	
}
class Car{
	public int number=0;
	public String color="";
	public int second=0;
	public int speed=0;
	
	public Car() {
		}
	public Car(int number,String color) {
		this.number=number;
		this.color=color;
		}
	public String getInfo() {
		return "차 번호:"+ number+" "+"색상:"+ color;
	}
	public Car(int second,int speed) {
		this.second=second;
		this.speed=speed;
	}
	public String getSpeed() {
		return second+"초간 속도를 시속"+speed+"km로 과속함.";
	}
	
}

public class ClassStart2 {

	public static void main(String[] args) {
		Phone p=new Phone("갤럭시z:",250);
		Phone p2=new Phone("아이폰12:",350);
		String spec=p.spec();
		String spec2=p2.spec();
		System.out.println("핸드폰 정보출력:"+"\n"+spec);
		System.out.println(spec2);
		
		Phone i=new Phone("짱구","엄마","엄마,초코비 사주세요~");
		Phone i2=new Phone("펭수","뚝딱이","안녕 뚝딱아.");
		String msg=i.msg();
		String msg2=i2.msg();
		System.out.println("----------------문자보내기----------------\n");
		System.out.println(msg+"\n");
		System.out.println(msg2);
		System.out.println("---------------------------------------");
		
		Tv t=new Tv("Oled5","LG전자");
		Tv t2=new Tv("UHD 8K","삼성전자");
		System.out.println(t.info());
		System.out.println(t2.info());
		System.out.println();
		
		Tv c=new Tv(1, " KBS joy");
		Tv c2=new Tv(5, " SBS");
		Tv c3=new Tv(7, " KBS 1");
		Tv c4=new Tv(11, " MBC");
		System.out.println("<채널안내표>");
		System.out.println(c.channel());
		System.out.println(c2.channel());
		System.out.println(c3.channel());
		System.out.println(c4.channel());
		System.out.println();
		
		Elevator e=new Elevator("GR1",20.01);
		Elevator e2=new Elevator("GM2",18.12);
		Elevator e3=new Elevator("IRIS",19.07);
		System.out.println("엘리베이터 정보");
		System.out.println(e.getInfo());
		System.out.println(e2.getInfo());
		System.out.println(e3.getInfo());
		System.out.println();
		
		Elevator f=new Elevator(1,"하나약국");
		Elevator f2=new Elevator(2,"1001안경");
		Elevator f3=new Elevator(3,"속편한내과");
		Elevator f4=new Elevator(4,"네모세모치과");
		System.out.println("층별안내도");
		System.out.println(f.fInfo());
		System.out.println(f2.fInfo());
		System.out.println(f3.fInfo());
		System.out.println(f4.fInfo());
		System.out.println();
		
		Car s1=new Car(1590,"white");
		Car s2=new Car(8000,"black");
		Car s3=new Car(1239,"green");
		System.out.println("과속차량 정보");
		System.out.println(s1.getInfo());
		System.out.println(s2.getInfo());
		System.out.println(s3.getInfo());
		System.out.println();
		
		Car car1=new Car(3,70);
		Car car2=new Car(10,90);
		Car car3=new Car(8,100);
		System.out.println("과속단속장");
		System.out.println(car1.getSpeed());
		System.out.println(car2.getSpeed());
		System.out.println(car3.getSpeed());
	}

}
