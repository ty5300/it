package com.day;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;


public class OrderHashMap1 {

	public static void main(String[] args) {
		
		HashMap<String, Movie> map = new HashMap<String, Movie>();
		
		for (int i = 0; i < 5; i++) {
			Movie movie = new Movie(i);
			map.put(movie.schema.getTitle(), movie);
		}

		
		// ��� 1)
		ArrayList<String> list = new ArrayList<String>();
		list.addAll(map.keySet());

		// ��� 2)
		// ArrayList<String> list = new ArrayList<String>(map.keySet());

		Collections.sort(list);

		for (String string :list) {
			System.out.println(string);
		}
		
		
		/** - Collections.sort(list); - */
		/* public class Movie implements Comparable<Movie>
		@Override
		public int compareTo(Movie o) {
		return this.schema.getTitle().compareTo(o.schema.getTitle());
		} */

	}

}



package day.com;

import java.util.ArrayList;


public class Movie implements Comparable<Movie>{  // @Override compareTo()
//public class Movie implements I2 {                // @Override GetList()

	@Override /** implements I2 */
	public ArrayList<String> GetList() {
		// TODO Auto-generated method stub
		ArrayList<String> list = new ArrayList<String>();

		for (int j = 0; j < title.length; j++) {
			list.add(title[j]);
		}
		
		return list;
	}
	
	MovieS schema = null ;

	String[] title = {"����", "���鷯����Ʈ", "Ÿ��Ÿ��", "�����", "Ŭ����"};
	String[] director = {"����", "���ʹ���", "ī�޷�", "����ȣ", "�����"};
	String[] genre = {"�׼�", "���", "���", "������", "��ε��"};
	String[] count = {"100��", "300��", "900��", "1000��", "150��"};
	String[] actor = {"�帣��", "���ϴϽ�", "��ī������", "�۰�ȣ", "���¿�"};
	String[] actress = {"��Ż��", "������", "����Ʈ", "������", "�տ���"};
	String[] time = {"120��", "200��", "","",""};
	
	public Movie() {
		// TODO Auto-generated constructor stub
	}
	
	public Movie(int i) {  // default constructor
		schema = new MovieS();
		schema.setTitle(title[i]);
		schema.setDirector(director[i]);
		schema.setGenre(genre[i]);
		schema.setCount(count[i]);
		schema.setActor(actor[i]);
		schema.setActress(actress[i]);
		schema.setTime(time[i]);
	}
	
	@Override
	public int compareTo(Movie o) {
		return this.schema.getTitle().compareTo(o.schema.getTitle());
	}
		
	
}