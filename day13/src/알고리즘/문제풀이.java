package �˰���;

import java.util.ArrayList;
import java.util.HashSet;

public class ����Ǯ�� {

	public static void main(String[] args) {
		// 1. ���� �ø��� �ǰ� ����
		//1��: �迬��
		//2��: �迵��
		//3��: ����
		//4��: ����
		//4���� ��Ģ�� �Ͽ� Ż����. remove
		//��ü ����� �ٽ� ����Ʈ
		ArrayList list = new ArrayList();
		list.add("�迬��");
		list.add("�迵��");
		list.add("����");
		list.add("����");
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(i+1 + "�� " + list.get(i));
		}
		System.out.println();
		list.remove(3);
		for (int i = 0; i < list.size(); i++) {
			System.out.println(i+1 + "�� " + list.get(i));
		}
		
		System.out.println();
		
		
		// 2. ��ħ�� ���濡 ���� ���ǵ�. ������ ���ſ����� �ȵǴϱ�
		//�ϳ����� �������� ��. �� ������ ���� ������ �ϳ��̻� ��������.
		//������ ���� ���� �� : ����, �޴���, ����, ����	.
		//�� ���濡 �� ������ ������ ���ǵ��� ���ÿ�.
	
		HashSet set = new HashSet();
		set.add("����");
		set.add("�޴���");
		set.add("����");
		set.add("����");
		
		System.out.println("�� ���濡 �� ������ ������ " + set.size() + "��");
		System.out.println("�� ���濡 �� ������ " + set);
		
	
	
	}

}
