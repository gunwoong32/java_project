package 새창데이터전달;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class 새창3 {
	public void open3(String m) {
		JFrame f = new JFrame();
		f.setSize(500, 500);
		JButton b1 = new JButton("로그인성공");
		f.add(b1);
		b1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				f.dispose();
				
			}
		});
		
		
		f.setVisible(true);
	}
}
