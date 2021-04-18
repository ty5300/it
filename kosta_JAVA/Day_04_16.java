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
//		set_test2(); // ���� ���� Ȯ���� �Ǵ� �ڵ�. CompareTo. ������ �ϱ�.
//		set_test3();
//		set_test4();
//		set_test5(); // ���� Ŭ������ ���ο� Comparator �����ϱ�
//		set_test6(); // ���ٽ�  ���ο� Comparator �����ϱ�
//		set_test7(); // hashmap �⺻ ���
//		set_test8(); // hashmap	���� ���(Ŭ����)	
//		set_test9(); // hashmap ���� ���(String, Ŭ����(int, String))
//		set_test10(); // QUIZ : key �̸� , class ���� - ���� �ּ� ���� ����
		set_test11(); // QUIZ �ش�. - Ŭ���� 2�� Ȱ��.
		
		
		
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
		System.out.println("��� ����: "+data.agv());
		
	}
	
	
	static void set_test10() {
		// Ű���� ��ü�� �� �� �ֳ���?
		HashMap<A, A> map_a = new HashMap<A, A>();
	
		//--- QUIZ : key �̸� , class ���� - ���� �ּ� ���� ����
		
		
		HashMap<String, A> map_id = new HashMap<String, A>();
		
		map_id.put("ȫ�浿", new A(19, "����", "010", "��"));
		map_id.put("��ý�", new A(29, "����", "011", "��"));
		map_id.put("���﹮", new A(31, "����", "012", "��"));
		
		
		for (String key : map_id.keySet()) {
			System.out.print("key : "+key+" - ");
			System.out.print(map_id.get(key).age+", ");
			System.out.print(map_id.get(key).home+", ");
			System.out.print(map_id.get(key).phone+", ");
			System.out.println(map_id.get(key).sex+" ");

		}
	}
	
	
	static void set_test9() {
		// HashMap�� set�̶� key ���� �ߺ��� �ɱ�? ------------ NO.
		// ȸ�����Կ��� ID�� �ߺ��Ǹ� �ȵǴϱ�.
		HashMap<String, A> map_a = new HashMap<String, A>();
		map_a.put("apple", new A(100,"apple"));  // A.Java Ŭ�������� �����ڷ� 2�� ����־� ���� ����.
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
//		for(int key : map.keySet()){ // �� map ��� keySet���� �ؾ� �ұ�? �̰� �迭�̴ϱ�
//			System.out.println(key);
//			System.out.println("map.get(key).count :"+map.get(key).count);
//			
//		}
		//--- compareto�� ���ϱ� ���� TreeSat �ʿ� ---//
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
		
		// ����Ʈ�� compareTo�� ������ �ȵǴϱ� // Collectors.sort()�� ������ �ؾ� �Ѵ�.
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).count);
		}
		 
		 
		 
		
			
		
	}
	
	static void set_test7() {
		System.out.println();
		//--- �⺻ ��� ---//
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		// ���� ����? //  ���������� set�̹Ƿ� �������� �������, �ߺ����� ���ĵȴ�.
		map.put(11, 100);
		map.put(12, 100);
		map.put(13, 100);
		// ���� ����?
		map.get(1);
		System.out.println(map.get(2));
		System.out.println(map.keySet()); // � �������� ������? �迭 !
		map.values();
		// Ű�� ����Ϸ���?
		// ���� ����Ϸ���?
		for(int key : map.keySet()){ // �� map ��� keySet���� �ؾ� �ұ�? �̰� �迭�̴ϱ�
			System.out.println(key);
			System.out.println(map.get(key));
		}
		
		
		//--- ���� ��� ---//
		HashMap<Integer, Integer> map_a = new HashMap<>();
		
		
	}


	
	static void set_test6() {
		// ���ٽ�
		TreeSet<A> set = new TreeSet<A>((x,y)->{
			return x.count - y.count; });		
	}
	static void set_test5() {
		// ���ο� compareTo �����ϴ� ���. // ���� Ŭ����
		
		TreeSet<A> set = new TreeSet<A>(
				new Comparator<A>() {
					@Override
					public int compare(A o1, A o2) {
						return o1.count - o2.count;
					}
				});
		
	}
	
	static void set_test0() {
//		TreeSet<Integer> set = new TreeSet<Integer>(); // ������ �ȵȴ�?
		HashSet<Integer> set = new HashSet<Integer>(); // ������ �ȴ�.
		set.add(200);
		set.add(100);
		set.add(300);
		
		for(Integer i : set) {
			System.out.println(i);			

			
		}
	}
	
	static void set_test4() { // �߿�
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
			
		// ������ �� �Ǵ� ������ implements Comparable<A>�� �� �� ���. �Ʒ��� ���� ����.
//		implements Comparable<A>
//		@Override
		
//		for(A i : list) {
//			System.out.println(i.str);	
//		}
	}
	
	
	
	
	static void set_test3() {
		// ���ڿ� ������ ���� ����, ���������� ��µǵ��� �ϱ�. 
		// ���� �� + ���ĺ������� �Ϸ���??
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
		// ���� ���� ���� �ٲٱ� ; class OOO implements Comparable<> Ȱ��.
		// TreeSet������ ����. HashSet������ ���� �ȹٲ�. 
		// TreeSet, HashSet, Set ���� ���� �� Ȱ�� �� ã�ƺ���.
		
		// ���ڸ� �Է��� �� ����, ���������� ��µǵ��� �ϱ�.
		TreeSet<A> TS = new TreeSet<A>();  // <A> ��  A.java Ŭ���� Ÿ���� �ְڴٴ� ����.

		
		A a0 = new A(); 	
		a0.count = 4;
		TS.add(a0); //
		
		A a1 = new A(); 	
		a1.count = 3;
		TS.add(a1); // add ���� compareTo(A other) ����.
		
		A a2 = new A();
		a2.count = 2;
		TS.add(a2);  // add ���� compareTo(A other) ����.
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
//		 HashSet, TreeSet �ߺ� ���ɼ� , ���� �ڵ����� ���ɼ� ����
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
////		TreeSet<A> a = new TreeSet<A>(); // ��½� ������ �� <- Ŭ������ �ּҿ� ���� ���� ������ ���� ������. ���� �Ұ�.
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
////		// �ٸ� �ּҰ� ��������, ���� �ּҰ� �������� Ȯ���غ���.
////		at.add(new A());
////		at.add(new A());
//		
//		for ( A i : at) {
//			System.out.println(i);
//			System.out.println("i.count :"+i.count);  // A.java�� int count;
//		}
//		// a�� ũ�⸦ �����ϰ� ����غ���.
//		System.out.println(at.size());
//		

		
		
		
	}

}

