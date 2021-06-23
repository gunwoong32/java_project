package 문제풀이;

public class 기본데이터2 {

	public static void main(String[] args) {
		
		//1.선언
		char color;
		int num;
		double avrAge;
	
		//2.대입
		color = 'r';
		num = 709;
		avrAge = 27.5; 	//카멜표기법, avg_age(파이썬,뱀표기법)
		color ='b'; 	//변수 하나에는 값이 하나만 저장된다.
		//변수(variable, 값이 변한다): 램의 저장공간에 들어갈 값은 변할 수 있다.
		//램에 만들어지는 저장공간을 변수라고 부른다.
		
		//3.출력
		System.out.println("색은 " + color);		//결합연산자
		System.out.println("방번호는 " + num + "호");
		System.out.println("평균나이는 " + avrAge);

		
		//한줄 복사 단축키 : ctrl +alt + 화살표아래
		//한줄 이동 단축키 : alt + 화살표
		//한줄 삭제 : ctrl + D
		
		
	}

}
