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
 * The <tasks> element groups all the tasks that we've to show in the chart. 
 * Each task is represented by a <task> element which is a child of <tasks> element. 
 *
 */
public class Tasks extends com.raisepartner.chartfusion.api.Node 
{
	public Tasks() 
	{
		super("tasks");
	}
	
    public Task createTaskNode() 
    {
        Task node = new Task();
        addNode(node);
        return node;
    }
}