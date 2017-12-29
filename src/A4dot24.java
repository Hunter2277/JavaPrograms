/*prompt for cities
read 3 cities

if c1 > c3
	swap them

if c2 > c3
	swap 

if c1 > c2
	swap
	
ouptput cities in order
*/



import java.util.Scanner;

public class A4dot24{
	
	public static void main(String[] args){
		//TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
	
		System.out.print("Please enter the first city: ");
		String c1 = input.nextLine();
		
		System.out.print("Please enter the second city: ");
		String c2 = input.nextLine();
		
		System.out.print("Please enter the third city: ");
		String c3 = input.nextLine();
		String t;
	
		if (c1.compareToIgnoreCase(c2) > 0) {
			t = c1;
			c1 = c2;
			c2 = t;
		}
		
		if (c2.compareToIgnoreCase(c3) > 0) {
			t = c2;
			c2 = c3;
			c3 = t;
		}
		
		if (c1.compareToIgnoreCase(c2) > 0) {
			t = c1;
			c1 = c2;
			c2 = t;
		}
		
		System.out.println("The cities in order are " + c1 + ", " + c2 + ", and " +c3);
		
				
		
	}
}




