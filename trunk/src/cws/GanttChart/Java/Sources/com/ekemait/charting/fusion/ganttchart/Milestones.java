package com.ekemait.charting.fusion.ganttchart;

/**
 * Milestones visually depict any crucial dates on the chart. You can create your own milestones on 
 * the chart based on date and task i.e., for a given task you can specify milestones on specific dates. 
 * You can also add tool text and link for the milestone.
 *
 */
public class Milestones extends com.raisepartner.chartfusion.api.Node 
{
	public Milestones() 
	{
		super("milestones");
	}
	
    public Milestone createMilestoneNode() 
    {
    	Milestone node = new Milestone();
        addNode(node);
        return node;
    }
}