package stuffplotter.shared;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Id;

import com.google.gwt.user.client.ui.SimplePanel;

/**
 * Class to hold the information for a user notification.
 */
public abstract class Notification implements Serializable
{
	public enum NotificationType
	{
		FRIENDREQUEST, EVENTINVITATION, ACHIEVEMENTGET;
	}

	/**
	 * ID of what generated the notification.
	 */
	@Id private Long notificationId;
	private NotificationType type;
	private String notificationFor;
	private String notificationFrom;
	private boolean newNotification = true;
	private Date notificationTime;
	
	protected String notificationDisplay;
	
	
	public Notification()
	{
		setNotificationTime(new Date());
		this.setNotificationDisplay("");
	}
	/**
	 * Constructor for a Notification.
	 * @pre id >= 0 && type != null && fromUser != null && forUser != null;
	 * @post this.id == id && this.type.equals(type) &&
	 * this.notificationFrom.equals(fromUser) && this.notificationFor.equals(forUser);
	 * @param id - the ID of what generated the notification.
	 * @param type - the type of the notification.
	 * @param from - the user the generated the notification.
	 * @param forUser - the user the notification is for.
	 */
	public Notification(NotificationType type, String foruser, String from)
	{
		this.type = type;
		this.notificationFrom = from;
		this.notificationFor = foruser;
		this.setNotificationTime(new Date());
		this.setNotificationDisplay("");
	}

	
	public Long getNotificationId(){
		return this.notificationId;
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
	public String getNotificationDisplay()
	{
		return notificationDisplay;
	}
	public void setNotificationDisplay(String notificationDisplay)
	{
		this.notificationDisplay = notificationDisplay;
	}
	
	public void setNewNotification(boolean bool)
	{
		this.newNotification = bool;
	}
	public Date getNotificationTime()
	{
		return notificationTime;
	}
	public void setNotificationTime(Date notificationTime)
	{
		this.notificationTime = notificationTime;
	}

}