package ����Ǯ��;

import java.util.Scanner;

public class ����Ǯ��2 {

	public static void main(String[] args) {
		
		String [] name = new String[3];
		//�迭�� �ڵ��ʱ�ȭ {null,null,null}
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < name.length; i++) {
			System.out.println("�����Է�>>");		
			name[i] =sc.next();
			
		}
		
		System.out.println(name[0] +  "���ٴ�" + name[1]);
		sc.close();
		
	}

}
//		String ������ ���� �ּҰ� ��������
//		���������� �� �ּҰ� ����Ű�� char���� ����Ʈ�ǵ��� ������ �Ǿ��ִ� ������.
//		s[0] : �ּ�!