package stuffplotter.views;

import com.google.gwt.user.client.ui.VerticalPanel;

import stuffplotter.presenters.AppController.MasterViewer;
import stuffplotter.presenters.ApplicationPagingPresenter.MainView;
import stuffplotter.presenters.MenuBarPresenter.MenuBarView;
import stuffplotter.presenters.TopBarPresenter.TopBarView;
import stuffplotter.views.global.MenuBarPanel;
import stuffplotter.views.global.TopBarPanel;

public class MasterView extends VerticalPanel implements MasterViewer
{
	private TopBarPanel topBarPanel;
	private MenuBarPanel menuBarPanel;
	private ApplicationPagingView mainPagingPanel;
	
	/**
	 * Constructor for the MasterView.
	 * @pre true;
	 * @post this.isVisible() == true;
	 */
	public MasterView()
	{
		super();
		this.initializeUI();
	}
	
	/**
	 * Helper method to initialize the UI and add it to the panel.
	 * @pre true;
	 * @post true;
	 */
	private void initializeUI()
	{
		this.topBarPanel = new TopBarPanel();
		this.menuBarPanel = new MenuBarPanel();
		this.mainPagingPanel = new ApplicationPagingView();
		this.add(topBarPanel);
		this.add(menuBarPanel);
		this.add(mainPagingPanel);
	}
	
	@Override
	public TopBarView getTopPanel()
	{
		return this.topBarPanel;
	}

	@Override
	public MenuBarView getMenuPanel()
	{
		return this.menuBarPanel;
	}

	@Override
	public MainView getMainPanel()
	{
		return this.mainPagingPanel;
	}
}
