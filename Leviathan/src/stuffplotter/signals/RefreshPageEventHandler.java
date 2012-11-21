package stuffplotter.signals;

import com.google.gwt.event.shared.EventHandler;

/**
 * Interface for handling RefreshPageEvents.
 */
public interface RefreshPageEventHandler extends EventHandler
{
	public void onRefreshPage(RefreshPageEvent event);
}