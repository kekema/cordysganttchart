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
 * In an angular gauge, dials are used to point to the desired value. You can point to more than one value using 
 * multiple dials. Each dial can have its individual properties like color (border and background), width 
 * (both base and top), radius and value of the dial.
 *
 */
public class Dials extends com.raisepartner.chartfusion.api.Node 
{
	public Dials() 
	{
		super("dials");
	}
	
    public Dial createDialNode() 
    {
    	Dial node = new Dial();
        addNode(node);
        return node;
    }
}