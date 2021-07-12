package db����;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class MemberDB {
	//�ڹٿ���  dbó���� ���� DML�߽����� Ŭ������ �����.
	//db������ ����  "db�� ����"�� �����Ѵ�.
	//db�����Ͽ� ������ó���� �ϴ� Ŭ������ ���� ���� ���̺������ �����.
	//���̺�(entity, ��ü)
	//create(insert~into values)
	public void create(String id, String pw, String name, String tel) throws Exception {
		//�ڹٿ� db�����ϴ� ���α׷�(JDBC) ����
		//1. JDBC connector����
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1. connector ���� ����!!!");
		//2. java���� db�� ���� :
		
		//	������ �ּ� url( ip, port, db��), username, password
		String url = "jdbc:mysql://localhost:3306/shoes"; //�׻�Ȱ��� mysql
		String username = "root";
		String password = "1234";
		Connection con = DriverManager.getConnection(url, username, password);
		System.out.println("2. shoes db ���� ����!!!");
		
		//3. sql���� �����.
		String sql = "insert into member values (?,?,?,?)";
//		String sql = "delete from member where id = 'apple'";
		//PreparedStatement : sql�� ��Ÿ���� ��ǰ.
		//��ǰ�� ���� �־���� �ּҸ� ������ �ȴ�.
		//ps��ǰ�� 2�ܰ迡�� ȹ���� con ��ǰ�� ���� return
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, id);
		ps.setString(2, pw);
		ps.setString(3, name);
		ps.setString(4, tel);
		System.out.println("3. sql�� ���� ����!!!");
		
		//4. sql���� mysql�� �����Ѵ�.
		int result = ps.executeUpdate();
		System.out.println("4. sql�� ���� ����!!!");
		System.out.println(result);
	}
	
	public void delete(String id) throws Exception {
		//�ڹٿ� db�����ϴ� ���α׷�(JDBC) ����
		//1. JDBC connector����
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1. connector ���� ����!!!");
		//2. java���� db�� ���� :
		
		//	������ �ּ� url( ip, port, db��), username, password
		String url = "jdbc:mysql://localhost:3306/shoes"; //�׻�Ȱ��� mysql
		String username = "root";
		String password = "1234";
		Connection con = DriverManager.getConnection(url, username, password);
		System.out.println("2. shoes db ���� ����!!!");
		
		//3. sql���� �����.
//		String sql = "insert into member values ('apple2','apple2','apple2','019')";
		String sql = "delete from member where id = ?";
		//PreparedStatement : sql�� ��Ÿ���� ��ǰ.
		//��ǰ�� ���� �־���� �ּҸ� ������ �ȴ�.
		//ps��ǰ�� 2�ܰ迡�� ȹ���� con ��ǰ�� ���� return
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, id);
		System.out.println("3. sql�� ���� ����!!!");
		
		//4. sql���� mysql�� �����Ѵ�.
		int result = ps.executeUpdate();
		System.out.println("4. sql�� ���� ����!!!");
		System.out.println(result);
	}
	
	public void update(String id, String tel) throws Exception {
		//�ڹٿ� db�����ϴ� ���α׷�(JDBC) ����
		//1. JDBC connector����
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1. connector ���� ����!!!");
		//2. java���� db�� ���� :
		
		//	������ �ּ� url( ip, port, db��), username, password
		String url = "jdbc:mysql://localhost:3306/shoes"; //�׻�Ȱ��� mysql
		String username = "root";
		String password = "1234";
		Connection con = DriverManager.getConnection(url, username, password);
		System.out.println("2. shoes db ���� ����!!!");
		
		//3. sql���� �����.
		String sql = "update member set tel= ? where id = ?";
//		String sql = "delete from member where id = 'apple'";
		//PreparedStatement : sql�� ��Ÿ���� ��ǰ.
		//��ǰ�� ���� �־���� �ּҸ� ������ �ȴ�.
		//ps��ǰ�� 2�ܰ迡�� ȹ���� con ��ǰ�� ���� return
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, tel);
		ps.setString(2, id);
		System.out.println("3. sql�� ���� ����!!!");
		
		//4. sql���� mysql�� �����Ѵ�.
		int result = ps.executeUpdate();
		System.out.println("4. sql�� ���� ����!!!");
		System.out.println(result);
	}
}
