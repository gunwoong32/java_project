package �迭����;

import java.util.Iterator;
import java.util.Scanner;

public class �������ƶ� {

	public static void main(String[] args) {
		int [] seat = new int[10];
		 Scanner sc = new Scanner(System.in);
		 int count=0;
		 final int MONEY =10000;

		 while (true) {
			System.out.println("--------");
			for (int i = 0; i < seat.length; i++) {
				System.out.print(i + " ");
			}
			System.out.println();
			for (int i = 0; i < seat.length; i++) {
				System.out.print(seat[i] + " ");
			}
			System.out.println();
			System.out.println("--------");
			
			System.out.print("�ڸ��� ����>>");
			int num = sc.nextInt();
			if (num == -1) {
				System.out.println("�ý����� ����");
				int total = count * MONEY;	
				System.out.println("���ұݾ��� " + total + "��");
			}
			
			
			if (seat[num] != 1) { //seat[num] == 0�� ����
				seat[num] = 1;
				System.out.println(num + "�� �ڸ� ����Ϸ�");
			}
			else {
				System.out.println("�̹� ����� �¼��Դϴ�.");
				
			}
			
		}
		 
		
		
	}

}
