package com.human.ex;

//productManager:클래스 상품들을 관리하는 프로그램 을 만들어보자 
//1.상품등록 2.상품입고 3.상품출고 4 상품검색 5.상품 재고 확인
class ProductManager{
	public static java.util.Scanner sc=new java.util.Scanner(System.in);
	public int arrindex=0;
	public Product[] arrProduct=new Product[10];
	public ProductManager() {}
	//1.상품등록
	public void registTestData() {  //매번 상품 등록하기 귀찮으니 test만들어 자동화
		Product p1=new Product("새우깡",100);
		registProduct(p1);
		Product p2=new Product("연필",100);
		registProduct(p2);
		Product p3=new Product("지우개",100);
		registProduct(p3);
		Product p4=new Product("지우개",70);
		registProduct(p4);
		Product p5=new Product("지우개",90);
		registProduct(p5);
	}
	public void registProduct(Product p) { //배열에 새 상품 넣는다.
		arrProduct[arrindex++]=p;
//		arrProduct[Product.totalCount-1]=p;
	
	}
	public void registProduct() {
		System.out.println("상품등록페이지>>");
        System.out.println("상품명:");
        String name=sc.nextLine();
        System.out.println("등록개수:");
        int count=Integer.parseInt(sc.nextLine());
        arrProduct[arrindex++]=new Product(name,count);
	}
	//2.입고
	public void inputProduct() {
		System.out.println("입고할 상품입력>>");
		String name=sc.nextLine();
		System.out.println("입고할 상품개수 입력>>");
		int count=Integer.parseInt(sc.nextLine());
		Product p=searchProduct(name);
		if(p==null) {
			System.out.println("없는 상품입니다.");
		}else {
			p.count=p.count+count;
		}
		p.display();
	}
	//3.출고
	public void outputProduct() {
		System.out.println("출고할 상품입력>>");
		String name=sc.nextLine();
		System.out.println("출고할 상품개수 입력>>");
		int count=Integer.parseInt(sc.nextLine());
		Product p=searchProduct(name);
		if(p==null) {
			System.out.println("없는 상품입니다.");
		}else {
			p.count=p.count-count;
		}
		p.display();
	}
	//4.검색
	public Product searchProduct(String name) {//Product를 반환하니 void 가 아니다.
		Product returnValue=null;
		for(int i=0;i<arrindex;i++) {
			if(arrProduct[i].name.equals(name)) {
				returnValue=arrProduct[i];
				break;
			}
		}
		return returnValue;
	}
	//5.정보확인
	public void displayProduct() {
		for(int i=0;i<Product.totalCount;i++) {
			arrProduct[i].display();
		}
	}
	public void start() {
		
		
		int i=0;
		registTestData();
		while(i!=6){
			System.out.println("번호입력하세요 1.상품등록 2.입고 3.출고 4.상품검색 5.정보확인 6.종료");
			i=Integer.parseInt(sc.nextLine());
			switch(i) {
			case 1:
				registProduct();
				break;
			case 2:
				inputProduct();
				break;
			case 3:
				outputProduct();
			case 4:
				System.out.println("검색할 상품명을 입력하세요.");
				String name=sc.nextLine();
				searchProduct(name);
				break;
			case 5:
				displayProduct();
				break;
			case 6:
				System.out.println("종료");
				break;
			}
		}
	}
}


public class ClassStart93 {

	public static void main(String[] args) {
		ProductManager pm=new ProductManager();
//		pm.registProduct();
//		pm.displayProduct();
//		pm.registTestData();
		pm.start(); //사용자 입력을 받아서 처리하는 메소드 구현

		
	}

}
