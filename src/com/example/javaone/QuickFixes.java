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

import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * 
 */
public class QuickFixes {

	public void fixErrors() {
		MissingClass missing = new MissingClass();
		missing.hello("greeting", 42);

		//change method signature
		String result = missing.hello("greet");

		//surround with or add throws
		File file = new File("c:\\tmp");
		new FileOutputStream(file).close();

		//can also surround with Alt+Shift+Z

	}

	public void fixWarnings() {
		//indirect static access
		QuickFixes quickFixes = new QuickFixes();
		String msg = quickFixes.getStaticValue();

		//infer generic type
		List messages = new ArrayList();

		if (msg != null) {
			messages.add(msg);
			System.out.println(messages);
		}

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

	public QuickFixes(String message) {
		super();
		//assign parameter to field
	}

	public QuickFixes() {
	}

	public static String getStaticValue() {
		return "hello";
	}

	private void liftPen(int x, int y) {
		//sample
	}

	private void plot(int x, int y) {
		//sample
	}
}
