package ca.ualberta.cs.lonelytweet;

import java.util.Date;

public class ImportantLonelyTweet extends LonelyTweet {

	public ImportantLonelyTweet() {
	}

	public ImportantLonelyTweet(String text, Date date) {
		this.tweetDate = date;
		this.tweetBody = text;
	}

}