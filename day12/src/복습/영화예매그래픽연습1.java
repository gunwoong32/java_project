package 복습;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Iterator;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class 영화예매그래픽연습1 {

	
	public static void main(String[] args) {

		JFrame f = new JFrame("영화예매그래픽 버전");
		f.setSize(560, 800);
		FlowLayout flow = new FlowLayout();	//정렬
		f.setLayout(flow);
		int[] seat = new int [200];
		
		for (int i = 0; i < 200; i++) {
			JButton b = new JButton(i + ""); // string.valueof(0);
			b.addActionListener(new ActionListener() {
				
				public void actionPerformed(ActionEvent e) {
					String s = e.getActionCommand();	//입력받고 저장?
					int index = Integer.parseInt(s);//숫자인지 분석
					seat[index] =1;	//s는 문자라서 숫자가 와야댐, 어떤수가 배열에 들어가도 seat[]은 1
					JOptionPane.showMessageDialog(f, index + "번 예약됨");
					b.setEnabled(false);	//버튼 비활성화
					b.setBackground(Color.RED);	//누른 버튼 레드로
					
				}
			});
			f.add(b);	//main에 추가?
		}
		
		JButton b2 = new JButton("<<<<<< 결제하기 >>>>>>");
		b2.setBackground(Color.YELLOW);//색 노랑
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//결제하기버튼을 누르면
				//1)배열안에 1이 몇개인지 세서
				//2)금액 10000원씩 계산 후에
				//3)결제금액 알려주세요
				//4)좌석번호
				
				int count =0;
				final int MONEY =10000;
				String sum ="";	//문자열로 넣기위해서 ""공백넣어줌
				for (int i = 0; i < seat.length; i++) {
					if (seat[i]==1) {
						count++;
						sum =sum+i + "번";
					}
					
				}
				int payment = count *MONEY;
				JOptionPane.showMessageDialog(f, "당신이 예약한 금액은" + payment + "원");
				JOptionPane.showMessageDialog(f, "당신이 예약한 좌석번호는" + sum + "입니다");
				
				
			}
		});
		f.add(b2);
		f.setVisible(true);
		
	}

}
