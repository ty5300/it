package com.day;

public class A_B_I_implements1 {

	public static void main(String[] args) {
		A a = new A();
		B b = new B();
		
		a.A_method();
		b.B_method();
		
		/** - Error - 
		 * I a = new B(); -> a.A_method()�� A�� ������ method�̹Ƿ� ȣ�� �Ұ�. 
			 		   	  -> a.GetList().get(0) �� ����.
		 * I b = new B(); -> b.B_method()�� B�� ������ method�̹Ƿ� ȣ�� �Ұ�. 
					      -> b.GetList().get(0) �� ����.
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
	
	String[] title = {"����", "���鷯����Ʈ", "Ÿ��Ÿ��", "�����", "Ŭ����"};
	String[] director = {"����", "���ʹ���", "ī�޷�", "����ȣ", "�����"};
	String[] genre = {"�׼�", "���", "���", "������", "��ε��"};
	String[] count = {"100��", "300��", "900��", "1000��", "150��"};
	String[] actor = {"�帣��", "���ϴϽ�", "��ī������", "�۰�ȣ", "���¿�"};
	String[] actress = {"��Ż��", "������", "����Ʈ", "������", "�տ���"};
	String[] time = {"120��", "200��", "","",""};
}

