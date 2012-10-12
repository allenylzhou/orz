package stuffplotter.server;

import java.util.ArrayList;
import java.util.List;

import stuffplotter.client.GreetingService;
import stuffplotter.shared.Event;
import stuffplotter.shared.FieldVerifier;
import com.google.gwt.user.server.rpc.RemoteServiceServlet;

/**
 * The server side implementation of the RPC service.
 */
@SuppressWarnings("serial")
public class GreetingServiceImpl extends RemoteServiceServlet implements
		GreetingService {

	public String greetServer(String input) throws IllegalArgumentException {
		// Verify that the input is valid. 
		if (!FieldVerifier.isValidName(input)) {
			// If the input is not valid, throw an IllegalArgumentException back to
			// the client.
			throw new IllegalArgumentException(
					"Name must be at least 4 characters long");
		}

		String serverInfo = getServletContext().getServerInfo();
		String userAgent = getThreadLocalRequest().getHeader("User-Agent");

		// Escape data from the client to avoid cross-site script vulnerabilities.
		input = escapeHtml(input);
		userAgent = escapeHtml(userAgent);

		// testing Objectify code
		DatabaseStore dataStore = new DatabaseStore();
		dataStore.addEvent(input);
		
		Event retrievedEvent = dataStore.retrieveEvent(input);
		String eventName = "N/A";
		List<String> participants = new ArrayList<String>();
		if(retrievedEvent != null)
		{
			eventName = retrievedEvent.getName();
			participants = retrievedEvent.getParticipants();
		}
		
		return "Hello, " + input + "!<br><br>I am running " + serverInfo
				+ ".<br><br>It looks like you are using:<br>" + userAgent
				+ "<br><br> The event found was: " + eventName + " with: "
				+ participants.size() + " participants.";
	}

	/**
	 * Escape an html string. Escaping data received from the client helps to
	 * prevent cross-site script vulnerabilities.
	 * 
	 * @param html the html string to escape
	 * @return the escaped string
	 */
	private String escapeHtml(String html) {
		if (html == null) {
			return null;
		}
		return html.replaceAll("&", "&amp;").replaceAll("<", "&lt;")
				.replaceAll(">", "&gt;");
	}
}
