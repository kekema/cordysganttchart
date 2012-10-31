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

package com.ekemait.charting.fusion.ganttchart;

/**
 * Milestones visually depict any crucial dates on the chart. You can create your own milestones on 
 * the chart based on date and task i.e., for a given task you can specify milestones on specific dates. 
 * You can also add tool text and link for the milestone.
 *
 */
public class Milestones extends com.raisepartner.chartfusion.api.Node 
{
	public Milestones() 
	{
		super("milestones");
	}
	
    public Milestone createMilestoneNode() 
    {
    	Milestone node = new Milestone();
        addNode(node);
        return node;
    }
}