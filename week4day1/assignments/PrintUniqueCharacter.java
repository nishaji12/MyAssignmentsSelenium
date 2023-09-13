package week4day1.assignments;

import java.util.HashSet;
import java.util.Set;

public class PrintUniqueCharacter {
	public static void main(String[] args) {
		/*
		 * Problem
		 * 
		 * a) Take your name as input
		 * b) Print all unique characters only (any order)
		 * 
		 * Input:  babu
		 * Output: a u 
		 * 
		 */

		/*
		 * Psuedocode
		 * 
		 * a) Convert String to Character array
		 * b) Create a new Set -> HashSet
		 * c) Add each character to the Set and if it is already there, remove it
		 * d) Finally, print the set
		 * 
		 */
		String input="babu";
		char[] newchar=input.toCharArray();
		char newchar1=0;
		for(int i=0;i<newchar.length;)
		{
			for(int j=1;j<newchar.length;j++)
			{
				if(newchar[i]==newchar[j])
				{
				System.out.println(newchar[i]);
				newchar1=newchar[i];
				}
			}
			break;
		}
	
		Set<Character> data1=new HashSet<>();
		for (Character character : newchar) {
			data1.remove(newchar1);
			data1.add(character);
		}
		System.out.println(data1);
	}

}
