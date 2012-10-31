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

package com.ekemait.charting.chart.ganttchart.row;

import java.util.ArrayList;
import java.util.List;

import com.ekemait.charting.chart.ganttchart.ChartConfig;
import com.ekemait.charting.fusion.ganttchart.DataColumn;
import com.ekemait.charting.fusion.ganttchart.Milestones;
import com.ekemait.charting.fusion.ganttchart.Processes;
import com.ekemait.charting.fusion.ganttchart.Tasks;

/**
 * Container class for the rows of a gantt chart.
 * 
 * @author kekema
 * 
 */
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
	
	/**
	 * Add all rows to the given fusion chart
	 * 
	 * @param fcGanttChart
	 */
	public void addToFusionGanttChart(com.ekemait.charting.fusion.ganttchart.GanttChart fcGanttChart)
	{
		Processes fcProcesses = fcGanttChart.createProcessesNode();
		fcProcesses.setFontSize("12");
		fcProcesses.setIsBold("1");
		fcProcesses.setAlign("left");
		fcProcesses.setHeaderText("Work Item");
		fcProcesses.setHeaderVAlign("bottom");
		fcProcesses.setHeaderAlign("left");
		fcProcesses.setAttribute("headerFontColor", ChartConfig.getValue("rowHeaderFontColor"));
		fcProcesses.setAttribute("headerBgColor", ChartConfig.getValue("rowHeaderBgColor"));
		fcProcesses.setAttribute("bgColor", ChartConfig.getValue("rowBgColor"));
		fcProcesses.setAttribute("fontColor", ChartConfig.getValue("rowFontColor"));
		fcProcesses.setAttribute("bgAlpha", ChartConfig.getValue("rowBgAlpha"));
		
		Tasks fcTasks = fcGanttChart.createTasksNode();
		Milestones fcMilestones = fcGanttChart.createMilestonesNode();

		int rowNumber = 0;
		for (Row row : rowChildren)
		{
			rowNumber++;
			row.addToFusionGanttChart(fcGanttChart, fcProcesses, fcTasks, fcMilestones, rowNumber);
		}
	}
	
	/**
	 * Fill the given column for each row
	 * 
	 * @param fcDataColumn
	 * @param columnName
	 */
	public void addColumnTextToFusionGanttChart(DataColumn fcDataColumn, String columnName)
	{
		for (Row row : rowChildren)
		{
			row.addColumnTextToFusionGanttChart(fcDataColumn, columnName);
		}
	}
}