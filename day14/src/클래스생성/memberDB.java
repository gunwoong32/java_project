package Ŭ��������;

import java.sql.DriverManager;

public class memberDB {
	//DB�۾��ϴ� class�� ���̺�� �Ѱ���
	//�۾��� ���̺��� 2���̸�, DB���� Ŭ������ 2�� ������ �Ѵ� 
	//DB�۾�
	//1.DB,���̺� ����
	//2. ������ ����(CRUD : Create, Read, Update, Delete)
	
	String ip = "localhost";	//�� �����ǰ� �ڵ����� ��
	String port = "3306";
	String user = "root";
	String pass = "1234";
	
	
	public void login(String id, String pw) {
		//ȸ�����Խ� ����� id�� apple, pw�� 1111
		if (id.equals("apple") && pw.equals("1111")) {
			System.out.println("�α��� ����!");
		}
		else {
			System.out.println("�α��� ����");
		}
	}

	public void create(String id,String pw, String name,String tel) throws Exception {
		//DB�����ؾ���.
		//1)��Ʈ��ũ ������ mqsql server ���� : �ּҿ� ����(ip + port)
		//2)������ mysql server�� ������ �޾ƾ��Ѵ�. �ʿ��� ���� : id,pw
		
		System.out.println(ip + port + "�� ����Ǿ����ϴ�");
		System.out.println("ȸ������ ó��");
		System.out.println("������ id�� " + id);
		System.out.println("������ pw�� " + pw);
		System.out.println("������ name�� " + name);
		System.out.println("������ tel�� " + tel);
		//JAVA�� mysql���� ���� ������ ������ ����.(JDBC���α׷���,java db connectivity)
		//1. connector ����
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1. Ŀ���� ���� ����!!!");
		
		//2. mysql server�� db�� �����ϰ� ������ ����
		String url = "jdbc:mysql://" + ip + ":" + port + "/shoes";
					//jdbc:mysql://localhost:3306/shoes
		DriverManager.getConnection(url, user, pass);
		System.out.println("2. mySQL ���� ����/���� ����");
		
		//3. sql�� ������
		
		//4. sql�� mysql server�� ����
		
		
	}
	public void read(String id) {
		System.out.println("ȸ������ �˻�");
	}
	public void update() {
		System.out.println("ȸ������ ���� ó��");
	}
	public void delete(String id) {
		System.out.println("ȸ��Ż�� ó��");
		System.out.println(id + "���� Ż�� �Ϸ�Ǿ����ϴ�.");
	}
	
	
}
