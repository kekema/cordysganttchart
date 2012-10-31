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

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import com.ekemait.charting.chart.ganttchart.ChartConfig;
import com.ekemait.charting.chart.ganttchart.GanttChart;
import com.ekemait.charting.fusion.ganttchart.Line;
import com.ekemait.charting.fusion.ganttchart.Trendlines;
import com.ekemait.charting.util.Util;

/**
 * Class to define a calendar for a gantt chart. It enables to define 1 or more time scales (days, weeks and/or months).
 * In addition, the non-workable days can be specified.
 * 
 * @author kekema
 * 
 */
public class ChartCalendar
{
	private final static String NW_DATE_FORMAT = "dd/MM/yyyy";
	// start date of calendar
	private Date startDate;
	// end date of calendar
	private Date endDate;
	
	// non workable days every week
	private List<Integer> nonWorkableDaysOfWeek = new ArrayList<Integer>();
	// additional specific non workable dates
	private List<String> nonWorkableDates = new ArrayList<String>();
	
    /**
     * The list of time scales
     */
	private final List<TimeScale> timeScaleChildren = new ArrayList<TimeScale>();
	
	/**
	 * Get the calendar start date
	 */
	public Date getStartDate()
	{
		return (this.startDate);
	}
	
	/**
	 * Set the calendar start date
	 * 
	 * @param startDate
	 */
	public void setStartDate(Date startDate)
	{
		this.startDate = Util.startOfDay(startDate);
	}
	
	/**
	 * Get the calendar end date
	 */
	public Date getEndDate()
	{
		return (this.endDate);
	}
	
	/**
	 * Set the calendar end date
	 * 
	 * @param endDate
	 */
	public void setEndDate(Date endDate)
	{
		this.endDate = Util.endOfDay(endDate);
	}
	
	/**
	 * Mark a day of the week (Sun-Sat) as non-workable.
	 * 
	 * @param dayOfWeek as per Calendar.DAY_OF_WEEK, for example Calendar.SUNDAY)
	 */
	public void setNonWorkableDayOfWeek(int dayOfWeek)
	{
		Integer dow = Integer.valueOf(dayOfWeek);
		if (!nonWorkableDaysOfWeek.contains(dow))
		{
			nonWorkableDaysOfWeek.add(dow);
		}
	}
	
	/**
	 * Mark a specific date as non-workable.
	 * 
	 * @param nonWorkableDate
	 */
	public void setNonWorkableDate(Date nonWorkableDate)
	{
		String formattedDate = Util.formatDate(nonWorkableDate, NW_DATE_FORMAT);
		if (!this.nonWorkableDates.contains(formattedDate))
		{
			this.nonWorkableDates.add(formattedDate);
		}
	}
	
    /**
     * Create a time scale.
     * 
     * @param timeUnit (TimeScale.TU_DAYS, TimeScale.TU_WEEKS or TimeScale.TU_MONTHS)
     */
	public TimeScale createTimeScale(int timeUnit)
	{
		TimeScale timeScale = new TimeScale(this, timeUnit);
		timeScaleChildren.add(timeScale);
		return timeScale;
	}
	
    /**
     * Add this calendar instance to a fusion gantt chart
     * 
     * @param fusionGanttChart Fusion chart instance
     */
	public void addToFusionGanttChart(com.ekemait.charting.fusion.ganttchart.GanttChart fusionGanttChart)
	{
		// time scales
		for (TimeScale timeScale : timeScaleChildren) 
		{
			timeScale.addToFusionGanttChart(fusionGanttChart);
		}
		
		// non-workable days
		addNonWorkableDaysToFusionChart(fusionGanttChart);
	}
	
	private void addNonWorkableDaysToFusionChart(com.ekemait.charting.fusion.ganttchart.GanttChart fusionGanttChart)
	{
		Trendlines trendLinesNode = fusionGanttChart.createTrendlinesNode();
		// check each date within the time frame of the chart calendar if it's a non-workable day
		// compose adjacent non-workable days to an interval and depict in fusion gantt chart using trend lines
		Calendar currentDate = Calendar.getInstance();
		currentDate.setTime(startDate);
		while (currentDate.getTime().getTime() < endDate.getTime())
		{
			if (isNonWorkable(currentDate))
			{
				Line line = trendLinesNode.createLineNode();
				line.setIsTrendZone("1"); 
				line.setColor(ChartConfig.getValue("nonWorkableDayColor")); 
				line.setDisplayValue(" ");
				Calendar startInterval = Calendar.getInstance();
				startInterval.setTime(currentDate.getTime());
				line.setStart(Util.formatDate(startInterval.getTime(), GanttChart.FC_INPUTDATE_JAVAFORMAT));
				// search for end of non-workable interval
				currentDate.add(Calendar.DAY_OF_MONTH, 1);
				currentDate.set(Calendar.HOUR_OF_DAY, 0);
				currentDate.set(Calendar.MINUTE, 0);
				currentDate.set(Calendar.SECOND, 0);
				while (isNonWorkable(currentDate))
				{
					currentDate.add(Calendar.DAY_OF_MONTH, 1);
				}
				// go back to last non-workable date
				currentDate.add(Calendar.DAY_OF_MONTH, -1);
				Calendar endInterval = Calendar.getInstance();
				endInterval.setTime(currentDate.getTime());
				endInterval.set(Calendar.HOUR_OF_DAY, 23);
				endInterval.set(Calendar.MINUTE, 59);
				endInterval.set(Calendar.SECOND, 59);
				if (endInterval.getTime().getTime() > endDate.getTime())
				{
					endInterval.setTime(endDate);
				}
				line.setEnd(Util.formatDate(endInterval.getTime(), GanttChart.FC_INPUTDATE_JAVAFORMAT));
			}
			// increment
			currentDate.add(Calendar.DAY_OF_MONTH, 1);
		}
	}
	
	private boolean isNonWorkable(Calendar aDate)
	{
		boolean nonWorkable = false;
		int dow = aDate.get(Calendar.DAY_OF_WEEK);
		nonWorkable = (nonWorkableDaysOfWeek.contains(dow));
		if (!nonWorkable)
		{
			String formattedDate = Util.formatDate(aDate.getTime(), NW_DATE_FORMAT);
			nonWorkable = nonWorkableDates.contains(formattedDate);
		}
		return nonWorkable;
	}
}