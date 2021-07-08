package 클래스사용;

import 클래스생성.Dog;
import 클래스생성.Phone;

public class 거실 {

	public static void main(String[] args) {
		Phone phone1 = new Phone();
		Dog dog1 = new Dog();
		phone1.color ="노랑";
		phone1.money = 5;
		phone1.call();
		phone1.message();
		System.out.println(phone1.color);
		System.out.println(phone1.money);
		
		dog1.dogColor ="갈색";
		dog1.dogCount =3;
		dog1.bark();
		dog1.shit();
		System.out.println(dog1.dogColor);
		System.out.println(dog1.dogCount);
		
		
		
		
	}

}
