package week4day1.assignments;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class FindSecondLargest {
	public static void main(String[] args) {

		// Here is the input
		int[] data = {3,2,11,4,6,7,2,3,3,6,7};
		Set<Integer> data1=new TreeSet<>();
		for(int i=0;i<data.length;i++)
		{
			data1.add(data[i]);
		}
		List<Integer> output=new ArrayList<>(data1);
		int outout=output.get(4);
		System.out.println(outout);
		//       output= 7;

		/*
		 * Pseudo Code: 
		 * a) Create a empty Set Using TreeSet
		 * b) Declare for loop iterator from 0 to data.length and add into Set 
		 * c) converted Set into List
		 * d) Print the second last element from List
		 * 
		 * 
		 */



	}

}
