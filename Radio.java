package com.human.ex;

public class Radio extends Controller {
	
	
	public Radio(boolean power ) {
		this.power = power;
	}
	
	@Override
	public void show() {
		if(power==true) {
	 System.out.println(getName() + "가 켜졌습니다.");
		}else {
			 System.out.println(getName() + "가 꺼졌습니다.");
		}
	}

	@Override
	public String getName() {
		String name = "라디오";
		return name;
	}

}
