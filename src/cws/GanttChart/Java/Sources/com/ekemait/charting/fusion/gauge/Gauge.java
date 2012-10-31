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

import com.ekemait.charting.fusion.annotations.Annotations;


/**
 * An angular/meter/dial gauge chart is used to display a specific dataset utilizing an indicator 
 * that moves within a circular range to indicate whether the monitored data is within defined limits. 
 * Colors can be selected for the data range to suit the application such as green for satisfactory, 
 * yellow for caution and red for alarm.
 *
 */
public class Gauge extends com.raisepartner.chartfusion.api.Node
{
	
	public final static String PARAMETER_MANAGERESIZE = "manageResize";
	public final static String PARAMETER_ORIGW = "origW";
	public final static String PARAMETER_ORIGH = "origH";
	public final static String PARAMETER_PALETTE = "palette";
	public final static String PARAMETER_BGALPHA = "bgAlpha";
	public final static String PARAMETER_BGCOLOR = "bgColor";
	public final static String PARAMETER_LOWERLIMIT = "lowerLimit";
	public final static String PARAMETER_UPPERLIMIT = "upperLimit";
	public final static String PARAMETER_NUMBERSUFFIX = "numberSuffix";
	public final static String PARAMETER_SHOWBORDER = "showBorder";
	public final static String PARAMETER_BASEFONTCOLOR = "basefontColor";
	public final static String PARAMETER_CHARTTOPMARGIN = "chartTopMargin";
	public final static String PARAMETER_CHARTBOTTOMMARGIN = "chartBottomMargin";
	public final static String PARAMETER_TOOLTIPBGCOLOR = "toolTipBgColor";
	public final static String PARAMETER_GAUGEFILLMIX = "gaugeFillMix";
	public final static String PARAMETER_GAUGEFILLRATIO = "gaugeFillRatio";
	public final static String PARAMETER_PIVOTRADIUS = "pivotRadius";
	public final static String PARAMETER_GAUGEOUTERRADIUS = "gaugeOuterRadius";
	public final static String PARAMETER_GAUGEINNERRADIUS = "gaugeInnerRadius";
	public final static String PARAMETER_GAUGEORIGINX = "gaugeOriginX";
	public final static String PARAMETER_GAUGEORIGINY = "gaugeOriginY";
	public final static String PARAMETER_TRENDVALUEDISTANCE = "trendValueDistance";
	public final static String PARAMETER_TICKVALUEDISTANCE = "tickValueDistance";
	public final static String PARAMETER_MANAGEVALUEOVERLAPPING = "manageValueOverlapping";
	public final static String PARAMETER_AUTOALIGNTICKVALUES = "autoAlignTickValues";
	
	public Gauge() 
	{
		super("chart");
	}
	
	/**
	 * Type: Boolean (0/1)
	 * 
	 * Setting this attribute to 1, you can allow the chart to automatically resize itself
	 * when the parent container of the chart is resized. 
 
	 */
	public void setManageResize(String value) 
	{
		setAttribute(PARAMETER_MANAGERESIZE, value);
	}
	
	/**
	 * Type:Number (Pixels) 
	 * 
	 * If you've opted to dynamically resize the chart, you can convey the original width of chart using this attribute. It 
	 * refers to the width based on which you had defined the various co-ordinates/radius of the gauge. 
	 */
	public void setOrigW(String value) 
	{
		setAttribute(PARAMETER_ORIGW, value);
	}
	
	/**
	 * Type: Number (Pixels) 
	 * 
	 * If you've opted to dynamically resize the chart, you can convey the original height of chart using this attribute. It 
	 * refers to the height based on which you had defined the various co-ordinates/radius of the gauge. 
	 */
	public void setOrigH(String value) 
	{
		setAttribute(PARAMETER_ORIGH, value);
	}
	
