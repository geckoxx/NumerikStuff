package Numerik;

import java.math.BigDecimal;

public class NumerikUtil {
	
	public static double roundDouble(double value, int scale) {
		boolean neg = value < 0 ? true : false;
		if (neg)
			value *= -1;
		int exponent = (int) Math.log10(value);
		double mantissa = value * Math.pow(10.0, -exponent);
		BigDecimal bd = new BigDecimal(mantissa).setScale(scale,
				BigDecimal.ROUND_HALF_UP);
		double round_value = bd.doubleValue() * Math.pow(10, exponent);
		if (neg)
			round_value *= -1;
		return round_value;
	}
	
}
