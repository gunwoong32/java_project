package 문제;

import java.util.Scanner;

public class 용어정리문제풀이20번 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("당신의 이름은? ");
		String name = sc.next();
		System.out.print("당신의 나이는? ");
		int age = sc.nextInt();
		
		call1 call1 = new call1();
		call1.call1(name);
		
		call2 call2 = new call2();
		call2.call2(name, age);
		
		
		
		
		
		
		
	}

}
