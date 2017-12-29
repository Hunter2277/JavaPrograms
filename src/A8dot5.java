/*Import Scanner
 * Declare main method
 * Initialize Scanner
 * Ask for user input of matrices row by row
 * Declare variables
 * Set up secondary method
 * For loop and nested for loop?
 * Add indexes?
 * Returns sum
 * Call method
 * Output result
 */
import java.util.Scanner;
public class A8dot5 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		double [][] mylist1 = new double [3][3];
		System.out.println("Enter matrix1");
		for(int i = 0; i < mylist1.length; i++){
			for(int j= 0; j < mylist1[i].length; j++){
				mylist1 [i][j] = input.nextDouble();
			}
		}

		double [][] mylist2 = new double [3][3];
		System.out.println("Enter matrix2");
		for(int i = 0; i < mylist2.length; i++){
			for(int j= 0; j < mylist2[i].length; j++){
				mylist2 [i][j] = input.nextDouble();
			}
		}
		double[][] result = addMatrix(mylist1, mylist2);
		printMatrix(mylist1, mylist2, result);
		

	}

	public static double[][] addMatrix(double[][] m1, double[][] m2){

		double [][] m3 = new double[3][3];
		for(int i =0; i < 3; i++){
			for(int j= 0; j < 3; j++){
				m3[i][j] = m1[i][j] + m2[i][j];

			}

		}
		return m3;

	}

	private static void printMatrix(double[][] m1, double[][] m2, double[][] m3){
		for(int i = 0; i < m1.length; i++){
			for(int j = 0; j < m2[i].length; j++){	
				System.out.print(m1[i][j] + " ");
			}
			System.out.print((i == 1)?" + " :"   ");
			for(int j = 0; j < m2[i].length; j++){
				System.out.print(m2[i][j] + " ");
			}
			System.out.print((i == 1)?" =  " :"    ");
			for(int j = 0; j < m3[i].length; j++){
				System.out.print(m3[i][j] + " ");
			}
			System.out.println();
		}
	}
}



