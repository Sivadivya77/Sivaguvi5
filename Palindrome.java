package ggtask5;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner obj =new Scanner (System.in);
		System.out.println("Enter the Name: ");
		String name=obj.nextLine();
		int i=0,j=name.length()-1;
		 
		while(i<j)
		{
			if (name.charAt(i) != name.charAt(j)) {
				System.out.println("Not palindrome");
				break;
				
			}
			i++;
			j--;
			
		}
		System.out.println("Its the palindrome ");
        obj.close();
	}
}
// output
//Enter the Name: 
//racecar
//Its the palindrome 




