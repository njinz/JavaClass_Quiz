package com.human.ex;
import java.io.IOException;
interface Sort{
	public void ascending(int [] arr);
	public void descending(int [] arr);
	public void description();
}
class QuickSort implements Sort{

	@Override
	public void ascending(int[] arr) {
		System.out.println("QuickSort ascending");
		
	}

	@Override
	public void descending(int[] arr) {
		System.out.println("QuickSort descending");
		
	}

	@Override
	public void description() {
		System.out.println("���ڸ� �����ϴ� �˰����Դϴ�.");
		System.out.println("QuickSort�Դϴ�");
		
	}
	
}

class HeapSort implements Sort{

	@Override
	public void ascending(int[] arr) {
		System.out.println("HeapSort ascending");
	}

	@Override
	public void descending(int[] arr) {
		System.out.println("HeapSort descending");
		
	}

	@Override
	public void description() {
		System.out.println("���ڸ� �����ϴ� �˰����Դϴ�.");
		System.out.println("HeapSort�Դϴ�");
		
	}
	
}
class BubbleSort implements Sort{

	@Override
	public void ascending(int[] arr) {
		System.out.println("BubbleSort ascending");
		
	}

	@Override
	public void descending(int[] arr) {
		System.out.println("BubbleSort descending");
		
	}

	@Override
	public void description() {
		System.out.println("���ڸ� �����ϴ� �˰����Դϴ�.");
		System.out.println("BubbleSort�Դϴ�");
		
	}
	
}
public class SortTest {

	public static void main(String[] args) throws IOException {
		System.out.println("���� ����� �����ϼ���.");
		System.out.println("B: BubbleSort");
		System.out.println("H: HeapSort");
		System.out.println("Q: QuickSort");
		
		int ch = System.in.read();
		Sort sort = null;
		
		if(ch =='B' || ch =='b') {
			sort = new BubbleSort();
		}
		else if(ch =='H' || ch =='h') {
			sort = new HeapSort();
		}
		else if(ch =='Q' || ch =='q') {
			sort = new QuickSort();
		}else {
			System.out.println("�������� �ʴ� ����Դϴ�.");
			return;
		}
		//���� ��İ� ������� Sort�� ����� �޼ҵ� ȣ��
		int[] arr = new int[10];
		sort.ascending(arr);
		sort.descending(arr);
		sort.description();
	}

}
