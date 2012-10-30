package com.ekemait.charting.fusion.ganttchart;

/**
 * Using the <trendLines> element (and children <line> elements), you can define trend lines on the chart.
 * Trend lines are horizontal lines spanning the chart canvas which aid in interpretation of data with respect to 
 * some pre-determined value. For example, if you are plotting sales data of current year, you might want to add previous 
 * year's average monthly sales as trend indicator for ease of comparison.
 *
 */
public class Trendlines extends com.raisepartner.chartfusion.api.Node 
{
	public Trendlines() 
	{
		super("trendlines"); // TODO: or trendLines?
	}
	
    public Line createLineNode() 
    {
    	Line node = new Line();
        addNode(node);
        return node;
    }
}