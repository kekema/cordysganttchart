package com.ekemait.charting.chart.ganttchart.column;

import java.util.ArrayList;
import java.util.List;

import com.ekemait.charting.chart.ganttchart.row.Rows;
import com.ekemait.charting.fusion.ganttchart.DataTable;

public class Columns
{
	private final List<Column> columnChildren = new ArrayList<Column>();
	
	public Column createColumn(String columnName)
	{
		Column column = new Column();
		column.setName(columnName);
		columnChildren.add(column);
		return column;
	}
	
	public void addToFusionGanttChart(com.ekemait.charting.fusion.ganttchart.GanttChart fcGanttChart, Rows rows)
	{
		if (!columnChildren.isEmpty())
		{
			DataTable fcDataTable = fcGanttChart.createDataTableNode();
			fcDataTable.setHeaderAlign("center");
			fcDataTable.setHeaderVAlign("bottom");
			fcDataTable.setAttribute("headerFontColor", "017BBE");
			fcDataTable.setAttribute("headerBgColor", "D5F0FF");
			fcDataTable.setAttribute("bgColor", "F0FAFF");
			fcDataTable.setAttribute("fontColor", "017BBE");
			fcDataTable.setAttribute("headerIsBold", "0");
			for (Column column : columnChildren) 
			{ 
			    column.addToFusionGanttChart(fcDataTable, rows);
			}
		}
	}
}