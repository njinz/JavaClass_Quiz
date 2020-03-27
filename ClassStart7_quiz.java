//문제2
package com.human.ex;
class Order{
	public static String number="";
	public static String id="";
	public static String date="";
	public static String name="";
	public static String productNumber="";
	public static String address="";
	
	public Order(){}
	public Order(String number, String id,String date,String name,String productNumber,String address) {
		this.number=number;
		this.id=id;
		this.date=date;
		this.name=name;
		this.productNumber=productNumber;
		this.address=address;
		
	}
	public static String Ordersheet() {
		String ordersheet="주문번호:"+number+"\n아이디:"+id+"\n주문날짜:"+date+"\n주문자 이름:"+name+"\n주문상품번호:"+productNumber+"\n배송주소:"+address;
		return ordersheet;
	}
}
public class ClassStart7_quiz {

	public static void main(String[] args) {
		Order o1=new Order("201803120001","abc123","2018년 3월 12일","홍길순","PD0345-12","서울시 영등포구 여의도동 20번지");
		System.out.println(o1.Ordersheet());
	}

}
