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