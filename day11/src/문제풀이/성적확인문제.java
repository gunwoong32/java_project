package ����Ǯ��;

import java.util.Iterator;

public class ����Ȯ�ι��� {

	public static void main(String[] args) {

		String[] subject = { "��ǻ��", "����", "����", "����", "ü��" };
		int[] term1 = { 77, 88, 99, 80, 70 };
		int[] term2 = { 99, 100, 88, 80, 70 };
		int a = 0;
		int b = 0;
		int  location = -1;
		// 1. ������ 2�б⿡ ���� ������ ���� ī��Ʈ�غ�����.
		for (int i = 0; i < term2.length; i++) {
			if (term1[i] < term2[i]) {
				a++;
			}
		}
		System.out.println("2�б⿡ ���� ������ ���� " + a + "����");
		// 2. ������ 1,2�б� ������ ������ ���� ī��Ʈ�غ�����.
		for (int i = 0; i < term2.length; i++) {
			if (term1[i] == term2[i]) {
				b++;
				location = i;
				
			}
		}
		System.out.println("1,2�б� ������ ������ ���� " + b + "����");

		// 3. ������ 1,2�б� ������ ������� ����Ʈ�غ�����.
		if (location != -1) {
			System.out.println("������ 1,2�б� ������ ������ " + subject[location]);
		}else {
			System.out.println("������ ������ �����ϴ�.");
		}

		
		
		
		
		
		
		
		
		
		
		
		
	}

}
