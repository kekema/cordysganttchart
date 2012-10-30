package com.ekemait.charting.chart.ganttchart.row;

import java.util.HashMap;

import com.ekemait.charting.chart.ganttchart.column.Columns;
import com.ekemait.charting.chart.ganttchart.row.item.Event;
import com.ekemait.charting.chart.ganttchart.row.item.Items;
import com.ekemait.charting.chart.ganttchart.row.item.Milestone;
import com.ekemait.charting.chart.ganttchart.row.item.Task;
import com.ekemait.charting.fusion.ganttchart.DataColumn;
import com.ekemait.charting.fusion.ganttchart.Milestones;
import com.ekemait.charting.fusion.ganttchart.Process;
import com.ekemait.charting.fusion.ganttchart.Processes;
import com.ekemait.charting.fusion.ganttchart.Tasks;
import com.ekemait.charting.fusion.ganttchart.Text;
import com.ekemait.charting.util.Util;

public class Row
{
	private String description;
	
	private Rows rowsParent;
	private HashMap<String, String> columnText = new HashMap<String, String>();
	private Items items = new Items();
	
	protected Row(Rows rowsParent)
	{
		this.rowsParent = rowsParent;
	}
	
	public void setColumnText(String columnName, String columnText)
	{
		this.columnText.put(columnName, columnText);
	}
	
	public void setDescription(String description)
	{
		this.description = description;
	}
	
	public String getDescription()
	{
		return this.description;
	}
	
	public Task createTask()
	{
		return (items.createTask());
	}
	
	public Event createEvent()
	{
		return (items.createEvent());
	}
	
	public Milestone createMilestone()
	{
		return (items.createMilestone());
	}
	
	public void addToFusionGanttChart(com.ekemait.charting.fusion.ganttchart.GanttChart fcGanttChart, Processes fcProcesses, Tasks fcTasks, Milestones fcMilestones, int rowNumber)
	{
		Process fcProcess = fcProcesses.createProcessNode();
		fcProcess.setId(String.valueOf(rowNumber));
		String description = "";
		if (Util.isSet(this.description))
		{
			description = this.description;
		}
		else
		{
			description = items.getFirstItemDescription();
		}
		fcProcess.setLabel(description);
		
		items.addToFusionGanttChart(fcGanttChart, fcTasks, fcMilestones, rowNumber);
	}
	
	public void addColumnTextToFusionGanttChart(DataColumn fcDataColumn, String columnName)
	{
		String text = this.columnText.get(columnName);
		if (!Util.isSet(text))
		{
			text = "";
		}
		Text textNode = fcDataColumn.createTextNode();
		textNode.setLabel(text);
	}
}