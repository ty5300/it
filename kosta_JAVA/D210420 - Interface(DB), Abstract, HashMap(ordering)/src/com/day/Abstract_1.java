package com.day;

public class Abstract_1 {

	public static void main(String[] args) {
		Abstract_1();
	}
	static void Abstract_1() {	
		ArrayList<I> list = new ArrayList<I>(); // Ŭ������ 10���� �ϳ��� �������̽� I�� ó���� �����ϴ�.

		
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
	/** abstract class Abs�� ��� -> */
	
	/** (interface I) implements -> (abstract Abs) extends -> D -> GetList() */
	@Override
	public ArrayList<String> GetList() { 
			ArrayList<String> list = new ArrayList<String>();
			list.add("D class");
			return list; // return �̶� ����� �ȵ�. 
			}
	
	/** (abstract Abs) extends -> D -> GetList() */
	@Override
	public void getTest() {  
		System.out.println("test");
	}
	
	/** D -> */
	public void list() { // ���� ���� class D���� ��� ���� ��.
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
	/** ��Ģ - [abstract] class Ŭ������, [abstract] void �޼����()
	 *  New class [tap] -> Modifiers -> abstract
	 *  abstract : Abs�� ��ӹ޴� class���� interface(@Override)�� ����
	 */
	
	public abstract void getTest(); 
	
	public void test() {
	}
}
