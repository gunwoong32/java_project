package Ŭ�������;

import Ŭ��������.Phone;
import Ŭ��������.TV;

public class �Ž� {

	public static void main(String[] args) {
		TV myTv = new TV();
		//new�� �ϸ�, ����������� heap������ ����ȴ�.
		//myTv ������ �������� ����������� ����� heap������ �ּҰ� ����.
		myTv.ch =7;
		//myTv�ȿ� ����ִ�  ����Ű�� ch������ 7�� ������� �ǹ�
		myTv.vol=9;
		myTv.onOff = true;
		System.out.println("myTv�� ä���� " + myTv.ch);
		System.out.println("myTv�� ������ " + myTv.vol);
		System.out.println("myTv�� ������ " + myTv.onOff);
		System.out.println(myTv);
		
		
		TV yourTv = new TV();
		myTv.ch =9;
		myTv.vol=12;
		myTv.onOff = true;
		System.out.println("yourTv�� ä���� " + myTv.ch);
		System.out.println("yourTv�� ������ " + myTv.vol);
		System.out.println("yourTv�� ������ " + myTv.onOff);
		System.out.println(yourTv);
		
		Phone myPhone = new Phone();
		
		myPhone.color = "Red";
		myPhone.name = "IPhone";
		myPhone.price = 100;
		myPhone.wifi =true;
		
		myPhone.��ȭ();
		myPhone.�޼���();
		myPhone.���ͳ�();
		myPhone.�ð�();
		
		
		
		
		
		
		
		
	}

}
