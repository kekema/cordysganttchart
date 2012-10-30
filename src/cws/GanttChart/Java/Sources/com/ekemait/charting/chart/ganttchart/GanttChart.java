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
	 * Number of days visible in window
	 * If the chart calendar has more days, a horizontal scroll bar will appear
	 * 
	 * @return
	 */
	public int getNumberVisibleDays()
	{
		return this.numberVisibleDays;
	}
	
	/**
	 * Number of days visible in window
	 * If the chart calendar has more days, a horizontal scroll bar will appear
	 * 
	 * @param numberVisibleDays
	 */
	public void setNumberVisibleDays(int numberVisibleDays)
	{
		this.numberVisibleDays = numberVisibleDays;
	}
	
	public String getCaption()
	{
		return this.caption;
	}
	
	public void setCaption(String caption)
	{
		this.caption = caption;
	}
	
	public String getSubcaption()
	{
		return this.subcaption;
	}
	
	public void setSubcaption(String subcaption)
	{
		this.subcaption = subcaption;
	}
	
	public String getExportHandler()
	{
		return this.exportHandler;
	}
	
	public void setExportHandler(String exportHandler)
	{
		this.exportHandler = exportHandler;
	}
	
	public String getExportFileName()
	{
		return this.exportFileName;
	}
	
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
		com.ekemait.charting.fusion.ganttchart.GanttChart fcGanttChart = new com.ekemait.charting.fusion.ganttchart.GanttChart();
		chartCalendar.addToFusionGanttChart(fcGanttChart);
		columns.addToFusionGanttChart(fcGanttChart, rows);
		rows.addToFusionGanttChart(fcGanttChart);
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
		fcGanttChart.setAttribute("canvasBorderColor", "017BBE");
		//fcGanttChart.setAttribute("chartTopMargin", "1");
		fcGanttChart.setAttribute("captionPadding", "10");
		//fcGanttChart.setAttribute("chartRightMargin", "1");
		fcGanttChart.setAttribute("logoURL", "/cordys/com/esure/claimhandling/pi/images/moj_logo_medium.png");
		fcGanttChart.setAttribute("logoPosition ", "TR");
		return fcGanttChart;
	}
}