package 새창데이터전달;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class 새창1 {
	public void open1(String m) {
		JFrame f = new JFrame("새창1화면@@");
		f.setSize(500, 500);
		JButton b1 = new JButton(m + "새창1버튼 화면닫기");
		f.add(b1);
		b1.setBackground(Color.pink);
		b1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(f, "새창을 닫습니다");
				// 새창1이 사라지게 하는것들
				// system.exit(); : 시스템 전체종료
				f.dispose();// : 새창1만 사라지게 만드는것

			}
		});

		f.setVisible(true);
	}
}
