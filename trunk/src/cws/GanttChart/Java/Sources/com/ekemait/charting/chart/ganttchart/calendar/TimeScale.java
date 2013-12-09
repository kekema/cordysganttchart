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

package com.ekemait.charting.chart.ganttchart.calendar;

import java.util.Calendar;

import com.ekemait.charting.chart.ganttchart.ChartConfig;
import com.ekemait.charting.chart.ganttchart.GanttChart;
import com.ekemait.charting.fusion.ganttchart.Categories;
import com.ekemait.charting.fusion.ganttchart.Category;
import com.ekemait.charting.util.Util;

/**
 * Class to define a time scale for a calendar.
 * 
 * @author kekema
 * 
 */
public class TimeScale
{
	// supported time units
	public static final int TU_DAYS = 10;
	public static final int TU_WEEKS = 20;
	public static final int TU_MONTHS = 30;
	
	private int timeUnit;
	private ChartCalendar chartCalendar;
	
	protected TimeScale(ChartCalendar chartCalendar, int timeUnit)
	{
		this.chartCalendar = chartCalendar;
		this.timeUnit = timeUnit;
	}
	
	/**
	 * Add this time scale instance to the given fusion chart
	 * 
	 * @param fusionGanttChart Fusion chart instance
	 */
	public void addToFusionGanttChart(com.ekemait.charting.fusion.ganttchart.GanttChart fusionGanttChart)
	{
		// take startdate and enddate as per chart calendar
		Calendar tsStartDate = Calendar.getInstance();
		tsStartDate.setTime(chartCalendar.getStartDate());
		Calendar tsEndDate = Calendar.getInstance();
		tsEndDate.setTime(chartCalendar.getEndDate());
		Calendar tsCurrentDate = Calendar.getInstance();
		
		Calendar catStartDate = Calendar.getInstance();
		Calendar catEndDate = Calendar.getInstance();
		
		Categories categories = fusionGanttChart.createCategoriesNode();
		categories.setAttribute("bgColor", ChartConfig.getValue("calendarBgColor"));
		categories.setAttribute("fontColor", ChartConfig.getValue("calendarFontColor"));
		
		if (this.timeUnit == TU_DAYS)
		{
			// days time scale
			// for each date, add a fusion category
			tsCurrentDate.setTime(tsStartDate.getTime());
			while (tsCurrentDate.getTime().getTime() <= tsEndDate.getTime().getTime())
			{
				catStartDate.setTime(tsCurrentDate.getTime());
				catStartDate.set(Calendar.HOUR_OF_DAY, 0);
				catStartDate.set(Calendar.MINUTE, 0);
				catStartDate.set(Calendar.SECOND, 0);
	
				catEndDate.setTime(tsCurrentDate.getTime());
				catEndDate.set(Calendar.HOUR_OF_DAY, 23);
				catEndDate.set(Calendar.MINUTE, 59);
				catEndDate.set(Calendar.SECOND, 59);
				
				Category category = categories.createCategoryNode();
				category.setStart(Util.formatDate(catStartDate.getTime(), GanttChart.FC_INPUTDATE_JAVAFORMAT));
				category.setEnd(Util.formatDate(catEndDate.getTime(), GanttChart.FC_INPUTDATE_JAVAFORMAT));
				category.setLabel(Util.formatDate(tsCurrentDate.getTime(), "dd"));
				
				category.setAttribute("isBold", "0");
				
				tsCurrentDate.add(Calendar.DAY_OF_MONTH, 1);
			}
		}
		else if ((this.timeUnit == TU_MONTHS) || (this.timeUnit == TU_WEEKS))
		{
			// month or weeks time scale 
			tsCurrentDate.setTime(tsStartDate.getTime());
			while (tsCurrentDate.getTime().getTime() < tsEndDate.getTime().getTime())
			{
				catStartDate.setTime(tsCurrentDate.getTime());
				catStartDate.set(Calendar.HOUR_OF_DAY, 0);
				catStartDate.set(Calendar.MINUTE, 0);
				catStartDate.set(Calendar.SECOND, 0);
	
				if (this.timeUnit == TU_MONTHS)
				{
					tsCurrentDate.set(Calendar.DAY_OF_MONTH, tsCurrentDate.getActualMaximum(Calendar.DAY_OF_MONTH));
				}
				else
				{
					// weeks
					Calendar saveDate = (Calendar)tsCurrentDate.clone();
					tsCurrentDate.set(Calendar.DAY_OF_WEEK, tsCurrentDate.getActualMaximum(Calendar.DAY_OF_WEEK));
					// 09-dec-2013: encountered a situation in which tsCurrentDate.get(Calendar.DAY_OF_WEEK) gave 1, but setting the day to the max day of week (7) resulted
					// in the date being set to the last day in previous week. Unclear why. Resolved by adding below if statement.
					if (tsCurrentDate.getTime().getTime() < saveDate.getTime().getTime())
					{
						tsCurrentDate.add(Calendar.DAY_OF_WEEK, 7);
					}
				}
				tsCurrentDate.set(Calendar.HOUR_OF_DAY, 23);
				tsCurrentDate.set(Calendar.MINUTE, 59);
				tsCurrentDate.set(Calendar.SECOND, 59);
				
				if (tsCurrentDate.getTime().getTime() < tsEndDate.getTime().getTime())
				{
					catEndDate.setTime(tsCurrentDate.getTime());
				}
				else
				{
					catEndDate.setTime(tsEndDate.getTime());
					catEndDate.set(Calendar.HOUR_OF_DAY, 23);
					catEndDate.set(Calendar.MINUTE, 59);
					catEndDate.set(Calendar.SECOND, 59);
				}

				Category category = categories.createCategoryNode();
				category.setStart(Util.formatDate(catStartDate.getTime(), GanttChart.FC_INPUTDATE_JAVAFORMAT));
				category.setEnd(Util.formatDate(catEndDate.getTime(), GanttChart.FC_INPUTDATE_JAVAFORMAT));
				if (this.timeUnit == TU_MONTHS)
				{
					category.setLabel(Util.formatDate(tsCurrentDate.getTime(), "MMM yyyy"));
				}
				else
				{
					// weeks
					category.setLabel("Week " + Util.formatDate(tsCurrentDate.getTime(), "ww"));
				}
				
				tsCurrentDate.set(Calendar.HOUR_OF_DAY, 0);
				tsCurrentDate.set(Calendar.MINUTE, 0);
				tsCurrentDate.set(Calendar.SECOND, 0);
				tsCurrentDate.add(Calendar.DAY_OF_MONTH, 1);
			}
		}
	}
}