package com.day;

public class A_B_I_implements1 {

	public static void main(String[] args) {
		A a = new A();
		B b = new B();
		
		a.A_method();
		b.B_method();
		
		/** - Error - 
		 * I a = new B(); -> a.A_method()는 A의 고유한 method이므로 호출 불가. 
			 		   	  -> a.GetList().get(0) 는 가능.
		 * I b = new B(); -> b.B_method()는 B의 고유한 method이므로 호출 불가. 
					      -> b.GetList().get(0) 는 가능.
		*/

		/** - Error - 
		 * a.GetList().size() > b.GetList().size()
		 */
		for (int i = 0; i < a.GetList().size(); i++) {
			System.out.println(a.GetList().get(i));   
			System.out.println(b.GetList().get(i));   
		}
	}
}
	
package com.day;

import java.util.ArrayList;

public class A_B_I_implements1 {

	@Override
	public ArrayList<String> GetList() {
		// TODO Auto-generated method stub
		ArrayList<String> list = new ArrayList<String>();
				list.add("A_@Override(1)");
				list.add("A_@Override(2)");
		return list;
	}
	
	public void A_method() {
		System.out.println("A_method");
	}
}



package com.day;

import java.util.ArrayList;

public class B implements I {

	@Override
	public ArrayList<String> GetList() {
		// TODO Auto-generated method stub
		ArrayList<String> list = new ArrayList<String>();
		list.add("B_@Override(1)");
		return list;
	}
	
	public void B_method() {
		System.out.println("B_method");
	}
}


package com.day;

import java.util.ArrayList;

public class C implements I {
	
	@Override
	public ArrayList<String> GetList() {
		// TODO Auto-generated method stub
		ArrayList<String> list = new ArrayList<String>();
		list.add("C_@Override (1)");
		return list;
	}
	
	String[] title = {"레옹", "쉰들러리스트", "타이타닉", "기생충", "클래식"};
	String[] director = {"룩배송", "스필버그", "카메론", "봉준호", "곽재용"};
	String[] genre = {"액션", "드라마", "드라마", "스릴러", "멜로드라마"};
	String[] count = {"100만", "300만", "900만", "1000만", "150만"};
	String[] actor = {"장르노", "리암니스", "디카프리오", "송강호", "조승우"};
	String[] actress = {"나탈리", "엠베스", "케이트", "조여정", "손예진"};
	String[] time = {"120분", "200분", "","",""};
}

