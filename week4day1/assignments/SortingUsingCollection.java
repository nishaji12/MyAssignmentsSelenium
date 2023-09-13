package week4day1.assignments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortingUsingCollection {
	public static void main(String[] args) {

		// Declare a String array and add the Strings values as (HCL, Wipro,  Aspire Systems, CTS)		

		// get the length of the array		

		// sort the array			

		// Iterate it in the reverse order

		// print the array
			
		// Required Output: Wipro, HCL , CTS, Aspire Systems
		String[] input={"HCL", "Wipro", "Aspire Systems", "CTS"};
		//int lenghofstr=input.length();
		List<String> list=new ArrayList<>(Arrays.asList(input));
		Collections.sort(list);
		Collections.reverse(list);
		System.out.println(list);
		}
}
