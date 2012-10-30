package com.ekemait.charting.fusion.gauge;


/**
 * Trendpoints can be used to indicate target values, historical value, average value, etc.
 *
 */
public class Point extends com.raisepartner.chartfusion.api.Node 
{
	public final static String PARAMETER_STARTVALUE = "startValue";
	public final static String PARAMETER_ENDVALUE = "endValue";
	public final static String PARAMETER_DISPLAYVALUE = "displayValue";
	public final static String PARAMETER_USEMARKER = "useMarker";
	public final static String PARAMETER_MARKERRADIUS = "markerRadius";
	public final static String PARAMETER_DASHED = "dashed";
	public final static String PARAMETER_DASHLEN = "dashLen";
	public final static String PARAMETER_DASHGAP = "dashGap";

	
	public Point() 
	{
		super("point");
	}
	
	/**
	 * Type: Number 
	 * 
	 * The starting value for the trend-point. Say, if you want to plot a trend-arc 
	 * from value 102 to 109, the startValue will be 102. 
	 */
	public void setStartValue(String value) 
	{
		setAttribute(PARAMETER_STARTVALUE, value);
	}
	
	/**
	 * Type: Number 
	 * 
	 * The ending value for the trend-point. Say, if you want to plot a trend-arc 
	 * from value 102 to 109, the endValue will be 109. 
	 */
	public void setEndValue(String value) 
	{
		setAttribute(PARAMETER_ENDVALUE, value);
	}
	
	/**
	 * Type: String 
	 * 
	 * Display label for the trend-point/trend-arc. If you do not specify a value, the chart displays the numeric value.  
	 */
	public void setDisplayValue(String value) 
	{
		setAttribute(PARAMETER_DISPLAYVALUE, value);
	}
	
	/**
	 * Type: Boolean (0/1) 
	 * 
	 * You can opt to show a triangular marker for each trend-point by setting this attribute to 1.    
	 */
	public void setUseMarker(String value) 
	{
		setAttribute(PARAMETER_USEMARKER, value);
	}
	
	/**
	 * Type: Number (Pixels) 
	 * 
	 * Radius of the marker.
	 */
	public void setMarkerRadius(String value) 
	{
		setAttribute(PARAMETER_MARKERRADIUS, value);
	}
	
	/**
	 * Type: Boolean (0/1) 
	 * 
	 * If you're showing the trend point as line, this attribute lets you control whether the line will be plotted as dashed.
	 */
	public void setDashed(String value) 
	{
		setAttribute(PARAMETER_DASHED, value);
	}
	
	/**
	 * Type: Number (pixels)  
	 * 
	 * Length of each dash, if trend-point is plotted as dashed line. 
	 */
	public void setDashLen(String value) 
	{
		setAttribute(PARAMETER_DASHLEN, value);
	}
	
	/**
	 * Type: Number (pixels)  
	 * 
	 * Length of each dash gap, if trend-point is plotted as dashed line.
	 */
	public void setDashGap(String value) 
	{
		setAttribute(PARAMETER_DASHGAP, value);
	}
	
}