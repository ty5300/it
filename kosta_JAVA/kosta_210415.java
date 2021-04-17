package com.day;
import java.util.ArrayList;
import com.today.TA;
public class Day_0415 extends TA {
	public static void main(String[] args) {
		class_heri();

	}
	static void info() {
		A_2 a = new A_2();
		String[] text_data = new String[] { "아이디", "이선구", "분당구 판교동", "010-2222-1111", "남여", "1234567", "28" };

		A_2 ac = new A_2(text_data[0], text_data[1], text_data[2], text_data[3], text_data[4], text_data[5],
				text_data[6]);

		System.out.println(ac.id); 		System.out.println(ac.name);		System.out.println(ac.addr);
		System.out.println(ac.phone);		System.out.println(ac.gender);		System.out.println(ac.age);
		System.out.println(ac.number);
	}
	static void dd() {
		A_2 a = new A_2();
		a.num_a = 100;
		TA ta = new TA();
		ta.num_ta = 50;

		Day_0415 day = new Day_0415();
		day.num_ta = 1;
	}

	static void class_heri() {
		A a = new A();
//		A a = new A(1);
//		A a_1 = new A();
//		System.out.println(a.count);
//		System.out.println(a.count2);
//		System.out.println(a.count3);
//
////		System.out.println(a.b.number);
////		System.out.println(a.number);
////		System.out.println(a_1.count);
//
////		Day_0415 n_data = new Day_0415();
////		
////		n_data.count = 600;
////		System.out.println(n_data.number);
	}

	static void list_methods() {
		ArrayList<Integer> list = new ArrayList<Integer>();
		ArrayList<Integer> list2 = new ArrayList<Integer>();

		list.add(1);
		list.add(2);
		list2.add(1);
//		System.out.println(list.get(0));
//		list.clear();
//		System.out.println(list);

		boolean bb = list.equals(list2); // String과 같이 주소가 아닌 value를 비교한다.
		boolean bb2 = list.contains(1);
		System.out.println("list와 list2가 같은가?" + bb);
		System.out.println("list에 값이 포함되어있는가?" + bb2);

		list.set(1, 4);
		System.out.println(list.get(1));
	}
}