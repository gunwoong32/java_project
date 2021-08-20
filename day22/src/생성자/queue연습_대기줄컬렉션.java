package 생성자;

import java.util.LinkedList;

public class queue연습_대기줄컬렉션 {
			//먼저 들어온 것이 먼저 나가는 자료
	public static void main(String[] args) {
		LinkedList queue = new LinkedList();
		queue.add("홍길동");
		queue.add("김길동");
		queue.add("송길동");
		System.out.println(queue);
		queue.remove();
		System.out.println(queue);
	}

}
