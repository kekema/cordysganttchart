package com.ekemait.charting.chart.ganttchart.column;

import com.ekemait.charting.chart.ganttchart.row.Rows;
import com.ekemait.charting.fusion.ganttchart.DataColumn;
import com.ekemait.charting.fusion.ganttchart.DataTable;

public class Column
{
	private String name;
	
	protected Column()
	{
		super();
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public String getName()
	{
		return(this.name);
	}
	
	public void addToFusionGanttChart(DataTable fcDataTable, Rows rows)
	{
		DataColumn fcDataColumn = fcDataTable.createDataColumnNode();
		fcDataColumn.setHeaderText(name);
		fcDataColumn.setAlign("left");
		rows.addColumnTextToFusionGanttChart(fcDataColumn, name);
	}
}