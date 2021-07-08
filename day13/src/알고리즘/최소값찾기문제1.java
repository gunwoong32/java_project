package 알고리즘;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Random;

public class 최소값찾기문제1 {

	public static void main(String[] args) {
		//1~10000까지의 값을 랜덤하게 10000개 만들어서
		//1. 최소값을 찾아보세요
		Random r = new Random(100);	
		int [] s = new int [10000];	//
		for (int i = 0; i < s.length; i++) {
			s[i] =r.nextInt(1000)+1;
		}
		int min =s[0];
		int count =0;
		for (int i = 0; i < s.length; i++) {
			if (s[i]<min) {
				min =s[i];
			}
		}
		System.out.println("최소값은 " + min);
		
		//2. 개수를 세어보세요
		//3. 위치값을 찾아보세요
		String result = "";
		for (int i = 0; i < s.length; i++) {
			if (s[i] ==min) {
				count++;
				//System.out.println(i);
				result += i+" ";	//와 같다.   result =result+i+" ";
			}
		}
		System.out.println("최소값인 " + min + "의 개수는 " + count + "개");
		System.out.println("위치는 " + result);
		
		//파괴함수를 써서 정렬 후 최소값/최대값을 찾아보자.
		Arrays.sort(s);//정렬
		System.out.println(s[0]);	//최소값
		System.out.println(s[s.length-1]);//최대값

	}

}