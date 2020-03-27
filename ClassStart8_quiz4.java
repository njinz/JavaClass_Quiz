package com.human.ex;
class MyCar{
	public String color="";
	public static int count=0;
	public static int redCount=0;
	
	public MyCar() {}
	public MyCar(String color) {
		this.color=color;
		count++;
		color=color.toLowerCase();
		if(color.equals("red")) {
			redCount++;
		}
	}
	
	public static int getNumOfRedCar() {
		
		return redCount;
	}
	public static int getNumOfCar() {
	
		return count;
	}
	
}

public class ClassStart8_quiz4 {

	public static void main(String[] args) {
		MyCar c1=new MyCar("red");
		MyCar c2=new MyCar("blue");
		MyCar c3=new MyCar("RED");
		
		System.out.printf("자동차수: %d, 빨간색 자동차수: %d", MyCar.getNumOfCar(),MyCar.getNumOfRedCar());

	}

}
