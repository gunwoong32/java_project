package 새창데이터전달;

import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class 새창4 {

		public void open4(int temp2) {
		JFrame f = new JFrame(temp2+"새창4화면 닫기");	
		f.setSize(500, 500);
		if (temp2>30) {
			JOptionPane.showMessageDialog(f, "폭염");
		} else {
			JOptionPane.showMessageDialog(f, "견딜만해요");

		}
		
		
		f.setVisible(true);
		}
}
