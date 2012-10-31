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

package com.ekemait.charting;

import java.util.Calendar;

import com.cordys.cpc.bsf.busobject.BusObjectConfig;
import com.ekemait.charting.chart.ganttchart.GanttChart;
import com.ekemait.charting.chart.ganttchart.calendar.ChartCalendar;
import com.ekemait.charting.chart.ganttchart.calendar.TimeScale;
import com.ekemait.charting.chart.ganttchart.column.Columns;
import com.ekemait.charting.chart.ganttchart.row.Rows;
import com.ekemait.charting.chart.ganttchart.row.Row;
import com.ekemait.charting.chart.ganttchart.row.item.Task;
import com.ekemait.charting.chart.ganttchart.row.item.Milestone;
import com.ekemait.charting.chart.ganttchart.row.item.Event;

/**
 * Example class to illustrate the usage of the Charting API.
 * 
 * @author kekema
 * 
 */
public class Chart extends ChartBase
{
	// number of days to fit in the client side pane
	// if the chart has more days, a scrollbar will appear
	private static final int DEFAULT_NUMBER_VISIBLE_DAYS = 21;
	// minimum number of rows to generate
	private static final int MINIMUM_NUMBER_ROWS = 12;
	
    public Chart()
    {
        this((BusObjectConfig)null);
    }

    public Chart(BusObjectConfig config)
    {
        super(config);
    }

    /**
     * Get an example gantt chart
     * 
     * @return a fusion gantt chart in XML string representation
     */
    public static com.ekemait.charting.Chart getGanttChart()
    {
    	// ininialize new gantt chart
		GanttChart ganttChart = new GanttChart();
		ganttChart.setCaption("Claim Timeline");
		ganttChart.setSubcaption("Claim: 00000000000235626 - Status: For Approval");
		ganttChart.setNumberVisibleDays(DEFAULT_NUMBER_VISIBLE_DAYS);
		
		// set export parameters
		ganttChart.setExportHandler("fcExporter");
		ganttChart.setExportFileName("GanttChartExample");
		
		// set the chart calendar
		ChartCalendar chartCalendar = ganttChart.getChartCalendar();
		Calendar calDate = Calendar.getInstance();
		chartCalendar.setStartDate(calDate.getTime());
		calDate.add(Calendar.DAY_OF_MONTH, DEFAULT_NUMBER_VISIBLE_DAYS * 2);
		chartCalendar.setEndDate(calDate.getTime());
		
		chartCalendar.setNonWorkableDayOfWeek(Calendar.SATURDAY);
		chartCalendar.setNonWorkableDayOfWeek(Calendar.SUNDAY);
		
		chartCalendar.createTimeScale(TimeScale.TU_MONTHS);
		chartCalendar.createTimeScale(TimeScale.TU_WEEKS);
		chartCalendar.createTimeScale(TimeScale.TU_DAYS);
		
		// create the needed gantt chart columns
		Columns columns = ganttChart.getColumns();
		columns.createColumn("Handler"); 
		
		// create the gantt chart rows
		Rows rows = ganttChart.getRows();
		createChartRows(rows);
		
		// generate the fusion chart
		com.ekemait.charting.fusion.ganttchart.GanttChart fcGanttChart = ganttChart.generateFusionGanttChart();
		
		// any customization of the generated chart
		
		// add a trendline for today
		// Trendlines trendlines = fcGanttChart.createTrendlinesNode();
		// Line line = trendlines.createLineNode();
		// line.setStart(Util.formatDate(new Date(), GanttChart.FC_INPUTDATE_JAVAFORMAT));
		// line.setDisplayValue("Now");
		
		// set the return xml
		Chart chart = new Chart();
		String chartXML = fcGanttChart.toString();
	    chart.setChartXML(chartXML);
	    
	    // return the result
		return chart;  
    }
    
