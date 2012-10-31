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

package com.ekemait.charting.chart.ganttchart;

import java.util.HashMap;

/**
 * Chart config settings
 * 
 * @author kekema
 *
 */
public class ChartConfig
{
	static boolean configInitialized = false;
	// configuration values
	static HashMap<String, String> cv = new HashMap<String, String>();
	
	/**
	 * Get configuration value for key
	 * 
	 * @param key
	 * @return
	 */
	public static String getValue(String key)
	{
		if (!configInitialized)
		{
			initializeConfig();
			configInitialized = true;
		}
		return(cv.get(key));
	}
	
	private static void initializeConfig()
	{
		// gantt chart
		cv.put("canvasBorderColor", "017BBE");
		// calendar
		cv.put("nonWorkableDayColor", "FFCC7F");
		// calendar timescale
		cv.put("calendarBgColor", "D5F0FF");
		cv.put("calendarFontColor", "017BBE");
		// columns
		cv.put("columnHeaderFontColor", "017BBE");
		cv.put("columnHeaderBgColor", "D5F0FF");
		cv.put("columnFontColor", "017BBE");
		cv.put("columnBgColor", "F0FAFF");
		// rows
		cv.put("rowHeaderFontColor", "017BBE");
		cv.put("rowHeaderBgColor", "D5F0FF");
		cv.put("rowBgColor", "D5F0FF");
		cv.put("rowFontColor", "017BBE");
		cv.put("rowBgAlpha", "60");
		// milestone events
		cv.put("plannedMilestoneBorderColor", "575757");
		cv.put("plannedMilestoneColor", "FFFFFF");
		cv.put("plannedExternalMilestoneColor", "017BBE");
		cv.put("plannedExternalMilestoneAlpha", "70");
		// tasks
		cv.put("summaryTaskColor", "017BBE");
		cv.put("taskColor", "D5F0FF");
	}
}