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
public class ColorRange extends com.raisepartner.chartfusion.api.Node 
{
	public ColorRange() 
	{
		super("colorRange");
	}
	
    public Color createColorNode() 
    {
    	Color node = new Color();
        addNode(node);
        return node;
    }
}