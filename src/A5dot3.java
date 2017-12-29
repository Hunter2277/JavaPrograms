/* For loop that takes the initial value 
 * 
 */
public class A5dot3 {

	public static void main(String[] args) {
		
		System.out.println("Kilograms      Pounds");
		
		double kilo = 0;
		for(int i = 1; i < 200; i++) {
			if (i % 2 == 1){
				kilo = i * 2.2;
				System.out.println(i +"              " + (int)(kilo * 10)/10.0);
			}
			
			
			
		}
			
			

	}

}