    /*
     * Add example chart rows 
     */
	private static void createChartRows(Rows rows)
	{
		int numberRows = 0;
		
		// add new row. Each row can have 1 or more tasks
		Row row = rows.createRow();
		row.setColumnText("Handler", "John");
		
		// summary task
		Task task = row.createTask();
		task.setDescription("Summary Task");
		Calendar calDate = Calendar.getInstance();
		task.setActualStartDate(calDate.getTime());
		calDate.add(Calendar.DAY_OF_MONTH, 12);
		task.setActualEndDate(calDate.getTime());
		task.setIsSummaryTask(true);
		numberRows++;
		
		// regular task
		row = rows.createRow();
		row.setColumnText("Handler", "Phillip");
		task = row.createTask();
		task.setDescription("Regular task");
		calDate = Calendar.getInstance();
		task.setActualStartDate(calDate.getTime());
		calDate.add(Calendar.DAY_OF_MONTH, 6);
		task.setActualEndDate(calDate.getTime());
		numberRows++;
		
		// regular task with planned end date
		row = rows.createRow();
		row.setColumnText("Handler", "Rachael");
		task = row.createTask();
		task.setDescription("Versus planned end date");
		calDate = Calendar.getInstance();
		calDate.add(Calendar.DAY_OF_MONTH, 2);
		task.setActualStartDate(calDate.getTime());
		calDate.add(Calendar.DAY_OF_MONTH, 4);
		task.setPlannedEndDate(calDate.getTime());
		calDate.add(Calendar.DAY_OF_MONTH, 2);
		task.setActualEndDate(calDate.getTime());
		numberRows++;
		
		// regular task with planned start/end
		row = rows.createRow();
		row.setColumnText("Handler", "Sudhir");
		task = row.createTask();
		task.setDescription("Versus planned dates");
		calDate = Calendar.getInstance();
		calDate.add(Calendar.DAY_OF_MONTH, 2);
		task.setPlannedStartDate(calDate.getTime());
		calDate.add(Calendar.DAY_OF_MONTH, 1);
		task.setActualStartDate(calDate.getTime());
		calDate.add(Calendar.DAY_OF_MONTH, 2);
		task.setPlannedEndDate(calDate.getTime());
		calDate.add(Calendar.DAY_OF_MONTH, 2);
		task.setActualEndDate(calDate.getTime());
		numberRows++;
		
		// repeating task, so one row with multiple tasks
		row = rows.createRow();
		row.setColumnText("Handler", "Roberto");
		task = row.createTask();
		task.setDescription("Repeating task");
		calDate = Calendar.getInstance();
		calDate.add(Calendar.DAY_OF_MONTH, 1);
		task.setActualStartDate(calDate.getTime());
		calDate.add(Calendar.DAY_OF_MONTH, 4);
		task.setActualEndDate(calDate.getTime());
		task = row.createTask();
		task.setDescription("Repeating task");
		calDate = Calendar.getInstance();
		calDate.add(Calendar.DAY_OF_MONTH, 6);
		task.setActualStartDate(calDate.getTime());
		calDate.add(Calendar.DAY_OF_MONTH, 3);
		task.setActualEndDate(calDate.getTime());
		task = row.createTask();
		task.setDescription("Repeating task");
		calDate = Calendar.getInstance();
		calDate.add(Calendar.DAY_OF_MONTH, 10);
		task.setActualStartDate(calDate.getTime());
		calDate.add(Calendar.DAY_OF_MONTH, 2);
		task.setActualEndDate(calDate.getTime());
		numberRows++;
		
		// milestone
		row = rows.createRow();
		Milestone milestone = row.createMilestone();
		milestone.setDescription("Milestone");
		//milestone.setPlannedEventDate(rowItem.plannedDate);
		//milestone.setExternalPlannedEventDate(rowItem.externalPlannedDate);
		calDate = Calendar.getInstance();
		calDate.add(Calendar.DAY_OF_MONTH, 12);
		milestone.setActualEventDate(calDate.getTime());
		numberRows++;
		
		// planned/actual milestone
		row = rows.createRow();
		milestone = row.createMilestone();
		milestone.setDescription("Versus planned");
		calDate = Calendar.getInstance();
		calDate.add(Calendar.DAY_OF_MONTH, 10);
		milestone.setPlannedEventDate(calDate.getTime());
		//milestone.setExternalPlannedEventDate(rowItem.externalPlannedDate);
		calDate.add(Calendar.DAY_OF_MONTH, 2);
		milestone.setActualEventDate(calDate.getTime());
		numberRows++;
		
		// event
		// can be used for example when a claim is rejected
		row = rows.createRow();
		Event event = row.createEvent();
		event.setDescription("Some event");
		calDate = Calendar.getInstance();
		calDate.add(Calendar.DAY_OF_MONTH, 6);
		event.setActualEventDate(calDate.getTime());
		numberRows++;
		
		// if less than minimum number of rows, fill up with empty rows
		// to prevent a to big row height
		for (int rn=numberRows; rn < MINIMUM_NUMBER_ROWS; rn++)
		{
			rows.createRow();
		}
	}

    public void onInsert()
    {
    }

    public void onUpdate()
    {
    }

    public void onDelete()
    {
    }

}
