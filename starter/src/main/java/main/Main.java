package main;

import circuitbreaker.CircuitBreaker;
import retry.TestRetry;

public class Main {

	public static void main(String[] args) {
		System.out.println("-------Retry--------");
		TestRetry t = new TestRetry();
		t.retry();
		System.out.println();
		System.out.println();
		System.out.println();
		
		System.out.println("-------CircuitBreaker--------");
		
		CircuitBreaker cb = new CircuitBreaker();
		cb.circuitBreaker();

	}

}
