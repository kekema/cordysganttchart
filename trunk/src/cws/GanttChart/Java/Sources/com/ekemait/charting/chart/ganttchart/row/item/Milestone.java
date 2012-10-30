package com.ekemait.charting.chart.ganttchart.row.item;

import java.util.Date;

public class Milestone extends Event
{
	protected Milestone()
	{
		super();
		isMilestone = true;
	}
	
	public void setPlannedMilestoneDate(Date plannedMilestoneDate)
	{
		this.plannedEventDate = plannedMilestoneDate;
	}
	
	public Date getPlannedMilestoneDate()
	{
		return (this.plannedEventDate);
	}
	
	public void setActualMilestoneDate(Date actualMilestoneDate)
	{
		this.actualEventDate = actualMilestoneDate;
	}
	
	public Date getActualMilestoneDate()
	{
		return (this.actualEventDate);
	}
}