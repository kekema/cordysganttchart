package com.ekemait.charting.chart.ganttchart.row.item;

import java.util.ArrayList;
import java.util.List;

import com.ekemait.charting.fusion.ganttchart.Milestones;
import com.ekemait.charting.fusion.ganttchart.Tasks;

public class Items
{
	private final List<Item> itemChildren = new ArrayList<Item>();
	
	public Task createTask()
	{
		Task task = new Task();
		itemChildren.add(task);
		return task;
	}
	
	public Event createEvent()
	{
		Event event = new Event();
		itemChildren.add(event);
		return event;
	}
	
	public Milestone createMilestone()
	{
		Milestone milestone = new Milestone();
		itemChildren.add(milestone);
		return milestone;
	}
	
	public String getFirstItemDescription()
	{
		String result = null;
		if (!itemChildren.isEmpty())
		{
			Item item = itemChildren.get(0);
			if (item != null)
			{
				result = item.getDescription();
			}
		}
		return result;
	}
	
	public void addToFusionGanttChart(com.ekemait.charting.fusion.ganttchart.GanttChart fcGanttChart, Tasks fcTasks, Milestones fcMilestones, int rowNumber)
	{
		int itemNumber = 0;
		for (Item item : itemChildren)
		{
			itemNumber++;
			item.addToFusionGanttChart(fcGanttChart, fcTasks, fcMilestones, rowNumber, itemNumber);
		}
	}
}