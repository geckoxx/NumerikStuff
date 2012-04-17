package Numerik;

public class Main {

	public static void main(String[] args) {
		double value = 123456.7890123456789e-13;
		System.out.println(value);
		System.out.println(NumerikUtil.roundDouble(value, 12));
	}

	
}