	/**
	 * Type: Number (1-5) 
	 * 
	 * Each chart has 5 pre-defined color palettes which you can choose from. Each palette 
	 * renders the chart in a different color theme. Valid values are 1-5. 
	 */
	public void setPalette(String value) 
	{
		setAttribute(PARAMETER_PALETTE, value);
	}
	
	/**
	 * Type: Number (0-100)
	 * 
	 * Sets the alpha (transparency) for the background. If you've opted for gradient 
	 * background, you need to set a list of alpha(s) separated by comma.
	 */
	public void setBgAlpha(String value) 
	{
		setAttribute(PARAMETER_BGALPHA, value);
	}
	
	/**
	 * Type: Color Code
	 * 
	 * This attribute sets the background color for the chart. You can set any hex color code as the value 
	 * of this attribute. To specify a gradient as background color, separate the hex color codes of each 
	 * color in the gradient using comma. Example: FF5904, FFFFFF. Remember to remove # and any spaces in between.
	 */
	public void setBgColor(String value) 
	{
		setAttribute(PARAMETER_BGCOLOR, value);
	}

	/**
	 * Type: Number
	 * 
	 * This attribute allows you to display a label instead of the lower limit. For example, in a chart displaying 
	 * Literacy Rate on a scale of 0-100%, you may need to show the label Low at the starting point of the chart. 
	 * Upon using this attribute to specify the label, the value 0 will be replaced by Low.
	 */
	public void setLowerLimit(String value) 
	{
		setAttribute(PARAMETER_LOWERLIMIT, value);
	}
	
	/**
	 * Type: Number
	 * 
	 * This attribute helps you explicitly set the upper limit of the chart. If you don't specify this value, the 
	 * chart automatically calculates the upper limit based on the data provided by you. 
	 */
	public void setUpperLimit(String value) 
	{
		setAttribute(PARAMETER_UPPERLIMIT, value);
	}
	
	/**
	 * Type: String
	 * 
	 * Using this attribute, you could add suffix to all the numbers visible on the graph. For example, to represent 
	 * all figure quantified as per annum on the chart, you could specify this attribute to ' /a' to show like 40000/a, 50000/a.  
	 */
	public void setNumberSuffix(String value) 
	{
		setAttribute(PARAMETER_NUMBERSUFFIX, value);
	}

	/**
	 * Type: Boolean (0/1)
	 * 
	 * Whether to show a border around the chart or not?   
	 */
	public void setShowBorder(String value) 
	{
		setAttribute(PARAMETER_SHOWBORDER, value);
	}

	/**
	 * Type: Color Code
	 * 
	 * This attribute sets the base font color of the chart i.e., all the values and the names in the chart which 
	 * lie on the canvas will be displayed using the font color provided here.   
	 */
	public void setBasefontColor(String value) 
	{
		setAttribute(PARAMETER_BASEFONTCOLOR, value);
	}
	
	/**
	 * Type: Number (Pixels)
	 * 
	 * Amount of empty space that you want to put on the top of your chart. Nothing is rendered in this space.    
	 */
	public void setChartTopMargin(String value) 
	{
		setAttribute(PARAMETER_CHARTTOPMARGIN, value);
	}
	
	/**
	 * Type: Number (Pixels)
	 * 
	 * Amount of empty space that you want to put on the bottom of your chart. Nothing is rendered in this space.     
	 */
	public void setChartBottomMargin(String value) 
	{
		setAttribute(PARAMETER_CHARTBOTTOMMARGIN, value);
	}
	
	/**
	 * Type: Color Code 
	 * 
	 * Background color for the tooltip.     
	 */
	public void setToolTipBgColor(String value) 
	{
		setAttribute(PARAMETER_TOOLTIPBGCOLOR, value);
	}

	/**
	 * Type: Gradient mix formula 
	 * 
	 * Gradient fill formula for the scale.     
	 */
	public void setGaugeFillMix(String value) 
	{
		setAttribute(PARAMETER_GAUGEFILLMIX, value);
	}

