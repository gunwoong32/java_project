package �޼����ȯ��;

public class Ź���ȭ��â�� {

	public static void main(String[] args) {
		int ȭ��_price = 10000;
		int ��_count = 5000;
		//�� ���� ���� ���غ���.
		���� cal = new ����();
		int result1 = cal.add(ȭ��_price, ��_count);
		
		
		int ��������_price =3000;
		int �Ĺ�_price =9000;
		int result2 = cal.add(��������_price, �Ĺ�_price);
		
		//���Ⱑ main�޼��忡�� ���� ������� ��ȯ�ϴ�.
		int result3 = cal.add(result1, result2);
		System.out.println("���� ������ �ݾ��� " + result3);
		
	}

}
