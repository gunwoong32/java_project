package �˰���;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Random;

public class �ּҰ�ã�⹮��1 {

	public static void main(String[] args) {
		//1~10000������ ���� �����ϰ� 10000�� ����
		//1. �ּҰ��� ã�ƺ�����
		Random r = new Random(100);	
		int [] s = new int [10000];	//
		for (int i = 0; i < s.length; i++) {
			s[i] =r.nextInt(1000)+1;
		}
		int min =s[0];
		int count =0;
		for (int i = 0; i < s.length; i++) {
			if (s[i]<min) {
				min =s[i];
			}
		}
		System.out.println("�ּҰ��� " + min);
		
		//2. ������ �������
		//3. ��ġ���� ã�ƺ�����
		String result = "";
		for (int i = 0; i < s.length; i++) {
			if (s[i] ==min) {
				count++;
				//System.out.println(i);
				result += i+" ";	//�� ����.   result =result+i+" ";
			}
		}
		System.out.println("�ּҰ��� " + min + "�� ������ " + count + "��");
		System.out.println("��ġ�� " + result);
		
		//�ı��Լ��� �Ἥ ���� �� �ּҰ�/�ִ밪�� ã�ƺ���.
		Arrays.sort(s);//����
		System.out.println(s[0]);	//�ּҰ�
		System.out.println(s[s.length-1]);//�ִ밪

	}

}