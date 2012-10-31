/*  
 *	Copyright 2012 Ekema IT   
 * 
 *  This file is part of Gauge Java API   
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

package com.ekemait.charting.fusion.gauge;

/**
 * The angular chart displays the data values on a radial scale. The radial scale is marked by a 
 * lower limit and an upper limit, i.e. the minimum and maximum values that can be plotted on the chart. 
 * Within that scale, you can create various sections to classify your data - each section can have a 
 * different background color, border color etc. to differentiate them from one another. These sections 
 * are called color ranges. There can be any number of color ranges. For each color range, you’ll have 
 * to specify the minimum and maximum values and the hex color code for the range. 
 *
 */
public class Color extends com.raisepartner.chartfusion.api.Node 
{
	public final static String PARAMETER_MINVALUE = "minValue";
	public final static String PARAMETER_MAXVALUE = "maxValue";
	public final static String PARAMETER_CODE = "code";
	public final static String PARAMETER_ALPHA = "alpha";
	public final static String PARAMETER_BORDERCOLOR = "borderColor";
	public final static String PARAMETER_BORDERALPHA = "borderAlpha";
	
	public Color() 
	{
		super("color");
	}
	
	/**
	 * Type: Number 
	 * 
	 * Indicates the starting value of that color range. The minValue of the first color range should be equal 
	 * to the chart's lowerLimit and the minValue of the succeeding <color> element should be equal 
	 * to the current <color> element's maxValue.  
	 */
	public void setMinValue(String value) 
	{
		setAttribute(PARAMETER_MINVALUE, value);
	}
	
	/**
	 * Type: Number 
	 * 
	 * Indicates the end value of that color range. The maxValue of the last color range should be equal to the chart's upperLimit.   
	 */
	public void setMaxValue(String value) 
	{
		setAttribute(PARAMETER_MAXVALUE, value);
	}
	
	/**
	 * Type: Color Code 
	 * 
	 * Actual color (hex color) of the color range using which it will be filled.    
	 */
	public void setCode(String value) 
	{
		setAttribute(PARAMETER_CODE, value);
	}
	
	/**
	 * Type: Number (0-100) 
	 * 
	 * Sets the transparency of each range in the color range. 
	 */
	public void setAlpha(String value) 
	{
		setAttribute(PARAMETER_ALPHA, value);
	}
	
	/**
	 * Type: Color Code  
	 * 
	 * Border color of that particular color in the range. If you want to specify a 
	 * different border for each range in the color range, you can use this attribute.  
	 */
	public void setBorderColor(String value) 
	{
		setAttribute(PARAMETER_BORDERCOLOR, value);
	}
	
	/**
	 * Type: Number (0-100) 
	 * 
	 * Border alpha for the color range. 
	 */
	public void setBorderAlpha(String value) 
	{
		setAttribute(PARAMETER_BORDERALPHA, value);
	}
}