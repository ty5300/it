package com.day;

public class A_B_I_implements2 {

	public static void main(String[] args) {
		/** <A> -> <I> : A_B_I_implements1�� Error 2 �ذ� 
		 * ���� Ŭ������ �ϳ��� interface�� ó�� ����
		*/
		ArrayList<I> list = new ArrayList<I>(); 
		
		A a = new A();
		B b = new B();
		C c = new C();
		
		list.add(a);
		list.add(b); 
		list.add(c); 
		
		/** ��� ��� 1 */
		for (int i = 0; i < list.size(); i++) {
			
			for (int j = 0; j < list.get(i).GetList().size(); j++) {
				
				System.out.println(list.get(i).GetList().get(j));
			}
		}
		
		/** ��� ��� 1 */
		One_Stop(b);
	}
	
	
	static void One_Stop(I k) {	
		/** ( A a ) -> ( I a ) */

		for (int i = 0; i < k.GetList().size(); i++) {
			System.out.println(k.GetList().get(i));
		}
	}
}
