package ����;

import java.util.Iterator;
import java.util.Random;

public class ����1000�� {

	public static void main(String[] args) {
		int[] jumsu = new int[1000];
//		
//		����ũ�� 1002��
//		���� ũ�� 4012byte
		System.out.println(jumsu.length + "��");
		System.out.println(jumsu);
		//�⺻�� ����(��)�� ���� : 1001 
		//������ ����(�ּ�) : 1
		Random r = new Random(3);
		System.out.println(r.nextInt(100));
		
//		jumsu[0] = r.nextint(100);
//		jumsu[1] = r.nextint(100);
//		jumsu[2] = r.nextint(100);
//		-> for
		for (int i = 0; i < jumsu.length; i++) {
			jumsu[i] =r.nextInt(100);
		}
		for (int i = 0; i < jumsu.length; i++) {
			System.out.println(jumsu[i]);
		}
//		-> foreach
		for (int x : jumsu) {
			System.out.println(x);
		}
		
	}//main

}//class
