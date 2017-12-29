/*Create Rectangle Class
 * Create Doubles width and height
 * Declare a no arg constructor that creates a default rectangle
 * Declare a constructor that creates rectangle with specified width and height
 * Declare method that returns the area
 * Declare method that returns the perimeter.
 * Create 2 rectangles that are different width and height
 * display their width, height, area and perimeter seperately
 */
public class Rectangle {

	double width = 1;
	double height = 1;
	
		public Rectangle(){
			
		}
		
		public Rectangle(double width , double height){
		this.width = width;
		this.height = height;
		}
		
		public double getArea(){
			return width*height;
			
		}

		public double getPerimeter(){
			double result = width + width + height + height;
			return result;
			
		}
}
