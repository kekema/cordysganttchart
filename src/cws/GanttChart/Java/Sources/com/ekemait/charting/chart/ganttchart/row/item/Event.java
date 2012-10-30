package com.ekemait.charting.chart.ganttchart.row.item;

import java.util.Date;

import com.ekemait.charting.chart.ganttchart.GanttChart;
import com.ekemait.charting.fusion.ganttchart.Milestones;
import com.ekemait.charting.fusion.ganttchart.Tasks;
import com.ekemait.charting.util.Util;

public class Event extends Item
{
	protected Date plannedEventDate;
	protected Date externalPlannedEventDate;
	protected Date actualEventDate;
	protected boolean isMilestone;
	
	protected Event()
	{
		super();
	}
	
	public void setPlannedEventDate(Date plannedEventDate)
	{
		this.plannedEventDate = plannedEventDate;
	}
	
	public Date getPlannedEventDate()
	{
		return (this.plannedEventDate);
	}
	
	public void setExternalPlannedEventDate(Date externalPlannedEventDate)
	{
		this.externalPlannedEventDate = externalPlannedEventDate;
	}
	
	public Date getExternalPlannedEventDate()
	{
		return (this.externalPlannedEventDate);
	}
	
	public void setActualEventDate(Date actualEventDate)
	{
		this.actualEventDate = actualEventDate;
	}
	
	public Date getActualEventDate()
	{
		return (this.actualEventDate);
	}
	
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
					fcMilestone.setColor("017BBE");
					fcMilestone.setAlpha("70");
				}
				else
				{
					fcMilestone.setColor("FFFFFF");
				}
				fcMilestone.setBorderColor("575757");
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