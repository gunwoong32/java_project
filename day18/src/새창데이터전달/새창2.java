package 새창데이터전달;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class 새창2 {
	public void open2(String m2) {
		JFrame f = new JFrame("새창2화면@@");
		f.setSize(800, 1000);
		JButton b2 = new JButton(m2 + "새창2버튼 화면닫기");
		f.add(b2);
		b2.setBackground(Color.blue);
		b2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(f, "새창2를 닫습니다.");
				f.dispose();
			}
		});

		f.setVisible(true);
	}
}
