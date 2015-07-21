package br.com.mystudies.java.performace;

import static java.lang.System.currentTimeMillis;

public class App {




	public static void main(String[] args) {

		long start = currentTimeMillis();

		for (int i = 0; i < 10000; i++) {
			int x = test(i);
		}

		System.out.println("Total time..: " +  ( currentTimeMillis() - start));
	}




	private static int test(int i) {
		return i * 10;
	}

}
