package 자바기본;

import java.util.ArrayList;
import java.util.Scanner;

public class 문제만들기2 {
	/*
	 * 식사인원수 입력받고 
	 * 메뉴입력을 인원수만큼 받아서 
	 * 출력
	 */
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		ArrayList<String> list = new ArrayList<String>();
		int menu1=0;
		int menu2=0;
		int other=0;
		System.out.print("식사인원수를 입력해주세요>> ");
		int people_no =  sc.nextInt();
		for (int i = 0; i < people_no; i++) {
			System.out.print("각자 먹고 싶은 메뉴를 정하세요>> ");
			String select_menu = sc.next();
			list.add(select_menu);
		}
		for (String a : list) {
			if (a.equals("자장면")) {
				menu1++;
			}else if (a.equals("짬뽕")) {
				menu2++;
			}else {
				other++;
			}
		}
		System.out.println("자장면을 선택한 사람은 " + menu1 +"명");
		System.out.println("짬뽕을 선택한 사람은 " + menu2 +"명");
		System.out.println("기타를 선택한 사람은 " + other +"명");
		
	}
	
}
