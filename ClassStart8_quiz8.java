package com.human.ex;
import java.util.*;
class Dice{
	public int face;
	public int roll() {
		Random rd=new Random();
		face=rd.nextInt(6)+1;
		
		return face;
	}
	}

public class ClassStart8_quiz8 {

	public static void main(String[] args) {
		Dice d=new Dice();
		System.out.println("주사위의 숫자 "+d.roll());
		
	
	}

}
