package ggtask5;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the name; ");
		String name = obj.next();
		System.out.println("After reverse name:");
		
		for (int i=name.length()-1;i>=0;i--) {
			
			System.out.print(name.charAt(i));
		}
		
		obj.close();

	}

}
//output
//Enter the name; 
//Sivachandran
//After reverse name:
//nardnahcaviS
