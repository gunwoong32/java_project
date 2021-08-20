package 생성자;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class BWindow {

	public BWindow() {
		System.out.println("B객체가 생성");
	}
	
	public void open() {
		
		
		
		JFrame f = new JFrame("A");
		f.setSize(300, 300);
		JButton b = new JButton("A open");
		f.add(b);
		b.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				AWindow a = new AWindow();
				a.open();
				f.dispose();
			}
		});
		
		
		f.setVisible(true);
		
		
		
		
		
		
	}

}
