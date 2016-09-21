/**
 * 
 */
package com.raidentrance;

import java.io.IOException;
import java.util.List;

import com.raidentrance.controller.TwitterController;
import com.raidentrance.util.QueryReader;

import twitter4j.Status;
import twitter4j.TwitterException;

/**
 * @author raidentrance
 *
 */
public class TwitterSearchApplication {

	public static void main(String[] args) throws IOException, TwitterException {
		TwitterController controller = new TwitterController();
		String command = QueryReader.readLine("Query in twitter (quit for exit)->>");
		while (!command.equals("quit")) {
			List<Status> result = controller.query(command);
			controller.printStatus(result);
			command = QueryReader.readLine("Query in twitter: ");
		}
	}

}
