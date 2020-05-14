package com.human.ex;

public class CountableTest {

	public static void main(String[] args) {
		Countable [] m = {new Bird("���ٱ�",5), new Bird("������",2), new Tree("�������",10), new Tree("�㳪��",7) };
		
		for (Countable e : m) 
			e.count();
		
		for(int i=0;i<m.length;i++) {
			//Ÿ�Կ� ���� fly or ripen
			if(m[i] instanceof Bird) {   //instance of : �ش� Ŭ���� ��ü ���θ� Ȯ���Ҷ�.
				Bird bird  =(Bird)m[i];
				
				bird.fly();
				
			}else if(m[i] instanceof Tree) {
				Tree tree = (Tree)m[i];
				
				tree.ripen();
			}
		}
	}

}
