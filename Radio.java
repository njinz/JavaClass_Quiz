package com.human.ex;

public class Radio extends Controller {
	
	
	public Radio(boolean power ) {
		this.power = power;
	}
	
	@Override
	public void show() {
		if(power==true) {
	 System.out.println(getName() + "�� �������ϴ�.");
		}else {
			 System.out.println(getName() + "�� �������ϴ�.");
		}
	}

	@Override
	public String getName() {
		String name = "����";
		return name;
	}

}
