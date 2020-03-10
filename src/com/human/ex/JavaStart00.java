package com.human.ex;

public class JavaStart00 {

	public static void main(String[] args) {
		java.util.Scanner scanner=new java.util. Scanner(System.in);
		System.out.print("상자의 가로,세로,높이를 한번에 입력:");
		String strr=scanner.next();
		double d1=Double.parseDouble(strr);
		double d2=Double.parseDouble(strr);
		double d3=Double.parseDouble(strr);
		System.out.println("상자의 부피는");
		System.out.format("%6f",(d1*d2*d3));
		System.out.println("입니다.");
		scanner.close();
		
		int i11=30;
		double d4=3.141592;
		String str="안녕하세요";
		str=String.format("%f,%.3f,%3f",d4,d4,d4);
		
		String str3=String.format("%%\"");
		System.out.println(str3);

		}

			}
