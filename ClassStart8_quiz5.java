package com.human.ex;
class Line{
	public int line=0;
	
	public Line() {}
	public Line(int line) {
		this.line=line;
	}
	public boolean isSameLine(Line l) {
		boolean result=true;
		if(this.line==l.line) {
			result=true;
		}
		return result;
		}
}
public class ClassStart8_quiz5 {

	public static void main(String[] args) {
		Line a=new Line(1);
		Line b=new Line(2);
		System.out.println(a.isSameLine(b));
		System.out.println(a==b);
	}

}
