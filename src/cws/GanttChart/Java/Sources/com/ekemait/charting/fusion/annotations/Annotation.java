/*  
 *	Copyright 2012 Ekema IT   
 * 
 *  This file is part of Charting Java API   
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

package com.ekemait.charting.fusion.annotations;

/**
 * Annotations let you create your own custom objects (shapes, images, text etc.) in the charts. You can create 
 * various shapes like polygons, rectangles, circles, arcs, etc., render annotation text at required positions and load 
 * external GIF/JPEG/PNG images or other Flash movies in the chart itself. . 
 *
 */
public class Annotation extends com.raisepartner.chartfusion.api.Node 
{
	public final static String PARAMETER_TYPE = "type";
	public final static String PARAMETER_X = "x";
	public final static String PARAMETER_Y = "y";
	public final static String PARAMETER_TOX = "toX";
	public final static String PARAMETER_TOY = "toY";
	public final static String PARAMETER_RADIUS = "radius";
	public final static String PARAMETER_FILLCOLOR = "fillColor";
	public final static String PARAMETER_SHOWBORDER = "showBorder";
	
	
	public Annotation() 
	{
		super("annotation");
	}
	
	/**
	 * Type: String (Rectangle, Circle, Polygon, Line, Arc, Text, Image)
	 * 
	 * Annotation shape.	
	 */
	public void setType(String value) 
	{
		setAttribute(PARAMETER_TYPE, value);
	}
	
	/**
	 * Type: Number
	 * 
	 * The starting (center for circle, arc and polygon) x co-ordinate for the annotation. This x co-ordinate 
	 * is relative to the x co-ordinate of the annotation group in which the annotation is placed. For example, 
	 * if you have set the x co-ordinate of the annotation group as 50 and the x co-ordinate of the annotation 
	 * is 100, then the effective x co-ordinate of the annotation will be 150 w.r.t to the starting position of the chart.
	 */
	public void setX(String value) 
	{
		setAttribute(PARAMETER_X, value);
	}
	
	/**
	 * Type: Number
	 * 
	 * The starting (center for circle, arc and polygon) y co-ordinate for the annotation. This again is relative to 
	 * the starting y co-ordinate of the annotation group in which the annotation is placed. 
	 */
	public void setY(String value) 
	{
		setAttribute(PARAMETER_Y, value);
	}
	
	/**
	 * Type: Number
	 * 
	 * The ending x co-ordinate for a line or rectangle. This co-ordinate is relative to the starting x-position of the 
	 * annotation group in which the annotation is placed. 
	 */
	public void setToX(String value) 
	{
		setAttribute(PARAMETER_TOX, value);
	}
	
	/**
	 * Type: Number
	 * 
	 * The ending y co-ordinate for a line or rectangle. This co-ordinate is relative to the starting y-position of 
	 * the annotation group in which the annotation is placed.  
	 */
	public void setToY(String value) 
	{
		setAttribute(PARAMETER_TOY, value);
	}
	
	/**
	 * Type: Number
	 * 
	 * The radius in case of a circle, arc or polygon. The rounding radius in case of a rectangle.  
	 */
	public void setRadius(String value) 
	{
		setAttribute(PARAMETER_RADIUS, value);
	}
	
	/**
	 * Type: Hex code (separated by commas if there are multiple codes for a gradient) 
	 * 
	 * This attribute sets the background fill color for the annotation. You can set any hex color code as 
	 * the value of this attribute. To specify a gradient as background color, separate the hex color codes 
	 * of each color in the gradient using comma. 
	 * Example: FF5904, FFFFFF. Remember to remove # and any spaces in between. See the gradient specification page for more details. 
	 */
	public void setFillColor(String value) 
	{
		setAttribute(PARAMETER_FILLCOLOR, value);
	}
	
	/**
	 * Type: Whether to show a border for the annotation. 
	 * 
	 * Whether to show a border for the annotation. 
	 */
	public void setShowBorder(String value) 
	{
		setAttribute(PARAMETER_SHOWBORDER, value);
	}
}