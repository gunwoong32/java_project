package ����Ǯ��;

public class ���������� {

	public static void main(String[] args) {
		int[] x= {1,2,3};
		int[] y= x;	//������ ����(���� ����: �ּҸ� ����)
		//int[] y = x.clone();//������ ����(���� ����: �ּҰ� ����Ű�� ������ ����� ����)
		
		System.out.print("x: ");
		for (int i : x) {
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.print("y: ");
		for (int i : y) {
			System.out.print(i + " ");
		}		
		
		System.out.println("\n==============x�� ������=============");
		
		x[0] = 9;
		
		System.out.print("x: ");
		for (int i : x) {
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.print("y: ");
		for (int i : y) {
			System.out.print(i + " ");
		}
		//��������, ������ ����ִ� �ּҸ� ����.
		System.out.println("x: " + x);
		System.out.println("y: " + y);
		
	}

}
