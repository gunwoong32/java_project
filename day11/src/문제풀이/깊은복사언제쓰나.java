package 문제풀이;

import java.util.Iterator;

public class 깊은복사언제쓰나 {

	public static void main(String[] args) {
		String[] subject = {"국어","영어","수학","컴퓨터","회화"};
		int[] term1 = {44,66,22,99,100};
		int[] term2 = term1.clone();
		term2[0] = 55;
		term2[2] = 88;	
		//term1 = {44,66,22,99,100}
		//term2 = {22,66,88,99,100}00
		int a =0;
		int b =0;
		
		//0)전체 1학기, 2학기 성적 프린트
		for (int i = 0; i < term2.length; i++) {
			System.out.println("과목명 : " + subject[i]);
			System.out.println("1학기 성적 : " + term1[i]);
			System.out.println("2학기 성적 : " + term2[i]);
		}
		
		
		//1)1학기, 2학기 성적 중 동일한 성적과목수
		for (int i = 0; i < term2.length; i++) {
			if (term1[i] == term2[i]) {
				a++;
			}
		}
		System.out.println("1학기, 2학기 성적 중 동일한 성적과목수 : " + a);
		
		//2)1학기, 2학기 성적 중 오른 과목수
		for (int i = 0; i < term2.length; i++) {
			if (term1[i] < term2[i]) {
				b++;
			}
		}
		System.out.println("1학기, 2학기 성적 중 오른 과목수 : " + b);
		
		//3)1학기, 2학기 성적 중 오른 과목명
		System.out.print("1학기, 2학기 성적 중 오른 과목명 : ");		
		for (int i = 0; i < term2.length; i++) {
			if (term1[i]<term2[i]) {
				System.out.print(subject[i]+ " ");
				
			}
		}
		
		
		
		
		
	}

}
