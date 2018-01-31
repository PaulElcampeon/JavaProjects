package pmcc;

public class Methods {

	public double Sxy(double[] x, double[] y, int count) {
		double SumXY = 0;
		double SumX = 0;
		double SumY = 0;
		double SXY = 0;
		for(int i = 0; i < x.length; i++) {
			SumXY += x[i]*y[i];
			}
		for(int i = 0; i < x.length; i++) {
			SumX += x[i];
			}
		for(int i = 0; i < x.length; i++) {
			SumY += y[i];
			}
		return SXY = SumXY - ((SumX*SumY)/count);
		}
	
	public double Sxx(double[] x, int count) {
		double sumX = 0;
		double sumX2 = 0;
		double SXX = 0;
		for(int i = 0; i < x.length; i++) {
			sumX2 += Math.pow(x[i], 2);
			}
		for(int i = 0; i < x.length; i++) {
			sumX += x[i];
			}
		SXX = sumX2 - (Math.pow(sumX, 2))/count;
		return SXX;
		}
	
	public double Syy(double[] y, int count) {
		double sumY = 0;
		double sumY2 = 0;
		double SYY = 0;
		for(int i = 0; i < y.length; i++) {
			sumY2 += Math.pow(y[i], 2);
			}
		for(int i = 0; i < y.length; i++) {
			sumY += y[i];
			}
		SYY = sumY2 - (Math.pow(sumY, 2))/count;
		return SYY;
		}
	}
