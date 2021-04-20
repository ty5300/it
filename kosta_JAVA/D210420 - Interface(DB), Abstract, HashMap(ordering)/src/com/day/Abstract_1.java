package com.day;

public class Abstract_1 {

	public static void main(String[] args) {
		Abstract_1();
	}
	static void Abstract_1() {	
		ArrayList<I> list = new ArrayList<I>(); // 클래스가 10개라도 하나의 인터페이스 I로 처리가 가능하다.

		
		D d = new D();
		d.GetList();  /* in Interface */
		d.getTest();  /* in Abstract _ abstract method  */
		d.test();     /* in Abstract _ default method */ 
		d.list();     /* in class D */
				
		Abs d = new D(); 
		d.GetList();  
		d.getTest();
		d.test();     
		d.list();      /* Error */

		I d = new D();
		d.GetList();  
		d.getTest();   /* Error */
		d.test();      /* Error */     
		d.list();      /* Error */

	}
}



package day.com;

import java.util.ArrayList;

public class D  extends Abs{
	/** abstract class Abs를 상속 -> */
	
	/** (interface I) implements -> (abstract Abs) extends -> D -> GetList() */
	@Override
	public ArrayList<String> GetList() { 
			ArrayList<String> list = new ArrayList<String>();
			list.add("D class");
			return list; // return 이라서 출력은 안됨. 
			}
	
	/** (abstract Abs) extends -> D -> GetList() */
	@Override
	public void getTest() {  
		System.out.println("test");
	}
	
	/** D -> */
	public void list() { // 내가 여기 class D에서 방금 만든 것.
		System.out.println("list");
	}
}





package day.com;

import java.util.ArrayList;

public interface I {
	ArrayList<String> GetList(); 
}




package day.com;

import java.util.ArrayList;

public abstract class Abs implements I{ 
	/** 규칙 - [abstract] class 클래스명, [abstract] void 메서드명()
	 *  New class [tap] -> Modifiers -> abstract
	 *  abstract : Abs를 상속받는 class에게 interface(@Override)를 전달
	 */
	
	public abstract void getTest(); 
	
	public void test() {
	}
}
