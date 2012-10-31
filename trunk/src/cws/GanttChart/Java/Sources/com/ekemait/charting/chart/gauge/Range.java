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

package com.ekemait.charting.chart.gauge;

import com.ekemait.charting.fusion.gauge.Color;
import com.ekemait.charting.fusion.gauge.ColorRange;

/**
 * Gauge slice range
 * 
 * @author kekema
 *
 */
public class Range
{
	private int fromValue;
	private int toValue;
	private String color;
	
	protected Range()
	{
		super();
	}
	
	public void setFromValue(int fromValue)
	{
		this.fromValue = fromValue;
	}
	
	public int getFromValue()
	{
		return(this.fromValue);
	}
	
	public void setToValue(int toValue)
	{
		this.toValue = toValue;
	}
	
	public int getToValue()
	{
		return(this.toValue);
	}
	
	public void setColor(String color)
	{
		this.color = color;
	}
	
	public String getColor()
	{
		return(this.color);
	}
	
	public void addToFusionGanttChart(ColorRange fcColorRange)
	{
		Color fcColor = fcColorRange.createColorNode();
		fcColor.setMinValue(String.valueOf(fromValue));
		fcColor.setMaxValue(String.valueOf(toValue));
		fcColor.setCode(color);
	}
}