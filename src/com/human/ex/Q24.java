package com.human.ex;

public class Q24 {

	public static void main(String[] args) {
	 //산수문제 자동출제 
	 System.out.println("산수문제를 자동으로 출제합니다");
	 int correctCount=0;
	 int wrongCount=0;
	
	 while(true) {
     int n1=(int)(Math.random()*100);
	 int n2=(int)(Math.random()*100);
	 int result=(int)(Math.random()*100);
	 
	 System.out.println(n1+"+"+n2+"="+result);
	 if(result==n1+n2) {
		 System.out.println("맞았습니다");
		 correctCount++;
	 }else {
		 System.out.println("틀렸습니다");
		 wrongCount++;
	 }
	 if(wrongCount==3) 
			break;
	}
	 System.out.println("3번이상 틀리셨습니다");
	 System.out.println("맞은횟수:"+correctCount+"틀린횟수:"+wrongCount);
	 System.out.println("종료합니다");
	 
	 }
		
		
		
		
	}

