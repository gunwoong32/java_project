package �迭����;

import java.util.Scanner;

public class �迭����_��ȭ��ȣ�Է�_�������� {

	public static void main(String[] args) {

		// ��ȭ��ȣ�Է�>> 011-245-1234
		// ���ʰ����� �����Ͻÿ�
		Scanner sc = new Scanner(System.in);
		System.out.print("��ȭ��ȣ�� �Է����ּ���>>");
		String num = sc.next();
//		String num = "  011-245-1234  ";
		String num2 = num.trim();
		String num3 = num2.replace("-", "");
		System.out.println(num2);
		System.out.println(num3); // 0112451234

		// -�� �������� �и��س�����.(String[])
		String[] num4 = num2.split("-");
		for (int i = 0; i < num4.length; i++) {
			System.out.print(num4[i]);
		}
		System.out.println();
		// ù��° ���ڿ��� 011�̸� SK, 019�̸� LG, �������̸� Apple
		if (num4[0].equals("011")) {
			System.out.println("SK");
		} else if (num4[0].equals("019")) {
			System.out.println("LG");
		} else {
			System.out.println("Apple");
		}
		// �ι�° ���ڿ��� ���̰� 4���̻��̸� �ֽ���, �ƴϸ� �õ���
		if (num4[1].length() >= 4) {
			System.out.println("�ֽ���");
		} else {
			System.out.println("�õ���");
		}

		// ��ü ��ȭ��ȣ�� ���̰� 10���� �̻��̸� ��ȿ�� ��ȭ��ȣ
		if (num3.length() >= 10) {
			System.out.println("��ȿ�� ��ȭ��ȣ");
			// ��ü ��ȭ��ȣ�� ���̰� 10���� �̸��̸� ��ȿ���� ���� ��ȭ��ȣ
		} else {
			System.out.println("��ȿ���� ���� ��ȭ��ȣ");
		}

	}

}
