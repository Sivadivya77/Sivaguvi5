package ggtask5;

import java.util.Scanner;

public class Hotelq6 {

	public static void main(String[] args) {
	
		Scanner obj =new Scanner (System.in);
		
		int month= obj.nextInt();
		System.out.println("Enter the month: " +month);	
		
		Scanner obj1 =new Scanner (System.in);
		float rent= obj1.nextInt();
		System.out.println("Enter the Rent: " + rent);
		
		Scanner obj2 =new Scanner (System.in);
		
		int day= obj2.nextInt();
		System.out.println("Enter the Day to Stay: " + day);
		 

 float t = rent*day;
float r =(float) ((rent+(rent*0.2))*day);

switch (month)
{
case 1:
	System.out.println("january month Hotel Tariff Rs: " +t);
	break;
case 2:
	System.out.println("February  month Hotel Tariff Rs: " +t);
	break;
case 3:
	System.out.println("March  month Hotel Tariff Rs: " +t);
	break;
case 4:
	System.out.println("April month Hotel Tariff Rs: " +r);
	break;
case 5:
	System.out.println("May month Hotel Tariff Rs: " +r);
	break;
case 6:
	System.out.println("June month Hotel Tariff Rs: " +r);
	break;
case 7:
	System.out.println("July month Hotel Tariff Rs: " +t);
	break;
case 8:
	System.out.println("August month Hotel Tariff Rs: " +t);
	break;
case 9:
	System.out.println("september month Hotel Tariff Rs: " +t);
	break;
case 10:
	System.out.println("October month Hotel Tariff Rs: " +t);
	break;
case 11:
	System.out.println("November month Hotel Tariff Rs: " +r);
	break;
case 12:
	System.out.println("December month Hotel Tariff Rs: " +r);
	break;
			default:
System.out.println("Invalid Input");
}		
obj.close();
obj1.close();
obj2.close();
return;

 
 
	}
	
	}
 /*
 output 
 3
 Enter the month: 3
 1500
 Enter the Rent: 1500.0
 2
 Enter the Day to Stay: 2
 March  month Hotel Tariff Rs: 3000.0

 output
 12
Enter the month: 12
1000
Enter the Rent: 1000.0
5
Enter the Day to Stay: 5
December month Hotel Tariff Rs: 6000.0

 */
 


