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
 * The Gantt chart is a specialized chart used for displaying various timelines like project timelines, development timelines etc.
 *
 */
public class GanttChart extends com.raisepartner.chartfusion.api.Node
{
	
	public final static String PARAMETER_MANAGERESIZE = "manageResize";
	public final static String PARAMETER_DATEFORMAT = "dateFormat";
	public final static String PARAMETER_OUTPUTDATEFORMAT = "outputDateFormat";
	public final static String PARAMETER_CAPTION = "caption";
	public final static String PARAMETER_SUBCAPTION = "subCaption";
	public final static String PARAMETER_SHOWSLACKASFILL = "showSlackAsFill";
	public final static String PARAMETER_SHOWPERCENTLABEL = "showPercentLabel";
	public final static String PARAMETER_GANTTPANEDURATION = "ganttPaneDuration";
	public final static String PARAMETER_GANTTPANEDURATIONUNIT = "ganttPaneDurationUnit";
	public final static String PARAMETER_ANIMATION = "animation";
	public final static String PARAMETER_EXPORTENABLED = "exportEnabled";
	public final static String PARAMETER_EXPORTATCLIENT = "exportAtClient";
	public final static String PARAMETER_EXPORTHANDLER = "exportHandler";
	public final static String PARAMETER_EXPORTFILENAME = "exportFileName";
	public final static String PARAMETER_SHOWEXPORTDIALOG = "showExportDialog";
	public final static String PARAMETER_SHOWABOUTMENUITEM = "showAboutMenuItem";
	
	public GanttChart() 
	{
		super("chart");
	}
	
	/**
	 * Type: Boolean 
	 * Range value: 0/1 
	 * 
	 * Setting this attribute to 1, you can allow the chart to automatically resize itself 
	 * when the parent container of the chart is resized. 
	 */
	public void setManageResize(String value) 
	{
		setAttribute(PARAMETER_MANAGERESIZE, value);
	}
	
	/**
	 * Type: String 
	 * Range value: mm/dd/yyyy or dd/mm/yyyy or yyyy/mm/dd
	 * 
	 * This attribute helps you specify the input date format for all the dates in your XML. This is a 
	 * mandatory attribute to specify and once specified, all the dates in your XML data should 
	 * conform to the format specified herein. 
	 */
	public void setDateFormat(String value) 
	{
		setAttribute(PARAMETER_DATEFORMAT, value);
	}
	
	/**
	 * Type: String 
	 * Range value: see online fusion documentation
	 * 
	 * You can also specify how the dates look on your Gantt chart using this attribute. This attribute takes the output date format as string. 
	 */
	public void setOuputDateFormat(String value) 
	{
		setAttribute(PARAMETER_OUTPUTDATEFORMAT, value);
	}
	
	/**
	 * Type: String 
	 * 
	 * Caption for the chart. 
	 */
	public void setCaption(String value) 
	{
		setAttribute(PARAMETER_CAPTION, value);
	}
	
	/**
	 * Type: String 
	 * 
	 * Sub-caption for the chart. 
	 */
	public void setSubCaption(String value) 
	{
		setAttribute(PARAMETER_SUBCAPTION, value);
	}
	
	/**
	 * Type: Boolean 
	 * Range value: 0/1 
	 * 
	 * If you've used the percentage task feature, you can opt to show the slack (percent of work not completed) as 
	 * either a filled bar or empty bar. To draw as empty bars, set this attribute as 0.
	 */
	public void setShowSlackAsFill(String value) 
	{
		setAttribute(PARAMETER_SHOWSLACKASFILL, value);
	}
	
	/**
	 * Type: Boolean 
	 * Range value: 0/1 
	 * 
	 * If you've used the percentage task feature, you can opt to show the percent complete 
	 * for each task as part of the task label by setting this attribute as 1. 
	 */
	public void setShowPercentLabel(String value) 
	{
		setAttribute(PARAMETER_SHOWPERCENTLABEL, value);
	}
	
	/**
	 * Type: Number
	 * 
	 * If you want your Gantt pane to scroll through a specified time line, you can use this attribute to 
	 * set what timeline the pane will represent. For example, if you want your Gantt pane to show date only 
	 * for 3 months and then scroll the rest, you can set this attribute as 3.
	 */
	public void setGanttPaneDuration(String value) 
	{
		setAttribute(PARAMETER_GANTTPANEDURATION, value);
	}
	
