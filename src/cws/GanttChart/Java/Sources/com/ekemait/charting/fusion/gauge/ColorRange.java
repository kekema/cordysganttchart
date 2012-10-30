package com.ekemait.charting.fusion.gauge;

/**
 * The angular chart displays the data values on a radial scale. The radial scale is marked by a 
 * lower limit and an upper limit, i.e. the minimum and maximum values that can be plotted on the chart. 
 * Within that scale, you can create various sections to classify your data - each section can have a 
 * different background color, border color etc. to differentiate them from one another. These sections 
 * are called color ranges. There can be any number of color ranges. For each color range, you’ll have 
 * to specify the minimum and maximum values and the hex color code for the range. 
 *
 */
public class ColorRange extends com.raisepartner.chartfusion.api.Node 
{
	public ColorRange() 
	{
		super("colorRange");
	}
	
    public Color createColorNode() 
    {
    	Color node = new Color();
        addNode(node);
        return node;
    }
}