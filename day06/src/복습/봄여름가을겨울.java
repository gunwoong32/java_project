package 복습;

import java.sql.Date;

public class 봄여름가을겨울 {

	public static void main(String[] args) {

		Date date = new Date(0);

		int month = date.getMonth() + 1;
		String result = "해당 계절이 없습니다"; // 초기값을null로 넣어도 되지만 문장으로 넣어도 된다.

		if (month == 3 || month == 4 || month == 5) {
			result = "봄";
		} else if (month == 6 || month == 7 || month == 8) {
			result = "여름";
		} else if (month == 9 || month == 10 || month == 11) {
			result = "가을";
		} else {
			result = "겨울";
		}
		System.out.println(result);

		int day = date.getDay();
		if (day == 0 || day == 6) {
			System.out.println("주말에는 놀아요");
		} else {
			System.out.println("주중에는 달려요");
		}

		while (true) {
			System.out.println("달려요 달려요"); // 1
			System.out.println("또달려요"); // 2
			System.out.println("마지막달려요"); // 3
			break;
		}

		switch (month) {
		case 6:
		case 7:
		case 8: // 6인 경우에[if]
			System.out.println("여름");
			break;

		default:// else
			System.out.println("여름이 아니야");
			break;
		}

//		if (3 <= month && month <= 5) {
//
//		}
	}// main

}// class
