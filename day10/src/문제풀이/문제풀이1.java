package ����Ǯ��;

import java.util.Scanner;

public class ����Ǯ��1 {

	public static void main(String[] args) {
		int[] num = new int[5];
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < num.length; i++) {
			System.out.print("�����Է�>>");
			
			num [i] = sc.nextInt();
		}
			System.out.println(num[0] +num[2]);
		sc.close(); //��ũ��(�������)�� �ݾƶ�
		
		
		
	}

}
