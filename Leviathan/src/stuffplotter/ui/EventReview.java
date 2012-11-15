/**
 * 
 */
package stuffplotter.ui;


import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.TextArea;

/**
 * @author farez
 * Class for displaying meta information about the event such as comments and ratings
 */
public class EventReview extends HorizontalPanel {

	//public Rating rating = new Rating();
	public HorizontalPanel CommentPanel = new HorizontalPanel();
	public TextArea Comment = new TextArea();
	public Button deleteComment = new Button("Delete");
	
	/**
	 * Helper method to add all the UI widgets together
	 */
	public void addFields() {
		this.add(CommentPanel);
		CommentPanel.add(Comment);
		CommentPanel.add(deleteComment);
	}
	
}
