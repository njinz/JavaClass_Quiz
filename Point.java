package com.human.ex;

public class Point {
	protected int x;
	protected int y;
	Point(){}
	Point(int x,int y){
		this.x =x;
		this.y=y;
	}
	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
		
	}

}
class movablePoint extends Point{
	private int xSpeed, ySpeed;
	movablePoint(){}
	movablePoint(int x,int y, int xSpeed, int ySpeed){
		super(x,y);
		this.xSpeed =xSpeed;
		this.ySpeed =ySpeed;
	}
	@Override
	public String toString() {
		return "movablePoint [x=" + x + ", y=" + y + ", xSpeed=" + xSpeed + ", ySpeed=" + ySpeed + "]";
	

	}
}