	/**
	 * Type: String - y,m,d, h, mn or s 
	 * 
	 * If you've opted to scroll the Gantt pane, this attribute lets you choose the unit of your specified duration. 
	 */
	public void setGanttPaneDurationUnit(String value) 
	{
		setAttribute(PARAMETER_GANTTPANEDURATIONUNIT, value);
	}
	
	/**
	 * Type: Boolean (0/1) 
	 * 
	 * Whether to animate the chart while rendering? If you define this attribute as 0, even 
	 * your custom defined Style animations will not work. 
	 */
	public void setAnimation(String value) 
	{
		setAttribute(PARAMETER_ANIMATION, value);
	}
	
	/**
	 * Type: Boolean (0/1) 
	 * 
	 * Whether the chart will allow exporting to images/PDFs. 
	 */
	public void setExportEnabled(String value) 
	{
		setAttribute(PARAMETER_EXPORTENABLED, value);
	}
	
	/**
	 * Type: Boolean (0/1) 
	 * 
	 * Whether to use client-side export handlers, or server-side export handlers. 
	 */
	public void setExportAtClient(String value) 
	{
		setAttribute(PARAMETER_EXPORTATCLIENT, value);
	}

	/**
	 * Type: String
	 * 
	 * In case of server-side exporting, this refers to the path of the server-side export handler 
	 * (the ready-to-use scripts that we provide). Make sure to provide the file name along with the path. 
	 * In case of client-side exporting, this refers to the DOM-Id of FusionCharts Export component 
	 * that is embedded in your web page, along with the chart. 
	 */
	public void setExportHandler(String value) 
	{
		setAttribute(PARAMETER_EXPORTHANDLER, value);
	}
	
	/**
	 * Type: String
	 * 
	 * Using this attribute you can specify the name (excluding the extension) of the output (export) file. 
	 */
	public void setExportFileName(String value) 
	{
		setAttribute(PARAMETER_EXPORTFILENAME, value);
	}
	
	/**
	 * Type: Boolean (0/1) 
	 * 
	 * Whether to show the export dialog during capture phase. If not, the chart starts capturing process without the dialog visible.
	 */
	public void setShowExportDialog(String value) 
	{
		setAttribute(PARAMETER_SHOWEXPORTDIALOG, value);
	}
	
	/**
	 * Type: Boolean (0/1) 
	 * 
	 * Whether to show the 'About ...' menu item upon right-click.
	 */
	public void setShowAboutMenuItem(String value) 
	{
		setAttribute(PARAMETER_SHOWABOUTMENUITEM, value);
	}
	
	/**
	 * Each <categories> element represents one visual timeline on the chart. 
	 * The timeline divisions are controlled by child <category> elements of <categories> element. 
	 * Each <category> element distributes the time line into visual divisions.
	 * 
	 * @return Categories node
	 */
    public Categories createCategoriesNode() 
    {
        Categories node = new Categories();
        addNode(node);
        return node;
    }
    
    /**
     * The <datatable> element lets you add your own data to the data-grid of the chart.
     * 
     * @return DataTable node
     */
    public DataTable createDataTableNode() 
    {
        DataTable node = new DataTable();
        addNode(node);
        return node;
    }
    
    /**
     * All the processes for the chart are grouped under the <processes> element. 
     * Each process is represented by an individual <process> element. 
     * Each <process> element represents one process on the Gantt chart. You can show team members, projects or task list as a process.
     * 
     * @return Processes node
     */
    public Processes createProcessesNode() 
    {
        Processes node = new Processes();
        addNode(node);
        return node;
    }
    
    /**
     * The <tasks> element groups all the tasks that we've to show in the chart. 
     * Each task is represented by a <task> element which is a child of <tasks> element. 
     * Each <task> element represents a task bar on the chart.
     * 
     * @return Tasks node
     */
    public Tasks createTasksNode() 
    {
        Tasks node = new Tasks();
        addNode(node);
        return node;
    }
    
    /**
     * Milestones visually depict any crucial dates on the chart.
     * 
     * @return Milestones node
     */
    public Milestones createMilestonesNode() 
    {
        Milestones node = new Milestones();
        addNode(node);
        return node;
    }
    
    /**
     * Using the <trendLines> element (and children <line> elements), you can define trend lines on the chart.
     * Trend lines are horizontal lines spanning the chart canvas which aid in interpretation of data with respect to some pre-determined value. 
     * For example, if you are plotting sales data of current year, you might want to add previous year's average monthly sales as trend indicator for ease of comparison.
     * 
     * @return Trendlines node
     */
    public Trendlines createTrendlinesNode() 
    {
        Trendlines node = new Trendlines();
        addNode(node);
        return node;
    }
    
}