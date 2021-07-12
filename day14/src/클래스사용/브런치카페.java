package 클래스사용;

import 클래스생성.계산기;

public class 브런치카페 {

	public static void main(String[] args) {
		int coffeePrice = 3500;
		int coffeeCount = 5;

		int bagelPrice =3000;
		int bagelCount =3;
		
		int a =1000;
		int b =2000;
		
		double c = 55.5;
		double d = 11.1;
		
		
		계산기 cal = new 계산기();
		cal.곱하기(coffeePrice,coffeeCount);
		cal.곱하기(bagelPrice,bagelCount);
		
		//커피 주문해보세요.
		cal.order("커피");
		//베이글을 주문해보세요.
		cal.order("베이글");
		
		cal.더하기(a,b);
		cal.나누기(c,d);
		
		
		
		
		
		
	}

}
