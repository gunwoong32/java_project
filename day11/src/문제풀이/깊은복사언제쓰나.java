package ����Ǯ��;

import java.util.Iterator;

public class ��������������� {

	public static void main(String[] args) {
		String[] subject = {"����","����","����","��ǻ��","ȸȭ"};
		int[] term1 = {44,66,22,99,100};
		int[] term2 = term1.clone();
		term2[0] = 55;
		term2[2] = 88;	
		//term1 = {44,66,22,99,100}
		//term2 = {22,66,88,99,100}00
		int a =0;
		int b =0;
		
		//0)��ü 1�б�, 2�б� ���� ����Ʈ
		for (int i = 0; i < term2.length; i++) {
			System.out.println("����� : " + subject[i]);
			System.out.println("1�б� ���� : " + term1[i]);
			System.out.println("2�б� ���� : " + term2[i]);
		}
		
		
		//1)1�б�, 2�б� ���� �� ������ ���������
		for (int i = 0; i < term2.length; i++) {
			if (term1[i] == term2[i]) {
				a++;
			}
		}
		System.out.println("1�б�, 2�б� ���� �� ������ ��������� : " + a);
		
		//2)1�б�, 2�б� ���� �� ���� �����
		for (int i = 0; i < term2.length; i++) {
			if (term1[i] < term2[i]) {
				b++;
			}
		}
		System.out.println("1�б�, 2�б� ���� �� ���� ����� : " + b);
		
		//3)1�б�, 2�б� ���� �� ���� �����
		System.out.print("1�б�, 2�б� ���� �� ���� ����� : ");		
		for (int i = 0; i < term2.length; i++) {
			if (term1[i]<term2[i]) {
				System.out.print(subject[i]+ " ");
				
			}
		}
		
		
		
		
		
	}

}
