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
 * Each <datacolumn> element adds a column to the chart's data grid. 
 *
 */
public class DataColumn extends com.raisepartner.chartfusion.api.Node 
{
	public final static String PARAMETER_HEADERTEXT = "headerText";
	public final static String PARAMETER_HEADERALIGN = "headerAlign";
	public final static String PARAMETER_ALIGN = "align";
	
	
	public DataColumn() 
	{
		super("datacolumn");
	}
	
    public Text createTextNode()
    {
    	Text node = new Text();
        addNode(node);
        return node;
    }
    
	/**
	 * Type: String 
	 * 
	 * Label for the header. 
	 */
	public void setHeaderText(String value) 
	{
		setAttribute(PARAMETER_HEADERTEXT, value);
	}
	
	/**
	 * Type: String - left, center or right 
	 * 
	 * Horizontal alignment position for the column header. 
	 */
	public void setHeaderAlign(String value) 
	{
		setAttribute(PARAMETER_HEADERALIGN, value);
	}
	
	/**
	 * Type: String - left, center or right 
	 * 
	 * Horizontal alignment position for all the cells in this data column.
	 */
	public void setAlign(String value) 
	{
		setAttribute(PARAMETER_ALIGN, value);
	}
}