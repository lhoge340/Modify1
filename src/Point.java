//import java.awt.Point;

public class Point {
	private int x;
	private int y;
	static private int counter = 0;
	
	public Point() {
		this(0,0);
		System.out.println("Using a default constructor");
	}
	
	public Point(int x, int y) {
		if ( x >= 0)
			this.x = x;
		if (y >= 0)
			this.y = y;
		++counter;
	}
	
	public Point(Point p) {
		this.x = p.getX();
		this.y = p.getY();
	}
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
	
	//Added code to test counter
	public static int getCounter() {
		return counter;
	}

}