package com.ekemait.charting.fusion.ganttchart;

/**
 * All the processes for the chart are grouped under the <processes> element. 
 * Each process is represented by an individual <process> element. 
 *
 */
public class Processes extends com.raisepartner.chartfusion.api.Node 
{
	
	public final static String PARAMETER_FONTSIZE = "fondSize";
	public final static String PARAMETER_ISBOLD = "isBold";
	public final static String PARAMETER_ALIGN = "align";
	public final static String PARAMETER_HEADERTEXT = "headerText";
	public final static String PARAMETER_HEADERFONTSIZE = "headerFontSize";
	public final static String PARAMETER_HEADERVALIGN = "headerVAlign";
	public final static String PARAMETER_HEADERALIGN = "headerAlign";
	
	public Processes() 
	{
		super("processes");
	}
	
	/**
	 * Type: Number 
	 * 
	 * Font size for process name.
	 */
	public void setFontSize(String value) 
	{
		setAttribute(PARAMETER_FONTSIZE, value);
	}
	
	/**
	 * Type: Boolean (0/1)
	 * 
	 * Whether to show process names in bold. 
	 */
	public void setIsBold(String value) 
	{
		setAttribute(PARAMETER_ISBOLD, value);
	}
	
	/**
	 * Value: left, center or right
	 * 
	 * Horizontal alignment for all process names.
	 */
	public void setAlign(String value) 
	{
		setAttribute(PARAMETER_ALIGN, value);
	}
	
	/**
	 * Type: String
	 * 
	 * Header label for the processes column in data table. 
	 */
	public void setHeaderText(String value) 
	{
		setAttribute(PARAMETER_HEADERTEXT, value);
	}
	
	/**
	 * Type: Number
	 * 
	 * Font size for the process header. 
	 */
	public void setHeaderFontSize(String value) 
	{
		setAttribute(PARAMETER_HEADERFONTSIZE, value);
	}
	
	/**
	 * Value: top, middle or bottom 
	 * 
	 * Vertical alignment position of the header label. 
	 */
	public void setHeaderVAlign(String value) 
	{
		setAttribute(PARAMETER_HEADERVALIGN, value);
	}
	
	/**
	 * Value: left, center or right 
	 * 
	 * Horizontal alignment position of the header label. 
	 */
	public void setHeaderAlign(String value) 
	{
		setAttribute(PARAMETER_HEADERALIGN, value);
	}
	
    public Process createProcessNode() 
    {
        Process node = new Process();
        addNode(node);
        return node;
    }
}