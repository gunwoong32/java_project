package ����;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Iterator;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class ��ȭ���ű׷��ȿ���1 {

	
	public static void main(String[] args) {

		JFrame f = new JFrame("��ȭ���ű׷��� ����");
		f.setSize(560, 800);
		FlowLayout flow = new FlowLayout();	//����
		f.setLayout(flow);
		int[] seat = new int [200];
		
		for (int i = 0; i < 200; i++) {
			JButton b = new JButton(i + ""); // string.valueof(0);
			b.addActionListener(new ActionListener() {
				
				public void actionPerformed(ActionEvent e) {
					String s = e.getActionCommand();	//�Է¹ް� ����?
					int index = Integer.parseInt(s);//�������� �м�
					seat[index] =1;	//s�� ���ڶ� ���ڰ� �;ߴ�, ����� �迭�� ���� seat[]�� 1
					JOptionPane.showMessageDialog(f, index + "�� �����");
					b.setEnabled(false);	//��ư ��Ȱ��ȭ
					b.setBackground(Color.RED);	//���� ��ư �����
					
				}
			});
			f.add(b);	//main�� �߰�?
		}
		
		JButton b2 = new JButton("<<<<<< �����ϱ� >>>>>>");
		b2.setBackground(Color.YELLOW);//�� ���
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//�����ϱ��ư�� ������
				//1)�迭�ȿ� 1�� ����� ����
				//2)�ݾ� 10000���� ��� �Ŀ�
				//3)�����ݾ� �˷��ּ���
				//4)�¼���ȣ
				
				int count =0;
				final int MONEY =10000;
				String sum ="";	//���ڿ��� �ֱ����ؼ� ""����־���
				for (int i = 0; i < seat.length; i++) {
					if (seat[i]==1) {
						count++;
						sum =sum+i + "��";
					}
					
				}
				int payment = count *MONEY;
				JOptionPane.showMessageDialog(f, "����� ������ �ݾ���" + payment + "��");
				JOptionPane.showMessageDialog(f, "����� ������ �¼���ȣ��" + sum + "�Դϴ�");
				
				
			}
		});
		f.add(b2);
		f.setVisible(true);
		
	}

}
