package �迭����;

import java.util.Iterator;
import java.util.Random;

public class ����ä������ {

	public static void main(String[] args) {
		// ��� 999�� ����
		// ���� 999�� ����
		int[] ��� = new int[999];
		int[] ���� = new int[999];
		int jumsu = 0;
		int a =0;

		Random r = new Random(11);
		for (int i = 0; i < ����.length; i++) {
			���[i] = r.nextInt(4) + 1; // 0~3���� + 1 : 1~4
			����[i] = r.nextInt(4) + 1;
		}
		System.out.println("��ȣ :    ���     ����");
		for (int i = 0; i < 999; i++) {
			System.out.println(i + "    :" + "     " + ���[i] + "  <->   " + ����[i] + " ���� :" + jumsu);
			if (���[i] == ����[i]) {
				jumsu++;
			}
		}
		System.out.println("����� ���������� " + jumsu + "��");
		
		//��Ⱥ��� ������ ������ �� ū ��� �� ���� ī��Ʈ
		for (int i = 0; i < ����.length; i++) {
			if (���[i] < ����[i]) {
				a++;
			}
		}
		System.out.println("��Ⱥ��� ������ �� ū ��� : "+ a);
	
	}

}
