/*Declare two methods
 * declare variables
 * while loop
 * call function
 * create 2 methods
 * 
 */
public class A6dot8 {

	public static void main(String[] args){
		
		double celsius = 40.0;
		double farenheit= 120.0;
		
		System.out.printf("%10s   %10s    |     %10s %10s %n", "Celsius", "Farenheit", "Celsius", "Farenheit");
	
		
		while (celsius >= 31.0){
			
			double f1 = cToF(celsius);
			double c2 = fToc(farenheit);
			
			System.out.printf("%10.1f %10.1f      |      %10.1f %10.1f %n", celsius, f1, farenheit, c2);
			
			
			celsius--;
			farenheit-= 10;

		}


	}

	public static double cToF(double celsius){
		double f1= (9.0 / 5) * 40.0 +32;
		
		 return f1;
		 
	}
	public static double fToc(double farenheit){

	
		double c2 = (5.0 / 9) * (120.0 - 32);
		
		return c2;
			

	}


}
