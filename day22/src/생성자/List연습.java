package 생성자;

import java.util.ArrayList;

public class List연습 {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add("박스키");
		list.add("송스키");
		list.add("김스키");
		list.add("정스키");
		
		System.out.println("시상자 목록은 " + list);
		System.out.println("2등이 반칙하여 탈락");
		list.remove(1);
		System.out.println("시상자 목록은 " + list);
		for (int i = 0; i < list.size(); i++) {
			System.out.println(i+1+"등 : " + list.get(i));
		}
		for (Object o : list) {
			System.out.println(o);
		}
	}

}
