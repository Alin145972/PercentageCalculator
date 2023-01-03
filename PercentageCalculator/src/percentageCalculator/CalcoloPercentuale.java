package percentageCalculator;

public class CalcoloPercentuale {
	public static String calcolaPercentuale(double val1, double val2) { 
		double p = (val1/100.0)*val2;
		
		return val1+" % of "+val2+" is "+p;
	}
}
