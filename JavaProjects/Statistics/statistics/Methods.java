package statistics;

import java.util.Arrays;

public class Methods {

	public double meaN(double [] a) {
		double sum = 0;
		double ans = 0; 
		
		for(int i = 0; i < a.length; i++) {
			sum += a[i];
		}
		
		ans = sum/a.length;
		
		return ans;
	}
	
	
	public double mediaN(double [] a) {
		int count = a.length;
		Arrays.sort(a);
		double ans = 0;
	
		if(a.length % 2 == 0) {
			double num = Math.ceil(a.length/2);
			int numx = (int) num;
			return a[numx];
		}
		
		else
		{
			ans = (a[a.length/2] + a[(a.length/2) + 1])/2;
			return ans;
		}
	}
	
	public String modE(double [] a) {
		Arrays.sort(a);
		String modex = "";
		double countx = 0;
	
		for(int i = 0; i<a.length; i++) {
			int county = 0;
			for(int j = 0; j<a.length; j++) {
					if(a[i] == a[j]) {
						county++;
						if(!(modex.contains(Double.toString(a[i])))){
						if(county == countx) {
							modex += " and "+Double.toString(a[i]);
							}
						}
						if(county > countx) {
							modex = Double.toString(a[i]);
							countx = county;
						}
					}
				}
			}

				return modex ;
		}
		
	public double rangE(double [] a) {
		Arrays.sort(a);
		int count = a.length;
		
		double rangex = a[a.length-1] - a[0];
		
		return rangex;
	}
	
	public double LowerQuarT(double [] a) {
		int count = a.length;
		Arrays.sort(a);
		double ans = 0;
	
		if((a.length+1) % 4 == 1) {
			double num = Math.ceil((a.length+1)/4);
			double num1 = num - 1;
			int numx = (int) num;
			int numy = (int) num1;
			double diff = a[numx] - a[numy];
			double diff2 = diff*0.25;
			double ANS = a[numy] + diff2; 
			return ANS;
		}
		
		else if((a.length+1) % 4 == 2){
			double num = Math.ceil((a.length+1)/4);
			double num1 = num - 1;
			int numx = (int) num;
			int numy = (int) num1;
			double diff = a[numx] - a[numy];
			double diff2 = diff*0.5;
			double ANS = a[numy] + diff2; 
			return ANS;
		}
		else if((a.length+1) % 4 == 3) {
			double num = Math.ceil((a.length+1)/4);
			double num1 = num - 1;
			int numx = (int) num;
			int numy = (int) num1;
			double diff = a[numx] - a[numy];
			double diff2 = diff*0.75;
			double ANS = a[numy] + diff2; 
			return ANS;
		}
		return ans;
	}
	
	public double UpperQuarT(double [] a) {
		int count = a.length;
		Arrays.sort(a);
		double ans = 0;
		
		if((a.length+1) % 4 == 1) {
			double num = Math.ceil((a.length+1)*0.75);
			double num1 = num - 1;
			int numx = (int) num;
			int numy = (int) num1;
			double diff = a[numx-1] - a[numy-1];
			double diff2 = diff*0.75;
			double ANS = a[numy-1] + diff2; 
			return ANS;
		}
		
		else if((a.length+1) % 4 == 2){
			double num = Math.ceil((a.length+1)*0.75);
			double num1 = num - 1;
			int numx = (int) num;
			int numy = (int) num1;
			double diff = a[numx-1] - a[numy-1];
			double diff2 = diff*0.5;
			double ANS = a[numy-1] + diff2; 
			return ANS;
		}
		else if((a.length+1) % 4 == 3) {
			double num = Math.ceil((a.length+1)*0.75);
			double num1 = num - 1;
			int numx = (int) num;
			int numy = (int) num1;
			double diff = a[numx-1] - a[numy-1];
			double diff2 = diff*0.25;
			double ANS = a[numy-1] + diff2; 
			return ANS;
		}
		return ans;
	}
		
	public double variancE(double [] a) {
		double sumX = 0;
		double sumX2 = 0;
		double ans = 0;
		
		for(int i = 0; i < a.length; i++) {
			sumX2 += Math.pow(a[i], 2);
		}
		
		for(int i = 0; i < a.length; i++) {
			sumX += a[i];
		}
		
		ans = (sumX2/a.length) - (Math.pow((sumX/a.length), 2));
		return ans;
	}

	public double StandardDeV(double[] a) {
		double ans = Math.sqrt(variancE(a));
		return ans;
		}
	}

