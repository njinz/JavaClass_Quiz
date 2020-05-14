//인터페이스 : 다중 상속을 하기 위해 (상속은 다중상속 불가)
package com.human.ex;


public interface Toy{
	
	public void walk();
	public void run();
	public void alarm();
	public void light();
}
class ToyRobot implements Toy{
	@Override
	public void walk() {System.out.println("The robot can walk.");}
	@Override
	public void run() {System.out.println("The robot can run.");}
	@Override
	public void alarm() {System.out.println("The robot has no alarm function.");}
	@Override
	public void light() {System.out.println("The robot has light function.");}
}

class ToyAirplane implements Toy{
	@Override
	public void walk() {System.out.println("The airplane can not walk.");}
	@Override
	public void run() {System.out.println("The airplane can not run.");}
	@Override
	public void alarm() {System.out.println("The airplane has alarm function.");}
	@Override
	public void light() {System.out.println("The airplane has no light function.");}
}

