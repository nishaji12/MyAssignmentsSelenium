package week4day1.assignments;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class MissingNumber {
	/*
	 * Problem 
	 * 
	 * There will be running number between 1 to 10
	 * One of the unique number will be missing
	 * Find the missing number
	 * 
	 * 
	 */
	
	/*
	 * Psuedocode
	 * 
	 * a) Remove the duplicates using Set
	 * b) Make sure the set is in the ascending order
	 * c) Iterate from the starting number and verify the next number is + 1
	 * d) If did not match, that is the number
	 * 
	 */
	public static void main(String[] args) {
		int[] num1= {1,2,3,5,9,3,4,5,7,8,9};
		Set<Integer> data1=new TreeSet<>();
		for (Integer integer : num1) {
			data1.add(integer);
		}
		List<Integer> data2=new ArrayList<>(data1);
		for(int i=0;i<data2.size();i++)
		{
			if(data2.get(i)!=i+1)
			{
				System.out.println(i+1);
				break;
			}
		}
	}
	
	

}
