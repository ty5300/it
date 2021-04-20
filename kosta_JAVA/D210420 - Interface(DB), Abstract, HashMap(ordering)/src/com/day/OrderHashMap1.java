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

		
		// 방식 1)
		ArrayList<String> list = new ArrayList<String>();
		list.addAll(map.keySet());

		// 방식 2)
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

	String[] title = {"레옹", "쉰들러리스트", "타이타닉", "기생충", "클래식"};
	String[] director = {"룩배송", "스필버그", "카메론", "봉준호", "곽재용"};
	String[] genre = {"액션", "드라마", "드라마", "스릴러", "멜로드라마"};
	String[] count = {"100만", "300만", "900만", "1000만", "150만"};
	String[] actor = {"장르노", "리암니스", "디카프리오", "송강호", "조승우"};
	String[] actress = {"나탈리", "엠베스", "케이트", "조여정", "손예진"};
	String[] time = {"120분", "200분", "","",""};
	
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