package �˰���;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;

public class �������δپ���Ÿ�� {

	public static void main(String[] args) {
		
		//set : ����, �ߺ��� ���� ������� ����
		HashSet set = new HashSet();
		set.add(100);
		set.add(200);
		set.add(100);	//�ߺ��� ���̶� �ȵ�
		System.out.println("set�� ũ��� " + set.size());
		System.out.println(set);
		
		
		ArrayList list = new ArrayList();
		//���� ���� �����͸� �ٷ� ��, ����, �پ��� �������� ��� ����Ѵ�.
		list.add(100);
		list.add(100.33);								//{100,100.33,true,a,����,r}
		list.add(true);
		list.add('a');
		list.add("����");
		Random r = new Random();
		list.add(r);
								//OBJECT � ������ Ÿ���̵� �� �����ִ�.
		System.out.println(list);
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(2));
		System.out.println(list.get(3));
		System.out.println(list.get(4));
		System.out.println(list.get(5));
		System.out.println(list.size());	//ũ�� 6
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(i + " : " + list.get(i));
		}
		list.remove(5);	//�ε��� 5���� ������
		for (int i = 0; i < list.size(); i++) {
			System.out.println(i + " : " + list.get(i));
		}
	
	}	
	

}
