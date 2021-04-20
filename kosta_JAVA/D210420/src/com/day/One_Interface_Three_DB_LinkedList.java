package com.day;

import java.util.LinkedList;

public class One_Interface_Three_DB_LinkedList {

	public static void main(String[] args) {
		One_Interface_Three_DB_LinkedList()
	}
	
	static void One_Interface_Three_DB_LinkedList() {	
		LinkedList<I> linked = new LinkedList<I>();
		Movie mo = new Movie();
		PhoneData ph = new PhoneData();
		Data_in da = new Data_in();
		
		linked.add(mo);
		linked.add(ph);
		linked.add(da);
		
		List_Interface(linked);
		
	}
	
	
	static void List_Interface(List<I> list) {	
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).GetList().size());
			for (int j = 0; j < list.get(i).GetList().size(); j++) {
				System.out.println( list.get(i).GetList().get(j));
			}
		}

	}
}



package day.com;

import java.util.ArrayList;

public interface I {
	ArrayList<String> GetList(); // 인터페이스라서 헤드만 있고 몸통은 없다. A, B에 implements 함.

}
