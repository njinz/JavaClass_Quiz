package com.human.ex;

class Cat{
	public int age=0;
	@Override
	public String toString() {
		return "Cat [age=" + age + ", name=" + name + "]";
	}
	public String name="없음";
}

//import java.util.Scanner;

public class JavaStart02 {

	public static void main(String[] args) {
		
//		//12월~2월은 겨울, 3월~5월은 봄 , 6월~8월은 여름 9월~11월 가을로 출력해보자. 
//		Scanner sc=new Scanner(System.in);
//		System.out.println("달을 입력하세요");
//		int month=sc.nextInt();
//		switch(month) {
//		case 12:case 1:case 2:							  //같은 실행명령을 가진다면 케이스별로 묶기
//			System.out.println(month+"월은 겨울입니다.");
//			System.out.println(month+"월은 좋은 계절입니다."); //한 케이스에 여러 개의 실행명령도 가능
//			break;
//		case 3:case 4:case 5:
//			System.out.println(month+"월은 봄입니다.");
//			break;
//		case 6:case 7:case 8:
//			System.out.println(month+"월은 여름입니다.");
//			break;
//		}
//		
//		Scanner scan=new Scanner(System.in);
//		System.out.println("월을 입력하세요");
//		int month1=scan.nextInt();
//		if(month1==12||month1==1||month1==2){
//			System.out.println(month1+"월은 겨울입니다.");}
//			else if(month1==3||month1==4||month1==5){
//			System.out.println(month1+"월은 봄입니다.");}
//			else if(month1==6||month1==7||month1==8){
//			System.out.println(month1+"월은 여름입니다.");}
//			else if(month1==9||month1==10||month1==11){
//			System.out.println(month1+"월은 가을입니다.");}
//			else {
//				System.out.println("잘못 입력된 숫자입니다");
//			}
//		
//		
//		
//		java.util.Random rd=new java.util.Random();
//		int i=rd.nextInt(5);
//		System.out.println(i);
//		
//		
//		
//		int a,b,c,temp;
//		Scanner sc1=new Scanner(System.in);
//		System.out.println("세 수를 입력해주세요");
//		a=Integer.parseInt(sc1.nextLine());
//		b=Integer.parseInt(sc1.nextLine());
//		c=Integer.parseInt(sc1.nextLine());
//		if(b>c&&b>a) {
//			temp=a;
//			a=b;
//			b=temp;
//		}
//		if(c>a&&c>b) {
//			temp=a;
//			a=c;
//			c=temp;
//			}
//		
//		if(c>b) {
//			temp=b;
//			b=c;
//			c=temp;
//		}
//		System.out.println();
//		System.out.println(a+">"+b+">"+c);
//	
		
//			System.out.println("상자의 부피는");
//			System.out.format("%6f",27000.);
//			System.out.println("입니다");
		
//		Scanner sc= new java.util.Scanner(System.in);
//		System.out.println("두 수를 입력하세요>>");
//		int a=sc.nextInt();
//		int b=sc.nextInt();
//		int c=0;
//		if(a>b) {
//			}else
//			{c=a;
//			a=b;
//			b=c;
//			}
//			
//		System.out.print(a);
//		System.out.println(b);
//		int i=0;
//		while(i<3) {
//			System.out.println("안녕");
//			i++;
//		}System.out.println("종료");
//		
//		String str= new String("안녕");
//		int h=0;
//		for(h=0;h<3;h++) {
//			System.out.println("안녕");
//		} System.out.println("안녕이"+ h+"번 출력됨");
//		
//		int a,sum=0;
//		for(a=0;a<11;a++) {
//			sum+=a;
//		}System.out.printf("1부터 10까지의 합은 %d입니다",sum);
//		
//		Scanner sc=new java.util.Scanner(System.in);
//		System.out.println("문자입력>>");
//		String text=sc.nextLine();
//		String hi=new String("안녕");
//		String bi=new String("잘가");
//		String gn=new String("잘자");
//		if(text.equals(hi)) {
//			System.out.println("너도"+hi);
//		}else if(text.equals(bi)) {
//			System.out.println("너도"+bi);
//		}else if(text.equals(gn)) {
//			System.out.println("너도"+gn);
//		}else {
//			System.out.println("잘못된 입력입니다");
//		}
//		
//		Scanner sc=new java.util.Scanner(System.in);
//		System.out.println("문자입력>>");
//		String text1=sc.nextLine();
//		
//			switch(text1){
//			case "안녕":
//				System.out.println("너도 안녕");
//				break;
//			case "잘자":
//				System.out.println("너도 잘자");
//				break;
//			default:
//				System.out.println("잘못된 문자열입니다");
//			}
				
				
//				Scanner sc=new java.util.Scanner(System.in);
//				int max=Integer.MIN_VALUE;
//				int min=Integer.MAX_VALUE;
//				
//				for(int i=0;i<5;i++) {
//					System.out.println("수를 입력>>");
//					int input=sc.nextInt();
//					if(input>max) {
//						max=input;
//					}
//					if(input<min) {
//						min=input;
//					}
//				}
//				System.out.println("가장 큰수:"+max+"가장 작은수:"+min);
//		
//		
//		Scanner sc=new java.util.Scanner(System.in);
//		System.out.println("가위,바위,보 중 하나를 입력하세요");
//		String userData=sc.nextLine();
//		java.util.Random rd=new java.util.Random();
//		int computerNum=rd.nextInt(3);
//		String winner="";
//		String computerData=" ";
//		switch(userData) {
//		case "가위":
//			switch(computerNum) {
//			case 0:
//				computerData="가위";
//				winner="비김";
//				break;
//			case 1:
//				computerData="바위";
//				winner="컴퓨터 승";
//				break;
//			case 2:
//				computerData="보";
//				winner="승리하였습니다!";
//				break;
//			
//			
//			}
//		 case "바위":
//			 switch(computerNum) {
//			 case 0:
//				 computerData="가위";
//				 winner="승리하였습니다!";
//				 break;
//			 case 1:
//				 computerData="바위";
//				 winner="비김";
//				 break;
//			 case 2:
//				 computerData="보";
//			 	 winner="컴퓨터 승";
//			 	 break;
//			 default:
//				 System.out.println("잘못된 입력");
//				 break;
//			 }
//		 case "보":
//			 switch(computerNum) {
//			 case 0:
//				 computerData="가위";
//				 winner="컴퓨터승";
//				 break;
//			 case 1:
//				 computerData="바위";
//				 winner="승리하였습니다!";
//				 break;
//			 case 3:
//				 computerData="보";
//				 winner="비김";
//				 break;
//		     default:
//		    	 System.out.println("잘못된 입력");
//		    	 break;
//			 }
//			
//		}
//		    System.out.println("나:"+userData);
//			System.out.println("컴퓨터:"+computerData);
//			System.out.println("승패:"+winner);
		
		//삼항 연산자 이용해 두수 비교하는 프로그램 구현. 
//		Scanner sc=new java.util.Scanner(System.in);
//		System.out.println("두 수를 입력하세요");
//		int a,b;
//		int temp=0;
//		a=sc.nextInt();
//		b=sc.nextInt();
//		temp=(a>b)? a:b;
//		System.out.println(temp);
//		
//		
//		boolean b=true;
//		boolean b1=false;
//		boolean []bArray=new boolean[4];
//		bArray[0]=false;
//		bArray[1]=b1;
//		bArray[2]=bArray[0];
//		bArray[3]=true;
//		
//		System.out.println(Arrays.toString(bArray));
		
		Cat cat1=new Cat();
		cat1.name="고1";
//		cat1.age=18;
//		Cat cat2=cat1;
//		cat2.name="고2";
//		cat2.age=19;
//		Cat cat3=new Cat();
//		cat3.name="고3";
//		cat3.age=20;
//		Cat cArr[]=new Cat[3];
//		cArr[0]=new Cat();
//		cArr[0].age=11;
//		cArr[0].name="고1";
//		cArr[1]=cat1;
//		cArr[2]=cat2;
//		System.out.println(Arrays.toString(cArr));
		
		
		
	}
		
	}


