package �迭����;

import java.util.Scanner;

public class �迭���� {

	public static void main(String[] args) {

		// ��,��,ȭ ������ ������� �Է��غ�����.("�帲,����,�帲")
		// �帲�� �����, ������ ����� �������.
		// 1. sc.next()�� �޾Ƽ�
		// 2. ��Ʈ���� �迭�� ��ȯ�ؼ� ��������.
		// 3. count�غ�����

		Scanner sc = new Scanner(System.in);
		System.out.print("��,��,ȭ ������ ������� �Է��غ�����>>");
		String data = sc.next();
		String[] data2 = data.split(",");
		int count1 = 0, count2 = 0;

		for (int i = 0; i < data2.length; i++) {
			if (data2[i].equals("�帲")) {
				count1++;
			} else {
				count2++;
			}
		}
		System.out.println("�帲�� ���� " + count1);
		System.out.println("������ ���� " + count2);

	}

}
