package �迭����;

import java.util.Scanner;

public class ���忹��ý���_���� {

	public static void main(String[] args) {
		int[] seat = new int[10];//�迭 ����
		Scanner sc = new Scanner(System.in); //Ű����� �Է�
		int count = 0;//
		final int MONEY = 10000;

		while (true) {
			System.out.println("-----------------------------");
			for (int i = 0; i < 10; i++) {
				System.out.print(i + "  ");
			}
			System.out.println();
			System.out.println("-----------------------------");
			for (int i = 0; i < 10; i++) {
				System.out.print(seat[i] + "  ");
			}
			
			System.out.println();
			System.out.print("�ڸ� ��ȣ�� �Է��ϼ���>>");
			int num = sc.nextInt();
			if (num == -1) {
				System.out.println("�ڸ����� �ý����� �����մϴ�");
				int total = count * MONEY;
				System.out.println("����� ���� �ݾ��� " + total + "��");
				break;
			}
			if (seat[num] != 1) {
				seat[num] = 1;
				System.out.println(num + "�� �ڸ� ����Ϸ�");
				count++;
				System.out.println(count + "�ڸ� �����");
			} else {
				System.out.println("�̹� ����� �ڸ��Դϴ�");
				System.out.println("�ٸ� �ڸ��� �������ּ���");
			}
			sc.close();
			
			int count2 = 0;
			for (int i = 0; i < seat.length; i++) {
				if (seat[i] == 1) {
					count2++;
				}
			}
			System.out.println(count2 + "�ڸ� �����");
			String sum = "";
			for (int i = 0; i < seat.length; i++) {
				if (seat[i] == 1) {
					sum = sum + i + "�� ";

				}
			}
			System.out.println("����� �ڸ� ��� " + sum);
		} // while

	}// main

}// class