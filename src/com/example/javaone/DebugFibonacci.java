/*******************************************************************************
 * Copyright (c) 2014 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package com.example.javaone;

/**
 * My Computer Science 101 assignemtn.
 */
public class DebugFibonacci {

	private int sequenceNumber;

	public DebugFibonacci(int n) {
		this.sequenceNumber = n;
	}

	public static void main(String[] arguments) {
		int n = 12;
		DebugFibonacci fibonacci = new DebugFibonacci(n);
		int result = fibonacci.compute();
		System.out.println("Fib " + n + " = " + result);

	}

	private int compute() {
		return fib(sequenceNumber);
	}

	private int fib(int n) {
		if (endPoint(n))
			return 1;
		if (n < 0)
			throw new RuntimeException("Oops");
		return fib(n - 2) + fib(n - 1);
	}

	private boolean endPoint(int n) {
		return n == 1;
	}
}
