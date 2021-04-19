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
import java.lang.Comparable; //패키지 import

public class Day_04_19 {
	
	static Set<String> test_set;
	// Set<String> test_set; static을 앞에 붙여줘야 메모리 할당을 받고, mian 내에서 test_set 변수명으로 사용 가능.
	// static을 안 붙이려면, main 혹은 메서드 내에 Set<String> test_set 라고 써주면 지역변수로 기능해서 사용 가능.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 의존객체 
		// 제품 휴대폰(판매자) 
		// 차수 열 => 이름 주소 주민번호 폰번호 이메일 통신사 요금제 단말기시리얼
		// 카디널리티 행 =>
		
		
		
//		test0(); // Static_test 란 무언인가?
//		test1(); // 1차 정렬 시도 <- PhoneData의 생성자에 s = new PhoneS( ... ) 추가 
//		test2(); // 2차 정렬 시도
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
		//key 값을 가나다 순으 정렬하자.
		HashMap<String, PhoneData> name_list = new HashMap<String,PhoneData>();
		
		for (int i = 0; i < 5; i++) {
			PhoneData data = new PhoneData(i); // new : 메모리 힙에 새로운 주소 할당
												// 중복 불가 key, 중복 가능 value
			name_list.put(data.name[i], data); // 동명이인이 있으므로 key값으로는 이름 사용 X.
			System.out.println("data.s.name "+data.s.name);	
		}

		// Set<String> test_set = name_list.keySet(); // main 위에 전역 변수로 static Set<String> test_set 로 안 써주면 좌측과 같이 써야 함. 
		test_set = name_list.keySet(); // keySet을 Set으로 받은건 keySey이 가변 배열이라는 의미.
													// static 은 다른 메모리에 대해 우선 할당받으니까
		for (String string : test_set) {
			System.out.println("정렬 전 : "+ string);
//			System.out.println(name_list.get(string).getAddr()); // 주소? 값?
		}System.out.println();
		
		
		
		// 방법2 - compareTo
		ArrayList<PhoneData> list_array = new ArrayList<PhoneData>(); // 정렬 기준이 없어서 어렵다.
		// 방법1 - ArrayList<String>
		ArrayList<String> list_String = new ArrayList<String>(); // String은 정렬 기준이 있어서 쉽게 된다.

//		Collections.sort(list_array); // list_array는 정렬 기준이 없어서 에러.
		for (int i = 0; i < 5; i++) {
			PhoneData data = new PhoneData(i); // new : 메모리 힙에 새로운 주소 할당
			name_list.put(data.name[i], data);
			// 방법2
			list_array.add(data);					
			
			
//			System.out.println(name_list.get(string).getAddr()); // 주소? 값?
		}System.out.println("list_array : "+ list_array);
		
		
		
		
		// 방법1-1) - key 값을 가나다 순으 정렬 - 에러
//		ArrayList<String> list_String1 = (ArrayList<String>) name_list.keySet(); // ( 형 변환 ) - 에러
		// 방법1-2) - key 값을 가나다 순으 정렬
//		ArrayList<String> list_String2 = new ArrayList<String>(name_list.keySet());
		// 방법1-3) - key 값을 가나다 순으 정렬
//		list_String.addAll(name_list.keySet()); // 형변환 까지 자동으로 해줌.  < ? extends E > 와일드 카드 있음.
//		System.out.println("list_String " + list_String);
		
		for (int i = 0; i < list_String.size(); i++) {
			System.out.println("정렬 직전 : " +list_String.get(i));			
		}

		// 방법2
		System.out.println("list_array :"+list_array);
		Collections.sort(list_array); 
		// Collections.sort는 의무적으로 comparTo를 호출하게 되어 있어서, 
		// compartTo가 에러 없이 완성이 되어야 collection도 정상 실행된다.
		
//		Collections.sort(list_String); // Collections에는 ArrayList, LinkedList를 삽입.

//		for (int i = 0; i < list_array.size(); i++) {	
//			System.out.println("Day : "+list_array.get(i).s.name);
//			
//			// 반환값 , String 배열을 arrayList에 넣는 것. 다양성 익히기. PhoneData의 함수 getList.
//			System.out.println(list_array.get(i).getList()); // list_array는 뭔지 알아?
//															 // list_array.get(i) 는 뭔지 알아?
//			
//			System.out.println(list_array.get(i).getList().get(i));
//			
//			for (int j = 0; j < list_array.get(i).getList().size(); j++) {
//				
//				System.out.println(list_array.get(i).getList().get(j));
//				
//				if (list_array.get(i).getList().get(j).equals("송가인")) {
//					// return; // 일치하는 데이터가 있으면 정지.
//					System.out.println("일치합니다. "+list_array.get(i).getList().get(j));
//				}				
//			}			
//		}
		
