package 순차문;

import javax.swing.JOptionPane;

public class 입력연습 {

	public static void main(String[] args) {


//		입력연습
//		오늘은 무슨 요일인가요? 목요일
//		오늘의 날씨는 어떤가요? 더워요
//		출력은 목요일은 더워요
		
		String today = JOptionPane.showInputDialog("오늘은 무슨요일인가요?");
		String day = JOptionPane.showInputDialog("오늘 날씨는?");
		JOptionPane.showMessageDialog(null, today + "은" + day);
		
		
//		String name = JOptionPane.showInputDialog("당신의 이름을 입력하세요");
//		System.out.println(name + "님 안녕히가세요.");
//		JOptionPane.showMessageDialog(null, name + "님 안녕히가세요.");
		
		

//		String name = JOptionPane.showInputDialog("당신의 이름을 입력하세요.");
//		System.out.println(name + "님 안녕하세요");
				
//		String num = JOptionPane.showInputDialog("당신이 있는 강의실 호수는?");
//		System.out.println("당신은 " + num + "호에 있습니다.");
		
//		String lunch = JOptionPane.showInputDialog("당신의 점심 메뉴는?");
//		System.out.println("당신은 "+ lunch + "을 먹는군요.");

		
		
		
		
	}

}
