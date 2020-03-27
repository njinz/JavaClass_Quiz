package com.human.ex;
//1)생성자 2)인스턴스변수 3)메소드
class MyDate{
	private int day=0;
	private int month=0;
	private int year=0;
	
	public MyDate(int day,int month,int year) {
		if(day<=0||month<=0||year<=0) {
			day=0;
			month=0;
			year=0;
			
		}else {
			this.day=day;
			this.month=month;
			this.year=year;
		}
	}
	public void setDay(int day) {
		  if(day<0) {
			  day=0;
		  }
	}
	public int getDay() {
		return this.day;
	}
	public void setMonth(int month) {
		if(month<0) {
			  month=0;
		  }
	}
	public int getMonth() {
		return this.month;
	}
	
	public void setYear(int year) {
		if(year<0) {
			  year=0;
		  }
	}
	public int getYear() {
		return this.year;
	}
	
	
	
	
	public boolean isValid() {
		boolean isTrue=false;
		if(month<0||month>12) {
		      isTrue= false;	
		}
		else if(month==1||month==3||month==5||month==7||month==8||month==10||month==12) {
			if(day>31) {
				isTrue= false;
			}else {
				isTrue= true;
			}
		}
		else if(month==4||month==6||month==9||month==11) {
			if(day>30) {
				isTrue= false;
				}
			}
		else if(month==2) {
			if(day>28) {
				isTrue= false;
			}
		
			
		}	
			if(isTrue==true){
				System.out.println("유효합니다");
			}else {
				System.out.println("유효하지 않습니다.");
			}
			return isTrue;
     }
	
}
public class ClassStart8_quiz1 {

	public static void main(String[] args) {
		MyDate m1=new MyDate(30,2,2000);
		System.out.println(m1.isValid());
		
		MyDate m2=new MyDate(2,10,2006);
		System.out.println(m2.isValid());

	}

}
