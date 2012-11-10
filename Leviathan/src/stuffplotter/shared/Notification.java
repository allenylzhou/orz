package stuffplotter.shared;

import com.google.gwt.user.client.ui.SimplePanel;

/**
 * Class to hold the information for a user notification.
 */
public abstract class Notification
{
	public enum NotificationType
	{
		FRIENDREQUEST, EVENTINVITATION;
	}
	
	/**
	 * ID of what generated the notification.
	 */
	private Long id;
	private NotificationType type;
	private String notificationFor;
	private String notificationFrom;
	
	/**
	 * Constructor for a Notification.
	 * @pre id >= 0 && type != null && fromUser != null && forUser != null;
	 * @post this.id == id && this.type.equals(type) &&
	 * 		 this.notificationFrom.equals(fromUser) && this.notificationFor.equals(forUser);
	 * @param id - the ID of what generated the notification.
	 * @param type - the type of the notification.
	 * @param fromUser - the user the generated the notification.
	 * @param forUser - the user the notification is for.
	 */
	public Notification(Long id, NotificationType type, String fromUser, String forUser)
	{
		this.id = id;
		this.type = type;
		this.notificationFrom = fromUser;
		this.notificationFor = forUser;
	}
	
	/**
	 * Method to retrieve the ID that generated the notification.
	 * @pre true;
	 * @post true;
	 * @return the ID that generated the notification.
	 */
	public Long getID()
	{
		return this.id;
	}
	
	/**
	 * Method to retrieve the type of the notification.
	 * @pre true;
	 * @post true;
	 * @return the type of the notification.
	 */
	public NotificationType getType()
	{
		return this.type;
	}
	
	/**
	 * Retrieve the name of the user who generated the notification.
	 * @pre true;
	 * @post true;
	 * @return the name of the user who generated the notification.
	 */
	public String getFrom()
	{
		return this.notificationFrom;
	}
	
	/**
	 * Retrieve the name of the user who the notification is for.
	 * @pre true;
	 * @post true;
	 * @return the name of the user who the notification is for.
	 */
	public String getFor()
	{
		return this.notificationFor;
	}
	
	/**
	 * Method to generate the message for the notification.
	 * @pre true;
	 * @post true;
	 * @return the message for the notification.
	 */
	public abstract SimplePanel generateMessage();
}