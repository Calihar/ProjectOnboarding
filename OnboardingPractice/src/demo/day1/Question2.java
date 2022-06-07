package demo.day1;

/**
 * Given an alphanumeric string made up of digits and lower case Latin characters only, find the sum of all the digit characters in the string.
 * @author caleb
 *
 */

public class Question2 {
	public static void main(String[] args) {
		String[] input = {"3", "yor32forget349", "loid47tag801", "long4001but137sugar"};
		stringNumSum(input);
	}
	
	
	public static void stringNumSum(String[] input) {
		System.out.println("Output:");
		//Get the number of rows
		int numOfRows = Integer.parseInt(input[0]);
		
		for (int i = 1; i <= numOfRows; i++) {
			int sum = 0;
			String tempStr = input[i];
			
			for(Character c : tempStr.toCharArray()) {
				int asciiValue = c;
				if (asciiValue >= 49 && asciiValue <= 57) {
					String tempStr2 = c.toString();
					int literalValue = Integer.parseInt(tempStr2);
					sum += literalValue;
				}
			}
			System.out.println(sum);
		}
	}

}
