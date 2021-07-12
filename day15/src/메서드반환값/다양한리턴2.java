package 메서드반환값;

import java.util.Random;

public class 다양한리턴2 {

	public int get(int x) {
		return x+100;
	}
	
	public double get(){
		return 11.11;
	}
	
	public int[] get2() {
		int[] num = {10,20,30,40,50};
		return num;
	}
	
	public Random get3() {
		Random r = new Random();
		return r;
	}
}
