package 생성자;

import java.util.LinkedList;

public class 컬렉션_문제풀이2 {

	public static void main(String[] args) {
/* 시험일정 순서가 국어, 수학, 영어, 컴퓨터
 * 시험일정을 담은 컬렉션을 만드세요.
 * 시험을 보면 한과목씩 사라지게 해주세요.
 * 전체 시험볼 과목: [국어, 수학, 영어, 컴퓨터]
 * 1일차 시험본 후 남은 과목: [수학, 영어, 컴퓨터]
 * 2일차 시험본 후 남은 과목: [영어, 컴퓨터]
 * 3일차 시험본 후 남은 과목: [컴퓨터]
 */

	LinkedList queue = new LinkedList();
	queue.add("국어");
	queue.add("수학");
	queue.add("영어");
	queue.add("컴퓨터");
	System.out.println(queue);
	System.out.print("1일차 시험본 후 ");
	queue.remove();
	System.out.println(queue);
	System.out.print("2일차 시험본 후 ");
	queue.remove();
	System.out.println(queue);
	System.out.print("3일차 시험본 후 ");
	queue.remove();
	System.out.println(queue);
	
	
	}

}
