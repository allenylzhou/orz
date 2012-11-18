package stuffplotter.presenters;

import java.util.List;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.HasClickHandlers;
import com.google.gwt.user.client.ui.HasWidgets;

import stuffplotter.shared.Event;

/**
 * Class for the Events Page presenter.
 */
public class EventsPagePresenter implements Presenter
{
	public interface EventsView
	{
		public HasClickHandlers getCreateEventBtn();
		public HasClickHandlers getCurrentEventsBtn();
		public HasClickHandlers getPastEventsBtn();
		public void setDisplay(List<Event> toDisplay);
		public Long getClickedId(ClickEvent event);
		//public EventList getEventList(); // create presenter for this 
	}
	
	private void bind()
	{
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void go(HasWidgets container)
	{
		// TODO Auto-generated method stub
		
	}

}
