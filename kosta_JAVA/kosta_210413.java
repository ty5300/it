package com.day;
import java.util.*;

public class day_04_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// main ���Ͽ� �� ���� import�� �� �ϰ�, 
		// �������̽��� �����ڷ� �޼ҵ��� ������ ����.
		// �������̽��� ������ A() ������ �ٷ� �����ϵ��� �����.

		// �ҽ��� ���鿡 �ƹ��� ������ �־ ū ������ �ȵȴ�.
		// �ݺ������� Ÿ�����ϸ鼭 �������� �ڱ� �Ӹ� �ӿ� �־� �Ѵ�. 
		// �׷��� ���� ������ ��� �����ؾ� �ϴ��� �ٷιٷ� ���δ�.
		interfaceTest();		System.out.println();
		twoArrayList();			System.out.println();
//		arrayTwoList();
	}	

	static void twoArrayList() {
		ArrayList<int[][]> list = new ArrayList<int[][]>();
		int[][] aryInt2 = {{1,2,3,4},{50,60,70,80,90},{100,200,300}}; 
//		list.add();
		
//		System.out.println(aryInt2[2].length);
//		System.out.println(aryInt2.length);
		
		list.add(aryInt2);
		list.add(aryInt2);
		// �ٷ� for�� ������ ���� �Ʒ�ó�� print������ �������� �迭����, �װ��� ���̰� ������
		// ���� ���Ҵ� �� ���� [][][]�� ���ľ� �ϴ��� üũ�ϰ� for�� ������.
		System.out.println("         "+list.get(0)+"  �ּ�");
		System.out.println("length : "+list.get(0).length);
		System.out.println("         "+list.get(0)[0]+"  �ּ�");
		System.out.println("length : "+list.get(0)[0].length);
		System.out.println("         "+list.get(0)[0][1]);
		
		
		System.out.println("\n\n");
		
		for (int i = 0; i < list.size(); i++) {
			for ( int j = 0; j < list.get(i).length; j++) {
//				System.out.println(list.get(i)[j]);
				for ( int k = 0; k < list.get(i)[j].length ; k++) {
					System.out.printf("%5d", list.get(i)[j][k]);
				}System.out.println("");
				
			}System.out.println("");
		}
		
		/////////////////////////////////////// ���� /////////////////////////////////////////
		// ------ 3�� �迭 ------//
		int[][][] int3 = new int[list.size()][][];
		for (int i = 0; i < list.size(); i++) {
			int3[i] = new int[list.get(i).length][];
			
			for (int j = 0; j < list.get(i).length; j++) {
				int3[i][j] = new int[list.get(i)[j].length];
				
				for (int k = 0; k < list.get(i)[j].length; k++ ) {
					int3[i][j][k] = list.get(i)[j][k];
				}	
			}
		}
		
		
		
		
		
		
		
		
		
		
	}
	
