/*Import Scanner
 * Declare main method
 * Ask user to input 10 variables
 * Declare second method named deviation
 * return deviation
 * Declare new method named mean
 * return the mean
 * Call method
 * return average
 */
import java.util.Scanner;
public class A7dot11 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter ten numbers: ");
		
		double [] array2 = new double[10]; 
		
		for(int i = 0; i < array2.length; i++){
			array2[i] = input.nextDouble();
		}
		
		double result = deviation(array2);
		System.out.println("The standard deviation is "+ result);
		System.out.println("The mean is: ");
		System.out.printf("%.2f", mean(array2));
		
	}
	
	public static double deviation(double[] x){
		double result = 0.0;
		double avg = mean(x);
		for(int i = 0; i < x.length; i++){
			result += Math.pow(x[i] - avg, 2);	
		}
		
		double ans = result / (x.length - 1);
		return Math.sqrt(ans);
		
		
	}
		public static double mean(double[]x){
			double mean = 0.0;
			for(int i = 0; i < x.length; i++){
				mean += x[i];
				}
			return mean/10;
		}
}
