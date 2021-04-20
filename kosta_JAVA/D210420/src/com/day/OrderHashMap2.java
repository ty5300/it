package com.day;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class OrderHashMap2 {
	
	public static void main(String[] args) {

		HashMap<String, Movie> map = new HashMap<String, Movie>();

		ArrayList<Movie> list_movie = new ArrayList<Movie>();
		
		for (int i = 0; i < 5; i++) {
			Movie movie = new Movie(i);
			list_movie.add(movie);
		}

		Collections.sort(list_movie);  

		for (int i = 0; i <list_movie.size(); i++) {
			System.out.println(list_movie.get(i).schema.getTitle());
		}
	}
}