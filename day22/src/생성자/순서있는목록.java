package 생성자;

import java.util.ArrayList;

import javax.swing.JFrame;

public class 순서있는목록 {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add("홍길동");
		list.add(100);		//기본형->클래스변환해서 들어감->Object
		list.add(22.2);
		list.add(true);
		list.add('남');
		list.add(new JFrame());
		System.out.println(list.size());
		System.out.println(list);
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(2));
		System.out.println(list.get(3));
		System.out.println(list.get(4));
		System.out.println(list.get(5));
		list.add("목요일");
		System.out.println(list.size());
		list.remove(5);	//인덱스값을 지운거임.
		list.remove("홍길동");
//		list.remove(new Integer(100));	
		//100이라는 값을 지운거임.
		//클래스로 변환해서 들어갔기 때문에 지울때에도 클래스로 변환해서 지워야한다...?
		System.out.println(list.size());
		System.out.println(list.get(0));	//인덱스 순서 바뀜
		list.set(0,"김길동");			//인덱스 순서 첫번째로 위치하게 시킴
		System.out.println(list);
		
	}

}
