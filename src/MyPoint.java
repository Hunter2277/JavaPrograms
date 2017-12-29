/*
 * Create MyPoint class
 * create data points x and y
 * Create no-arg constructor that creates (0,0)
 * Create constructor that creates specified coordinates
 * Create a method named Distance that returns distance from this point to another point
 * 
 * 
 */
public class MyPoint {

	private double x = 0;
	private double y = 0;
	
	public MyPoint(){
		
	}
	
	public MyPoint(double x, double y){
		this.x = x;
		this.y = y;
		
	}
	
	public double getX(){
		return x;
	}
	
	public double getY(){
		return y;
	}
	
	public double distance(double x, double y){
		return Math.sqrt(Math.pow(x - this.x, 2) + Math.pow(y - this.y, 2));
	}
	
	public double distance(MyPoint z){
		return distance(z.getX(), z.getY());
	}
	
	
}
