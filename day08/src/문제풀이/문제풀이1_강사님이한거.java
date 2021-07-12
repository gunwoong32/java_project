package 문제풀이;

public class 문제풀이1_강사님이한거 {

	public static void main(String[] args) {
		int[] n = new int[5];
		System.out.println(n.length);
		n[0] = 100;
		System.out.println(n[0]);
		n[n.length - 1] = 500;
		System.out.println(n[n.length - 1]);
		n[2] = 200;
		System.out.println(n[2]);
		
		for (int i = 0; i < n.length; i++) {
			System.out.print(n[i] + " ");
		}
		System.out.println();
		
		for (int i = 0; i < n.length; i++) {
			System.out.println(i + ": " + n[i]);
		}
		
		
	}

}
