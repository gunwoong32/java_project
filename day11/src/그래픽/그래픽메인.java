package �׷���;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class �׷��ȸ��� {

	public static void main(String[] args) {
		JFrame f = new JFrame();
			f.setSize(800, 800);
			JButton b1 = new JButton("���� ����");
			JButton b2 = new JButton("���� ������");
			JButton b3 = new JButton("���� ���");
			JButton b4 = new JButton("���� �Ʒ���");
			JButton b5 = new JButton("���� ����");
			b5.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					//b1�� ������ �� ó���ϴ� ������ ����.
					UP up = new UP();
					up.up();
				}
			});
			f.add(b1, BorderLayout.WEST);
			f.add(b2, BorderLayout.EAST);
			f.add(b3, BorderLayout.CENTER);
			f.add(b4, BorderLayout.SOUTH);
			f.add(b5, BorderLayout.NORTH);
			
			b1.setBackground(Color.YELLOW);
			b2.setBackground(Color.YELLOW);
			b3.setBackground(Color.BLUE);
			b4.setBackground(Color.GREEN);
			b5.setBackground(Color.GREEN);
			
			Font font = new Font("�ü�",Font.BOLD,30);
			b1.setFont(font);
			b2.setFont(font);
			b3.setFont(font);
			b4.setFont(font);
			b5.setFont(font);
			
			
			
			
			f.setVisible(true);
	}

}
