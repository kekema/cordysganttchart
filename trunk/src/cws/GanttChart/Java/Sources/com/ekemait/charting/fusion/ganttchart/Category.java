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
 * Each <category> element distributes the time line into visual divisions. 
 *
 */
public class Category extends com.raisepartner.chartfusion.api.Node
{
	public final static String PARAMETER_START = "start";
	public final static String PARAMETER_END = "end";
	public final static String PARAMETER_LABEL = "label";
	
	
	public Category() 
	{
		super("category");
	}
	
	/**
	 * Type: String 
	 * 
	 * Label for the category. You can specify any text label to be displayed as the category label. 
	 */
	public void setLabel(String value) 
	{
		setAttribute(PARAMETER_LABEL, value);
	}
	
	/**
	 * Type: Date 
	 * 
	 * Start date for this category. Needs to be specified in the date format for the chart. 
	 */
	public void setStart(String value) 
	{
		setAttribute(PARAMETER_START, value);
	}
	
	/**
	 * Type: Date 
	 * 
	 * End date for this category. Needs to be specified in the date format for the chart. 
	 */
	public void setEnd(String value) 
	{
		setAttribute(PARAMETER_END, value);
	}
	
}