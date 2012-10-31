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

import java.util.Date;

/**
 * Class to define a milestone for a gantt chart.
 * 
 * @author kekema
 * 
 */
public class Milestone extends Event
{
	protected Milestone()
	{
		super();
		isMilestone = true;
	}
	
	/**
	 * Set planned date
	 * 
	 * @param plannedMilestoneDate
	 */
	public void setPlannedMilestoneDate(Date plannedMilestoneDate)
	{
		this.plannedEventDate = plannedMilestoneDate;
	}
	
	/**
	 * Get planned date
	 * 
	 * @return
	 */
	public Date getPlannedMilestoneDate()
	{
		return (this.plannedEventDate);
	}
	
	/**
	 * Set actual date
	 * 
	 * @param actualMilestoneDate
	 */
	public void setActualMilestoneDate(Date actualMilestoneDate)
	{
		this.actualEventDate = actualMilestoneDate;
	}
	
	/**
	 * Get actual date
	 * 
	 * @return
	 */
	public Date getActualMilestoneDate()
	{
		return (this.actualEventDate);
	}
}