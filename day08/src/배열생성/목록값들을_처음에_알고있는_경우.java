package 배열생성;

public class 목록값들을_처음에_알고있는_경우 {

	public static void main(String[] args) {
		// 배열을 만들 때는 처음부터 값들을 알고 있는 경우/ 모르는 경우
		String[] names = { "홍길동", "김길동", "정길동", "장길동", "정길동" };
		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		}
		
		for (String s : names) {
			System.out.println(s);
		}
		
		
		
//		
//		
//		
//		
//		
//		int[] ages = { 100, 88, 55, 10, 4 };
//		for (int i = 0; i < ages.length; i++) {
//			System.out.println(ages[i]);
//		}
//		for (int x : ages) {
//			System.out.println(x);
//		}
//		
//		
//		
//		
//		
//		double[] eyes = { 2.0, 1.5, 1.2, 0.5, 1.0 };
//		for (int i = 0; i < eyes.length; i++) {
//			System.out.println(eyes[i]);
//		}
//		
//		
//		
//		
//		
//		char[] genders = { '남', '여', '여', '여', '남' };
//		for (int i = 0; i < genders.length; i++) {
//			System.out.println(genders[i]);
//		}
//		
//		
//		boolean[] food = { true, false, true, false, true };
//		for (int i = 0; i < food.length; i++) {
//			System.out.println(food[i]);
//		}

	}// main

}// class
