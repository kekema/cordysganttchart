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

import java.util.Date;

import com.ekemait.charting.chart.ganttchart.ChartConfig;
import com.ekemait.charting.chart.ganttchart.GanttChart;
import com.ekemait.charting.fusion.ganttchart.Milestones;
import com.ekemait.charting.fusion.ganttchart.Tasks;
import com.ekemait.charting.util.Util;

/**
 * Class to define an event for a gantt chart. 
 * Event can be 'claim rejected', 'fraud detected', etc.
 * 
 * @author kekema
 * 
 */
public class Event extends Item
{
	// any (internal) planned date (mostly applicable for Milestone only)
	protected Date plannedEventDate;
	// any external planned date (mostly applicable for Milestone only)
	protected Date externalPlannedEventDate;
	// actual date
	protected Date actualEventDate;
	// event is a milestone true/false
	protected boolean isMilestone;
	
	protected Event()
	{
		super();
	}
	
	/**
	 * Set planned date
	 * 
	 * @param plannedEventDate
	 */
	public void setPlannedEventDate(Date plannedEventDate)
	{
		this.plannedEventDate = plannedEventDate;
	}
	
	/**
	 * Get planned date
	 * 
	 * @return
	 */
	public Date getPlannedEventDate()
	{
		return (this.plannedEventDate);
	}
	
	/**
	 * Set external planned date
	 * @param externalPlannedEventDate
	 */
	public void setExternalPlannedEventDate(Date externalPlannedEventDate)
	{
		this.externalPlannedEventDate = externalPlannedEventDate;
	}
	
	/**
	 * Get external planned date
	 * @return
	 */
	public Date getExternalPlannedEventDate()
	{
		return (this.externalPlannedEventDate);
	}
	
	/**
	 * Set actual date
	 * 
	 * @param actualEventDate
	 */
	public void setActualEventDate(Date actualEventDate)
	{
		this.actualEventDate = actualEventDate;
	}
	
	/**
	 * Get actual date
	 * 
	 * @return
	 */
	public Date getActualEventDate()
	{
		return (this.actualEventDate);
	}
	
	/**
	 * Add event to the given fusion chart
	 */
	@Override
	public void addToFusionGanttChart(com.ekemait.charting.fusion.ganttchart.GanttChart fcGanttChart, Tasks fcTasks, Milestones fcMilestones, int rowNumber, int itemNumber)
	{
		boolean plannedEvent =  ((plannedEventDate != null) || (externalPlannedEventDate != null));
		boolean actualEvent = (actualEventDate != null);
		if (plannedEvent || actualEvent)
		{
			boolean duo = (plannedEvent && actualEvent);
			if (plannedEvent)
			{
				if (plannedEventDate != null)
				{
					createFusionMilestoneNode(fcGanttChart, fcTasks, fcMilestones, rowNumber, itemNumber, true, false, duo);
				}
				if (externalPlannedEventDate != null)
				{
					createFusionMilestoneNode(fcGanttChart, fcTasks, fcMilestones, rowNumber, itemNumber, true, true, duo);
				}
			}
			if (actualEvent)
			{
				createFusionMilestoneNode(fcGanttChart, fcTasks, fcMilestones, rowNumber, itemNumber, false, false, duo);
			}
		}
	}
	
	private void createFusionMilestoneNode(com.ekemait.charting.fusion.ganttchart.GanttChart fcGanttChart, Tasks fcTasks, Milestones fcMilestones, int rowNumber, int itemNumber, boolean planned, boolean external, boolean duo)
	{
		// create dummy task as place holder to be able to link the milestone
		com.ekemait.charting.fusion.ganttchart.Task fcTask = fcTasks.createTaskNode();
		String taskId = String.valueOf(rowNumber) + "-" + String.valueOf(itemNumber);
		if (duo)
		{
			if (planned)
			{
				if (external)
				{
					taskId = taskId + "E";
				}
				taskId = taskId + "P";
			}
			else
			{
				taskId = taskId + "A";
			}
		}
		fcTask.setId(taskId);
		fcTask.setProcessId(String.valueOf(rowNumber));
		Date eventDate;
		if (planned)
		{
			if (external)
			{
				eventDate = externalPlannedEventDate;
			}
			else
			{
				eventDate = plannedEventDate;
			}
		}
		else
		{
			eventDate = actualEventDate;
		}
		String eventFormattedDate = Util.formatDate(eventDate, GanttChart.FC_INPUTDATE_JAVAFORMAT);
		fcTask.setStart(eventFormattedDate);
		fcTask.setEnd(eventFormattedDate);
		fcTask.setShowBorder("0");
		if (duo)
		{
			fcTask.setHeight("25%");
			if (planned)
			{
				fcTask.setTopPadding("22%");
			}
			else
			{
				fcTask.setTopPadding("53%");
			}
		}
		
		com.ekemait.charting.fusion.ganttchart.Milestone fcMilestone = fcMilestones.createMilestoneNode();
		fcMilestone.setDate(Util.formatDate(eventDate, GanttChart.FC_INPUTDATE_JAVAFORMAT));
		fcMilestone.setTaskId(taskId);
		if (isMilestone)
		{
			fcMilestone.setShape("polygon");
			fcMilestone.setNumSides("3");
			fcMilestone.setStartAngle("270");
			if (planned)
			{
				if (external)
				{
					fcMilestone.setColor(ChartConfig.getValue("plannedExternalMilestoneColor"));
					fcMilestone.setAlpha(ChartConfig.getValue("plannedExternalMilestoneAlpha"));
				}
				else
				{
					fcMilestone.setColor(ChartConfig.getValue("plannedMilestoneColor"));
				}
				fcMilestone.setBorderColor(ChartConfig.getValue("plannedMilestoneBorderColor"));
			}
		}
		else
		{
			fcMilestone.setShape("polygon");
			fcMilestone.setNumSides("4");
			fcMilestone.setRadius("6");
		}
		String toolText = description;
		eventFormattedDate = Util.formatDate(eventDate, GanttChart.FC_OUTPUTDATE_JAVAFORMAT);
		if (isMilestone)
		{
			if (planned)
			{
				if (external)
				{
					toolText = toolText + " (external planned milestone), " + eventFormattedDate;
				}
				else
				{
					toolText = toolText + " (internal planned milestone), " + eventFormattedDate;
				}
			}
			else
			{
				toolText = toolText + " (actual milestone), " + eventFormattedDate;
			}
		}
		else
		{
			toolText = toolText + ", " + eventFormattedDate;
		}
		fcMilestone.setToolText(toolText);
	}
}