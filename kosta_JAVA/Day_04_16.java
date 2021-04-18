package day.com;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;
import java.util.stream.Collectors;


import java.util.Set;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

import java.util.HashSet;
public class Day_04_16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		set_test()0; 

//		set_test1(); 
//		set_test2(); // 숫자 정렬 확실히 되는 코드. CompareTo. 무조건 암기.
//		set_test3();
//		set_test4();
//		set_test5(); // 무명 클래스로 내부에 Comparator 정의하기
//		set_test6(); // 람다식  내부에 Comparator 정의하기
//		set_test7(); // hashmap 기본 용법
//		set_test8(); // hashmap	응용 용법(클래스)	
//		set_test9(); // hashmap 응용 용법(String, 클래스(int, String))
//		set_test10(); // QUIZ : key 이름 , class 내용 - 나이 주소 폰번 성별
		set_test11(); // QUIZ 해답. - 클래스 2개 활용.
		
		
		
	}
	
	
//	static void set_test() {}
//	static void set_test() {}
	static void set_test11() {
		HashMap<String, Data> map = new HashMap<String, Data>();
		Data_in data = new Data_in();
		
		for ( int i = 0; i < data.name.length; i++) {
			System.out.println(data.name[i]);
			
			Data p_data = new Data(data.age[i], data.addr[i], data.phone[i], data.gender[i] );
			
			map.put(data.name[i], p_data);
		}
		for (String key : map.keySet()) {
			Data p_data = map.get(key);
			System.out.print(key+"\t");
			System.out.print(p_data.age+"\t");
			System.out.print(p_data.addr+"\t");
			System.out.print(p_data.phone+"\t");
			System.out.println(p_data.gender+"\t");
			
		}
		System.out.println("평균 나이: "+data.agv());
		
	}
	
	
	static void set_test10() {
		// 키값이 객체가 될 수 있나요?
		HashMap<A, A> map_a = new HashMap<A, A>();
	
		//--- QUIZ : key 이름 , class 내용 - 나이 주소 폰번 성별
		
		
		HashMap<String, A> map_id = new HashMap<String, A>();
		
		map_id.put("홍길동", new A(19, "서울", "010", "남"));
		map_id.put("김시습", new A(29, "광주", "011", "남"));
		map_id.put("성삼문", new A(31, "광주", "012", "남"));
		
		
		for (String key : map_id.keySet()) {
			System.out.print("key : "+key+" - ");
			System.out.print(map_id.get(key).age+", ");
			System.out.print(map_id.get(key).home+", ");
			System.out.print(map_id.get(key).phone+", ");
			System.out.println(map_id.get(key).sex+" ");

		}
	}
	
	
	static void set_test9() {
		// HashMap은 set이라 key 값이 중복이 될까? ------------ NO.
		// 회원가입에서 ID가 중복되면 안되니까.
		HashMap<String, A> map_a = new HashMap<String, A>();
		map_a.put("apple", new A(100,"apple"));  // A.Java 클래스에서 생성자로 2개 만들둬야 에러 없음.
		map_a.put("google", new A(300, "google"));
		map_a.put("samsung", new A(200, "samsung"));
		
		System.out.println("map_a.size()   : "+ map_a.size());
		System.out.println("map_a.keySet() : "+ map_a.keySet());
		System.out.println("map_a.values() : "+ map_a.values());
		
		for (String keyString : map_a.keySet()){
			
			System.out.println("key                  : "+keyString);
			System.out.println("map_a.get(key).count : "+map_a.get(keyString).count);
			System.out.println("map_a.get(key).str   : "+map_a.get(keyString).str);
		}
	}
	
	static void set_test8() {
		System.out.println();
//		HashMap<Integer, A> map = new HashMap<Integer, A>();
//		A a1 = new A();
//		A a2 = new A();
//		
//		a1.count = 11;
//		a2.count = 22;
//		map.put(1, a1);
//		map.put(2, a2);
//		
//		for(int key : map.keySet()){ // 왜 map 대신 keySet으로 해야 할까? 이게 배열이니까
//			System.out.println(key);
//			System.out.println("map.get(key).count :"+map.get(key).count);
//			
//		}
		//--- compareto로 비교하기 위해 TreeSat 필요 ---//
		TreeSet<A> tree_set = new TreeSet<A>();
		
		ArrayList<A> list = new ArrayList<A>();
		A aa1 = new A();
		A aa2 = new A();
		A aa3 = new A();
		aa1.count = 3000;
		aa2.count = 2000;
		aa3.count = 5000;
		list.add(aa1);
		list.add(aa2);
		list.add(aa3);
		
		// 리스트는 compareTo로 정렬이 안되니까 // Collectors.sort()로 정렬을 해야 한다.
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).count);
		}
		 
		 
		 
		
			
		
	}
	
	static void set_test7() {
		System.out.println();
		//--- 기본 용법 ---//
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		// 넣을 때는? //  내부적으로 set이므로 오름차순 순서대로, 중복없이 정렬된다.
		map.put(11, 100);
		map.put(12, 100);
		map.put(13, 100);
		// 꺼낼 때는?
		map.get(1);
		System.out.println(map.get(2));
		System.out.println(map.keySet()); // 어떤 형식으로 나오지? 배열 !
		map.values();
		// 키를 출력하려면?
		// 값을 출력하려면?
		for(int key : map.keySet()){ // 왜 map 대신 keySet으로 해야 할까? 이게 배열이니까
			System.out.println(key);
			System.out.println(map.get(key));
		}
		
		
		//--- 응용 용법 ---//
		HashMap<Integer, Integer> map_a = new HashMap<>();
		
		
	}


	
	static void set_test6() {
		// 람다식
		TreeSet<A> set = new TreeSet<A>((x,y)->{
			return x.count - y.count; });		
	}
	static void set_test5() {
		// 내부에 compareTo 정의하는 방법. // 무명 클래스
		
		TreeSet<A> set = new TreeSet<A>(
				new Comparator<A>() {
					@Override
					public int compare(A o1, A o2) {
						return o1.count - o2.count;
					}
				});
		
	}
	
	static void set_test0() {
//		TreeSet<Integer> set = new TreeSet<Integer>(); // 정렬이 안된다?
		HashSet<Integer> set = new HashSet<Integer>(); // 정렬이 된다.
		set.add(200);
		set.add(100);
		set.add(300);
		
		for(Integer i : set) {
			System.out.println(i);			

			
		}
	}
	
	static void set_test4() { // 중요
		ArrayList<A> list = new ArrayList<A>();
		A a1 = new A();		a1.str = "bde";		
		A a2 = new A();		a2.str = "azc";		
		A a3 = new A();		a3.str = "cac";		
		list.add(a1);
		list.add(a2);
		list.add(a3);
		Collections.sort(list);
		for (int i = 0 ; i < list.size(); i++) {
			System.out.println(list.get(i).str);
		}
			
		// 위에가 안 되는 이유는 implements Comparable<A>를 안 쓴 경우. 아래와 같이 하자.
//		implements Comparable<A>
//		@Override
		
//		for(A i : list) {
//			System.out.println(i.str);	
//		}
	}
	
	
	
	
	static void set_test3() {
		// 문자열 갯수에 따라 오름, 내림순서로 출력되도록 하기. 
		// 문자 수 + 알파벳순으로 하려면??
		TreeSet<A> at = new TreeSet<A>();
		A a1 = new A();		a1.str = "aaaaa";		at.add(a1);
		A a2 = new A();		a2.str = "dd";		at.add(a2);
		A a3 = new A();		a3.str = "cccccc";		at.add(a3);
		
		System.out.println("at.size() : "+ at.size());
		
		for(A i : at) {
			System.out.println(i.str);	
		}
		
	}
	static void set_test2() {
		// 오름 내림 순서 바꾸기 ; class OOO implements Comparable<> 활용.
		// TreeSet에서만 가능. HashSet에서는 순서 안바뀜. 
		// TreeSet, HashSet, Set 차이 숙지 및 활용 예 찾아보기.
		
		// 숫자를 입력한 후 오름, 내림순서로 출력되도록 하기.
		TreeSet<A> TS = new TreeSet<A>();  // <A> 는  A.java 클래스 타입을 넣겠다는 선언.

		
		A a0 = new A(); 	
		a0.count = 4;
		TS.add(a0); //
		
		A a1 = new A(); 	
		a1.count = 3;
		TS.add(a1); // add 직후 compareTo(A other) 수행.
		
		A a2 = new A();
		a2.count = 2;
		TS.add(a2);  // add 직후 compareTo(A other) 수행.
		A a3 = new A();
		a3.count = 1;
		TS.add(a3);
			
		System.out.println("at.size() : "+ TS.size());
		for(A i : TS) {
			System.out.println(i.count);			
		}
///////////////////////

	}
	
	static void set_test1() {
//		 HashSet, TreeSet 중복 가능성 , 순서 자동정렬 가능성 숙지
//		HashSet<Integer> set_list = new HashSet<Integer>();
//		
//		set_list.add(300);		set_list.add(200);
//		set_list.add(200);		set_list.add(100);
//		
//		System.out.println(set_list.size());
//		for (int i : set_list) {
//			System.out.println(i);
//		}System.out.println();
//
//		System.out.println("--------------------------------------");
//		TreeSet<Integer> tree_set = new TreeSet<Integer>();
//		tree_set.add(400);		
//		tree_set.add(100);		
//		tree_set.add(200);
//		tree_set.add(400);		
//		tree_set.add(300);
//		
//		for (int item : tree_set) {
//			System.out.println(item);
//		}System.out.println();
//		
//		System.out.println("--------------------------------------");
//
//		TreeSet<String> tree_string = new TreeSet<String>();
//		
//		tree_string.add("ccc");		tree_string.add("a");
//		tree_string.add("bb");		tree_string.add("ccccccc");
//		tree_string.add("ddd");		tree_string.add("bb");
//		tree_string.add("bbbbb");
//		
//		for (String item : tree_string) {
//			System.out.println(item);
//		}System.out.println();
//		
//		///////////
////		TreeSet<A> a = new TreeSet<A>(); // 출력시 빨간줄 뜸 <- 클래스의 주소에 대한 정렬 기준이 없기 때문에. 정렬 불가.
//		HashSet<A> at = new HashSet<A>();
//		at.add(new A());
//		at.add(new A());
//		A aa = new A();
//		at.add(aa);
//		at.add(aa); // 
//		
//		System.out.println("--------------------------------------");
//
//		
////		TreeSet<A> at = new TreeSet<A>();
////		
////		// 다른 주소가 찍히는지, 같은 주소가 찍히는지 확인해보자.
////		at.add(new A());
////		at.add(new A());
//		
//		for ( A i : at) {
//			System.out.println(i);
//			System.out.println("i.count :"+i.count);  // A.java의 int count;
//		}
//		// a의 크기를 예측하고 출력해보기.
//		System.out.println(at.size());
//		

		
		
		
	}

}

