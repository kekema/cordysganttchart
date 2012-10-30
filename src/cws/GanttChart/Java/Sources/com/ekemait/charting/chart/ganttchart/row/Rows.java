package com.ekemait.charting.chart.ganttchart.row;

import java.util.ArrayList;
import java.util.List;

import com.ekemait.charting.fusion.ganttchart.DataColumn;
import com.ekemait.charting.fusion.ganttchart.Milestones;
import com.ekemait.charting.fusion.ganttchart.Processes;
import com.ekemait.charting.fusion.ganttchart.Tasks;

public class Rows
{
    /**
     * The list of rows
     */
	private final List<Row> rowChildren = new ArrayList<Row>();
	
    /**
     * Create a row
     * 
     */
	public Row createRow()
	{
		Row row = new Row(this);
		rowChildren.add(row);
		return row;
	}
	
	public void addToFusionGanttChart(com.ekemait.charting.fusion.ganttchart.GanttChart fcGanttChart)
	{
		Processes fcProcesses = fcGanttChart.createProcessesNode();
		fcProcesses.setFontSize("12");
		fcProcesses.setIsBold("1");
		fcProcesses.setAlign("left");
		fcProcesses.setHeaderText("Work Item");
		//fcProcesses.setHeaderFontSize("16");
		fcProcesses.setHeaderVAlign("bottom");
		fcProcesses.setHeaderAlign("left");
		fcProcesses.setAttribute("headerFontColor", "017BBE");
		fcProcesses.setAttribute("headerBgColor", "D5F0FF");
		fcProcesses.setAttribute("bgColor", "D5F0FF");
		fcProcesses.setAttribute("fontColor", "017BBE");
		fcProcesses.setAttribute("bgAlpha", "60");
		
		Tasks fcTasks = fcGanttChart.createTasksNode();
		Milestones fcMilestones = fcGanttChart.createMilestonesNode();

		int rowNumber = 0;
		for (Row row : rowChildren)
		{
			rowNumber++;
			row.addToFusionGanttChart(fcGanttChart, fcProcesses, fcTasks, fcMilestones, rowNumber);
		}
	}
	
	public void addColumnTextToFusionGanttChart(DataColumn fcDataColumn, String columnName)
	{
		for (Row row : rowChildren)
		{
			row.addColumnTextToFusionGanttChart(fcDataColumn, columnName);
		}
	}
}