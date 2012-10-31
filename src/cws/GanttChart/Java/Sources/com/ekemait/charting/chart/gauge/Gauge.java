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

import com.ekemait.charting.fusion.annotations.Annotation;
import com.ekemait.charting.fusion.annotations.AnnotationGroup;
import com.ekemait.charting.fusion.annotations.Annotations;
import com.ekemait.charting.fusion.gauge.Dial;
import com.ekemait.charting.fusion.gauge.Dials;
import com.ekemait.charting.fusion.gauge.Point;
import com.ekemait.charting.fusion.gauge.Trendpoints;


/**
 * Gauge chart abstraction on top of external libraries; currently FusionCharts supported.
 * 
 * @author kekema
 *
 */
public class Gauge
{
	private int currentValue;
	private int targetValue;
	private boolean targetValueSet = false;
	private boolean currentValueSet = false;
	private String valueSuffix = null;
	private boolean createBackground = false;
	private String backgroundFillColor = null;
	
	private Ranges ranges = new Ranges();
	
	/**
	 * Get the Ranges instance to enable creating a number of ranges
	 * 
	 * @return Ranges
	 */
	public Ranges getRanges()
	{
		return this.ranges;
	}
	
	public void setCurrentValue(int currentValue)
	{
		this.currentValue = currentValue;
		this.currentValueSet = true;
	}
	
	public int getCurrentValue()
	{
		return this.currentValue;
	}
	
	public void setTargetValue(int targetValue)
	{
		this.targetValue = targetValue;
		this.targetValueSet = true;
	}
	
	public int getTargetValue()
	{
		return this.targetValue;
	}
	
	public void setValueSuffix(String valueSuffix)
	{
		this.valueSuffix = valueSuffix;
	}
	
	public String getValueSuffix()
	{
		return this.valueSuffix;
	}
	
	public void createBackground(String fillColor)
	{
		this.backgroundFillColor = fillColor;
		this.createBackground = true;
	}
	
	/**
	 * Generate a FusionCharts instance of this gauge.
	 * The resulting chart can be used by the application to apply any further specific customizations, 
	 * and then apply toString() to get the XML.
	 * 
	 * @return fusion Gauge
	 */
	public com.ekemait.charting.fusion.gauge.Gauge generateFusionGauge()
	{
		com.ekemait.charting.fusion.gauge.Gauge fcGauge = new com.ekemait.charting.fusion.gauge.Gauge();
		fcGauge.setManageResize("1");
		fcGauge.setOrigW("350");
		fcGauge.setOrigH("200");
		fcGauge.setPalette("2");
		fcGauge.setBgAlpha("0");
		fcGauge.setBgColor("FFFFFF");
		fcGauge.setLowerLimit(String.valueOf(ranges.minValue()));
		fcGauge.setUpperLimit(String.valueOf(ranges.maxValue()));
		fcGauge.setNumberSuffix(valueSuffix);
		fcGauge.setShowBorder("0");
		fcGauge.setBasefontColor("FFFFDD");
		fcGauge.setChartTopMargin("5");
		fcGauge.setChartBottomMargin("5");
		fcGauge.setToolTipBgColor("009999");
		fcGauge.setGaugeFillMix("{dark-10},{light-70},{dark-10}");
		fcGauge.setGaugeFillRatio("3");
		fcGauge.setPivotRadius("8");
		fcGauge.setGaugeOuterRadius("120");
		fcGauge.setGaugeInnerRadius("70%");
		fcGauge.setGaugeOriginX("175");
		fcGauge.setGaugeOriginY("170");
		fcGauge.setTrendValueDistance("15");
		fcGauge.setTickValueDistance("15");
		fcGauge.setManageValueOverlapping("1");
		fcGauge.setAutoAlignTickValues("1");
		ranges.addToFusionGauge(fcGauge);
		if (currentValueSet)
		{
			Dials dials = fcGauge.createDialsNode();
			Dial dial = dials.createDialNode();
			dial.setValue(String.valueOf(currentValue));
			dial.setShowValue("1");
			dial.setRearExtension("10");
			dial.setBaseWidth("10");
		}
		if (targetValueSet)
		{
			Trendpoints trendpoints = fcGauge.createTrendpointsNode();
			Point point = trendpoints.createPointNode();
			point.setStartValue(String.valueOf(targetValue));
			point.setDisplayValue("Target");
			point.setUseMarker("0");
			point.setDashed("1");
			point.setDashLen("2");
			point.setDashGap("2");
		}
		if (createBackground)
		{
			Annotations annotations = fcGauge.createAnnotationsNode();
			AnnotationGroup annotationGroup = annotations.createAnnotationGroup();
			annotationGroup.setId("Grp1");
			annotationGroup.setShowBelow("1");
			annotationGroup.setShowShadow("1");
			annotationGroup.setVisible("1");
			Annotation annotation = annotationGroup.createAnnotation();
			annotation.setType("rectangle");
			//macro seems not to work
			//annotation.setX("$chartStartX+5");
			//annotation.setY("$chartStartY+5");
			//annotation.setToX("$chartEndX-5");
			//annotation.setToY("$chartEndY-5");
			annotation.setX("5");
			annotation.setY("5");
			annotation.setToX("450");
			annotation.setToY("280");
			annotation.setRadius("10");
			annotation.setFillColor(String.valueOf(backgroundFillColor));
			annotation.setShowBorder("0");
		}
		return fcGauge;
	}
}