	/**
	 * Type: Ratio of each color separated by comma  
	 * 
	 * Ratio fill mix for the scale.    
	 */
	public void setGaugeFillRatio(String value) 
	{
		setAttribute(PARAMETER_GAUGEFILLRATIO, value);
	}
	
	/**
	 * Type: Number (Pixels)
	 * 
	 * Radius of the pivot. 
	 */
	public void setPivotRadius(String value) 
	{
		setAttribute(PARAMETER_PIVOTRADIUS, value);
	}
	
	/**
	 * Type: Number (Pixels)
	 * 
	 * Outer radius for the color range scale. 
	 */
	public void setGaugeOuterRadius(String value) 
	{
		setAttribute(PARAMETER_GAUGEOUTERRADIUS, value);
	}
	
	/**
	 * Type: Number (Pixels) or Number (percent) 
	 * 
	 * Inner radius for color range scale. It can either be in exact pixels or in percentage of outer radius. 
	 */
	public void setGaugeInnerRadius(String value) 
	{
		setAttribute(PARAMETER_GAUGEINNERRADIUS, value);
	}
	
	/**
	 * Type: Number (Pixels)
	 * 
	 * You can manually specify the x co-ordinate at which the center of the gauge will be placed. This comes 
	 * handy when you are designing small angle gauges or when you are using custom objects in the chart to draw 
	 * certain objects and need to set the exact center position. 
	 */
	public void setGaugeOriginX(String value) 
	{
		setAttribute(PARAMETER_GAUGEORIGINX, value);
	}

	/**
	 * Type: Number (Pixels)
	 * 
	 * You can manually specify the y co-ordinate at which the center of the gauge will be placed. This comes 
	 * handy when you are designing small angle gauges or when you are using custom objects in the chart to draw 
	 * certain objects and need to set the exact center position. 
	 */
	public void setGaugeOriginY(String value) 
	{
		setAttribute(PARAMETER_GAUGEORIGINY, value);
	}
	
	/**
	 * Type: Number (Pixels)
	 * 
	 * Distance between trend values and tick lines.  
	 */
	public void setTrendValueDistance(String value) 
	{
		setAttribute(PARAMETER_TRENDVALUEDISTANCE, value);
	}

	/**
	 * Type: Number (Pixels)
	 * 
	 * Distance between tick values and tick marks. 
	 */
	public void setTickValueDistance(String value) 
	{
		setAttribute(PARAMETER_TICKVALUEDISTANCE, value);
	}
	
	/**
	 * Type: Boolean (0/1)
	 * 
	 * Whether to eliminate overlapping of tick values and overlapping trend values. 
	 */
	public void setManageValueOverlapping(String value) 
	{
		setAttribute(PARAMETER_MANAGEVALUEOVERLAPPING, value);
	}
	
	/**
	 * Type: Boolean (0/1)
	 * 
	 * Whether to ask the chart to automatically place tick values to reduce overlapping of the tick values with the gauge.
	 */
	public void setAutoAlignTickValues(String value) 
	{
		setAttribute(PARAMETER_AUTOALIGNTICKVALUES, value);
	}
	
	/**
	 * Create colorRange section.
	 * 
	 * @return ColorRange node
	 */
    public ColorRange createColorRangeNode() 
    {
    	ColorRange node = new ColorRange();
        addNode(node);
        return node;
    }
    
	/**
	 * Create dials section.
	 * 
	 * @return Dials node
	 */
    public Dials createDialsNode() 
    {
    	Dials node = new Dials();
        addNode(node);
        return node;
    }
    
	/**
	 * Create trendpoints section.
	 * 
	 * @return Trendpoints node
	 */
    public Trendpoints createTrendpointsNode() 
    {
    	Trendpoints node = new Trendpoints();
        addNode(node);
        return node;
    }
    
	/**
	 * Create annotations section.
	 * 
	 * @return Annotations node
	 */
    public Annotations createAnnotationsNode() 
    {
    	Annotations node = new Annotations();
        addNode(node);
        return node;
    }
}