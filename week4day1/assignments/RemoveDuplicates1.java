package week4day1.assignments;

import java.util.Set;
import java.util.TreeSet;

public class RemoveDuplicates1 {
public static void main(String[] args) {		
		
//		Declare a String as "PayPal India"

//		Convert it into a character array

//		Declare a Set as charSet for Character

//		Declare a Set as dupCharSet for duplicate Character

//		Iterate character array and add it into charSet

//		if the character is already in the charSet then, add it to the dupCharSet

//		Check the dupCharSet elements and remove those in the charSet

//		Iterate using charSet

//		Check the iterator variable isn't equals to an empty space

//		print it
	String input="PayPal India";
	String input1=input.toLowerCase().replace(" ", "");
	char[] chararray=input1.toCharArray();
	Set<Character> charset=new TreeSet<>();
	Set<Character> duplicateset=new TreeSet<>();
	for (Character character : chararray) {
		if(!charset.contains(character))
			{
				charset.add(character);
				
			}
			else
			{
				duplicateset.add(character);
			}
		}
	    charset.removeAll(duplicateset);
		System.out.println(charset);
		System.out.println(duplicateset);
	}
}
