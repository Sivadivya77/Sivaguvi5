package ggtask5;

import java.util.Scanner;

public class Gradingsys {

	public static void main(String[] args) {
		 
		Scanner obj =new Scanner (System.in);
		System.out.println("Enter the Student mark: ");
		int mark=obj.nextInt();
		
		if (mark == 100) {
			
			System.out.println("Grade S") ;
			
		}else if (mark<99 && mark >90){
			
			System.out.println("Grade A");
		}
		else if (mark<89 && mark > 80)
		{
			System.out.println("Grade B");
		}
		else if (mark <79 && mark > 70) {
			System.out.println("Grade C");
		}
			else if (mark <69 && mark > 60) {
				System.out.println("Grade D");
			}
			else if (mark <59 && mark > 50) {
				System.out.println("Grade E");
			}
			else if(mark < 50 ) {
				System.out.println("Fail");
			}
			else {
				System.out.println("Invalid Input");
			} obj.close();
							
			}
}	
					
			
			
/*Output                         
Enter the Student mark:            
102
Invalid Input

Output	
Enter the Student mark: 
77
Grade C


*/