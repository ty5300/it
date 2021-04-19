package day.com;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.lang.Comparable; //��Ű�� import

public class Day_04_19 {
	
	static Set<String> test_set;
	// Set<String> test_set; static�� �տ� �ٿ���� �޸� �Ҵ��� �ް�, mian ������ test_set ���������� ��� ����.
	// static�� �� ���̷���, main Ȥ�� �޼��� ���� Set<String> test_set ��� ���ָ� ���������� ����ؼ� ��� ����.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ������ü 
		// ��ǰ �޴���(�Ǹ���) 
		// ���� �� => �̸� �ּ� �ֹι�ȣ ����ȣ �̸��� ��Ż� ����� �ܸ���ø���
		// ī��θ�Ƽ �� =>
		
		
		
//		test0(); // Static_test �� �����ΰ�?
//		test1(); // 1�� ���� �õ� <- PhoneData�� �����ڿ� s = new PhoneS( ... ) �߰� 
//		test2(); // 2�� ���� �õ�
//		test3();
		test4();
//		test();
//		test();
//		test();
//		test();
//		test();
//		test();
//		test();
//		test();

	}
	static void test4() {
		//key ���� ������ ���� ��������.
		HashMap<String, PhoneData> name_list = new HashMap<String,PhoneData>();
		
		for (int i = 0; i < 5; i++) {
			PhoneData data = new PhoneData(i); // new : �޸� ���� ���ο� �ּ� �Ҵ�
												// �ߺ� �Ұ� key, �ߺ� ���� value
			name_list.put(data.name[i], data); // ���������� �����Ƿ� key�����δ� �̸� ��� X.
			System.out.println("data.s.name "+data.s.name);	
		}

		// Set<String> test_set = name_list.keySet(); // main ���� ���� ������ static Set<String> test_set �� �� ���ָ� ������ ���� ��� ��. 
		test_set = name_list.keySet(); // keySet�� Set���� ������ keySey�� ���� �迭�̶�� �ǹ�.
													// static �� �ٸ� �޸𸮿� ���� �켱 �Ҵ�����ϱ�
		for (String string : test_set) {
			System.out.println("���� �� : "+ string);
//			System.out.println(name_list.get(string).getAddr()); // �ּ�? ��?
		}System.out.println();
		
		
		
		// ���2 - compareTo
		ArrayList<PhoneData> list_array = new ArrayList<PhoneData>(); // ���� ������ ��� ��ƴ�.
		// ���1 - ArrayList<String>
		ArrayList<String> list_String = new ArrayList<String>(); // String�� ���� ������ �־ ���� �ȴ�.

//		Collections.sort(list_array); // list_array�� ���� ������ ��� ����.
		for (int i = 0; i < 5; i++) {
			PhoneData data = new PhoneData(i); // new : �޸� ���� ���ο� �ּ� �Ҵ�
			name_list.put(data.name[i], data);
			// ���2
			list_array.add(data);					
			
			
//			System.out.println(name_list.get(string).getAddr()); // �ּ�? ��?
		}System.out.println("list_array : "+ list_array);
		
		
		
		
		// ���1-1) - key ���� ������ ���� ���� - ����
//		ArrayList<String> list_String1 = (ArrayList<String>) name_list.keySet(); // ( �� ��ȯ ) - ����
		// ���1-2) - key ���� ������ ���� ����
//		ArrayList<String> list_String2 = new ArrayList<String>(name_list.keySet());
		// ���1-3) - key ���� ������ ���� ����
//		list_String.addAll(name_list.keySet()); // ����ȯ ���� �ڵ����� ����.  < ? extends E > ���ϵ� ī�� ����.
//		System.out.println("list_String " + list_String);
		
		for (int i = 0; i < list_String.size(); i++) {
			System.out.println("���� ���� : " +list_String.get(i));			
		}

		// ���2
		System.out.println("list_array :"+list_array);
		Collections.sort(list_array); 
		// Collections.sort�� �ǹ������� comparTo�� ȣ���ϰ� �Ǿ� �־, 
		// compartTo�� ���� ���� �ϼ��� �Ǿ�� collection�� ���� ����ȴ�.
		
//		Collections.sort(list_String); // Collections���� ArrayList, LinkedList�� ����.

//		for (int i = 0; i < list_array.size(); i++) {	
//			System.out.println("Day : "+list_array.get(i).s.name);
//			
//			// ��ȯ�� , String �迭�� arrayList�� �ִ� ��. �پ缺 ������. PhoneData�� �Լ� getList.
//			System.out.println(list_array.get(i).getList()); // list_array�� ���� �˾�?
//															 // list_array.get(i) �� ���� �˾�?
//			
//			System.out.println(list_array.get(i).getList().get(i));
//			
//			for (int j = 0; j < list_array.get(i).getList().size(); j++) {
//				
//				System.out.println(list_array.get(i).getList().get(j));
//				
//				if (list_array.get(i).getList().get(j).equals("�۰���")) {
//					// return; // ��ġ�ϴ� �����Ͱ� ������ ����.
//					System.out.println("��ġ�մϴ�. "+list_array.get(i).getList().get(j));
//				}				
//			}			
//		}
		
		System.out.println("-----------------------------------------------");
		// PhoneData �� is_true �Լ� �̿��ؼ� �Ǻ� // �̿��� �߰� ����
		String temp = "����";
		for (int i = 0; i < list_array.size(); i++) {	
			if (list_array.get(i).is_true(temp)){
				System.out.println("id �ߺ�.");
				}
			}System.out.println("id ��� ����");
			name_list.put(temp, new PhoneData(temp, "���ֵ�", "000", "010-0000-0000", "email", "sk", "30000", "����ȣ_0010"));
			System.out.println(name_list.size());
			System.out.println(name_list.get(temp).s.phoneNum); // ��ȣ ���.
			System.out.println(name_list.get(temp).getPhoneNum());
			//System.out.println(name_list.getPhoneNum());  // �� �ȵǴ��� �ľ�����. - 
			// name_list�� PhoneData�� value�� Dict, Map�� ����Ű�� ��!
			// �׷��� name_list.getPhoneNum()�� �� ����. 
			// name_list.get("�۰���") ó�� "�۰���"�� Ű�� �ϴ� PhoneData ��ü�� data��
			// .getPhoneNum()�� �ٿ��� �Ѵ�.
		}

	
	static void test3() {
		//key ���� ������ ���� ��������.
		HashMap<String, PhoneData> name_list = new HashMap<String,PhoneData>();
		
		for (int i = 0; i < 5; i++) {
			PhoneData data = new PhoneData(i); // new : �޸� ���� ���ο� �ּ� �Ҵ�
												// �ߺ� �Ұ� key, �ߺ� ���� value
			name_list.put(data.name[i], data); // ���������� �����Ƿ� key�����δ� �̸� ��� X.
			System.out.println("data.s.name "+data.s.name);	
		}

		// Set<String> test_set = name_list.keySet(); // main ���� ���� ������ static Set<String> test_set �� �� ���ָ� ������ ���� ��� ��. 
		test_set = name_list.keySet(); // keySet�� Set���� ������ keySey�� ���� �迭�̶�� �ǹ�.
													// static �� �ٸ� �޸𸮿� ���� �켱 �Ҵ�����ϱ�
		for (String string : test_set) {
			System.out.println("���� �� : "+ string);
//			System.out.println(name_list.get(string).getAddr()); // �ּ�? ��?
		}System.out.println();
		
		
		
		// ���2 - compareTo
		ArrayList<PhoneData> list_array = new ArrayList<PhoneData>(); // ���� ������ ��� ��ƴ�.
		// ���1 - ArrayList<String>
		ArrayList<String> list_String = new ArrayList<String>(); // String�� ���� ������ �־ ���� �ȴ�.

//		Collections.sort(list_array); // list_array�� ���� ������ ��� ����.
		for (int i = 0; i < 5; i++) {
			PhoneData data = new PhoneData(i); // new : �޸� ���� ���ο� �ּ� �Ҵ�
			name_list.put(data.name[i], data);
			// ���2
			list_array.add(data);					
			
			
//			System.out.println(name_list.get(string).getAddr()); // �ּ�? ��?
		}System.out.println("list_array : "+ list_array);
		
		
		
		
		// ���1-1) - key ���� ������ ���� ���� - ����
//		ArrayList<String> list_String1 = (ArrayList<String>) name_list.keySet(); // ( �� ��ȯ ) - ����
		// ���1-2) - key ���� ������ ���� ����
//		ArrayList<String> list_String2 = new ArrayList<String>(name_list.keySet());
		// ���1-3) - key ���� ������ ���� ����
//		list_String.addAll(name_list.keySet()); // ����ȯ ���� �ڵ����� ����.  < ? extends E > ���ϵ� ī�� ����.
//		System.out.println("list_String " + list_String);
		
		for (int i = 0; i < list_String.size(); i++) {
			System.out.println("���� ���� : " +list_String.get(i));			
		}

		// ���2
		Collections.sort(list_array); 
		// Collections.sort�� �ǹ������� comparTo�� ȣ���ϰ� �Ǿ� �־, 
		// compartTo�� ���� ���� �ϼ��� �Ǿ�� collection�� ���� ����ȴ�.
		
//		Collections.sort(list_String); // Collections���� ArrayList, LinkedList�� ����.

		for (int i = 0; i < list_array.size(); i++) {	
			System.out.println("Day : "+list_array.get(i).s.name);
			
			// ��ȯ�� , String �迭�� arrayList�� �ִ� ��. �پ缺 ������. PhoneData�� �Լ� getList.
			System.out.println(list_array.get(i).getList());
			System.out.println(list_array.get(i).getList().get(i));
			for (int j = 0; j < list_array.get(i).getList().size(); j++) {
				System.out.println(list_array.get(i).getList().get(j));
				
				if (list_array.get(i).getList().get(j).equals("�۰���")) {
					System.out.println("��ġ�մϴ�. "+list_array.get(i).getList().get(j));
				}
			}
		}

	}

	static void test2() {
		//key ���� ������ ���� ��������.
		HashMap<String, PhoneData> name_list = new HashMap<String,PhoneData>();
		
		for (int i = 0; i < 5; i++) {
			PhoneData data = new PhoneData(i); // new : �޸� ���� ���ο� �ּ� �Ҵ�
												// �ߺ� �Ұ� key, �ߺ� ���� value
			name_list.put(data.name[i], data); // ���������� �����Ƿ� key�����δ� �̸� ��� X.
			System.out.println("data.s.name "+data.s.name);	
		}
		System.out.println(name_list.size());
		System.out.println(name_list.keySet()); // [�۰���, ���缮, �����, ������, ����] : �迭
		
		// Set<String> test_set = name_list.keySet(); // main ���� ���� ������ static Set<String> test_set �� �� ���ָ� ������ ���� ��� ��. 
		test_set = name_list.keySet(); // keySet�� Set���� ������ keySey�� ���� �迭�̶�� �ǹ�.
													// static �� �ٸ� �޸𸮿� ���� �켱 �Ҵ�����ϱ�
		for (String string : test_set) {
			System.out.println("���� �� : "+ string);
//			System.out.println(name_list.get(string).getAddr()); // �ּ�? ��?
		}System.out.println();
		
		// ���2 - 	
		ArrayList<PhoneData> list_array = new ArrayList<PhoneData>();
		// ���1 - key ���� ������ ���� ����
		ArrayList<String> list_String = new ArrayList<String>();

//		Collections.sort(list_array); // list_array�� ���� ������ ��� ����.
		for (int i = 0; i < 5; i++) {
			PhoneData data = new PhoneData(i); // new : �޸� ���� ���ο� �ּ� �Ҵ�
			name_list.put(data.name[i], data);
			// ���2
			list_array.add(data);					

//			System.out.println(name_list.get(string).getAddr()); // �ּ�? ��?
		}System.out.println();
		
		
		
		
		// ���1-1) - key ���� ������ ���� ���� - ����
//		ArrayList<String> list_String1 = (ArrayList<String>) name_list.keySet(); // ( �� ��ȯ ) - ����
		// ���1-2) - key ���� ������ ���� ����
//		ArrayList<String> list_String2 = new ArrayList<String>(name_list.keySet());
		// ���1-3) - key ���� ������ ���� ����
		list_String.addAll(name_list.keySet()); // ����ȯ ���� �ڵ����� ����.  < ? extends E > ���ϵ� ī�� ����.
		System.out.println(list_String);

		System.out.println(name_list.size());
		
		for (int i = 0; i < list_String.size(); i++) {
			System.out.println(list_String.get(i));			
		}

		
//		Collections.sort(list_array); // �� �޴� Ÿ���̶� ����. �� ���� ����� comparTo�� �� ��.
		Collections.sort(list_String); // Collections���� ArrayList, LinkedList�� ����.

		for (int i = 0; i < list_String.size(); i++) {			
//			System.out.println("���� �� : "+list_String.get(i));			
//			System.out.println(name_list.get(list_String.get(i))); // �ּҰ� ������ ��ü�� ��.
			System.out.println(".s.name "+name_list.get(list_String.get(i))); // �ּҰ� ������ ��ü�� ��.
			System.out.println(".s.name "+name_list.get(list_String.get(i)).s.name); // s.�� ���� ��ü. 
			System.out.println(".s.addr "+name_list.get(list_String.get(i)).s.addr); // �ּҰ� ������ ��ü�� ��.
			System.out.println(".s.getAddr "+name_list.get(list_String.get(i)).getAddr()[i]); // �ּҰ� ������ ��ü�� ��.

		}

	}
		
	
	static void test1() {
		//key ���� ������ ���� ��������.
		HashMap<String, PhoneData> name_list = new HashMap<String,PhoneData>();
		
		for (int i = 0; i < 5; i++) {
			PhoneData data = new PhoneData(i); // new : �޸� ���� ���ο� �ּ� �Ҵ�
												// �ߺ� �Ұ� key, �ߺ� ���� value
			name_list.put(data.name[i], data); // ���������� �����Ƿ� key�����δ� �̸� ��� X.
			System.out.println("data.s.name "+data.s.name);	
		}
		System.out.println(name_list.size());
		System.out.println(name_list.keySet()); // [�۰���, ���缮, �����, ������, ����] : �迭
		
		// Set<String> test_set = name_list.keySet(); // main ���� ���� ������ static Set<String> test_set �� �� ���ָ� ������ ���� ��� ��. 
		test_set = name_list.keySet(); // keySet�� Set���� ������ keySey�� ���� �迭�̶�� �ǹ�.
													// static �� �ٸ� �޸𸮿� ���� �켱 �Ҵ�����ϱ�
		for (String string : test_set) {
			System.out.println("���� �� : "+ string);
//			System.out.println(name_list.get(string).getAddr()); // �ּ�? ��?
		}System.out.println();
		
		
		// ���2
		ArrayList<PhoneData> list_array = new ArrayList<PhoneData>();
		// ���1 - key ���� ������ ���� ����
		ArrayList<String> list_String = new ArrayList<String>();

//		Collections.sort(list_array); // list_array�� ���� ������ ��� ����.
		for (int i = 0; i < 5; i++) {
			PhoneData data = new PhoneData(i); // new : �޸� ���� ���ο� �ּ� �Ҵ�
			name_list.put(data.name[i], data);
			// ���2
			list_array.add(data);					

			
//			System.out.println(name_list.get(string).getAddr()); // �ּ�? ��?
		}System.out.println();
		
		
		
		
		// ���1-1) - key ���� ������ ���� ���� - ����
//		ArrayList<String> list_String1 = (ArrayList<String>) name_list.keySet(); // ( �� ��ȯ ) - ����
		// ���1-2) - key ���� ������ ���� ����
//		ArrayList<String> list_String2 = new ArrayList<String>(name_list.keySet());
		// ���1-3) - key ���� ������ ���� ����
		list_String.addAll(name_list.keySet()); // ����ȯ ���� �ڵ����� ����.  < ? extends E > ���ϵ� ī�� ����.
		System.out.println(list_String);

		System.out.println(name_list.size());
		
		for (int i = 0; i < list_String.size(); i++) {
			System.out.println(list_String.get(i));			
		}

		
//		Collections.sort(list_array); // �� �޴� Ÿ���̶� ����. �� ���� ����� comparTo�� �� ��.
		Collections.sort(list_String); // Collections���� ArrayList, LinkedList�� ����.

		for (String string : list_String) {
			System.out.println("���� �� : "+ string);
//			System.out.println(name_list.get(string).getAddr()); // �ּ�? ��?
		}System.out.println();
		
	}
		
		// ���4 - key ���� ������ ���� ����
