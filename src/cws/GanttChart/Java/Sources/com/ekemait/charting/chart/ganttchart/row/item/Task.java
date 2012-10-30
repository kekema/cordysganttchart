package com.ekemait.charting.chart.ganttchart.row.item;

import java.util.Date;

import com.ekemait.charting.chart.ganttchart.GanttChart;
import com.ekemait.charting.fusion.ganttchart.Milestones;
import com.ekemait.charting.fusion.ganttchart.Tasks;
import com.ekemait.charting.util.Util;

public class Task extends Item
{
	private boolean isSummaryTask;
	private Date plannedStartDate;
	private Date plannedEndDate;
	private Date actualStartDate;
	private Date actualEndDate;
	
	protected Task()
	{
		super();
	}
	
	public void setIsSummaryTask(boolean isSummaryTask)
	{
		this.isSummaryTask = isSummaryTask;
	}
	
	public boolean getIsSummaryTask()
	{
		return (this.isSummaryTask);
	}
	
	public void setPlannedStartDate(Date plannedStartDate)
	{
		this.plannedStartDate = plannedStartDate;
	}
	
	public Date getPlannedStartDate()
	{
		return (this.plannedStartDate);
	}
	
	public void setPlannedEndDate(Date plannedEndDate)
	{
		this.plannedEndDate = plannedEndDate;
	}
	
	public Date getPlannedEndDate()
	{
		return (this.plannedEndDate);
	}
	
	public void setActualStartDate(Date actualStartDate)
	{
		this.actualStartDate = actualStartDate;
	}
	
	public Date getActualStartDate()
	{
		return (this.actualStartDate);
	}
	
	public void setActualEndDate(Date actualEndDate)
	{
		this.actualEndDate = actualEndDate;
	}
	
	public Date getActualEndDate()
	{
		return (this.actualEndDate);
	}
	
	@Override
	public void addToFusionGanttChart(com.ekemait.charting.fusion.ganttchart.GanttChart fcGanttChart, Tasks fcTasks, Milestones fcMilestones, int rowNumber, int itemNumber)
	{
		boolean plannedTask = ((plannedStartDate != null) || (plannedEndDate != null));
		boolean dueDateMilestone = ((plannedStartDate == null) && (plannedEndDate != null));
		boolean actualTask = ((actualStartDate != null) || (actualEndDate != null));
		if (plannedTask || actualTask)
		{
			boolean duo = (plannedTask && actualTask);
			if (plannedTask)
			{
				createFusionTaskNode(fcGanttChart, fcTasks, fcMilestones, rowNumber, itemNumber, true, duo, dueDateMilestone);
			}
			if (actualTask)
			{
				createFusionTaskNode(fcGanttChart, fcTasks, fcMilestones, rowNumber, itemNumber, false, duo, dueDateMilestone);
			}
		}
	}
	
	private void createFusionTaskNode(com.ekemait.charting.fusion.ganttchart.GanttChart fcGanttChart, Tasks fcTasks, Milestones fcMilestones, int rowNumber, int itemNumber, boolean planned, boolean duo, boolean dueDateMilestone)
	{
		com.ekemait.charting.fusion.ganttchart.Task fcTask = fcTasks.createTaskNode();
		String taskId = String.valueOf(rowNumber) + "-" + String.valueOf(itemNumber);
		if (duo)
		{
			if (planned)
			{
				taskId = taskId + "P";
			}
			else
			{
				taskId = taskId + "A";
			}
		}
		fcTask.setId(taskId);
		fcTask.setProcessId(String.valueOf(rowNumber));
		Date startDate;
		Date endDate;
		if (planned)
		{
			startDate = plannedStartDate;
			endDate = plannedEndDate;
		}
		else
		{
			startDate = actualStartDate;
			endDate = actualEndDate;
		}
		if (startDate == null)
		{
			startDate = endDate;
		}
		else if ((endDate == null) || (endDate.getTime() < startDate.getTime()))
		{
			endDate = startDate;
		}
		fcTask.setStart(Util.formatDate(startDate, GanttChart.FC_INPUTDATE_JAVAFORMAT));
		fcTask.setEnd(Util.formatDate(endDate, GanttChart.FC_INPUTDATE_JAVAFORMAT));
		fcTask.setLabel(description);
		fcTask.setShowLabel("0");
		if (isSummaryTask)
		{
			fcTask.setShowAsGroup("1");
			fcTask.setTopPadding("25%");
			fcTask.setHeight("60%");
			fcTask.setColor("017BBE");
		}
		else
		{
			fcTask.setColor("D5F0FF");
		}
		if (duo)
		{
			if (!dueDateMilestone)
			{
				fcTask.setHeight("25%");
				if (planned)
				{
					fcTask.setTopPadding("15%");
				}
				else
				{
					fcTask.setTopPadding("60%");
				}
			}
			else
			{
				if (planned)
				{
					// draw a small milestone to depict the due date
					fcTask.setTopPadding("5%");
					fcTask.setShowBorder("0");
					com.ekemait.charting.fusion.ganttchart.Milestone fcMilestone = fcMilestones.createMilestoneNode();
					fcMilestone.setDate(Util.formatDate(endDate, GanttChart.FC_INPUTDATE_JAVAFORMAT));
					fcMilestone.setTaskId(taskId);
					fcMilestone.setShape("polygon");
					fcMilestone.setNumSides("3");
					fcMilestone.setStartAngle("270");
					fcMilestone.setRadius("3");
					fcMilestone.setToolText("Due date");
				}
			}
		}
	}
}