package com.human.ex;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class BookTest extends Book  {

public BookTest(int price) {
		super(price);
	
}


public static void main(String[] args) {
	
		Book[] bArr = {new Book(1000),new Book(2000),new Book(3000)};
		
		
		ArrayList<Book> arr = new ArrayList<Book>();
		arr.add(bArr[0]);
		arr.add(bArr[1]);
		arr.add(bArr[2]);
		
		Collections.sort(arr,new Comparator<Book>() {

			@Override
			public int compare(Book arg0, Book arg1) {
				int returnValue=0;
				if(arg0.price>arg1.price) {
					returnValue=-1;
				}else if(arg0.price<arg1.price) {
					returnValue=1;
				}else {
					returnValue=0;
				}
				return returnValue;
			}
			
		});
		System.out.println("가격정렬:");
		for(Book b : arr) {
			System.out.println(b.price);
		}
			
		
	}







}