//	public static void main(String[] args) {
	static void interfaceTest() {
		A A1 = new A(5);
		A1.Crying(); // ���� �����Ҹ�   by public class A implements I <- Interface 
		
		B B1 = new B(3);
		B1.Crying(); // ���� �����Ҹ�    by public class B implements I <- Interface 
		
		A A2 = new A("hello");
	}
	
	static void arrayTwoList() {
		ArrayList<Integer> list = new ArrayList<Integer>();
		LinkedList<Integer> list_i = new LinkedList<Integer>();
		
	//	timeCurrent(list);
	//	System.out.println(list.size());
	//	
	//	timeCurrent(list_i);
	//	System.out.println(list_i.size());
		///////////////////////////////////////////////////
		
		
		//--- ������ ���� : ArrayList, LinkedList�� �Ű������� ���� �Լ���
		// 2�� ������ �ұ�?? - ������� List�� �Լ� �� �Ű����� Ÿ������ ���ָ� ����.
	//	static void timeCurrent(List<Integer> k) { �̷��� !!!
		
	//	List<Integer> list = new ArrayList<Integer>();
	//	List<Integer> list_i = new LinkedList<Integer>();
	//	
		
		//--- QUIZ : �Ʒ� �迭�� ���� �迭 2���� 10������� �߰��ϰ�, 
		// ������ 0~9���� ���� ��, for������ **��� ���� ����ϱ�**  ! 
		// 1)
		ArrayList<int[]> int_a_list = new ArrayList<int[]>();
		// 2)		
		int[] aryInt = new int[10];
		for (int i = 0; i < aryInt.length; i++) {
			aryInt[i] = i;
		}
		// 3)
		int_a_list.add(aryInt);
		int_a_list.add(aryInt);
		// 4)
		System.out.println("int_a_list.size()      :  "+ int_a_list.size());
		System.out.println("int_a_list.get(0)�� ���� :  " + int_a_list.get(0).length +"\n");
		for (int j = 0; j < int_a_list.size(); j++) {
			for (int i = 0; i < int_a_list.get(j).length; i++) {
				System.out.println("  "+int_a_list.get(j)[i]);
			}System.out.println();
		}
		
		//--- QUIZ : int[][] list2 ������ int_a_list�� ������ ũ���� 2�� �迭�� ����
		//---        2���� �迭 �ȿ� int_a_list�� �� ���Ҹ� ������ �� ����Ͻÿ�.
		int[][] list2 = new int[int_a_list.size()][];
		
		for ( int i = 0; i < int_a_list.size(); i++) {
			list2[i] = new int[int_a_list.get(i).length];
			for ( int j = 0; j < int_a_list.get(i).length; j++) {
				list2[i][j] = int_a_list.get(i)[j];
			}
		}
		
		for ( int i = 0; i < int_a_list.size(); i++) {
			for ( int j = 0; j < int_a_list.get(i).length; j++) {
				System.out.println("list2[i][j] : "+list2[i][j]);
			}System.out.println();
		}	
		//	ArrayList<int[]> int_a_list2 = new ArrayList<int[]>();
		//	
		//	int[] aryInt2 = new int[10];
		//	for (int i = 0; i < aryInt2.length; i++) {
		//		aryInt2[i] = i;
		//	}
		//	int_a_list2.add(aryInt2);
		//	int_a_list2.add(aryInt2);	
		//	
		//	for ( int i = 0 ; i < int_a_list.size(); i++) {
		//		for (int j = 0; j < int_a_list.get(i).length ; j++) {
		//			System.out.println(int_a_list.get(i)[j]);
		//		}
		//	}
			
				
			
		//	timeCurrent( list );
		//	System.out.println(list_i.size());
		//	}
		
		//static void timeCurrent(List<Integer> l) {
		//	
		//	double startTime	= System.currentTimeMillis()*100;
		//	for ( int i = 0; i < 10000; i++ ) {
		//		l.add(i);
		//	}
		//	for ( int i = 0; i < 10000; i++) {
		//		l.remove(0);
		//	}
		//	double endTime	= System.currentTimeMillis()*100;
		//	System.out.println(endTime-startTime);
		//}
		
		//�μ� Ÿ���� LinkedList<Integer> �ΰ��.	
		//static void timeCurrent(LinkedList<Integer> l) {
		
		//�μ� Ÿ���� ArrayList<Integer> �ΰ��.
		//static void timeCurrent(ArrayList<Integer> l) {
		//	double startTime	= System.currentTimeMillis()*100;
		//	for ( int i = 0; i < 10000; i++ ) {
		//		l.add(i);
		//	}
		//	for ( int i = 0; i < 10000; i++) {
		//		l.remove(0);
		//	}
			
		//	double endTime	= System.currentTimeMillis()*100;
		//	System.out.println(endTime-startTime);
		//	// main ���Ͽ� �� ���� import�� �� �ϰ�, 
		//	// �������̽��� �����ڷ� �޼ҵ��� ������ ����.
		//}
		
	}
}
	
	// ���ϸ� I.java
	//package com.day;
	//
	//public interface I {
	//	public void Crying() ;
	//}
	
	///////////////////////////////

	//���ϸ� A.java
//	package com.day;
//	public class A implements I {
//		@Override
//		public void Crying() {
//			System.out.println("���� �����Ҹ� ����");
//		}
//		public A(int n) {
//			System.out.println("A ������(int) ȣ�� �Ϸ�");
//		}
//		public A(String n) {
//			System.out.println("A ������(String) ȣ�� �Ϸ�");
//		}
//		public A() {
//			System.out.println();
//		}
//	}
//
	//���ϸ� B.java
//	package com.day;
//	public class B implements I {
//		@Override
//		public void Crying() {
//			System.out.println("���� �����Ҹ� ����");
//		}
//		public B(int n) {
//			System.out.println("B ������(int) ȣ�� �Ϸ�");
//		}
//	}