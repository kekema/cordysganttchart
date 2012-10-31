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
 * Each <process> element represents one process on the Gantt chart. 
 * You can show team members, projects or task list as a process - there's no restriction to that.
 *
 */
public class Process extends com.raisepartner.chartfusion.api.Node
{
	public final static String PARAMETER_ID = "id";
	public final static String PARAMETER_LABEL = "label";
	public final static String PARAMETER_ALIGN = "align";
	
	public Process() 
	{
		super("process");
	}
	
	/**
	 * Type: String 
	 * 
	 * String ID for the process. Each process needs to have a unique identifier to enable cross linking with tasks.  
	 */
	public void setId(String value) 
	{
		setAttribute(PARAMETER_ID, value);
	}
	
	/**
	 * Type: String 
	 * 
	 * The label for the process.  
	 */
	public void setLabel(String value) 
	{
		setAttribute(PARAMETER_LABEL, value);
	}
	
	/**
	 * Type: String (left, center or right)
	 * 
	 * Horizontal alignment position for the process name. 
	 */
	public void setAlign(String value) 
	{
		setAttribute(PARAMETER_ALIGN, value);
	}
	
}