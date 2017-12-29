

/*Import Scanner
 * Declare main method
 * Ask user to input 10 variables
 * Declare second method named average
 * For loop that adds the sum of numbers in the array
 * Declare method again to average the numbers
 * Call method
 * return average
 * output average
 */

import java.lang.reflect.Array;
import java.util.Scanner;

public class A7dot8 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter ten numbers: ");
		
		double [] array = new double[10]; 
		
			for(int i = 0; i < array.length; i++){
				array[i] = input.nextDouble();
			}
			
			double result = average(array);
			System.out.print(result);

	}
		public static int average(int[] array){
			int sum = 0;
			int avg = 0;
			for(int i = 0; i < array.length; i++){
				sum += array[i];
			}
				avg= sum / array.length;
				return avg;
				
			
		}
		
		public static double average(double[] array){
			double sum = 0;
			double avg = 0;
			for(int i = 0; i < array.length; i++){
				sum += array[i];
			}
				avg= sum / array.length;
				return avg;
			
		}
}
