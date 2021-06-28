package 복습;

import javax.swing.JOptionPane;

public class 입력처리출력1 {

	public static void main(String[] args) {

		// 1.입력
		String hobby = JOptionPane.showInputDialog("당신의 취미는 무엇인가요?");
		String when = JOptionPane.showInputDialog("언제하시나요?");
		String time = JOptionPane.showInputDialog("얼마나하시나요?");
		
				
		
		
		
		// 2.처리
		String result = when + " 에 " +hobby + "을 하시는군요!";
		//String -> int 로 변환해주는 처리
		int time2 = Integer.parseInt(time);
		if (time2 >= 3) { // 비교연산자의 결과는 항상 boolean[논리데이터,true/false]
			//조건이 true일 때 실행되는 부분
			JOptionPane.showMessageDialog(null, "아주 많이 하셨군요");
		} else {
			//조건이 false일 때 실행되는 부분
			JOptionPane.showMessageDialog(null, "보통으로 하셨군요.");
		}
		
		
		
		// 3.출력
		JOptionPane.showMessageDialog(null, result);
		
		
	}//main

}//class
