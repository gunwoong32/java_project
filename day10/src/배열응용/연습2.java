package �迭����;

import java.util.Iterator;
import java.util.Scanner;

public class ����2 {

	public static void main(String[] args) {

		int[] seat = new int[10];
		Scanner sc = new Scanner(System.in);
		int count = 0;
		final int MONEY = 10000;
		
		
		while (true) {
			System.out.println("---------");
			for (int i = 0; i < seat.length; i++) {
				System.out.print(i + " ");
			}
			System.out.println();
			System.out.println("---------");
			for (int i = 0; i < seat.length; i++) {
				System.out.print(seat[i] + " ");
			}
			
			System.out.println();
			System.out.print("�ڸ��� �����ϼ���(-1�� ����)>>");
			int seatNum = sc.nextInt();
			if (seatNum == -1) {
				System.out.println("�ý��� ����");
				int total = count * MONEY;
				System.out.println("�� " + count + "�ڸ� " + total + "�� �Դϴ�");
				break;
			}
			if (seat[seatNum] != 1) {
				seat[seatNum]=1;
				System.out.println(seatNum + "�� �ڸ� �����ϼ̽��ϴ�.");
				count++;
			} else {
				System.out.println("�̹� ���õ� �ڸ�");
				
			} 
		}

	}

}