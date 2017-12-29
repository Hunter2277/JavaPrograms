/*Import Scanner
 * Code user input
 * Calculate gross pay, Deductions and Net pay
 * 
 */





import java.util.Scanner;

public class A4dot23 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Enter Employee's Name");
		String n = input.nextLine();
		
		System.out.println("Enter number of hours worked in a week:");
		double h = input.nextDouble();
		
		System.out.println("Enter hourly pay rate:");
		double p = input.nextDouble();
		
		System.out.println("Enter state witholding rate:");
		double sw = input.nextDouble();
		
		System.out.println("Enter federal witholding rate:");
		double fw = input.nextDouble();
		
		double gP = h * p;
		double fT = fw * gP;
		double sT = sw * gP;
		double td = fT + sT;
		double np = gP - td;
		
		System.out.println("Employee Name: " + n + "\n");
		System.out.println("Hours Worked:" + h + "\n");
		System.out.println("Pay Rate:" + p + "\n");
		System.out.println("Gross Pay:" + gP + "\n");
		System.out.println("Deductions: \n");
		System.out.println( "Federal Witholdings" + (int)(fT * 100)/(100.00) + "\n");
		System.out.println( "State Witholdings" + (int)(sT * 100)/(100.00) + "\n");
		System.out.println("Total Deductions" + (int)(td * 100)/(100) + "\n");
		System.out.println("Net Pay" + (int)(np * 100)/(100) + "\n");
			
	
	}

}
