package �������迭;

import java.util.Random;

public class �������� {

	public static void main(String[] args) {
		
		//��������
		//������ ���� 1~100
		Random r = new Random();
		int [][] n = new int [4][5];
		System.out.println(r.nextInt(100) + 1);	// r.nextint(100)�� 0~99�����ϱ� 1�� ���ؾ��Ѵ�.
		
		for (int i = 0; i < n.length; i++) {
			for (int j = 0; j < n[i].length; j++) {
				n[i][j] = r.nextInt(100);
				System.out.print(n[i][j] + " ");
			}System.out.println();
			}
		
		
		}
				
		//4*5�� ��������.
		//��ü�� ����Ʈ
		
		
	}

