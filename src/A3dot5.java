/*Import scanner
 * Ask user for two inputs
 * Declare input variable w1
 *  Declare input variable passed
 *  switch w1 % 6
 *  case 0-6 System.out.println(Today is...)
 *  passed +=w1
 *  System.out.println(and the future day s Thursday)
 * */




import java.util.Scanner;
public class A3dot5 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Enter Today's day:");
		int w1= input.nextInt();
		
		System.out.print("Enter the number of days elapsed since today:");
		int passed= input.nextInt();
		
		switch (w1 % 7){
		case 0: System.out.println("Today is Sunday");break;
		case 1: System.out.println("Today is Monday");break;
		case 2: System.out.println("Today is Tuesday");break;
		case 3: System.out.println("Today is Wednesday");break;
		case 4: System.out.println("Today is Thursday");break;
		case 5: System.out.println("Today is Friday");break;
		case 6: System.out.println("Today is Saturday");break;
		}
		
		passed +=w1;
		switch (passed % 7){
		case 0: System.out.print("and the future day is Sunday");break;
		case 1: System.out.print("and the future day is Monday");break;
		case 2: System.out.print("and the future day is Tuesday");break;
		case 3: System.out.print("and the future day is Wednesday");break;
		case 4: System.out.print("and the future day is Thursday");break;
		case 5: System.out.print("and the future day is Friday");break;
		case 6: System.out.print("and the future day is Saturday");break;
		}
		
		
		

	}

}
