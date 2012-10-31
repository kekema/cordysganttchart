/*  
 *	Copyright 2012 Ekema IT   
 * 
 *  This file is part of Gantt Chart Java API   
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

package com.ekemait.charting.fusion.ganttchart;

/**
 * Using the <trendLines> element (and children <line> elements), you can define trend lines on the chart.
 * Trend lines are horizontal lines spanning the chart canvas which aid in interpretation of data with respect to 
 * some pre-determined value. For example, if you are plotting sales data of current year, you might want to add previous 
 * year's average monthly sales as trend indicator for ease of comparison.
 *
 */
public class Trendlines extends com.raisepartner.chartfusion.api.Node 
{
	public Trendlines() 
	{
		super("trendlines"); // TODO: or trendLines?
	}
	
    public Line createLineNode() 
    {
    	Line node = new Line();
        addNode(node);
        return node;
    }
}