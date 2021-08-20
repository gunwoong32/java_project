package 생성자;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;

public class 컬렉션_문제풀이1 {

	public static void main(String[] args) {
		//list, set, queue, map
		//ArrayList, HashSet, LinkedList, HashMap
		HashSet bag = new HashSet();
		bag.add("디자이너");
		bag.add("프로그래머");
		bag.add("DB관리자");
		System.out.println("팀원목록 : " + bag);
		System.out.println();
		
		LinkedList queue = new LinkedList();
		queue.add("상한우유");
		queue.add("싱싱우유");
		System.out.println(queue);
		queue.remove("상한우유");
		System.out.println("현재 남은 우유는" + queue);
		
		System.out.println();
		ArrayList list = new ArrayList();
		list.add("박스키");
		list.add("송스키");
		list.add("김스키");
		list.add("정스키");
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(i+1 + "등은 " + list.get(i));
		}
		System.out.println("2등이 반칙하여 탈락함");
		list.remove(1);
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(i+1 + "등은 " + list.get(i));
		}
		System.out.println();
		HashMap phone = new HashMap();
		phone.put("1번", "엄마");
		phone.put("2번", "아빠");
		phone.put("3번", "친구");
		phone.put("4번", "동생");
		System.out.println(phone);
		System.out.println("휴대폰 2번은 누구? "+phone.get("2번"));
	}

}
