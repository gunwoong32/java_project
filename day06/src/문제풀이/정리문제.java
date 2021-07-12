package 문제풀이;

public class 정리문제 {

	public static void main(String[] args) {
		String food = "떡볶이";
				
		switch (food) {
		case "떡볶이":
			System.out.println("분식집으로");
			break;
		case "우동":
			System.out.println("일식집으로");
			break;
		case "짜장":
			System.out.println("중국집으로");
			break;
			//우동 : 일식집, 짜장: 중국집, 아니면 : 집에
		default:
			System.out.println("집에");
			break;
		}
		
		
		String sn = "980203-2234567"; //0부터 시작. 뒷자리1은 7번째
		//sn.charAt(7); //'1'
		char gender = sn.charAt(7); //'1'; // 성별추출 위치 -> index
		
		switch (gender) {
		case '1': case '3':
			System.out.println("남");
			break;
		case '2': case '4':
			System.out.println("여");
			break;

		default:
			System.out.println("없음");
			break;
		}
		
		//if~else : char는 기본데이터이기 때문에 비교연산자 사용가능
	
		if (gender == '1' || gender == '3') {
			System.out.println("남");
		} else if (gender =='2'||gender =='4') {
			System.out.println("여");
		} else {
			System.out.println("없음");
		}{

		}
		
		
		
	}//main

}//class
