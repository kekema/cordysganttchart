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

package com.ekemait.charting.chart.ganttchart.column;

import java.util.ArrayList;
import java.util.List;

import com.ekemait.charting.chart.ganttchart.ChartConfig;
import com.ekemait.charting.chart.ganttchart.row.Rows;
import com.ekemait.charting.fusion.ganttchart.DataTable;

/**
 * Container class for all gantt chart columns
 * 
 * @author kekema
 * 
 */
public class Columns
{
	private final List<Column> columnChildren = new ArrayList<Column>();
	
	/**
	 * Add a new column
	 * 
	 * @param columnName
	 * @return
	 */
	public Column createColumn(String columnName)
	{
		Column column = new Column();
		column.setName(columnName);
		columnChildren.add(column);
		return column;
	}
	
	/**
	 * Add all columns to the given fusion chart
	 * 
	 * @param fcGanttChart
	 * @param rows
	 */
	public void addToFusionGanttChart(com.ekemait.charting.fusion.ganttchart.GanttChart fcGanttChart, Rows rows)
	{
		if (!columnChildren.isEmpty())
		{
			DataTable fcDataTable = fcGanttChart.createDataTableNode();
			fcDataTable.setHeaderAlign("center");
			fcDataTable.setHeaderVAlign("bottom");
			fcDataTable.setAttribute("headerFontColor", ChartConfig.getValue("columnHeaderFontColor"));
			fcDataTable.setAttribute("headerBgColor", ChartConfig.getValue("columnHeaderBgColor"));
			fcDataTable.setAttribute("bgColor", ChartConfig.getValue("columnBgColor"));
			fcDataTable.setAttribute("fontColor", ChartConfig.getValue("columnFontColor"));
			fcDataTable.setAttribute("headerIsBold", "0");
			for (Column column : columnChildren) 
			{ 
			    column.addToFusionGanttChart(fcDataTable, rows);
			}
		}
	}
}