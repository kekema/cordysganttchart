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

import java.util.ArrayList;
import java.util.List;

import com.ekemait.charting.fusion.gauge.ColorRange;

/**
 * Gauge ranges
 * 
 * @author kekema
 *
 */
public class Ranges
{
	private final List<Range> rangeChildren = new ArrayList<Range>();
	
	public Range createRange(int fromValue, int toValue, String color)
	{
		Range range = new Range();
		range.setFromValue(fromValue);
		range.setToValue(toValue);
		range.setColor(color);
		rangeChildren.add(range);
		return range;
	}
	
	protected int minValue()
	{
		int result = 0;
		if (!rangeChildren.isEmpty())
		{
			result = Integer.MAX_VALUE;
			for (Range range : rangeChildren) 
			{
				int fromValue = range.getFromValue();
				if (fromValue < result)
				{
					result = fromValue;
				}
			}
		}
		return result;
	}
	
	protected int maxValue()
	{
		int result = 0;
		if (!rangeChildren.isEmpty())
		{
			result = Integer.MIN_VALUE;
			for (Range range : rangeChildren) 
			{
				int toValue = range.getToValue();
				if (toValue > result)
				{
					result = toValue;
				}
			}
		}
		return result;
	}
	
	public void addToFusionGauge(com.ekemait.charting.fusion.gauge.Gauge fcGauge)
	{
		if (!rangeChildren.isEmpty())
		{
			ColorRange fcColorRange = fcGauge.createColorRangeNode();
			for (Range range : rangeChildren) 
			{ 
			    range.addToFusionGanttChart(fcColorRange);
			}
		}
	}
}