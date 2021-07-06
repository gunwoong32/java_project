package 배열응용;

import java.util.Iterator;
import java.util.Random;

public class 토익채점문제 {

	public static void main(String[] args) {
		// 답안 999개 공간
		// 내답 999개 공간
		int[] 답안 = new int[999];
		int[] 내답 = new int[999];
		int jumsu = 0;
		int a =0;

		Random r = new Random(11);
		for (int i = 0; i < 내답.length; i++) {
			답안[i] = r.nextInt(4) + 1; // 0~3까지 + 1 : 1~4
			내답[i] = r.nextInt(4) + 1;
		}
		System.out.println("번호 :    답안     내답");
		for (int i = 0; i < 999; i++) {
			System.out.println(i + "    :" + "     " + 답안[i] + "  <->   " + 내답[i] + " 점수 :" + jumsu);
			if (답안[i] == 내답[i]) {
				jumsu++;
			}
		}
		System.out.println("당신의 토익점수는 " + jumsu + "점");
		
		//답안보다 내답이 정답이 더 큰 경우 몇 문제 카운트
		for (int i = 0; i < 내답.length; i++) {
			if (답안[i] < 내답[i]) {
				a++;
			}
		}
		System.out.println("답안보다 내답이 더 큰 경우 : "+ a);
	
	}

}
