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

/**
 * Class to define a row for a gantt chart. 
 * 
 * @author kekema
 * 
 */
public class Row
{
	// row description
	private String description;
	
	// container class
	private Rows rowsParent;
	// content for each column in the row
	private HashMap<String, String> columnText = new HashMap<String, String>();
	// items in the row (tasks, milestones, events), mostly just one task
	private Items items = new Items();
	
	protected Row(Rows rowsParent)
	{
		this.rowsParent = rowsParent;
	}
	
	/**
	 * Set the content for a given column within the row
	 * 
	 * @param columnName
	 * @param columnText
	 */
	public void setColumnText(String columnName, String columnText)
	{
		this.columnText.put(columnName, columnText);
	}
	
	/**
	 * Set the row description
	 * 
	 * @param description
	 */
	public void setDescription(String description)
	{
		this.description = description;
	}
	
	/**
	 * Get the row description
	 * 
	 * @return
	 */
	public String getDescription()
	{
		return this.description;
	}
	
	/**
	 * Create a task within the row
	 * 
	 * @return
	 */
	public Task createTask()
	{
		return (items.createTask());
	}
	
	/**
	 * Create an event within the row
	 * 
	 * @return
	 */
	public Event createEvent()
	{
		return (items.createEvent());
	}
	
	/**
	 * Create a milestone within the row
	 * 
	 * @return
	 */
	public Milestone createMilestone()
	{
		return (items.createMilestone());
	}
	
	/**
	 * Add the row to the given fusion chart
	 * 
	 * @param fcGanttChart
	 * @param fcProcesses
	 * @param fcTasks
	 * @param fcMilestones
	 * @param rowNumber
	 */
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
	
	/**
	 * Add a column text to the given fusion chart
	 * 
	 * @param fcDataColumn
	 * @param columnName
	 */
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