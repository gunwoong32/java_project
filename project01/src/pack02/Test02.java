package pack02;

import java.util.Scanner;

public class Test02 {

	public static void main(String[] args) {
		System.out.println("-----------------------------");		//UI
		System.out.println("건강 검진을 위해 회원의 정보를 입력해주세요");
		System.out.println("-----------------------------");
		
		Scanner sc = new Scanner(System.in);		//스캐너로 입력받기
		System.out.print("당신의 소속은>> ");			//당신의 소속은>> 프린트
		String belong = sc.next();					//입력받은값을 belong에 저장
		System.out.print("당신의 소속은 " + belong + "이시군요!");	//프린트
		
		System.out.println();						//엔터
		System.out.print("당신의 나이는>> ");			//프린트
		int age = sc.nextInt();						//입력값 age에 저장
		System.out.println("당신의 작년나이는 " + (age-1) + "세였겠군요!");		//작년나이니까 age-1
		
		System.out.print("현재 당신의 몸무게는>>");			//프린트
		double weight =sc.nextDouble();					//실수값이니까 double씀
		if (weight>=90) {								//if문 90이상이면
			System.out.println("당신은 지금 과체중이시군요!");	//이 문장을 프린트
		}
		else if (weight>=70) {							//70이상이면 아래문장프린트
			System.out.println("당신은 지금 보통이시군요!");
		}
		else {											//그 외 아래문장프린트
			System.out.println("당신은 지금 미달이시군요!");
		}
		
		System.out.print("당신은 결혼하셨나요>>");			//프린트
		boolean marry =sc.nextBoolean();				//true false이기 때문에 boolean을 써주었다.
		if (marry) {							// boolean이기 때문에 논리연산자를 안써줘도 된다.
			System.out.println("당신은 배우자가 있겠군요");	//true면 이 문장 프린트 
		}
		else {
			System.out.println("당신은 배우자가 없겠군요");	//false면 이 문장 프린트
		}
		
		
		
		
		
	}

}
