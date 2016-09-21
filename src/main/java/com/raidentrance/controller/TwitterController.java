/**
 * 
 */
package com.raidentrance.controller;

import java.text.SimpleDateFormat;
import java.util.List;

import twitter4j.Query;
import twitter4j.QueryResult;
import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;

/**
 * @author raidentrance
 *
 */
public class TwitterController {
	private Twitter twitter;
	private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

	public TwitterController() {
		twitter = TwitterFactory.getSingleton();
	}

	public List<Status> query(String query) throws TwitterException {
		QueryResult search = twitter.search(new Query(query));
		List<Status> tweets = search.getTweets();
		return tweets;
	}

	public void printStatus(Status status) {
		System.out.println("----------------------------------------------------------");
		System.out.println(String.format("User [%s]", status.getUser().getScreenName()));
		System.out.println(status.getText());
		System.out.println(sdf.format(status.getCreatedAt()));
		System.out.println(String.format("RT[%d] FAV[%d]", status.getRetweetCount(), status.getFavoriteCount()));
		System.out.println("----------------------------------------------------------");
	}

	public void printStatus(List<Status> status) {
		for (Status tweet : status) {
			printStatus(tweet);
		}
	}
	
}
