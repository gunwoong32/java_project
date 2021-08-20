package 생성자;

public class Phone공장 {

	public static void main(String[] args) {
		Phone phone1 = new Phone("white",3000);
		Phone phone2 = new Phone("black",2000);
		
		System.out.println(phone1);
		System.out.println(phone2);
	}

}
