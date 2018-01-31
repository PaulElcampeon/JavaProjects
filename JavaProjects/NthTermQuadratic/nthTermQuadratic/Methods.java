package nthTermQuadratic;

public class Methods {
	
	public double[] calculations(double[] Data) {
		double y = Data[1] - Data[0];
		double x = Data[2] - Data[1];
		double secondDiff = x - y;
		double a = secondDiff/2;
		double b = y - 3*a;
		double c = Data[0] - b - a;
		double[] ans = {a,b,c}; 
		return ans;
		}
		
	public boolean checker1(String[] data) {
		for(String s: data) {
			if(s.equals("")) {
				return false;
				}
			}
		return true;
		}
	}