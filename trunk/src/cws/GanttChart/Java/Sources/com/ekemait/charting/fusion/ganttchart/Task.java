package com.ekemait.charting.fusion.ganttchart;

/**
 * Each task element represents a task bar on the chart 
 * 
 */
public class Task extends com.raisepartner.chartfusion.api.Node
{
	public final static String PARAMETER_ID = "id";
	public final static String PARAMETER_START = "start";
	public final static String PARAMETER_END = "end";
	public final static String PARAMETER_LABEL = "label";
	public final static String PARAMETER_SHOWASGROUP = "showAsGroup";
	public final static String PARAMETER_SHOWLABEL = "showLabel";
	public final static String PARAMETER_PROCESSID = "processId";
	public final static String PARAMETER_HEIGHT = "height";
	public final static String PARAMETER_TOPPADDING = "topPadding";
	public final static String PARAMETER_COLOR = "color";
	public final static String PARAMETER_SHOWBORDER = "showBorder";
	
	public Task() 
	{
		super("task");
	}
	
	/**
	 * Type: String 
	 * 
	 * Each task can have its own unique ID. It is used for linking connectors and milestones. 
	 */
	public void setId(String value) 
	{
		setAttribute(PARAMETER_ID, value);
	}
	
	/**
	 * Type: String 
	 * 
	 * String label for the task. 
	 */
	public void setLabel(String value) 
	{
		setAttribute(PARAMETER_LABEL, value);
	}
	
	/**
	 * Type: Date 
	 * 
	 * Start date for the task in the date format specified in XML. 
	 */
	public void setStart(String value) 
	{
		setAttribute(PARAMETER_START, value);
	}
	
	/**
	 * Type: Date 
	 * 
	 * End date for the task in the date format specified in XML. 
	 */
	public void setEnd(String value) 
	{
		setAttribute(PARAMETER_END, value);
	}
	
	/**
	 * Type: Boolean (0/1)  
	 * 
	 * Whether to render the task bar visually as a group. 
	 */
	public void setShowAsGroup(String value) 
	{
		setAttribute(PARAMETER_SHOWASGROUP, value);
	}
	
	/**
	 * Type: Boolean (0/1)  
	 * 
	 * Whether to show the label for this task bar. 
	 */
	public void setShowLabel(String value) 
	{
		setAttribute(PARAMETER_SHOWLABEL, value);
	}
	
	/**
	 * Type: String 
	 * 
	 * You can relate each task to its process using the process ID, which can be specified here. 
	 */
	public void setProcessId(String value) 
	{
		setAttribute(PARAMETER_PROCESSID, value);
	}
	
	/**
	 * Type: String 
	 * 
	 * Height for the task bar either in pixels (e.g., 30 or 25) or in percent (e.g., 25% or 50%).
	 */
	public void setHeight(String value) 
	{
		setAttribute(PARAMETER_HEIGHT, value); 
	}
	
	/**
	 * Type: String 
	 * 
	 * Padding required at the top of the task bar either in pixels or in percent. 
	 */
	public void setTopPadding(String value) 
	{
		setAttribute(PARAMETER_TOPPADDING, value);
	}
	
	/**
	 * Type: Color Code 
	 * 
	 * Fill color for the task bar. This color is manipulated by the task fill gradient formula to attain the required gradient.
	 */
	public void setColor(String value) 
	{
		setAttribute(PARAMETER_COLOR, value);
	}
	
	/**
	 * Type: Boolean (0/1)  
	 * 
	 * Whether to show border for the task bar. 
	 */
	public void setShowBorder(String value) 
	{
		setAttribute(PARAMETER_SHOWBORDER, value);
	}
	
}