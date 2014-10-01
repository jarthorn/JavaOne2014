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

/**
 * 
 */
public class ContentAssist {
	private int age;
	private String name;

	public void methodCompletions() {
		String s = "hello";
		int myStart = 3, myEnd = 4;
		//fuzy matching
		s.eq
		
		//smart parameter completion
		s.sub
		
		//context aware, with probability
		String msg = s;
		if (msg.)
			
		
		//proposals filtered on throwables
		throw new Nu
	
		//generate inner class
		Runnable r = new Run
	}

	//create getter/setter for age field

	//generate equals/hashcode

	/**
	 * Can also do content assist in javadoc 
	 * Example: {@link Qui}
	 * @param 
	 */
	public String computeName(String first, String last) {
		return first + ' ' + last;
	}

}
