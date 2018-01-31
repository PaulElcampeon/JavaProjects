package areaANDcircumference;

public class Methods {

	public double Circumference(double RADIUS) {
		
		double ans = Math.PI * 2 * RADIUS;
		return ans;
	}
	
	public double Area(double RADIUS) {
		
		double ans = Math.PI * Math.pow(RADIUS, 2);
		return ans;
	}
}
