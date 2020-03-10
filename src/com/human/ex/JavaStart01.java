package com.human.ex;

public class JavaStart01 {

	public static void main(String[] args) {
		
			    //두수에게 숫자를 입력받아 1004이면 '암호가 맞음' 아니면 틀림
//				java.util.Scanner sc=new java.util.Scanner(System.in);
//				System.out.println("암호를 입력하세요");
//				String str=sc.nextLine();
//				int pw=Integer.parseInt(str);
//				if(pw==1004) {
//					System.out.println("암호가 맞음");
//				}
//				else {
//					System.out.println("암호가 틀림");
//				}
			
				//안녕 "너도 안녕" 잘가 "너도 잘가" 잘자 "너도 잘자" 출력 
				java.util.Scanner scc=new java.util.Scanner(System.in);
				System.out.println("문자를 입력하세요");
				String str1=scc.nextLine();
				String hi=new String("안녕");
				String by=new String("잘가");
				String gn=new String("잘자");
				if(str1.equals(hi)){
					System.out.println("너도"+str1);
				}
				else if(str1.equals(by)) {
					System.out.println("너도"+str1);
				}
				else if(str1.equals(gn)) {
					System.out.println("너도"+str1);
				}
				else System.out.println("꺼져");
				
				//안녕을 3번 출력하라
//				int h=0;
//				String hii=new String("안녕");
//				for(h=0;h<3;h++) {
//					System.out.println(hii);
//				}
//				System.out.println("안녕이"+h+"번 출력되었습니다.");
//				
				int h=0;
				String str=new String("안녕");
				while(h<3) {
					System.out.println(str);
					h++;
				}
				
				
		}

	}