		System.out.println("-----------------------------------------------");
		// PhoneData 의 is_true 함수 이용해서 판별 // 이용자 추가 생성
		String temp = "원빈";
		for (int i = 0; i < list_array.size(); i++) {	
			if (list_array.get(i).is_true(temp)){
				System.out.println("id 중복.");
				}
			}System.out.println("id 사용 가능");
			name_list.put(temp, new PhoneData(temp, "제주도", "000", "010-0000-0000", "email", "sk", "30000", "기계번호_0010"));
			System.out.println(name_list.size());
			System.out.println(name_list.get(temp).s.phoneNum); // 번호 출력.
			System.out.println(name_list.get(temp).getPhoneNum());
			//System.out.println(name_list.getPhoneNum());  // 왜 안되는지 파악하자. - 
			// name_list는 PhoneData가 value인 Dict, Map을 가리키는 것!
			// 그래서 name_list.getPhoneNum()할 수 없다. 
			// name_list.get("송가인") 처럼 "송가인"을 키로 하는 PhoneData 객체인 data에
			// .getPhoneNum()을 붙여야 한다.
		}

	
	static void test3() {
		//key 값을 가나다 순으 정렬하자.
		HashMap<String, PhoneData> name_list = new HashMap<String,PhoneData>();
		
		for (int i = 0; i < 5; i++) {
			PhoneData data = new PhoneData(i); // new : 메모리 힙에 새로운 주소 할당
												// 중복 불가 key, 중복 가능 value
			name_list.put(data.name[i], data); // 동명이인이 있으므로 key값으로는 이름 사용 X.
			System.out.println("data.s.name "+data.s.name);	
		}

		// Set<String> test_set = name_list.keySet(); // main 위에 전역 변수로 static Set<String> test_set 로 안 써주면 좌측과 같이 써야 함. 
		test_set = name_list.keySet(); // keySet을 Set으로 받은건 keySey이 가변 배열이라는 의미.
													// static 은 다른 메모리에 대해 우선 할당받으니까
		for (String string : test_set) {
			System.out.println("정렬 전 : "+ string);
//			System.out.println(name_list.get(string).getAddr()); // 주소? 값?
		}System.out.println();
		
		
		
		// 방법2 - compareTo
		ArrayList<PhoneData> list_array = new ArrayList<PhoneData>(); // 정렬 기준이 없어서 어렵다.
		// 방법1 - ArrayList<String>
		ArrayList<String> list_String = new ArrayList<String>(); // String은 정렬 기준이 있어서 쉽게 된다.

//		Collections.sort(list_array); // list_array는 정렬 기준이 없어서 에러.
		for (int i = 0; i < 5; i++) {
			PhoneData data = new PhoneData(i); // new : 메모리 힙에 새로운 주소 할당
			name_list.put(data.name[i], data);
			// 방법2
			list_array.add(data);					
			
			
//			System.out.println(name_list.get(string).getAddr()); // 주소? 값?
		}System.out.println("list_array : "+ list_array);
		
		
		
		
		// 방법1-1) - key 값을 가나다 순으 정렬 - 에러
//		ArrayList<String> list_String1 = (ArrayList<String>) name_list.keySet(); // ( 형 변환 ) - 에러
		// 방법1-2) - key 값을 가나다 순으 정렬
//		ArrayList<String> list_String2 = new ArrayList<String>(name_list.keySet());
		// 방법1-3) - key 값을 가나다 순으 정렬
//		list_String.addAll(name_list.keySet()); // 형변환 까지 자동으로 해줌.  < ? extends E > 와일드 카드 있음.
//		System.out.println("list_String " + list_String);
		
		for (int i = 0; i < list_String.size(); i++) {
			System.out.println("정렬 직전 : " +list_String.get(i));			
		}

		// 방법2
		Collections.sort(list_array); 
		// Collections.sort는 의무적으로 comparTo를 호출하게 되어 있어서, 
		// compartTo가 에러 없이 완성이 되어야 collection도 정상 실행된다.
		
//		Collections.sort(list_String); // Collections에는 ArrayList, LinkedList를 삽입.

		for (int i = 0; i < list_array.size(); i++) {	
			System.out.println("Day : "+list_array.get(i).s.name);
			
			// 반환값 , String 배열을 arrayList에 넣는 것. 다양성 익히기. PhoneData의 함수 getList.
			System.out.println(list_array.get(i).getList());
			System.out.println(list_array.get(i).getList().get(i));
			for (int j = 0; j < list_array.get(i).getList().size(); j++) {
				System.out.println(list_array.get(i).getList().get(j));
				
				if (list_array.get(i).getList().get(j).equals("송가인")) {
					System.out.println("일치합니다. "+list_array.get(i).getList().get(j));
				}
			}
		}

	}

	static void test2() {
		//key 값을 가나다 순으 정렬하자.
		HashMap<String, PhoneData> name_list = new HashMap<String,PhoneData>();
		
		for (int i = 0; i < 5; i++) {
			PhoneData data = new PhoneData(i); // new : 메모리 힙에 새로운 주소 할당
												// 중복 불가 key, 중복 가능 value
			name_list.put(data.name[i], data); // 동명이인이 있으므로 key값으로는 이름 사용 X.
			System.out.println("data.s.name "+data.s.name);	
		}
		System.out.println(name_list.size());
		System.out.println(name_list.keySet()); // [송가인, 유재석, 김수현, 아이유, 현빈] : 배열
		
		// Set<String> test_set = name_list.keySet(); // main 위에 전역 변수로 static Set<String> test_set 로 안 써주면 좌측과 같이 써야 함. 
		test_set = name_list.keySet(); // keySet을 Set으로 받은건 keySey이 가변 배열이라는 의미.
													// static 은 다른 메모리에 대해 우선 할당받으니까
		for (String string : test_set) {
			System.out.println("정렬 전 : "+ string);
//			System.out.println(name_list.get(string).getAddr()); // 주소? 값?
		}System.out.println();
		
		// 방법2 - 	
		ArrayList<PhoneData> list_array = new ArrayList<PhoneData>();
		// 방법1 - key 값을 가나다 순으 정렬
		ArrayList<String> list_String = new ArrayList<String>();

//		Collections.sort(list_array); // list_array는 정렬 기준이 없어서 에러.
		for (int i = 0; i < 5; i++) {
			PhoneData data = new PhoneData(i); // new : 메모리 힙에 새로운 주소 할당
			name_list.put(data.name[i], data);
			// 방법2
			list_array.add(data);					

//			System.out.println(name_list.get(string).getAddr()); // 주소? 값?
		}System.out.println();
		
		
		
		
		// 방법1-1) - key 값을 가나다 순으 정렬 - 에러
//		ArrayList<String> list_String1 = (ArrayList<String>) name_list.keySet(); // ( 형 변환 ) - 에러
		// 방법1-2) - key 값을 가나다 순으 정렬
//		ArrayList<String> list_String2 = new ArrayList<String>(name_list.keySet());
		// 방법1-3) - key 값을 가나다 순으 정렬
		list_String.addAll(name_list.keySet()); // 형변환 까지 자동으로 해줌.  < ? extends E > 와일드 카드 있음.
		System.out.println(list_String);

		System.out.println(name_list.size());
		
		for (int i = 0; i < list_String.size(); i++) {
			System.out.println(list_String.get(i));			
		}

		
//		Collections.sort(list_array); // 못 받는 타입이라서 에러. 이 라인 지우고 comparTo로 할 것.
		Collections.sort(list_String); // Collections에는 ArrayList, LinkedList를 삽입.

		for (int i = 0; i < list_String.size(); i++) {			
//			System.out.println("정렬 후 : "+list_String.get(i));			
//			System.out.println(name_list.get(list_String.get(i))); // 주소가 찍히니 객체인 것.
			System.out.println(".s.name "+name_list.get(list_String.get(i))); // 주소가 찍히니 객체인 것.
			System.out.println(".s.name "+name_list.get(list_String.get(i)).s.name); // s.가 의존 객체. 
			System.out.println(".s.addr "+name_list.get(list_String.get(i)).s.addr); // 주소가 찍히니 객체인 것.
			System.out.println(".s.getAddr "+name_list.get(list_String.get(i)).getAddr()[i]); // 주소가 찍히니 객체인 것.

		}

	}
		
	
	static void test1() {
		//key 값을 가나다 순으 정렬하자.
		HashMap<String, PhoneData> name_list = new HashMap<String,PhoneData>();
		
		for (int i = 0; i < 5; i++) {
			PhoneData data = new PhoneData(i); // new : 메모리 힙에 새로운 주소 할당
												// 중복 불가 key, 중복 가능 value
			name_list.put(data.name[i], data); // 동명이인이 있으므로 key값으로는 이름 사용 X.
			System.out.println("data.s.name "+data.s.name);	
		}
		System.out.println(name_list.size());
		System.out.println(name_list.keySet()); // [송가인, 유재석, 김수현, 아이유, 현빈] : 배열
		
		// Set<String> test_set = name_list.keySet(); // main 위에 전역 변수로 static Set<String> test_set 로 안 써주면 좌측과 같이 써야 함. 
		test_set = name_list.keySet(); // keySet을 Set으로 받은건 keySey이 가변 배열이라는 의미.
													// static 은 다른 메모리에 대해 우선 할당받으니까
		for (String string : test_set) {
			System.out.println("정렬 전 : "+ string);
//			System.out.println(name_list.get(string).getAddr()); // 주소? 값?
		}System.out.println();
		
		
		// 방법2
		ArrayList<PhoneData> list_array = new ArrayList<PhoneData>();
		// 방법1 - key 값을 가나다 순으 정렬
		ArrayList<String> list_String = new ArrayList<String>();

//		Collections.sort(list_array); // list_array는 정렬 기준이 없어서 에러.
		for (int i = 0; i < 5; i++) {
			PhoneData data = new PhoneData(i); // new : 메모리 힙에 새로운 주소 할당
			name_list.put(data.name[i], data);
			// 방법2
			list_array.add(data);					

			
//			System.out.println(name_list.get(string).getAddr()); // 주소? 값?
		}System.out.println();
		
		
		
		
		// 방법1-1) - key 값을 가나다 순으 정렬 - 에러
//		ArrayList<String> list_String1 = (ArrayList<String>) name_list.keySet(); // ( 형 변환 ) - 에러
		// 방법1-2) - key 값을 가나다 순으 정렬
//		ArrayList<String> list_String2 = new ArrayList<String>(name_list.keySet());
		// 방법1-3) - key 값을 가나다 순으 정렬
		list_String.addAll(name_list.keySet()); // 형변환 까지 자동으로 해줌.  < ? extends E > 와일드 카드 있음.
		System.out.println(list_String);

		System.out.println(name_list.size());
		
		for (int i = 0; i < list_String.size(); i++) {
			System.out.println(list_String.get(i));			
		}

		
//		Collections.sort(list_array); // 못 받는 타입이라서 에러. 이 라인 지우고 comparTo로 할 것.
		Collections.sort(list_String); // Collections에는 ArrayList, LinkedList를 삽입.

		for (String string : list_String) {
			System.out.println("정렬 후 : "+ string);
//			System.out.println(name_list.get(string).getAddr()); // 주소? 값?
		}System.out.println();
		
	}
		
		// 방법4 - key 값을 가나다 순으 정렬
