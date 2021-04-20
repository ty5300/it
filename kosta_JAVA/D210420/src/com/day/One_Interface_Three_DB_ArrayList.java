package com.day;

public class One_Interface_Three_DB_ArrayList {
	public static void main(String[] args) {
		/** interface�� ����ؼ� ���� DB���� key ���� ����ϱ� */
		
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
public class PhoneData implements I {	// impelments I2 �ǽ���
	
	public PhoneS schema; // Day_04_19���� data.s.name�� �����ϱ� ���� �ܺο� s�� ������.
	String str;
	String[] name = {"�۰���", "����", "�����", "������","���缮"};
	private String[] addr = {"��⵵ ������", "���� Ư����", "�λ� ������", "��õ ������", "���� ������"};
	private String[] number = {"000000-123456", "000000-123456", "000000-123456", "000000-123456", "000000-123456" };
	private String[] phoneNum = {"010-0000-1234", "010-0000-1234","010-0000-1234","010-0000-1234","010-0000-1234"};
	private String[] email = {"kmgc18@naver.com","kmgc18@naver.com","kmgc18@naver.com","kmgc18@naver.com","kmgc18@naver.com" };
	private String[] service = {"sk-0000-1234", "lg-0000-1234", "kt-0000-1234", "sk-0000-1234", "������-0000-1234"};
	private String[] plan = {"20000", "30000", "50000" , "60000", "70000"};
	private String[] serial = {"����ȣ_0000", "����ȣ_0000", "����ȣ_0000","����ȣ_0000","����ȣ_0000" };

	public PhoneData() {
	}
	
	public PhoneData(int index) {
		super();
		/** PhoneS schema : ������ü. PhoneData ȣ�� �� �����ڿ� ���� PhoneS�� ���� schema ȣ��. */
		schema = new PhoneS(name[index], addr[index], number[index], phoneNum[index], email[index],
				service[index], plan[index], serial[index]); // �����ڰ� ������ ���� �߻�
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

	String[] title = {"����", "���鷯����Ʈ", "Ÿ��Ÿ��", "�����", "Ŭ����"};
	String[] director = {"����", "���ʹ���", "ī�޷�", "����ȣ", "�����"};
	String[] genre = {"�׼�", "���", "���", "������", "��ε��"};
	String[] count = {"100��", "300��", "900��", "1000��", "150��"};
	String[] actor = {"�帣��", "���ϴϽ�", "��ī������", "�۰�ȣ", "���¿�"};
	String[] actress = {"��Ż��", "������", "����Ʈ", "������", "�տ���"};
	String[] time = {"120��", "200��", "","",""};
	
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
	
	String[] name = {"ȫ�浿", "�Ż��Ӵ�", "���﹮"};
	int[]  age = {60, 31, 22};	
	String[] addr = {"�����", "������", "������"};
	String[] phone = {"011", "012", "012"};
	String[] gender = {"��", "��", "��"};
	
	
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

