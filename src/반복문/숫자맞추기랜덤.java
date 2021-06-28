package 반복문;

import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class 숫자맞추기랜덤 {

	public static void main(String[] args) {
// new : 벽돌처럼 사용할 때 RAM에 새롭게 복사해서 부품을 사용함.
//		JFrame f = new JFrame();
//		JButton b1 = new JButton();
//		JTextField t1 = new JTextField();

		
//		Random r = new Random();
//		int num = r.nextInt(100); // 0-99까
//		System.out.println(num);
		
//50 보다 작은 임의의 수 생성
// 1000보다 작은 임의의 수 생성
		Random r = new Random(4); // 씨앗값 [seed]
		int num = r.nextInt(100); // 0-99
		System.out.println(num);
		
		int num2 = r.nextInt(899) + 100;
		System.out.println(num2);
		
		int num3 = r.nextInt(45) + 5; // 5~49
		System.out.println(num3);
		
		int num4 =  r.nextInt(20) + 3; // 3~22
		System.out.println(num4);
		
		
	}

}
