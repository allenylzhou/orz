package stuffplotter.shared;

import java.util.List;

import stuffplotter.UI.MonthPanel.Month;

/**
 * Class to hold the days selected for an event.
 */
public class MonthContainer
{
	private String year;
	private Month month;
	private List<DayContainer> days;
	
	/**
	 * Constructor for a month object.
	 * @pre month != null && year != null;
	 * @post this.month.equals(month) && this.year.equals(year) &&
	 * 		 this.days.equals(days);
	 * @param month - the month.
	 * @param year - the year of the month.
	 * @param days - the days selected in the month.
	 */
	public MonthContainer(Month month, String year, List<DayContainer> days)
	{
		this.month = month;
		this.year = year;
		this.days = days;
	}
	
	/**
	 * Method to retrieve the year of the month.
	 * @pre true;
	 * @post true;
	 * @return the year of the month.
	 */
	public String getYear()
	{
		return this.year;
	}
	
	/**
	 * Method to retrieve the month. 
	 * @pre true;
	 * @post true;
	 * @return the month.
	 */
	public Month getMonth()
	{
		return this.month;
	}
	
	/**
	 * Method to retrieve the days selected in the month.
	 * @pre true;
	 * @post true;
	 * @return the days selected in the month.
	 */
	public List<DayContainer> getDays()
	{
		return this.days;
	}
}