//		TreeMap<String,PhoneData> tm = new TreeMap<String,PhoneData>(name_list);  
//		Iterator<String> iteratorKey = tm.keySet( ).iterator( ); // 키값 오름차순 정렬
//		Iterator<String> iteratorKey = tm.descendingKeySet().iterator(); //키값 내림차순 정렬
		


		
		// Map은을 keySet으로 출력하면, name 배열에 입력한 대로 출력되지 않는다.
		// 
		
//		PhoneS s = new PhoneS(data.name[0], data.addr[0], data.number[0], data.phoneNum[0], data.email[0],
//				data.service[0], data.plan[0], data.serial[0]); // 생성자가 없으면 에러 발생
	
	static void test0() {	
		// 객체 생성시 new 연산자로 주소가 다르게 된다고 배웠는데,
		// 아래와 같이 하면 static인 count를 출력해보자. 주소가 같네.
		// static이 들어가면 여러 개를 생성해도 주소가 한 개다.
		// 따라서, 값을 변경 시키면 a, b 모두에 바뀐다. 
		// 즉, 편리하지만, 여러 개를 만드는 의미가 없어서, static은 자제해서 사용해야 한다.
		// Static_test.java -> public static int count;
		Static_test test_a = new Static_test(); 
		Static_test test_b = new Static_test();
		System.out.println(test_a);
		System.out.println(test_b);
		test_a.count = 300;
		System.out.println(test_a.count);
		System.out.println(test_b.count);
		System.out.println(Static_test.count);
		System.out.println(test_a.int_array);  // static으로 변수를 설정해둬서, 
		System.out.println(test_b.int_array); // 객체에서 접근도 할 수 있고
		System.out.println(Static_test.int_array); // 클래스에서 바로 접근 가능.
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
