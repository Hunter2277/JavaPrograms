/*Import Scanner
 * Declare main method
 * Initialize Scanner
 * Ask for user input of matrices row by row
 * Declare variables
 * Set up secondary method
 * For loop (int i=0; i<5; i++) then sum +=[i] (row by row)
 * Returns sum of major diagnol elements
 * Call method
 * Output result
 */
import java.util.Scanner;

public class A8dot2 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		double [][] mylist = new double [4][4];
		System.out.println("Enter a 4 by 4 matrix row by row:");
		for(int i = 0; i < mylist.length; i++){
				for(int j= 0; j < mylist[i].length; j++){
					mylist [i][j] = input.nextDouble();
				}
		}
		double result = sumMajorDiagnonal(mylist);
		System.out.println("Sum of the Elements in major Diagnol is " + result );
		
		//sum += matrix[row];	
		

	}
	
	public static double sumMajorDiagnonal(double[][] m){
		double sum = 0;
		for(int i = 0; i < m.length; i++){
			sum += m [i][i];
		}
		return sum;
			
	}
		
		
}
