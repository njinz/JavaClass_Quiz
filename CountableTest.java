package com.human.ex;

public class CountableTest {

	public static void main(String[] args) {
		Countable [] m = {new Bird("뻐꾸기",5), new Bird("독수리",2), new Tree("사과나무",10), new Tree("밤나무",7) };
		
		for (Countable e : m) 
			e.count();
		
		for(int i=0;i<m.length;i++) {
			//타입에 따라 fly or ripen
			if(m[i] instanceof Bird) {   //instance of : 해당 클래스 객체 여부를 확인할때.
				Bird bird  =(Bird)m[i];
				
				bird.fly();
				
			}else if(m[i] instanceof Tree) {
				Tree tree = (Tree)m[i];
				
				tree.ripen();
			}
		}
	}

}
