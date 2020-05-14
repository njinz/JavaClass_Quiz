package com.human.ex;

public class PhoneTest {

	public static void main(String[] args) {
		
		Phone[] arr = {new Phone("황진이"), new Telephone("길동이","내일"),new Smartphone("민국이","갤러그")};
		
		for(int i=0;i<arr.length;i++) {
			
			
			if(arr[i] instanceof Telephone) {
				Telephone t = (Telephone)arr[i];
				t.autoAnswering();
				
			}else if(arr[i] instanceof Smartphone) {
				Smartphone s = (Smartphone)arr[i];
				s.playGame();
				
			}else if(arr[i] instanceof Phone){
				Phone p = (Phone)arr[i];
				p.talk();
			}
		}
		
		
//		}
//		arr[0].talk();
//		((Telephone)arr[1]).autoAnswering();
//		((Smartphone)arr[2]).playGame();
	}

}
