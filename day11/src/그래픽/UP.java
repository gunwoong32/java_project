package �׷���;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class UP {

	public void up() {

		JFrame f = new JFrame("��������");
		f.setSize(500, 500);
		JButton b = new JButton("���� ������");
		f.add(b);
		b.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				UP1 up1 = new UP1();
				up1.up1(); // �Լ�ȣ��
				
			}
		});

		f.setVisible(true);

	}

}
