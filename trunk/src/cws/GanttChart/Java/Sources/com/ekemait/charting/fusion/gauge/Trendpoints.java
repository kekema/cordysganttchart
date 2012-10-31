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
 * Trendpoints can be used to indicate target values, historical value, average value, etc.
 *
 */
public class Trendpoints extends com.raisepartner.chartfusion.api.Node 
{
	public Trendpoints() 
	{
		super("trendpoints");
	}
	
    public Point createPointNode() 
    {
    	Point node = new Point();
        addNode(node);
        return node;
    }
}