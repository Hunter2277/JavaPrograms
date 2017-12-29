/*Import date
 * for loop
 */


import java.util.Date;
public class A9dot3 {

	public static void main(String[] args) {
		Date date = new Date();
		System.out.println("For elapsed times,10000, 100000, 1000000, 10000000, 100000000, 1000000000, 10000000000, 100000000000:");

			for(long i = 10000; i <= 100000000000L;i*=10){
				date.setTime(i);
				System.out.println(date.toString());
			}
			
	}

}
