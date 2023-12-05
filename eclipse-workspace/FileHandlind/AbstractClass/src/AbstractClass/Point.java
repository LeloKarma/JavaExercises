package AbstractClass;

class Point {

	private int x;
	private int y;
	
	public Point(int x,int y) {
		this.x = x;
		this.y = y;
	}
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
}
class GreatPoint extends Point{
	public GreatPoint(int x,int y) {
		super(x,y);
	}
	public double distance() {
		int x = getX();
		int y = getY();
		return Math.sqrt(x * x + y * y);
	}

public class Demo{
	public static void main(String[] args) {
		
		GreatPoint point = new GreatPoint(3,4);
		double distance = point.distance();
		
		System.out.println("The distance from(0,0):" +distance);
	}
}
}
