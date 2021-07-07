package 복습;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class 영화예매그래픽연습3 {

	public static void main(String[] args) {

		JFrame f = new JFrame();
		f.setSize(560, 500);
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		int seat[] = new int [200];

		for (int i = 0; i < seat.length; i++) {
			
			JButton b = new JButton(i+"");
			b.addActionListener(new ActionListener() {
				
				public void actionPerformed(ActionEvent e) {

					
					
					
					
					
					
				}
			});
			
		}
		f.add(b);
		
		
		
		
		
		
		
		
		
		
		f.setVisible(true);
	}

}
