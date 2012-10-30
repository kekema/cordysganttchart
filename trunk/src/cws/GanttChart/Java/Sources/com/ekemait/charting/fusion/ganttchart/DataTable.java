package com.ekemait.charting.fusion.ganttchart;

/**
 * The <datatable> element lets you add your own data to the data-grid of the chart. 
 *
 */
public class DataTable extends com.raisepartner.chartfusion.api.Node 
{
	public final static String PARAMETER_HEADERALIGN = "headerAlign";
	public final static String PARAMETER_HEADERVALIGN = "headerVAlign";
	
	public DataTable() 
	{
		super("datatable");
	}
	
	/**
	 * Type: String - left, center or right 
	 * 
	 * Horizontal alignment position for all column headers in the data table. 
	 */
	public void setHeaderAlign(String value) 
	{
		setAttribute(PARAMETER_HEADERALIGN, value);
	}
	
	/**
	 * Type: String - top, middle or bottom 
	 * 
	 * Vertical alignment position for all column headers in the data table.
	 */
	public void setHeaderVAlign(String value) 
	{
		setAttribute(PARAMETER_HEADERVALIGN, value);
	}
	
    public DataColumn createDataColumnNode()
    {
    	DataColumn node = new DataColumn();
        addNode(node);
        return node;
    }
}