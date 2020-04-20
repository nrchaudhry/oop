
public class Circle {
	
	private int center;
	
	// This this the radious of Circle
	private int radious;

	public int getCenter() {
		return center;
	}

	public void setCenter(int center) {
		this.center = center;
	}

	public int getRadious() {
		return radious;
	}

	public void setRadious(int radious) {
		this.radious = radious;
	}
	
	public void draw() {
		
	}
	
	public double computeArea() {
		double area=0.0;
		
		area = 2*3.14*radious*radious;
		
		return area;
	}
}
