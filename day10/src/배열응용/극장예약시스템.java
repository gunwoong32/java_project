package �迭����;

import java.util.Scanner;

public class ���忹��ý��� {

	public static void main(String[] args) {
		int[] seat = new int[10];
		Scanner sc = new Scanner(System.in);
		int count = 0;
		final int MONEY =10000; //�׻� �Ȱ��� ���� ���� ����(���)	
								//final�� ����� ��Ÿ��.����Ұ�.�빮�ڷ� ǥ��.
		while (true) {
			System.out.println("-----------------------------");
			for (int i = 0; i < 10; i++) {
				System.out.print(i + "  ");
			}
			System.out.println();
			System.out.println("-----------------------------");
			for (int i = 0; i < seat.length; i++) {
				System.out.print(seat[i] + "  ");
			}
			System.out.println();
			System.out.print("���ϴ� �ڸ� ��ȣ�Է�(����-1)>>");
			int no = sc.nextInt(); // 0�� �Է�
			if (no == -1) {
				System.out.println("����ý��� �����մϴ�.");
				int total = count * MONEY;
				System.out.println("����� ���� �ݾ��� " + total + "��");
				// System.exit(0);
				break;
			}
		
			// ����ó���ϱ� ���� �̹� �� �ڸ��� ����� �ڸ����� Ȯ���ؾ��Ѵ�.
			// Ȯ�ι���� ���غ���.
			// 0�� �Է������� �迭�� �ε��� 0���ڸ��� 1�� �����ؼ� ����ƴٶ�� ���� �����ص���.
			if(seat[no] !=1) {
			seat[no] = 1;
			System.out.println(no + "�� ����Ϸ�");
			count++;
			System.out.println(count + "�ڸ� �����");
			}
			else { 												//1�� ����Ǿ������� ���� 
				System.out.println("�̹� ����� �ڸ��Դϴ�");
				System.out.println("�ٸ� �ڸ��� �������ּ���");
			}
		}
		sc.close();
//		//����� �ڸ��� �迭�� 1�� �� ������ ����� ���� �� �ִ�
//		//1. ���ݱ��� �迭�� ����� ���� �� 1�� ����� �������
//		int count2 =0;
//		for (int i = 0; i < seat.length; i++) {
//			if (seat[i] == 1) {
//				count2++;
//			}
//		}
//		System.out.println(count2 + "�ڸ� �����");
//		//2. 1�� ����� �ڸ��� ������� ����Ʈ
//		String sum ="";
//		for (int i = 0; i < seat.length; i++) {
//			if (seat[i] == 1) {
//				//System.out.println(i + "�� �ڸ�");
//				sum = sum + i + "�� ";
//				
//			}
//		}
//		System.out.println("����� �ڸ� ��� " + sum);
		
	}

}