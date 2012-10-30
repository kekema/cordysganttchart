package com.ekemait.charting.fusion.ganttchart;

/**
 * Each <categories> element represents one visual timeline on the chart. 
 * The timeline divisions are controlled by child <category> elements of <categories> element. 
 *
 */
public class Categories extends com.raisepartner.chartfusion.api.Node 
{
	public Categories() 
	{
		super("categories");
	}
	
    public Category createCategoryNode() 
    {
        Category node = new Category();
        addNode(node);
        return node;
    }
}