
public class A13dot6 {

	public static void main(String[] args) {
		ComparableCircle[] circles = {
				new ComparableCircle(4),
				new ComparableCircle(3)};
		java.util.Arrays.sort(circles);
		System.out.println(circles[circles.length - 1]);

	}

}
