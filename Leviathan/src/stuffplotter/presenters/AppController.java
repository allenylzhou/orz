package stuffplotter.presenters;

import stuffplotter.client.services.ServiceRepository;
import stuffplotter.presenters.ApplicationPagingPresenter.MainView;
import stuffplotter.presenters.MenuBarPresenter.MenuBarView;
import stuffplotter.presenters.TopBarPresenter.TopBarView;

import com.google.gwt.event.shared.HandlerManager;
import com.google.gwt.user.client.ui.HasWidgets;

public class AppController implements Presenter
{
	public interface MasterViewer
	{
		public TopBarView getTopPanel();
		public MenuBarView getMenuPanel();
		public MainView getMainView();
	}
	
	private final HandlerManager eventBus;
	private final ServiceRepository serviceRepo;
	private HasWidgets masterView;
	
	/**
	 * Constructor for the AppController.
	 * @pre serviceRepository != null && eventBus != null;
	 * @post true;
	 * @param serviceRepository - a repository containing all the asynchronous services.
	 * @param eventBus - the HandlerManager to help components signal other components.
	 */
	public AppController(ServiceRepository serviceRepository, HandlerManager eventBus)
	{
		this.serviceRepo = serviceRepository;
		this.eventBus = eventBus;
	}
	
	/**
	 * Add handlers to objects.
	 * @pre true;
	 * @post true;
	 */
	private void bind()
	{
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void go(HasWidgets container)
	{
		this.masterView = container;
	}
}