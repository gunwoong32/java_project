package �޼����ȯ��;

import java.util.Random;

public class �پ��Ѹ��ϻ��2 {

	public static void main(String[] args) {
		�پ��Ѹ���2 r2 = new �پ��Ѹ���2();
		int result1 = r2.get(100);	//result1 =200
		double result2 = r2.get();	//result2 = 11.11
		int[] result3 = r2.get2();	//{10,20,30,40,50};
		for (int x : result3) {
			System.out.println(x);
		}
		Random rd = r2.get3();
		System.out.println(rd.nextInt());
	}

}
