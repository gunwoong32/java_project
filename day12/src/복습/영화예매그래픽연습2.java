package 복습;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class 영화예매그래픽연습2 {

	public static void main(String[] args) {

		JFrame f = new JFrame();
		f.setSize(560, 800);
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		int[] seat = new int[200];

		for (int i = 0; i < seat.length; i++) {

			JButton b = new JButton(i + "");
			b.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String s = e.getActionCommand();
					int index = Integer.parseInt(s);
					seat[index] = 1;
					JOptionPane.showMessageDialog(f, index + "번 예약됨");
					b.setEnabled(false);
					b.setBackground(Color.BLUE);
				}
			});
			f.add(b);
		}

		JButton b1 = new JButton("<<<<<<결제하기>>>>>>>");
		b1.setBackground(Color.YELLOW);
		b1.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				// 결제하기버튼을 누르면
				// 1)배열안에 1이 몇개인지 세서
				// 2)금액 10000원씩 계산 후에
				// 3)결제금액 알려주세요
				// 4)좌석번호
				int count = 0;
				final int MONEY = 10000;
				String sum = "";
				for (int i = 0; i < seat.length; i++) {

					if (seat[i] == 1) {
						count++;
						sum = sum + 1;
					}

				}
				int payment = count * MONEY;
				JOptionPane.showMessageDialog(f, "당신이 예약한 금액은" + payment + "원");
				JOptionPane.showMessageDialog(f, "당신이 예약한 좌석번호는" + sum + "입니다");

			}
		});

		f.add(b1);
		f.setVisible(true);

	}

}