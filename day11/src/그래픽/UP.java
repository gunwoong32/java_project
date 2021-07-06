package 그래픽;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class UP {

	public void up() {

		JFrame f = new JFrame("업프레임");
		f.setSize(500, 500);
		JButton b = new JButton("나를 눌러요");
		f.add(b);
		b.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				UP1 up1 = new UP1();
				up1.up1(); // 함수호출
				
			}
		});

		f.setVisible(true);

	}

}
