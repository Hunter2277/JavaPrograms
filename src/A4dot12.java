/* Import Scanner
 * Ask for user input
 * Case statements for binary
 * Default statement 
 */



import java.util.Scanner;
public class A4dot12{

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
			System.out.print("Enter hex didgit:");
			
					
				
					
		
			char hex = input.nextLine().charAt(0);
			
			String result="";
			
				switch(hex){
				case '0': result = "0000"; break;
				case '1': result = "0001"; break;
				case '2': result = "0010"; break;
				case '3': result = "0011"; break;
				case '4': result = "0100"; break;
				case '5': result = "0101"; break;
				case '6': result = "0110"; break;
				case '7': result = "0111"; break;
				case '8': result = "1000"; break;
				case '9': result = "1001"; break;
				case 'A': result = "1010"; break;
				case 'a': result = "1010"; break;
				case 'B': result = "1011"; break;
				case 'b': result = "1011"; break;
				case 'C': result = "1100"; break;
				case 'c': result = "1100"; break;
				case 'D': result = "1101"; break;
				case 'd': result  = "1110"; break;
				case 'E': result  = "1110"; break;
				case 'e': result  = "1110"; break;
				case 'F': result  = "1111"; break;
				case 'f': result  = "1111"; break;
				default :System.out.println(hex +" is an invalid input");
				}
				
				System.out.println("The binary value is " + result);
				input.close();
			
}
}