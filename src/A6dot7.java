/* Import Scanner
 * Declare Methods
 * Declare parameters
 * Calculate investment value w/ for loop with years incrementing
 * Call function
 * Display result
 */




import java.util.Scanner;
public class A6dot7 {

	public static void main(String[] args) {
		
		
				Scanner input=new Scanner(System.in);
		
						System.out.println("The amount invested:");
		
							double investmentAmount = input.nextDouble();
		
		
						System.out.println("Annual Interest Rate:");
		
							double annual = input.nextDouble();
		
								double monthlyInterestRate = (annual/1200);
		
		
	System.out.println("Years          Future Value");
		
		for(int years = 1; years <= 30; years++){
			
			double result = futureInvestmentValue(investmentAmount, monthlyInterestRate, years);
			System.out.println(years + "         "  + (int)(result*100)/100.00);
		}
			
		}
			
		public static double futureInvestmentValue(
				double investmentAmount, double monthlyInterestRate, int years){
				double yearlyinv = (investmentAmount* (Math.pow(1+ monthlyInterestRate, years*12)));
				return yearlyinv;
	}
		
		

}