//		TreeMap<String,PhoneData> tm = new TreeMap<String,PhoneData>(name_list);  
//		Iterator<String> iteratorKey = tm.keySet( ).iterator( ); // Ű�� �������� ����
//		Iterator<String> iteratorKey = tm.descendingKeySet().iterator(); //Ű�� �������� ����
		


		
		// Map���� keySet���� ����ϸ�, name �迭�� �Է��� ��� ��µ��� �ʴ´�.
		// 
		
//		PhoneS s = new PhoneS(data.name[0], data.addr[0], data.number[0], data.phoneNum[0], data.email[0],
//				data.service[0], data.plan[0], data.serial[0]); // �����ڰ� ������ ���� �߻�
	
	static void test0() {	
		// ��ü ������ new �����ڷ� �ּҰ� �ٸ��� �ȴٰ� ����µ�,
		// �Ʒ��� ���� �ϸ� static�� count�� ����غ���. �ּҰ� ����.
		// static�� ���� ���� ���� �����ص� �ּҰ� �� ����.
		// ����, ���� ���� ��Ű�� a, b ��ο� �ٲ��. 
		// ��, ��������, ���� ���� ����� �ǹ̰� ���, static�� �����ؼ� ����ؾ� �Ѵ�.
		// Static_test.java -> public static int count;
		Static_test test_a = new Static_test(); 
		Static_test test_b = new Static_test();
		System.out.println(test_a);
		System.out.println(test_b);
		test_a.count = 300;
		System.out.println(test_a.count);
		System.out.println(test_b.count);
		System.out.println(Static_test.count);
		System.out.println(test_a.int_array);  // static���� ������ �����صּ�, 
		System.out.println(test_b.int_array); // ��ü���� ���ٵ� �� �� �ְ�
		System.out.println(Static_test.int_array); // Ŭ�������� �ٷ� ���� ����.
		///////////////////////////////////////////////////////////////////
	}

//	static void test() {	}
//	static void test() {	}
//	static void test() {	}
//	static void test() {	}
//	static void test() {	}
//	static void test() {	}
//	static void test() {	}
//	static void test() {	}
//	static void test() {	}
//	static void test() {	}
	
	
}
