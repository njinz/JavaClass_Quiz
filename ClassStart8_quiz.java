//문제3 
//1)x 2)추상성 상속성 다형성 3)클래스 4)인스턴스필드 5)메소드
//문제4
//1)3 2)클래스메소드 3)Circle c1=new Circle; c1.radius;
//문제5
//1)x 2)o 3)o 4)x 5)getter setter
//1)2 2)2 3)x 4)x 5)x
package com.human.ex;

class Printer {
	private int numberOfPapers = 0;
	public int amount = 0;
	private boolean duplex;
	public Printer() {
	}

	public Printer(int numberOfPapers, int amount) {
		this.numberOfPapers = numberOfPapers;
		this.amount = amount;
	}
	public Printer(int numberOfPapers) {
		this.numberOfPapers = numberOfPapers;
	}
	public Printer(int numberOfPapers,boolean duplex) {
		this.numberOfPapers = numberOfPapers;
		this.duplex=duplex;
	}

	public void setNumberOfPapers(int numberOfPapers) {
		
		this.numberOfPapers=(numberOfPapers - amount);
		
		if (numberOfPapers < 0) {
			this.numberOfPapers = 0;
		}else {
			this.numberOfPapers=(numberOfPapers - amount);
		}
	}

	public void setDuplex(boolean duplex) {
		
	}
	public int getNumberOfPapers() {
		
		return this.numberOfPapers;
	}
	public boolean getDuplex() {
		return this.duplex;
	}
    
	public void print(int numberOfPapers,int amount) {
		System.out.println(amount + "장 출력합니다.남은 용지는" + (numberOfPapers - amount) + "장입니다.");
		
	}
	
	public void print(int amount) {
		if(this.numberOfPapers<=0) {
			System.out.println("용지가 부족합니다.");
		}else if (amount > numberOfPapers) {
			System.out.println("모두 출력하려면 용지가" + Math.abs((amount - numberOfPapers)) + "장이 부족합니다." +numberOfPapers + "장만 출력합니다.");
		}else{
			System.out.println(amount + "장 출력합니다.남은 용지는" + (numberOfPapers - amount) + "장입니다.");
		}
	
		
		if(duplex==true) {
			if((amount/2)+1<=this.numberOfPapers){
				System.out.println("양면으로"+((amount/2)+1)+"장 출력했습니다.현재"+ (this.numberOfPapers-((amount/2)+1)) + "장 남아있습니다.");
			}
		}else if(duplex==false) {
			if(amount>this.numberOfPapers) {
				System.out.println("단면으로 모두 출력하려면"+(amount-this.numberOfPapers)+"장 부족합니다."+this.numberOfPapers+"장만 출력합니다.");
			}
			
		}
		
	
	}
	
	}


public class ClassStart8_quiz {

	public static void main(String[] args) {

		Printer p1 = new Printer();
		p1.print(100,30);
		
		
		Printer p2=new Printer(10);
		p2.print(20);
		p2.print(10);
		System.out.println(p2.getNumberOfPapers());
		
		Printer p3=new Printer(20,true);
		p3.print(25);
		
		Printer p4=new Printer(5);
		p4.setDuplex(false);
		p4.print(10);
		System.out.println(p4.getNumberOfPapers());
		
	}
}