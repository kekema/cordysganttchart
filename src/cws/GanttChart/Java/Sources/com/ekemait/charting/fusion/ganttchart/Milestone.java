package com.ekemait.charting.fusion.ganttchart;

/**
 * Milestones visually depict any crucial dates on the chart. You can create your own milestones on 
 * the chart based on date and task i.e., for a given task you can specify milestones on specific dates. 
 * You can also add tool text and link for the milestone.
 *
 */
public class Milestone extends com.raisepartner.chartfusion.api.Node
{
	public final static String PARAMETER_DATE = "date";
	public final static String PARAMETER_TASKID = "taskId";
	public final static String PARAMETER_SHAPE = "shape";
	public final static String PARAMETER_TOOLTEXT = "toolText";
	public final static String PARAMETER_NUMSIDES = "numSides";
	public final static String PARAMETER_STARTANGLE = "startAngle";
	public final static String PARAMETER_RADIUS = "radius";
	public final static String PARAMETER_COLOR = "color";
	public final static String PARAMETER_ALPHA = "alpha";
	public final static String PARAMETER_BORDERCOLOR = "borderColor";
	public final static String PARAMETER_BORDERTHICKNESS = "borderThickness";
	
	public Milestone() 
	{
		super("milestone");
	}
	
	/**
	 * Type: Date 
	 * 
	 * Date for the milestone in the specified date format. 
	 */
	public void setDate(String value) 
	{
		setAttribute(PARAMETER_DATE, value);
	}
	
	/**
	 * Type: String
	 * 
	 * ID of the task to which this milestone relates to. You must define task IDs before you can use milestones. 
	 */
	public void setTaskId(String value) 
	{
		setAttribute(PARAMETER_TASKID, value);
	}
	
	/**
	 * Type: String (star/polygon)
	 * 
	 * Shape of the milestone .
	 */
	public void setShape(String value) 
	{
		setAttribute(PARAMETER_SHAPE, value);
	}
	
	/**
	 * Type: String
	 * 
	 * Each milestone can have its own tool text, which you can specify here. 
	 */
	public void setToolText(String value) 
	{
		setAttribute(PARAMETER_TOOLTEXT, value);
	}
	
	/**
	 * Type: number (3-15)
	 * 
	 * Number of sides that the milestone should have. 
	 */
	public void setNumSides(String value) 
	{
		setAttribute(PARAMETER_NUMSIDES, value);
	}
	
	/**
	 * Type: number (0-360)
	 * 
	 * Starting angle for the star/polygon. 
	 */
	public void setStartAngle(String value) 
	{
		setAttribute(PARAMETER_STARTANGLE, value);
	}
	
	/**
	 * Type: number (2-15)
	 * 
	 * Radius for the milestone (in pixels).  
	 */
	public void setRadius(String value) 
	{
		setAttribute(PARAMETER_RADIUS, value);
	}
	
	/**
	 * Type: color code
	 * 
	 * Color for the milestone. 
	 */
	public void setColor(String value) 
	{
		setAttribute(PARAMETER_COLOR, value);
	}
	
	/**
	 * Type: Number (0-100) 
	 * 
	 * Alpha for the milestone. 
	 */
	public void setAlpha(String value) 
	{
		setAttribute(PARAMETER_ALPHA, value);
	}
	
	/**
	 * Type: color code
	 * 
	 * Border color for the milestone.
	 */
	public void setBorderColor(String value) 
	{
		setAttribute(PARAMETER_BORDERCOLOR, value);
	}
	
	/**
	 * Type: Number
	 * 
	 * Border thickness for the milestone. 
	 */
	public void setBorderThickness(String value) 
	{
		setAttribute(PARAMETER_BORDERTHICKNESS, value);
	}
}