package com.human.ex;

public class GirlTest {

	public static void main(String[] args) {
		Girl[] girls = {new Girl("������"), new GoodGirl("����"), new BestGirl("Ȳ����")};
//		Girl g1 = new Girl();
//		Girl g2 = new GoodGirl();
//		GoodGirl gg = new BestGirl();
//		
		for(Girl g: girls) {
			g.show();
		}
		
	}

}
