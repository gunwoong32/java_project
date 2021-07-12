package 누적연습;

import java.util.Scanner;

public class 콘솔입력스캐너2 {

	public static void main(String[] args) {

	Scanner sc = new Scanner(System.in); 
	
	System.out.print("숫자1 입력 >>");
	int n1 = sc.nextInt();	//String -> int로 바꾸어줌
	
	System.out.print("숫자2 입력 >>");
	int n2 = sc.nextInt();
	
	if (n1>n2) {
		System.out.println("앞 숫자가 크다");
	} else {
		System.out.println("뒷 숫자가 크다");
	}
	System.out.println("n1: " + n1);
	System.out.println("n2: " + n2);
	
	System.out.print("당신이 좋아하는 과목은?");
	String subject = sc.next();
	System.out.println("jsp로 점프");
	
	
	}

}
