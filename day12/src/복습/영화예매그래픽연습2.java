package ����;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class ��ȭ���ű׷��ȿ���2 {

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
					JOptionPane.showMessageDialog(f, index + "�� �����");
					b.setEnabled(false);
					b.setBackground(Color.BLUE);
				}
			});
			f.add(b);
		}

		JButton b1 = new JButton("<<<<<<�����ϱ�>>>>>>>");
		b1.setBackground(Color.YELLOW);
		b1.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				// �����ϱ��ư�� ������
				// 1)�迭�ȿ� 1�� ����� ����
				// 2)�ݾ� 10000���� ��� �Ŀ�
				// 3)�����ݾ� �˷��ּ���
				// 4)�¼���ȣ
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
				JOptionPane.showMessageDialog(f, "����� ������ �ݾ���" + payment + "��");
				JOptionPane.showMessageDialog(f, "����� ������ �¼���ȣ��" + sum + "�Դϴ�");

			}
		});

		f.add(b1);
		f.setVisible(true);

	}

}