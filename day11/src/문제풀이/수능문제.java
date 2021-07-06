package 문제풀이;

import java.util.Random;

public class 수능문제 {

	public static void main(String[] args) {
		int[] jumsu = new int [10000];
		Random r = new Random(5);
		int n = 0;
		
		for (int i = 0; i < jumsu.length; i++) {
			jumsu[i] =r.nextInt(331);
			System.out.println(jumsu[i]);
			if (jumsu[i] == 330) {
				n++;
			}
			
			}
			System.out.println("수능만점자는 " + n + "명입니다.");		
		}
		
	
		//1. 수능만점자는 몇 명일까요
		//2. 만점자 번호는 몇 번일까요
		
	}