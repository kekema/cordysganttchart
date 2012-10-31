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

import com.ekemait.charting.chart.ganttchart.row.Rows;
import com.ekemait.charting.fusion.ganttchart.DataColumn;
import com.ekemait.charting.fusion.ganttchart.DataTable;

/**
 * Class to define a column for a gantt chart. 
 * 
 * @author kekema
 * 
 */
public class Column
{
	// column header name
	private String name;
	
	protected Column()
	{
		super();
	}
	
	/**
	 * Set the column header name
	 * 
	 * @param name
	 */
	public void setName(String name)
	{
		this.name = name;
	}
	
	/**
	 * Get the column header name
	 *
	 */
	public String getName()
	{
		return(this.name);
	}
	
	/**
	 * Add the column to a fusion chart
	 * 
	 * @param fcDataTable
	 * @param rows
	 */
	public void addToFusionGanttChart(DataTable fcDataTable, Rows rows)
	{
		DataColumn fcDataColumn = fcDataTable.createDataColumnNode();
		fcDataColumn.setHeaderText(name);
		fcDataColumn.setAlign("left");
		rows.addColumnTextToFusionGanttChart(fcDataColumn, name);
	}
}