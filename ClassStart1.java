//Q. 사각형 넓이 구하는 메소드를 포함한 객체를 만들어 사각형 넓이를 구하시오. 
//Q. 국영수 과목 평균과 총점을 출력할수 있는 객체를 만들어보자. 

package com.human.ex;
class Rectangle{
	private int height=0;
	private int length=0;
	
	public void setHeight(int height) {
		if(height<0) {
			height=0;
		}					//setter
		this.height=height;
	}
	public int getHeight() {
		return this.height;
	}						//getter
	
  //setter(필수는 아니고 옵션): 값을 세팅하는 메소드(나중에 값을 변경하고 싶을때 위가 private이라 직접 고치는게 불가능할때 .. 넓이는 음수가 나올수 없으므로 음수가 나올때 0으로 설정해주는 과정 필요.)
	public void setLength(int length) {
		if(length<0) {
			length=0;
		}
		this.length=length;
	}
	
 //getter(옵션): 값을 얻어오는 메소드
	public int getLength() {
		return this.length;
	}
	
	public Rectangle() {
		}
	public Rectangle(int height,int length) {
		if(length<0) {
			length=0;
		}
		this.height=height;
		this.length=length;
	}
	public int area() {
		return height*length;
	}
}

class Student{
	public int kor;
	public int eng;
	public int mat;
	
	public Student() {
		
	}
	public Student(int kor,int eng, int mat) {
	this.kor=kor;								//위를 이렇게 만들어도 됨. 
	this.eng=eng;
	this.mat=mat;								//public Student(int k,int e, int m){
	}											// kor=k; eng=e; mat=m;}
				
	public int total() {
	  return kor+eng+mat;
	}
	public double avg() {
		return total()/3;
	}
	
}
public class ClassStart1 {

	public static void main(String[] args) {
		Rectangle rc=new Rectangle(5,4); //new 꼭 만들어주기!!!
//		System.out.println("사각형의 넓이는"+rc.area());
		rc.setLength(1);
		rc.setHeight(5);
		System.out.println(rc.area());
		
		Student st=new Student(90,80,70);
		System.out.println("총점은:"+ st.total()+"\n평균은"+st.avg());
	}

}
