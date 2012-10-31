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

import com.ekemait.charting.chart.ganttchart.calendar.ChartCalendar;
import com.ekemait.charting.chart.ganttchart.column.Columns;
import com.ekemait.charting.chart.ganttchart.row.Rows;
import com.ekemait.charting.util.Util;


/**
 * Gantt chart abstraction on top of external libraries; currently FusionCharts supported.
 * The gantt chart is constructed of a chart calendar (time scales plus definition of non-workable days), optionally a number 
 * of columns, plus a range of rows, where each row can have one or more tasks/events/milestones.
 * 
 * @author kekema
 * 
 */
public class GanttChart
{
	public static final String FC_INPUTDATE_FUSIONFORMAT = "dd/mm/yyyy";
	public static final String FC_INPUTDATE_JAVAFORMAT = "dd/MM/yyyy HH:mm";
	public static final String FC_OUTPUTDATE_FUSIONFORMAT = "dd mns hh:mn";
	public static final String FC_OUTPUTDATE_JAVAFORMAT = "dd MMM HH:mm";
	
	// caption/subcaption
	private String caption;
	private String subcaption;
	// number of days visible in window
	// if the chart calendar has more days, a horizontal scroll bar will appear
	private int numberVisibleDays = 0;
	// export parameters
	private String exportHandler;
	private String exportFileName;
	
	// gantt chart sub parts
	private ChartCalendar chartCalendar = new ChartCalendar();
	private Columns columns = new Columns();
	private Rows rows = new Rows();

	/**
	 * Get number of days visible in window
	 * If the chart calendar has more days, a horizontal scroll bar will appear
	 * 
	 * @return
	 */
	public int getNumberVisibleDays()
	{
		return this.numberVisibleDays;
	}
	
	/**
	 * Set number of days visible in window
	 * If the chart calendar has more days, a horizontal scroll bar will appear
	 * 
	 * @param numberVisibleDays
	 */
	public void setNumberVisibleDays(int numberVisibleDays)
	{
		this.numberVisibleDays = numberVisibleDays;
	}
	
	/**
	 * Get the chart caption.
	 */
	public String getCaption()
	{
		return this.caption;
	}
	
	/**
	 * Set the chart caption.
	 * 
	 * @param caption
	 */
	public void setCaption(String caption)
	{
		this.caption = caption;
	}
	
	/**
	 * Get the chart subcaption.
	 */
	public String getSubcaption()
	{
		return this.subcaption;
	}
	
	/**
	 * Set the chart subcaption.
	 * 
	 * @param subcaption
	 */
	public void setSubcaption(String subcaption)
	{
		this.subcaption = subcaption;
	}
	
	/**
	 * Get the chart export handler. This name refers to the name of the export object (client side) 
	 * as to be used to export to PDF, etc.
	 */
	public String getExportHandler()
	{
		return this.exportHandler;
	}
	
	/**
	 * Set the chart export handler. This name refers to the name of the export object (client side) 
	 * as to be used to export to PDF, etc.
	 * 	 
	 * @param exportHandler
	 */
	public void setExportHandler(String exportHandler)
	{
		this.exportHandler = exportHandler;
	}
	
	/**
	 * Get the chart export file name as to be used by the client side export functionality.
	 */
	public String getExportFileName()
	{
		return this.exportFileName;
	}
	
	/**
	 * Set the chart export file name as to be used by the client side export functionality.
	 * 	 
	 * @param exportFileName
	 */
	public void setExportFileName(String exportFileName)
	{
		this.exportFileName = exportFileName;
	}
	
	/**
	 * Get the ChartCalendar, which can be used to specify time scales and non-workable days.
	 * 
	 * @return ChartCalendar
	 */
	public ChartCalendar getChartCalendar()
	{
		return this.chartCalendar;
	}
	
	/**
	 * Get the Columns instance to enable creating custom columns.
	 * 
	 * @return Columns
	 */
	public Columns getColumns()
	{
		return this.columns;
	}
	
	/**
	 * Get the Rows instance to enable creating the rows for the chart.
	 * 
	 * @return Rows
	 */
	public Rows getRows()
	{
		return this.rows;
	}
		
	/**
	 * Generate a FusionCharts instance of this gantt chart.
	 * The resulting chart can be used by the application to apply any further specific customizations, 
	 * and then apply toString() to get the XML.
	 * 
	 * @return fusion GanttChart
	 */
	public com.ekemait.charting.fusion.ganttchart.GanttChart generateFusionGanttChart()
	{
		// initialize new fusion gantt chart
		com.ekemait.charting.fusion.ganttchart.GanttChart fcGanttChart = new com.ekemait.charting.fusion.ganttchart.GanttChart();
		// add the calendar
		chartCalendar.addToFusionGanttChart(fcGanttChart);
		// add the columns
		columns.addToFusionGanttChart(fcGanttChart, rows);
		// add the rows
		rows.addToFusionGanttChart(fcGanttChart);
		// set some attributes
		fcGanttChart.setManageResize("1");
		fcGanttChart.setDateFormat(GanttChart.FC_INPUTDATE_FUSIONFORMAT);
		fcGanttChart.setOuputDateFormat(GanttChart.FC_OUTPUTDATE_FUSIONFORMAT);
		fcGanttChart.setCaption(this.getCaption());
		fcGanttChart.setSubCaption(this.getSubcaption());
		if (this.getNumberVisibleDays() > 0)
		{
			fcGanttChart.setGanttPaneDuration(new Integer(this.getNumberVisibleDays()).toString());
			fcGanttChart.setGanttPaneDurationUnit("d");
		}
		fcGanttChart.setAnimation("0");
		// exporter settings
		if (Util.isSet(this.exportHandler))
		{
			fcGanttChart.setExportEnabled("1");
			fcGanttChart.setExportAtClient("1");
			fcGanttChart.setExportHandler(this.getExportHandler());
			fcGanttChart.setShowExportDialog("1");
			if (Util.isSet(this.exportFileName))
			{
				fcGanttChart.setExportFileName(this.exportFileName);
			}
		}
		fcGanttChart.setShowAboutMenuItem("0");
		// fcGanttChart.setAttribute("canvasBorderColor", "017BBE");
		fcGanttChart.setAttribute("canvasBorderColor", ChartConfig.getValue("canvasBorderColor"));
		return fcGanttChart;
	}
}