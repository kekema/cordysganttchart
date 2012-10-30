package com.ekemait.charting.fusion.gauge;


/**
 * Trendpoints can be used to indicate target values, historical value, average value, etc.
 *
 */
public class Trendpoints extends com.raisepartner.chartfusion.api.Node 
{
	public Trendpoints() 
	{
		super("trendpoints");
	}
	
    public Point createPointNode() 
    {
    	Point node = new Point();
        addNode(node);
        return node;
    }
}