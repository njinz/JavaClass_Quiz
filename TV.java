package com.human.ex;

public class TV extends Controller {
	public boolean power;
	
	public TV(boolean power) {
		this.power = power;
	}
	

	public void show() {
		if(power==true) {
			System.out.println(getName()+ "가 켜졌습니다.");
		}else {
			System.out.println(getName()+"가 꺼졌습니다.");
		}
	}

	@Override
	public String getName() {
		String returnValue ="TV";
		return returnValue;
	}
	

}
