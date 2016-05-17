package br.com.mystudies.java.performace;

import static java.lang.Double.isInfinite;
import static java.lang.System.currentTimeMillis;

public class Microbenchmarks {





	public static void main(String[] args) {
		/*new Microbenchmarks().*/doTest();
	}



















	public static void doTest(){
		double l;

		long then = currentTimeMillis();


		for (int i = 0; i < 1; i++) {
			l = filImpl1(30);
		}

		long now = currentTimeMillis();

		System.out.println("Elapsed time: " + (now - then));
	}















	private static double filImpl1(int n) {
		if(n < 0 ) throw new IllegalArgumentException("Must be > 0");
		if(n == 0) return 0d;
		if(n == 1) return 1d;
		double d = filImpl1(n -2 ) + filImpl1( n - 1);
		if(isInfinite(d)) throw new ArithmeticException("Overflow");
		return d;
	}










}
