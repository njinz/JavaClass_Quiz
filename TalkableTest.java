package com.human.ex;

public class TalkableTest  {
	public static void speak(String s) {
		System.out.println(s);
	}
	
	public static void main(String[] args) {
		Korean k = new Korean();
		American a = new American();
		speak(k.speak());
		speak(a.speak());

	}

}
