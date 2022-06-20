package demo.day3;

public class Question1 {

	public static void main(String[] args) {
		System.out.println(squares(3, 9));
		System.out.println(squares(17, 24));
		System.out.println(squares(1, 1000000000));
		
	}
	
	public static int squares(int min, int max) {
		int count = 0;
		for(int i = min; i<=max; i++) {
			double root = Math.sqrt(i);
			if(root == (int)root) {
				count++;
			}
		}
		return count;
	}
}
