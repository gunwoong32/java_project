package �迭����;

import java.util.Scanner;


public class ���Ϲ��� {

	public static void main(String[] args) {
		
		//���/�ٳ����� 2õ��, ����/Ű���� 3õ��
		 
		String fruit [] = {"����","���","�ٳ���","����","Ű��"};
		int [] count = new int[5];
		Scanner sc = new Scanner(System.in);
		
		
		while (true) {
			System.out.println("==================");
			System.out.print("�����ϴ� ������? 1)���, 2)�ٳ���, 3)����, 4)Ű��, 0)����>>");
			int b = sc.nextInt();
			System.out.println(fruit[b] + "�� ���õǾ����ϴ�.");
			
			if (b == 0) {
				System.out.println("�ý����� ����˴ϴ�");
				for (int i = 1; i < count.length; i++) {
					System.out.println(fruit[i]+ ": " + count[i] + "��");
					
				}
			//	System.out.println("�����Ϸ��� ��ü �ݾ��� " +total+ "���Դϴ�");
			}
			System.out.println("==================");
			
					
			
			
			
		}//while
		
	}//main

}//class