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
 * The <datatable> element lets you add your own data to the data-grid of the chart. 
 *
 */
public class DataTable extends com.raisepartner.chartfusion.api.Node 
{
	public final static String PARAMETER_HEADERALIGN = "headerAlign";
	public final static String PARAMETER_HEADERVALIGN = "headerVAlign";
	
	public DataTable() 
	{
		super("datatable");
	}
	
	/**
	 * Type: String - left, center or right 
	 * 
	 * Horizontal alignment position for all column headers in the data table. 
	 */
	public void setHeaderAlign(String value) 
	{
		setAttribute(PARAMETER_HEADERALIGN, value);
	}
	
	/**
	 * Type: String - top, middle or bottom 
	 * 
	 * Vertical alignment position for all column headers in the data table.
	 */
	public void setHeaderVAlign(String value) 
	{
		setAttribute(PARAMETER_HEADERVALIGN, value);
	}
	
    public DataColumn createDataColumnNode()
    {
    	DataColumn node = new DataColumn();
        addNode(node);
        return node;
    }
}