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
 * For each trend line on the chart, you need to define a <line> element under <trendLines> element.
 *
 */
public class Line extends com.raisepartner.chartfusion.api.Node
{
	public final static String PARAMETER_START = "start";
	public final static String PARAMETER_END = "end";
	public final static String PARAMETER_DISPLAYVALUE = "displayValue";
	public final static String PARAMETER_COLOR = "color";
	public final static String PARAMETER_THICKNESS = "thickness";
	public final static String PARAMETER_DASHED = "dashed";
	public final static String PARAMETER_ISTRENDZONE = "isTrendZone";
	public final static String PARAMETER_ALPHA = "alpha";
	
	public Line() 
	{
		super("line");
	}
	
	/**
	 * Type: Date 
	 * 
	 * Start date for the trend line/zone.. 
	 */
	public void setStart(String value) 
	{
		setAttribute(PARAMETER_START, value);
	}
	
	/**
	 * Type: Date 
	 * 
	 * End date for the trend line/zone. If you intend to draw a trend line instead of a trend zone, then you do not need to specify a value for this attribute. 
	 */
	public void setEnd(String value) 
	{
		setAttribute(PARAMETER_END, value);
	}
	
	/**
	 * Type: String 
	 * 
	 * If you want to display your custom value beneath the trend line, you can do so here. Example, you can show the trend line and label it as "Today".  
	 */
	public void setDisplayValue(String value) 
	{
		setAttribute(PARAMETER_DISPLAYVALUE, value);
	}
	
	/**
	 * Type: Color code 
	 * 
	 * Color for the trend line/zone.  
	 */
	public void setColor(String value) 
	{
		setAttribute(PARAMETER_COLOR, value);
	}
	
	/**
	 * Type: Number
	 * 
	 * Thickness of the trend line.  
	 */
	public void setThickness(String value) 
	{
		setAttribute(PARAMETER_THICKNESS, value);
	}
	
	/**
	 * Type: Boolean (0/1)
	 * 
	 * Whether to show the trend line as dashed.  
	 */
	public void setDashed(String value) 
	{
		setAttribute(PARAMETER_DASHED, value);
	}
	
	/**
	 * Type: Boolean (0/1)
	 * 
	 * Option to set whether it will appear as a trend zone or a trend line. 
	 */
	public void setIsTrendZone(String value) 
	{
		setAttribute(PARAMETER_ISTRENDZONE, value);
	}
	
	/**
	 * Type: Number (0-100) 
	 * 
	 * Alpha of the trend line. 
	 */
	public void setAlpha(String value) 
	{
		setAttribute(PARAMETER_ALPHA, value);
	}
}