package ����Ǯ��;

import java.util.Random;

public class ���ɹ��� {

	public static void main(String[] args) {
		int[] jumsu = new int [10000];
		Random r = new Random(5);
		int n = 0;
		
		for (int i = 0; i < jumsu.length; i++) {
			jumsu[i] =r.nextInt(331);
			System.out.println(jumsu[i]);
			if (jumsu[i] == 330) {
				n++;
			}
			
			}
			System.out.println("���ɸ����ڴ� " + n + "���Դϴ�.");		
		}
		
	
		//1. ���ɸ����ڴ� �� ���ϱ��
		//2. ������ ��ȣ�� �� ���ϱ��
		
	}