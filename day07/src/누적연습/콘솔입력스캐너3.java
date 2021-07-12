package 누적연습;

import java.util.Scanner;

public class 콘솔입력스캐너3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("과목을 입력(자바,c,python)>>");	
		String data = sc.next();
		if (data.equals("자바")) {
		System.out.println("JSP점프@@");
		}else if (data.equals("c++")) {
		System.out.println("ASP점프@@");
		}else {
			System.out.println("python으로 점프@@");
		}
		
		switch (data) {
		case "자바":
		System.out.println("JSP점프@@");
			break;
		case "c":
			System.out.println("ASP점프@@");
			break;
		default:
			System.out.println("python으로 점프@@");
			break;
		}
		
		
		
		System.out.print("나이를 입력하세요 >>");
		int n1 = sc.nextInt();
		System.out.println("내년 나이는 " + (n1 + 1));

		System.out.print("키를 입력하세요 >>");
		Double n2 = sc.nextDouble();
		System.out.println("내년 키는 " + (n2 + 10));

		System.out.print("저녁을 먹었는지 입력하세요(true/false)");
		boolean n3 = sc.nextBoolean();
		if (n3) {	//boolean 이기 때문에 n3 == true 이렇게 안써줘도된다.
			System.out.println("배가 부르시겠군요");
		} else {
			System.out.println("배가 고프시겠군요");
		}
		
		System.out.print("올해의 목표는?");
		sc.nextLine(); // 한번더 써줘야함.
		String n4 = sc.nextLine();
		System.out.println("올해의 목표는 " + n4 + "!!!!");
		 
		
		
		
		
		
		
		
	}

}
