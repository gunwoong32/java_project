package 순차문;

import javax.swing.JOptionPane;

public class 순차문5문제풀이 {

	public static void main(String[] args) {

//		문제
//		내가 먹고 싶은 음식은? 팥빙수
//		친구가 먹고 싶은 음식은? 팥빙수
//		아하! 나랑 친구랑 같아요!
//		크~! 나랑 친구랑 달라요!
		
		
		String iFood = JOptionPane.showInputDialog("내가 먹고싶은 음식은?");
		String fFood = JOptionPane.showInputDialog("친구가 먹고싶은 음식은?");
		
		String iFood1 = "팥빙수"; 	//
		String fFood1 = "팥빙수";		//

		if (iFood.equals(iFood1) && fFood.equals(fFood1)) {
			JOptionPane.showMessageDialog(null, "아하! 나랑 친구랑 같아요!");
			
		} else {
			JOptionPane.showMessageDialog(null, "크~! 나랑 친구랑 달라요!");

		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	} // main

} //class
