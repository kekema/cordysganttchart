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
public class Annotations extends com.raisepartner.chartfusion.api.Node 
{
	public Annotations() 
	{
		super("annotations");
	}
	
    public AnnotationGroup createAnnotationGroup() 
    {
    	AnnotationGroup node = new AnnotationGroup();
        addNode(node);
        return node;
    }
}