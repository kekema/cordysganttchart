package com.ekemait.charting.chart.ganttchart.calendar;

import java.util.Calendar;

import com.ekemait.charting.chart.ganttchart.GanttChart;
import com.ekemait.charting.fusion.ganttchart.Categories;
import com.ekemait.charting.fusion.ganttchart.Category;
import com.ekemait.charting.util.Util;

public class TimeScale
{
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
	
	public void addToFusionGanttChart(com.ekemait.charting.fusion.ganttchart.GanttChart fusionGanttChart)
	{
		Calendar tsStartDate = Calendar.getInstance();
		tsStartDate.setTime(chartCalendar.getStartDate());
		Calendar tsEndDate = Calendar.getInstance();
		tsEndDate.setTime(chartCalendar.getEndDate());
		Calendar tsCurrentDate = Calendar.getInstance();
		
		Calendar catStartDate = Calendar.getInstance();
		Calendar catEndDate = Calendar.getInstance();
		
		Categories categories = fusionGanttChart.createCategoriesNode();
		categories.setAttribute("bgColor", "D5F0FF");
		categories.setAttribute("fontColor", "017BBE");
		
		if (this.timeUnit == TU_DAYS)
		{
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
					tsCurrentDate.set(Calendar.DAY_OF_WEEK, tsCurrentDate.getActualMaximum(Calendar.DAY_OF_WEEK));
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