//환율 1,200 exchangeRate
//환전세 0.05%
//소지금 20달러
//원화 2만원
//환전하는 프로그램을 구현해보자. 
//
//객체 구현버전 03.25

package com.human.ex;
import java.util.*;
class ExchangeClass{
	public static double exchangeRate=1200; 
	public static double exchangeTax=0;
	public double dollar1=0;
	public double won1=0;
	public double rDollar=0;
	public double rWon=0;
	
	public ExchangeClass() {};
	
	public ExchangeClass(double exchangeRate,double exchangeTax,double dollar1, double won1) {
		
		this.exchangeRate =  exchangeRate;
		this.exchangeTax = exchangeTax;
		this.dollar1 = dollar1;
		this.won1 = won1;
		
	}
	public static void changeExchangeRate() {
		ExchangeClass.exchangeRate=ExchangeClass.exchangeRate*1.1;
	}

	public int exchangeDollartoWon() {
		return (int)((dollar1*exchangeRate)*(1-exchangeTax));
	}
	public int exchangeWontoDollar() {
		return (int)((won1/exchangeRate)*(1-exchangeTax));
	}
	public String display() {
		return "Dollar:"+dollar1+"\nWon:"+won1+"\n환율:"+exchangeRate+"\n환전수수료:"+exchangeTax;
	}
	
	
}

public class ClassStart5 {
	public static void main(String[] args) {
		
		ExchangeClass m1=new ExchangeClass(1200,0.05,20,20000);
		m1.rDollar=m1.exchangeWontoDollar();
		System.out.println(m1.display());
		System.out.println("원에서 달러로 환전한 금액은 "+m1.rDollar+"달러입니다."+"\n");
		System.out.println(ExchangeClass.exchangeRate);
		ExchangeClass.changeExchangeRate();
//		System.out.println(ExchangeClass.exchangeRate);
		(new ExchangeClass()).changeExchangeRate();
		
		
		
		ExchangeClass m2=new ExchangeClass(1300,0.05,30,20000);
		m2.rWon=m2.exchangeDollartoWon();
		System.out.println(m2.display());
		System.out.println("달러에서 원으로 환전할 금액은 "+m2.rWon+"원 입니다."+"\n");

		
	}

}
