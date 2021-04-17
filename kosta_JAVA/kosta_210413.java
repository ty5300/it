package com.day;
import java.util.*;

public class day_04_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// main 파일에 안 쓰고 import도 안 하고, 
		// 인터페이스의 생성자로 메소드의 다형성 구현.
		// 인터페이스의 생성자 A() 만으로 바로 수행하도록 설계됨.

		// 소스를 깃헙에 아무리 가지고 있어도 큰 도움이 안된다.
		// 반복적으로 타이핑하면서 익혀놓고 자기 머리 속에 둬야 한다. 
		// 그래야 맡은 업무를 어떻게 진행해야 하는지 바로바로 보인다.
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
		// 바로 for문 돌리기 전에 아래처럼 print문으로 어디까지가 배열인지, 그것의 길이가 얼마인지
		// 최종 원소는 몇 번의 [][][]를 거쳐야 하는지 체크하고 for문 돌리기.
		System.out.println("         "+list.get(0)+"  주소");
		System.out.println("length : "+list.get(0).length);
		System.out.println("         "+list.get(0)[0]+"  주소");
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
		
		/////////////////////////////////////// 오류 /////////////////////////////////////////
		// ------ 3차 배열 ------//
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
		A1.Crying(); // 개의 울음소리   by public class A implements I <- Interface 
		
		B B1 = new B(3);
		B1.Crying(); // 새의 울음소리    by public class B implements I <- Interface 
		
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
		
		
		//--- 다형성 예시 : ArrayList, LinkedList를 매개변수로 넣을 함수를
		// 2개 만들어야 할까?? - 조상격인 List를 함수 안 매개변수 타입으로 해주면 가능.
	//	static void timeCurrent(List<Integer> k) { 이렇게 !!!
		
	//	List<Integer> list = new ArrayList<Integer>();
	//	List<Integer> list_i = new LinkedList<Integer>();
	//	
		
		//--- QUIZ : 아래 배열에 하위 배열 2개를 10사이즈로 추가하고, 
		// 각각에 0~9까지 대입 후, for문으로 **모든 원소 출력하기**  ! 
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
		System.out.println("int_a_list.get(0)의 길이 :  " + int_a_list.get(0).length +"\n");
		for (int j = 0; j < int_a_list.size(); j++) {
			for (int i = 0; i < int_a_list.get(j).length; i++) {
				System.out.println("  "+int_a_list.get(j)[i]);
			}System.out.println();
		}
		
		//--- QUIZ : int[][] list2 변수에 int_a_list와 동일한 크기의 2차 배열을 만들어서
		//---        2차원 배열 안에 int_a_list의 각 원소를 대입한 후 출력하시오.
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
		
		//인수 타입이 LinkedList<Integer> 인경우.	
		//static void timeCurrent(LinkedList<Integer> l) {
		
		//인수 타입이 ArrayList<Integer> 인경우.
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
		//	// main 파일에 안 쓰고 import도 안 하고, 
		//	// 인터페이스의 생성자로 메소드의 다형성 구현.
		//}
		
	}
}
	
	// 파일명 I.java
	//package com.day;
	//
	//public interface I {
	//	public void Crying() ;
	//}
	
	///////////////////////////////

	//파일명 A.java
//	package com.day;
//	public class A implements I {
//		@Override
//		public void Crying() {
//			System.out.println("개의 울음소리 설정");
//		}
//		public A(int n) {
//			System.out.println("A 생성자(int) 호출 완료");
//		}
//		public A(String n) {
//			System.out.println("A 생성자(String) 호출 완료");
//		}
//		public A() {
//			System.out.println();
//		}
//	}
//
	//파일명 B.java
//	package com.day;
//	public class B implements I {
//		@Override
//		public void Crying() {
//			System.out.println("새의 울음소리 설정");
//		}
//		public B(int n) {
//			System.out.println("B 생성자(int) 호출 완료");
//		}
//	}