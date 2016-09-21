/**
 * 
 */
package com.raidentrance.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author raidentrance
 *
 */
public class QueryReader {

	public static String readLine() throws IOException {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader reader = new BufferedReader(isr);
		return reader.readLine();
	}

	public static String readLine(String message) throws IOException {
		System.out.print(message);
		return readLine();
	}
}
