package 배열응용;

import java.util.Arrays;

public class 스트링을배열로2 {

	public static void main(String[] args) {
		// String에 포함되어있는 공백을 제거할때는 1.trim을 써라
		String s1 = "    감자    ";
		System.out.println(s1.length());
		String s2 = s1.trim();
		System.out.println(s2.length());
		// 2번째 방법은 replace를 쓰기
		String s3 = s1.replace("    ", "");
		System.out.println(s3.length());

		
		String data = " 감자, 고구마, 양파, 감자, 고구마, 양파, 양파 ";
		String data2 = data.trim();//비파괴함수
		System.out.println(data2);
		System.out.println(data2.length());
		String data3 = data2.replace(" ", ""); //비파괴함수
		System.out.println(data3);
		
		int[] num = {1, 2, 5, 10, 4, 20};
		Arrays.sort(num);	//파괴함수 (원본이 없어지고 작은수부터 나열)
		for (int i : num) {
			System.out.print(i + " ");
		}
		
	}

}
