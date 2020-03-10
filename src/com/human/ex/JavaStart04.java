package com.human.ex;

import java.util.Arrays;

public class JavaStart04 {

	public static void main(String[] args) {
		int fArray[]=new int[50];
		for(int i=2;i<50;i++) {
			fArray[0]=1;
			fArray[1]=1;
			
			fArray[i]=fArray[i-2]+fArray[i-1];
		}
		System.out.println(Arrays.toString(fArray));
		}

	@Override
	public String toString() {
		return "JavaStart04 [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}

	}


