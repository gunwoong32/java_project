package �迭����;

import java.util.Scanner;

public class ���� {

	public static void main(String[] args) {

		int[] seat = new int[10];
		Scanner sc = new Scanner(System.in);
		int count = 0;
		final int MONEY = 10000; // ����� �����Ҷ��� final int �빮�ں���=��;

		while (true) {
			System.out.println("-----------------------------");
			for (int i = 0; i < 10; i++) {
				System.out.print(i + "  ");
			}
			System.out.println();
			System.out.println("-----------------------------");
			for (int i = 0; i < 10; i++) {
				System.out.print(seat[i] + "  ");
			} // 1. UI�����

			System.out.println();
			System.out.print("���ϴ� �ڸ��� �Է��ϼ���>>");
			int num = sc.nextInt(); // 2. �Է¹ޱ�

			if (num == -1) { // 3. -1�̸� ��������
				System.out.println("�ý����� �����մϴ�");
				int total = count * MONEY; // 6. ���ұݾ�
				System.out.println("����� ���� �ݾ��� " + total + "��");
				break; // -1�̸� while���� ���ߵ��� ��.
			}

			if (seat[num] != 1) {// seat[num] == 0�� ����
				seat[num] = 1; // 4. ������ �ڸ��� 1�� �ٲپ��ش�.
				System.out.println(num + "�� �ڸ� ����Ǿ����ϴ�");
				count++;
				System.out.println(count + "�ڸ� �����");
			} else { // 5. �̹� ���õǾ�������[=1] ����.
				System.out.println("�̹� ����� �ڸ��Դϴ�");
				System.out.println("�ٸ� �ڸ��� �������ּ���");
			}

		} // while

	}// main

}// class
