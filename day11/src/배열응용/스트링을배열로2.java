package �迭����;

import java.util.Arrays;

public class ��Ʈ�����迭��2 {

	public static void main(String[] args) {
		// String�� ���ԵǾ��ִ� ������ �����Ҷ��� 1.trim�� ���
		String s1 = "    ����    ";
		System.out.println(s1.length());
		String s2 = s1.trim();
		System.out.println(s2.length());
		// 2��° ����� replace�� ����
		String s3 = s1.replace("    ", "");
		System.out.println(s3.length());

		
		String data = " ����, ����, ����, ����, ����, ����, ���� ";
		String data2 = data.trim();//���ı��Լ�
		System.out.println(data2);
		System.out.println(data2.length());
		String data3 = data2.replace(" ", ""); //���ı��Լ�
		System.out.println(data3);
		
		int[] num = {1, 2, 5, 10, 4, 20};
		Arrays.sort(num);	//�ı��Լ� (������ �������� ���������� ����)
		for (int i : num) {
			System.out.print(i + " ");
		}
		
	}

}
