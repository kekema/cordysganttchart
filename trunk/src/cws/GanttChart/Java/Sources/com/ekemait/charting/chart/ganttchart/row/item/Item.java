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

import com.ekemait.charting.fusion.ganttchart.Milestones;
import com.ekemait.charting.fusion.ganttchart.Tasks;

/**
 * Abstract class for row items
 * 
 * @author kekema
 * 
 */
public abstract class Item
{
	protected String description;
	
	public void setDescription(String description)
	{
		this.description = description;
	}
	
	public String getDescription()
	{
		return(this.description);
	}
	
	abstract public void addToFusionGanttChart(com.ekemait.charting.fusion.ganttchart.GanttChart fcGanttChart, Tasks fcTasks, Milestones fcMilestones, int rowNumber, int itemNumber);
}