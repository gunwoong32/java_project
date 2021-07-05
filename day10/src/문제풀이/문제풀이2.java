package 문제풀이;

import java.util.Scanner;

public class 문제풀이2 {

	public static void main(String[] args) {
		
		String [] name = new String[3];
		//배열은 자동초기화 {null,null,null}
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < name.length; i++) {
			System.out.println("과목입력>>");		
			name[i] =sc.next();
			
		}
		
		System.out.println(name[0] +  "보다는" + name[1]);
		sc.close();
		
	}

}
//		String 변수는 원래 주소가 들어가있지만
//		내부적으로 그 주소가 가리키는 char들을 프린트되도록 조정이 되어있는 상태임.
//		s[0] : 주소!