/**
 * A program to carry on conversations with a human user. This is the initial
 * version that:
 * <ul>
 * <li>
 * Uses indexOf to find strings</li>
 * <li>
 * Handles responding to simple words and phrases</li>
 * </ul>
 * This version uses a nested if to handle default responses.
 * 
 * @author Laurie White
 * @version April 2012
 */
public class Magpie2 {
	/**
	 * Get a default greeting
	 * 
	 * @return a greeting
	 */
	public String getGreeting() {
		return "Hello, let's talk.";
	}
	/**
	 * Gives a response to a user statement
	 * 
	 * @param statement
	 *            the user statement
	 * @return a response based on the rules given
	 */
	public String getResponse(String statement) {
		String response = "";
		if (statement.indexOf("Yes") >= 0) {
			response = "Why so happy?";
		} else if (statement.indexOf("Mother") >= 0
				|| statement.indexOf("Father") >= 0
				|| statement.indexOf("sister") >= 0
				|| statement.indexOf("brother") >= 0) {
			response = "Tell me more about your faimly.";
		} else {
			response = getRandomResponse();
		}
		return response;
	}
	
	public String getResponse2(String statement) {
		String response = "";
		if (statement.indexOf("No") >= 0) {
			response = "Lets talk please?";
		} else if (statement.indexOf("dog") >= 0
				|| statement.indexOf("cat") >= 0)
				 {
			response = "Tell me more about your pets.";
		} else {
			response = getRandomResponse();
		}
		return response;
	}
	
	
	public String getResponse3(String statement) {
		String response = "";
		if (statement.indexOf("Hi") >= 0) {
			response = "Whats up";
		} else if (statement.indexOf("Hanging out") >= 0
				|| statement.indexOf("Friend") >= 0)
				 {
			response = "What are their names?";
		} else {
			response = getRandomResponse();
		}
		return response;
	}

	/**
	 * Pick a default response to use if nothing else fits.
	 * 
	 * @return a non-committal string
	 */
	private String getRandomResponse() {
		final int NUMBER_OF_RESPONSES = 4;
		double r = Math.random();
		int whichResponse = (int) (r * NUMBER_OF_RESPONSES);
		String response = "";

		if (whichResponse == 0) {
			response = "Nice.";
		} else if (whichResponse == 1) {
			response = "Whats up.";
		} else if (whichResponse == 2) {
			response = "Why so happy";
		} else if (whichResponse == 3) {
			response = "Whats up";
		}

		return response;
	}
}
