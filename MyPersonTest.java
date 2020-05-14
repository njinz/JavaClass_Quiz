package com.human.ex;

public class MyPersonTest {

	public static void main(String[] args) {

		MyPerson[] arr = {new MyPerson("길동이",22),new MyStudent("황진이",23,100),
				new ForeignMyStudent("AMY", 30,200,"USA")};
		for(MyPerson mp : arr) {
			mp.show();
		}

}
}