package com.ekemait.charting.fusion.gauge;


/**
 * In an angular gauge, dials are used to point to the desired value. You can point to more than one value using 
 * multiple dials. Each dial can have its individual properties like color (border and background), width 
 * (both base and top), radius and value of the dial.
 *
 */
public class Dial extends com.raisepartner.chartfusion.api.Node 
{
	public final static String PARAMETER_VALUE = "value";
	public final static String PARAMETER_SHOWVALUE = "showValue";
	public final static String PARAMETER_REAREXTENSION = "rearExtension";
	public final static String PARAMETER_BASEWIDTH = "baseWidth";
	
	public Dial() 
	{
		super("dial");
	}
	
	/**
	 * Type: Number 
	 * 
	 * Numerical value for the dial that will be shown on the chart.   
	 */
	public void setValue(String value) 
	{
		setAttribute(PARAMETER_VALUE, value);
	}
	
	/**
	 * Type: Boolean (0/1)_ 
	 * 
	 * Whether to show value for this dial.
	 */
	public void setShowValue(String value) 
	{
		setAttribute(PARAMETER_SHOWVALUE, value);
	}
	
	/**
	 * Type: Number (Pixels) 
	 * 
	 * If you want the dial to extend beyond the pivot (in opposite side) for more realistic 
	 * looks, you can set the extension distance (in pixels) using this attribute.    
	 */
	public void setRearExtension(String value) 
	{
		setAttribute(PARAMETER_REAREXTENSION, value);
	}
	
	/**
	 * Type: Number (Pixels) 
	 * 
	 * Width of the bottom part of the dial (the part connected to pivot). 
	 */
	public void setBaseWidth(String value) 
	{
		setAttribute(PARAMETER_BASEWIDTH, value);
	}
}