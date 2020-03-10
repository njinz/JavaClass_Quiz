package com.human.ex;
import java.util.Arrays;
import java.util.Scanner;
public class JavaStart05 {

	public static void main(String[] args) {
//		System.out.println(Math.sqrt(9)); //제곱근 구하는 식
		
		int arr1[]= {1,2,3,4,8};
		System.out.println(java.util.Arrays.toString(arr1));
		int arr2[]= {2,4,6,8,10};
		System.out.println(Arrays.toString(arr2));
		
		//자판기 구현
		
		Scanner sc=new Scanner(System.in);
		String str="";
		
		System.out.println("돈을 투입해주세요");
		
		int deposit=Integer.parseInt(sc.nextLine());
		while(!str.equals("4")) {
		System.out.println("1.사이다 2.콜라 3.환타 4.종료 중 하나 선택>>");
		str=sc.nextLine();
		switch(str) {
		case "1":
			if(deposit<700) {
				System.out.println("잔액부족");}
			else{
				
				System.out.println("잔돈은"+(deposit-700)+"입니다");
				deposit=deposit-700;
				
			}
			break;
		case "2":
			if(deposit<500) {
				System.out.println("잔액부족");}
			else{
				deposit=deposit-500;
			System.out.println("잔돈은"+deposit+"입니다");
		
			}
			break;
		case "3":
			if(deposit<350) {
				System.out.println("잔액부족");}
			else{
				deposit=deposit-350;
				System.out.println("잔돈은"+deposit+"입니다");
				break;
				}
			break;
		case "4":
			System.out.println("종료off");
			
			int d1=deposit/1000;
			int d2=deposit/500;
			int d3=deposit%500/100;
			int d4=deposit%500%100/50;
			System.out.printf("거스름돈은 1000원 %d장,500원 %d장, 100원 %d장, 50원 %d장 입니다",d1,d2,d3,d4);
			break;
			
			default:
				break;
			
		}
			
		}
		
	}

}
