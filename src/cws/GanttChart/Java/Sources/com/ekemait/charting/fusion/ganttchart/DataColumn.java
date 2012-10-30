package com.ekemait.charting.fusion.ganttchart;

/**
 * Each <datacolumn> element adds a column to the chart's data grid. 
 *
 */
public class DataColumn extends com.raisepartner.chartfusion.api.Node 
{
	public final static String PARAMETER_HEADERTEXT = "headerText";
	public final static String PARAMETER_HEADERALIGN = "headerAlign";
	public final static String PARAMETER_ALIGN = "align";
	
	
	public DataColumn() 
	{
		super("datacolumn");
	}
	
    public Text createTextNode()
    {
    	Text node = new Text();
        addNode(node);
        return node;
    }
    
	/**
	 * Type: String 
	 * 
	 * Label for the header. 
	 */
	public void setHeaderText(String value) 
	{
		setAttribute(PARAMETER_HEADERTEXT, value);
	}
	
	/**
	 * Type: String - left, center or right 
	 * 
	 * Horizontal alignment position for the column header. 
	 */
	public void setHeaderAlign(String value) 
	{
		setAttribute(PARAMETER_HEADERALIGN, value);
	}
	
	/**
	 * Type: String - left, center or right 
	 * 
	 * Horizontal alignment position for all the cells in this data column.
	 */
	public void setAlign(String value) 
	{
		setAttribute(PARAMETER_ALIGN, value);
	}
}