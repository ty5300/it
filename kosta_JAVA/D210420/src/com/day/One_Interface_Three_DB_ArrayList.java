package com.day;

public class One_Interface_Three_DB_ArrayList {
	public static void main(String[] args) {
		/** interface를 사용해서 여러 DB에서 key 값만 출력하기 */
		
		ArrayList<I> list = new ArrayList<I>(); 
		
		Movie mo = new Movie();
		PhoneData ph = new PhoneData();
		Data_in da = new Data_in();

		list.add(mo);
		list.add(ph);
		list.add(da);

		for (int i = 0; i < list.size(); i++) {
			for (int j = 0; j < list.get(i).GetList().size(); j++) {
				System.out.println(list.get(i).GetList());
				
			}System.out.println("* * * * * * * * *");
		}
		
		ArrayList_Interface(list);
		Parameter_Interface(ph);
	}
	
	static void Parameter_Interface(I a) {
		for (int i = 0; i < a.GetList().size(); i++) {
			System.out.println(a.GetList().get(i));
		}
	}
	
	
	static void ArrayList_Interface(ArrayList<I> list) {	
		for (int i = 0; i < list.size(); i++) {
			for (int j = 0; j < list.get(i).GetList().size(); j++) {
				System.out.println( list.get(i).GetList().get(j));  
			}
		}
	}
}




package day.com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

/** Comparable - @Override compareTo() */
//public class PhoneData implements Comparable<PhoneData> {

/** Interface - @Override GetList() */
public class PhoneData implements I {	// impelments I2 실습용
	
	public PhoneS schema; // Day_04_19에서 data.s.name로 접근하기 위해 외부에 s를 정의함.
	String str;
	String[] name = {"송가인", "현빈", "김수현", "아이유","유재석"};
	private String[] addr = {"경기도 수원시", "서울 특별시", "부산 광역시", "인천 광역시", "대전 광역시"};
	private String[] number = {"000000-123456", "000000-123456", "000000-123456", "000000-123456", "000000-123456" };
	private String[] phoneNum = {"010-0000-1234", "010-0000-1234","010-0000-1234","010-0000-1234","010-0000-1234"};
	private String[] email = {"kmgc18@naver.com","kmgc18@naver.com","kmgc18@naver.com","kmgc18@naver.com","kmgc18@naver.com" };
	private String[] service = {"sk-0000-1234", "lg-0000-1234", "kt-0000-1234", "sk-0000-1234", "별정통-0000-1234"};
	private String[] plan = {"20000", "30000", "50000" , "60000", "70000"};
	private String[] serial = {"기계번호_0000", "기계번호_0000", "기계번호_0000","기계번호_0000","기계번호_0000" };

	public PhoneData() {
	}
	
	public PhoneData(int index) {
		super();
		/** PhoneS schema : 의존객체. PhoneData 호출 시 생성자에 의해 PhoneS의 변수 schema 호출. */
		schema = new PhoneS(name[index], addr[index], number[index], phoneNum[index], email[index],
				service[index], plan[index], serial[index]); // 생성자가 없으면 에러 발생
//		System.out.println("PhoneData - s :"+ s);
		}
	
	
	/** public class PhoneData implements Comparable<PhoneData> */
	@Override
	public int compareTo(PhoneData o) {
		System.out.println(" ----compareTo----");
		return this.schema.name.compareTo(o.schema.name) ; 
	}
	
	@Override
	public ArrayList<String> GetList() {
		// TODO Auto-generated method stub
		ArrayList<String> list = new ArrayList<String>();
//		
		for (int j = 0; j < name.length; j++) {
			list.add(name[j]);
		}
		
		return list;

	}
	
	public PhoneS getS() {
		return schema;
	}

	public String[] getName() {
		return name;
	}

	public String[] getAddr() {
		return addr;
	}

	public String[] getNumber() {
		return number;
	}

	public String[] getPhoneNum() {
		return phoneNum;
	}

	public String[] getEmail() {
		return email;
	}

	public String[] getService() {
		return service;
	}

	public String[] getPlan() {
		return plan;
	}

	public String[] getSerial() {
		return serial;
	}
}




package day.com;

import java.util.ArrayList;

/** Comparable - @Override compareTo() */
//public class Movie implements Comparable<Movie>{  

/** Interface - @Override GetList() */
public class Movie implements I {        
	@Override
	public ArrayList<String> GetList() {
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
	
	/** public class Movie implements Comparable<Movie> */
	@Override
	public int compareTo(Movie o) {
		return this.schema.getTitle().compareTo(o.schema.getTitle());
	}
}



package day.com;

import java.util.ArrayList;

/** Comparable - @Override compareTo() */
//public class Data_in implements Comparable<Data_in> {

/** Interface - @Override GetList() */
public class Data_in implements I {
	
	public Data_in schema; 

	@Override
	public ArrayList<String> GetList() {

		ArrayList<String> list = new ArrayList<String>();

		for (int j = 0; j < name.length; j++) {
			list.add(name[j]);
		}
		return list;
	}
	
	String[] name = {"홍길동", "신사임당", "성삼문"};
	int[]  age = {60, 31, 22};	
	String[] addr = {"서울시", "강서구", "강동구"};
	String[] phone = {"011", "012", "012"};
	String[] gender = {"남", "여", "남"};
	
	
	public Data_in(String[] name, int[] age, String[] addr, String[] phone, String[] gender) {
		super();
		this.name = name;
		this.age = age;
		this.addr = addr;
		this.phone = phone;
		this.gender = gender;
	}

	public Data_in() {
	}
}

