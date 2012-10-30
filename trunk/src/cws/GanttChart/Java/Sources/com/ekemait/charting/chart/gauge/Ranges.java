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