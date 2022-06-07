package demo.day1;

import java.util.ArrayList;

/**
 * Write a program that accepts sets of three numbers, and prints the second-maximum number among the three.
 * @author caleb
 *
 */

public class Question1 {
	
	public static void main(String[] args) {
		String[] input = {"3", "1 2 3", "10 15 5", "100 999 500"};
		System.out.println("Input:\n3\n1 2 3\n10 15 5\n100 999 500\n");
		secondMaximum(input);
	}


	public static void secondMaximum(String[] input) {
		System.out.println("Output:");
		//Get the number of rows
		int numOfRows = Integer.parseInt(input[0]);
		//Create the ArrayList that will hold all the values to be outputted
		ArrayList<Integer> secMax = new ArrayList<Integer>();

		//Iterate through the Input
		for(int i = 1; i <= numOfRows; i++) {
			//Create a container to hold all the values as int
			ArrayList<Integer> tempIntArr = new ArrayList<Integer>();
			
			//Divide the specific line up by " ".
			String[] tempStrArr = input[i].split(" ");
			//Iterate through the new split up array and add the values to the temp int array
			for(String str : tempStrArr) {
				tempIntArr.add(Integer.parseInt(str));
			}
			int max = 0;
			int secondMax = -1;
			for(int n : tempIntArr) {
				if(n < max && n < secondMax) {}
					
				else if(n > max && n > secondMax) {
					secondMax = max;
					max = n;
				}
				else if(n > secondMax && n < max)
					secondMax = n;
			}
			if(secondMax != -1)
				secMax.add(secondMax);
			System.out.println(secondMax);
			
		}
		
		
	}
}
