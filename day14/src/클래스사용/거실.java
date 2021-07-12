package 클래스사용;

import 클래스생성.Phone;
import 클래스생성.TV;

public class 거실 {

	public static void main(String[] args) {
		TV myTv = new TV();
		//new를 하면, 멤버변수들이 heap영역에 복사된다.
		//myTv 참조형 변수에는 멤버변수들이 복사된 heap영역의 주소가 들어간다.
		myTv.ch =7;
		//myTv안에 들어있는  가리키는 ch변수에 7을 넣으라는 의미
		myTv.vol=9;
		myTv.onOff = true;
		System.out.println("myTv의 채널은 " + myTv.ch);
		System.out.println("myTv의 볼륨은 " + myTv.vol);
		System.out.println("myTv의 전원은 " + myTv.onOff);
		System.out.println(myTv);
		
		
		TV yourTv = new TV();
		myTv.ch =9;
		myTv.vol=12;
		myTv.onOff = true;
		System.out.println("yourTv의 채널은 " + myTv.ch);
		System.out.println("yourTv의 볼륨은 " + myTv.vol);
		System.out.println("yourTv의 전원은 " + myTv.onOff);
		System.out.println(yourTv);
		
		Phone myPhone = new Phone();
		
		myPhone.color = "Red";
		myPhone.name = "IPhone";
		myPhone.price = 100;
		myPhone.wifi =true;
		
		myPhone.전화();
		myPhone.메세지();
		myPhone.인터넷();
		myPhone.시계();
		
		
		
		
		
		
		
		
	}

}
