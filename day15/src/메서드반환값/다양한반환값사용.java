package �޼����ȯ��;

import java.util.Date;

public class �پ��ѹ�ȯ����� {

	public static void main(String[] args) {
		�پ��Ѹ��� r = new �پ��Ѹ���();
		int result1 = r.add();
		double result2 = r.add2();
		char result3 = r.add3();
		boolean result4 = r.add4();
		String result5 = r.add5();
		Date result6 = r.add6();
		System.out.println(result6);
		int[] result7 = r.add7();
		for (int x : result7) {
			System.out.println(x+"");
		}
		���� result8 = r.add8();
		result8.add(200, 100);
	}

}
