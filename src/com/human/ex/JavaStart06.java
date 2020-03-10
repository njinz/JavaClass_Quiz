package com.human.ex;

public class JavaStart06 {

	public static void main(String[] args) {
java.util.Scanner sc=new java.util.Scanner(System.in);
		
		String stringInput="";
		
		System.out.println("투입할 금액을 입력하세요.");
		int input=Integer.parseInt(sc.nextLine());
		
		while(!stringInput.equals("4")) {
			
			
			System.out.println("음료를 선택하세요.");
			System.out.println("1-사이다 700, 2-콜라 500, 3-환타 350, 4-반환, 5-투입");
			stringInput=sc.nextLine();
			
			switch(stringInput) {
				case "1":
					if(input>700) {
						System.out.println("사이다를 선택하였습니다.");
						System.out.println("현재 남은 금액은 "+(input-700)+"원 입니다.");
						input=input-700;
						break;
					}else {
						System.out.println("잔액이 부족합니다.");
					}
					break;
				case "2":
					if(input>500) {
						System.out.println("콜라를 선택하였습니다.");
						System.out.println("현재 남은 금액은 "+(input-500)+"원 입니다.");
						input=input-500;
						break;
					}else {
						System.out.println("잔액이 부족합니다.");
					}
					break;
				case "3":
					if(input>350) {
						System.out.println("환타를 선택하였습니다.");
						System.out.println("현재 남은 금액은 "+(input-350)+"원 입니다.");
						input=input-350;
						break;
					}else {
						System.out.println("잔액이 부족합니다.");
					}
				case "4":
					break;
				case "5":
					System.out.println("투입할 금액을 입력하세요.");
					int input1=Integer.parseInt(sc.nextLine());
					input=input+input1;
					break;
			}
		
		}
		int A=input/1000;
		int B=(input%1000)/500;
		int C=(input%1000%500)/100;
		int D=(input%1000%500%100)/50;
		System.out.println("잔액은 천원 "+A+"개, 500원 "+B+"개, 100원 "+C+"개, 50원 "+D+"개 입니다.");
	

	}

}
