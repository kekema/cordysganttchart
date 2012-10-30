package com.ekemait.charting.fusion.ganttchart;

/**
 * The <tasks> element groups all the tasks that we've to show in the chart. 
 * Each task is represented by a <task> element which is a child of <tasks> element. 
 *
 */
public class Tasks extends com.raisepartner.chartfusion.api.Node 
{
	public Tasks() 
	{
		super("tasks");
	}
	
    public Task createTaskNode() 
    {
        Task node = new Task();
        addNode(node);
        return node;
    }
}