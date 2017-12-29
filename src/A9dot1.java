
public class A9dot1 {

	public static void main(String[] args){
		Rectangle rc1 = new Rectangle(4, 40);
		rc1.getArea();
		rc1.getPerimeter();
		System.out.printf("Rectangle 1 width is %.2f%n", rc1.width);
		System.out.printf("height is %.2f%n", rc1.height);
		System.out.printf("area is: %.2f%n", rc1.getArea());
		System.out.printf("perimeter is: %.2f%n%n", rc1.getPerimeter());

		Rectangle rc2 = new Rectangle(3.5, 35.9);
		rc1.getArea();
		rc1.getPerimeter();
		System.out.printf("Rectangle 1 width is %.2f%n", rc2.width);
		System.out.printf("height is %.2f%n", rc2.height);
		System.out.printf("area is: %.2f%n", rc2.getArea());
		System.out.printf("perimeter is: %.2f%n", rc2.getPerimeter());

	} 

}
