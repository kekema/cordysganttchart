/*  
 *	Copyright 2012 Ekema IT   
 * 
 *  This file is part of Gantt Chart Java API   
 *   
 *  Licensed under the Apache License, Version 2.0 (the "License");  
 *  you may not use this file except in compliance with the License.  
 *  You may obtain a copy of the License at  
 *  
 *  http://www.apache.org/licenses/LICENSE-2.0  
 *  
 *  Unless required by applicable law or agreed to in writing, software  
 *  distributed under the License is distributed on an "AS IS" BASIS,  
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.  
 *  See the License for the specific language governing permissions and  
 *  limitations under the License. 
 */ 

package com.ekemait.charting.chart.ganttchart.row.item;

import java.util.ArrayList;
import java.util.List;

import com.ekemait.charting.fusion.ganttchart.Milestones;
import com.ekemait.charting.fusion.ganttchart.Tasks;

/**
 * Container class for row items
 * 
 * @author kekema
 * 
 */
public class Items
{
	private final List<Item> itemChildren = new ArrayList<Item>();
	
	/**
	 * Add a task item
	 * 
	 * @return
	 */
	public Task createTask()
	{
		Task task = new Task();
		itemChildren.add(task);
		return task;
	}
	
	/**
	 * Add an event item
	 * 
	 * @return
	 */
	public Event createEvent()
	{
		Event event = new Event();
		itemChildren.add(event);
		return event;
	}
	
	/**
	 * Add a milestone item
	 * 
	 * @return
	 */
	public Milestone createMilestone()
	{
		Milestone milestone = new Milestone();
		itemChildren.add(milestone);
		return milestone;
	}
	
	/**
	 * Get first item description which can be used for the row description in 
	 * case the row has no description defined.
	 * 
	 * @return
	 */
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
	
	/**
	 * Add all row items to the given fusion chart
	 * 
	 * @param fcGanttChart
	 * @param fcTasks
	 * @param fcMilestones
	 * @param rowNumber
	 */
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