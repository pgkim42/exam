package main;

public class Quiz8 {
	public static void main(String[] args) {

		Calc calc = new Calculator();

		System.out.println(calc.add(10, 5));
		System.out.println(calc.substract(10, 5));
		System.out.println(calc.times(10, 5));
		System.out.println(calc.divide(10, 5));

		System.out.println();
		
		System.out.println(calc.times(10, 0));
		System.out.println(calc.divide(10, 20));

	}
}

interface Calc {
	public static int ERROR = -9999;

	int add(int a, int b);

	int substract(int a, int b);

	int times(int a, int b);

	int divide(int a, int b);

}

class Calculator implements Calc {

	@Override
	public int add(int a, int b) {
		return a + b;
	}

	@Override
	public int substract(int a, int b) {
		return a - b;
	}

	@Override
	public int times(int a, int b) {

		if ((a <= 0) || (b <= 0)) {
			return ERROR;
		} else {
			return a * b;
		}
	}

	@Override
	public int divide(int a, int b) {
		if (a < b) {
			return ERROR;
		} else {
			return a / b;
		}
	}

}