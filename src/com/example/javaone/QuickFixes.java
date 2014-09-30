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

import java.util.ArrayList;

/**
 * 
 */
public class QuickFixes {

	public void fixErrors() {
		MissingClass missing = new MissingClass();
		missing.hello("greeting", 42);

		//change method signature
		String result = missing.hello("greet");

	}

	public void fixWarnings() {

	}

	public void fixGoodCodeToo() {

		//assign to local variable
		new ArrayList<String>();

		int x = 4, y = 5;
		//exchange operands, split
		if (x < 10 && y > 11) {
			plot(x, y);
		} else {
			liftPen(x, y);
		}

		//boolean simplification
		if (!(x > 10 || y > x))
			liftPen(x, y);

	}

	private void liftPen(int x, int y) {
		//sample
	}

	private void plot(int x, int y) {
		//sample
	}
}
