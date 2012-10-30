package com.ekemait.charting.fusion.ganttchart;

/**
 * Each <text> element, child of <datacolumn> element, represents a single cell in the data column.
 *
 */
public class Text extends com.raisepartner.chartfusion.api.Node 
{
	public final static String PARAMETER_LABEL = "label";
	
	public Text() 
	{
		super("text");
	}
	
	/**
	 * Type: String 
	 * 
	 * String label to be displayed in the cell. 
	 */
	public void setLabel(String value) 
	{
		setAttribute(PARAMETER_LABEL, value);
	}
}