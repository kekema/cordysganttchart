/**
 * Copyright (c) 2008 Raise Partner
 * 22, av. Doyen Louis Weil,
 * 38000 Grenoble, France
 * All rights reserved.
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
 *
 * Contact: sebastien@chassande.fr
 */
package com.raisepartner.chartfusion.api.mscolumn3dlinedy;

public class MSColumn3DLineDY extends com.raisepartner.chartfusion.api.Chart {

	public final static String PARAMETER_LABELDISPLAY = "labelDisplay";
	public final static String PARAMETER_ROTATELABELS = "rotateLabels";
	public final static String PARAMETER_SLANTLABELS = "slantLabels";
	public final static String PARAMETER_LABELSTEP = "labelStep";
	public final static String PARAMETER_STAGGERLINES = "staggerLines";
	public final static String PARAMETER_CONNECTNULLDATA = "connectNullData";
	public final static String PARAMETER_ROTATEVALUES = "rotateValues";
	public final static String PARAMETER_SHOWYAXISVALUES = "showYAxisValues";
	public final static String PARAMETER_SHOWLIMITS = "showLimits";
	public final static String PARAMETER_SHOWDIVLINEVALUES = "showDivLineValues";
	public final static String PARAMETER_YAXISVALUESSTEP = "yAxisValuesStep";
	public final static String PARAMETER_ADJUSTDIV = "adjustDiv";
	public final static String PARAMETER_SHOWSECONDARYLIMITS = "showSecondaryLimits";
	public final static String PARAMETER_SHOWDIVLINESECONDARYVALUE = "showDivLineSecondaryValue";
	public final static String PARAMETER_MAXCOLWIDTH = "maxColWidth";
	public final static String PARAMETER_USE3DLIGHTING = "use3DLighting";
	public final static String PARAMETER_SHOWSHADOW = "showShadow";
	public final static String PARAMETER_PYAXISMAXVALUE = "PYAxisMaxValue";
	public final static String PARAMETER_PYAXISMINVALUE = "PYAxisMinValue";
	public final static String PARAMETER_SYAXISMINVALUE = "SYAxisMinValue";
	public final static String PARAMETER_SYAXISMAXVALUE = "SYAxisMaxValue";
	public final static String PARAMETER_SETADAPTIVEYMIN = "setAdaptiveYMin";
	public final static String PARAMETER_SETADAPTIVESYMIN = "setAdaptiveSYMin";
	public final static String PARAMETER_ROTATEYAXISNAME = "rotateYAxisName";
	public final static String PARAMETER_PYAXISNAMEWIDTH = "PYAxisNameWidth";
	public final static String PARAMETER_SYAXISNAMEWIDTH = "SYAxisNameWidth";
	public final static String PARAMETER_XAXISNAME = "xAxisName";
	public final static String PARAMETER_PYAXISNAME = "PYAxisName";
	public final static String PARAMETER_SYAXISNAME = "SYAXisName";
	public final static String PARAMETER_CANVASBGCOLOR = "canvasBgColor";
	public final static String PARAMETER_CANVASBGALPHA = "canvasBgAlpha";
	public final static String PARAMETER_CANVASBASECOLOR = "canvasBaseColor";
	public final static String PARAMETER_SHOWCANVASBG = "showCanvasBg";
	public final static String PARAMETER_SHOWCANVASBASE = "showCanvasBase";
	public final static String PARAMETER_CANVASBASEDEPTH = "canvasBaseDepth";
	public final static String PARAMETER_CANVASBGDEPTH = "canvasBgDepth";
	public final static String PARAMETER_OVERLAPCOLUMNS = "overlapColumns";
	public final static String PARAMETER_SHOWPLOTBORDER = "showPlotBorder";
	public final static String PARAMETER_PLOTBORDERCOLOR = "plotBorderColor";
	public final static String PARAMETER_PLOTBORDERALPHA = "plotBorderAlpha";
	public final static String PARAMETER_PLOTFILLALPHA = "plotFillAlpha";
	public final static String PARAMETER_LINECOLOR = "lineColor";
	public final static String PARAMETER_LINETHICKNESS = "lineThickness";
	public final static String PARAMETER_LINEALPHA = "lineAlpha";
	public final static String PARAMETER_LINEDASHED = "lineDashed";
	public final static String PARAMETER_LINEDASHLEN = "lineDashLen";
	public final static String PARAMETER_LINEDASHGAP = "lineDashGap";
	public final static String PARAMETER_DRAWANCHORS = "drawAnchors";
	public final static String PARAMETER_ANCHORSIDES = "anchorSides";
	public final static String PARAMETER_ANCHORRADIUS = "anchorRadius";
	public final static String PARAMETER_ANCHORBORDERCOLOR = "anchorBorderColor";
	public final static String PARAMETER_ANCHORBORDERTHICKNESS = "anchorBorderThickness";
	public final static String PARAMETER_ANCHORBGCOLOR = "anchorBgColor";
	public final static String PARAMETER_ANCHORALPHA = "anchorAlpha";
	public final static String PARAMETER_ANCHORBGALPHA = "anchorBgAlpha";
	public final static String PARAMETER_NUMDIVLINES = "numDivLines";
	public final static String PARAMETER_DIVLINECOLOR = "divLineColor";
	public final static String PARAMETER_DIVLINETHICKNESS = "divLineThickness";
	public final static String PARAMETER_DIVLINEALPHA = "divLineAlpha";
	public final static String PARAMETER_DIVLINEISDASHED = "divLineIsDashed";
	public final static String PARAMETER_DIVLINEDASHLEN = "divLineDashLen";
	public final static String PARAMETER_DIVLINEDASHGAP = "divLineDashGap";
	public final static String PARAMETER_ZEROPLANECOLOR = "zeroPlaneColor";
	public final static String PARAMETER_ZEROPLANEALPHA = "zeroPlaneAlpha";
	public final static String PARAMETER_ZEROPLANESHOWBORDER = "zeroPlaneShowBorder";
	public final static String PARAMETER_ZEROPLANEBORDERCOLOR = "zeroPlaneBorderColor";
	public final static String PARAMETER_SHOWLEGEND = "showLegend";
	public final static String PARAMETER_LEGENDPOSITION = "legendPosition";
	public final static String PARAMETER_LEGENDBGCOLOR = "legendBgColor";
	public final static String PARAMETER_LEGENDBGALPHA = "legendBgAlpha";
	public final static String PARAMETER_LEGENDBORDERCOLOR = "legendBorderColor";
	public final static String PARAMETER_LEGENDBORDERTHICKNESS = "legendBorderThickness";
	public final static String PARAMETER_LEGENDBORDERALPHA = "legendBorderAlpha";
	public final static String PARAMETER_LEGENDSHADOW = "legendShadow";
	public final static String PARAMETER_LEGENDALLOWDRAG = "legendAllowDrag";
	public final static String PARAMETER_LEGENDSCROLLBGCOLOR = "legendScrollBgColor";
	public final static String PARAMETER_LEGENDSCROLLBARCOLOR = "legendScrollBarColor";
	public final static String PARAMETER_LEGENDSCROLLBTNCOLOR = "legendScrollBtnColor";
	public final static String PARAMETER_YAXISVALUEDECIMALS = "yAxisValueDecimals";
	public final static String PARAMETER_SFORMATNUMBER = "sFormatNumber";
	public final static String PARAMETER_SFORMATNUMBERSCALE = "sFormatNumberScale";
	public final static String PARAMETER_SDEFAULTNUMBERSCALE = "sDefaultNumberScale";
	public final static String PARAMETER_SNUMBERSCALEUNIT = "sNumberScaleUnit";
	public final static String PARAMETER_SNUMBERSCALEVALUE = "sNumberScaleValue";
	public final static String PARAMETER_SNUMBERPREFIX = "sNumberPrefix";
	public final static String PARAMETER_SNUMBERSUFFIX = "sNumberSuffix";
	public final static String PARAMETER_SDECIMALS = "sDecimals";
	public final static String PARAMETER_SYAXISVALUEDECIMALS = "sYAxisValueDecimals";
	public final static String PARAMETER_OUTCNVBASEFONT = "outCnvBaseFont";
	public final static String PARAMETER_OUTCNVBASEFONTSIZE = "outCnvBaseFontSize";
	public final static String PARAMETER_OUTCNVBASEFONTCOLOR = "outCnvBaseFontColor";
	public final static String PARAMETER_SERIESNAMEINTOOLTIP = "seriesNameInToolTip";
	public final static String PARAMETER_CANVASPADDING = "canvasPadding";
	public final static String PARAMETER_LEGENDPADDING = "legendPadding";
	public final static String PARAMETER_XAXISNAMEPADDING = "xAxisNamePadding";
	public final static String PARAMETER_YAXISNAMEPADDING = "yAxisNamePadding";
	public final static String PARAMETER_YAXISVALUESPADDING = "yAxisValuesPadding";
	public final static String PARAMETER_LABELPADDING = "labelPadding";
	public final static String PARAMETER_VALUEPADDING = "valuePadding";
	public final static String PARAMETER_PLOTSPACEPERCENT = "plotSpacePercent";

	public MSColumn3DLineDY() {
	}

	/**
	 * Type: String 
	 * Range value: WRAP, STAGGER, ROTATE or NONE 
	 * Description :
	 * Using this attribute, you can control how your data labels (x-axis
	 *  labels) would appear on the chart. There are 4 options: WRAP, 
	 * STAGGER, ROTATE or NONE. WRAP wraps the label text if it's longer than
	 *  the allotted area. ROTATE rotates the label in vertical or slanted 
	 * position. STAGGER divides the labels into multiple lines. 
	 */
	public void setLabelDisplay(String value) {
		setAttribute(PARAMETER_LABELDISPLAY, value);
	}

	/**
	 * Type: Boolean 
	 * Range value: 0/1 
	 * Description :
	 * This attribute lets you set whether the data labels would show up 
	 * as rotated labels on the chart. 
	 */
	public void setRotateLabels(String value) {
		setAttribute(PARAMETER_ROTATELABELS, value);
	}

	/**
	 * Type: Boolean 
	 * Range value: 0/1 
	 * Description :
	 * If you've opted to show rotated labels on chart, this attribute 
	 * lets you set the configuration whether the labels would show as 
	 * slanted labels or fully vertical ones. 
	 */
	public void setSlantLabels(String value) {
		setAttribute(PARAMETER_SLANTLABELS, value);
	}

	/**
	 * Type: Number 
	 * Range value: 1 or above 
	 * Description :
	 * By default, all the labels are displayed on the chart. However, if
	 *  you've a set of streaming data (like name of months or days of week),
	 *  you can opt to hide every n-th label for better clarity. This 
	 * attributes just lets you do so. It allows to skip every n(th) X-axis 
	 * label. 
	 */
	public void setLabelStep(String value) {
		setAttribute(PARAMETER_LABELSTEP, value);
	}

	/**
	 * Type: Number 
	 * Range value: 2 or above 
	 * Description :
	 * If you've opted for STAGGER mode as labelDisplay, using this 
	 * attribute you can control how many lines to stagger the label to. By 
	 * default, all labels are displayed in a single line. 
	 */
	public void setStaggerLines(String value) {
		setAttribute(PARAMETER_STAGGERLINES, value);
	}

	/**
	 * Type: Boolean 
	 * Range value: 0/1 
	 * Description :
	 * This attributes lets you control whether empty data sets in your 
	 * data will be connected to each other OR would they appear as broken 
	 * data sets? Please see Discontinuous data section for more details on 
	 * this. 
	 */
	public void setConnectNullData(String value) {
		setAttribute(PARAMETER_CONNECTNULLDATA, value);
	}

	/**
	 * Type: Boolean 
	 * Range value: 0/1 
	 * Description :
	 * If you've opted to show data values, you can rotate them using 
	 * this attribute. 
	 */
	public void setRotateValues(String value) {
		setAttribute(PARAMETER_ROTATEVALUES, value);
	}

	/**
	 * Type: Boolean 
	 * Range value: 0/1 
	 * Description :
	 * FusionCharts y-axis is divided into vertical sections using div 
	 * (divisional) lines. Each div line assumes a value based on its 
	 * position. Using this attribute you can set whether to show those div 
	 * line (y-axis) values or not. 
	 */
	public void setShowYAxisValues(String value) {
		setAttribute(PARAMETER_SHOWYAXISVALUES, value);
	}

	/**
	 * Type: Boolean 
	 * Range value: 0/1 
	 * Description :
	 * Whether to show chart limit values? showYAxisValues is the single 
	 * new attribute in v3 which over-rides this value. 
	 */
	public void setShowLimits(String value) {
		setAttribute(PARAMETER_SHOWLIMITS, value);
	}

	/**
	 * Type: Boolean 
	 * Range value: 0/1 
	 * Description :
	 * Whether to show div line values? showYAxisValues is the single new
	 *  attribute in v3 which over-rides this value. 
	 */
	public void setShowDivLineValues(String value) {
		setAttribute(PARAMETER_SHOWDIVLINEVALUES, value);
	}

	/**
	 * Type: Number 
	 * Range value: 1 or above 
	 * Description :
	 * By default, all div lines show their values. However, you can opt 
	 * to skip every x(th) div line value using this attribute. 
	 */
	public void setYAxisValuesStep(String value) {
		setAttribute(PARAMETER_YAXISVALUESSTEP, value);
	}

	/**
	 * Type: Boolean 
	 * Range value: 0/1 
	 * Description :
	 * FusionCharts automatically tries to adjust divisional lines and 
	 * limit values based on the data provided. However, if you want to set 
	 * your explicit lower and upper limit values and number of divisional 
	 * lines, first set this attribute to false. That would disable automatic
	 *  adjustment of divisional lines. 
	 */
	public void setAdjustDiv(String value) {
		setAttribute(PARAMETER_ADJUSTDIV, value);
	}

	/**
	 * Type: Boolean 
	 * Range value: 0/1 
	 * Description :
	 * Whether to show secondary axis chart limit values? 
	 */
	public void setShowSecondaryLimits(String value) {
		setAttribute(PARAMETER_SHOWSECONDARYLIMITS, value);
	}

	/**
	 * Type: Boolean 
	 * Range value: 0/1 
	 * Description :
	 * Whether to show div line values for the secondary y-axis? 
	 */
	public void setShowDivLineSecondaryValue(String value) {
		setAttribute(PARAMETER_SHOWDIVLINESECONDARYVALUE, value);
	}

	/**
	 * Type: Number 
	 * Range value: In Pixels 
	 * Description :
	 * Maximum allowed column width 
	 */
	public void setMaxColWidth(String value) {
		setAttribute(PARAMETER_MAXCOLWIDTH, value);
	}

	/**
	 * Type: Boolean 
	 * Range value: 0/1 
	 * Description :
	 * Whether to use advanced gradients and shadow effects to create 
	 * better looking 3D charts? 
	 */
	public void setUse3DLighting(String value) {
		setAttribute(PARAMETER_USE3DLIGHTING, value);
	}

	/**
	 * Type: Boolean 
	 * Range value: 0/1 
	 * Description :
	 * Whether to show shadows for data plot? 
	 */
	public void setShowShadow(String value) {
		setAttribute(PARAMETER_SHOWSHADOW, value);
	}

	/**
	 * Type: Number 
	 * Range value: 
	 * Description :
	 * This attribute helps you explicitly set the upper limit of the 
	 * primary y-axis. If you don't specify this value, it is automatically 
	 * calculated by FusionCharts based on the data provided by you. 
	 */
	public void setPYAxisMaxValue(String value) {
		setAttribute(PARAMETER_PYAXISMAXVALUE, value);
	}

	/**
	 * Type: Number 
	 * Range value: 
	 * Description :
	 * This attribute helps you explicitly set the lower limit of the 
	 * primary y-axis. If you don't specify this value, it is automatically 
	 * calculated by FusionCharts based on the data provided by you. 
	 */
	public void setPYAxisMinValue(String value) {
		setAttribute(PARAMETER_PYAXISMINVALUE, value);
	}

	/**
	 * Type: Number 
	 * Range value: 
	 * Description :
	 * This attribute helps you explicitly set the lower limit of the 
	 * secondary y-axis. If you don't specify this value, it is automatically
	 *  calculated by FusionCharts based on the data provided by you. 
	 */
	public void setSYAxisMinValue(String value) {
		setAttribute(PARAMETER_SYAXISMINVALUE, value);
	}

	/**
	 * Type: Number 
	 * Range value: 
	 * Description :
	 * This attribute helps you explicitly set the upper limit of the 
	 * secondary y-axis. If you don't specify this value, it is automatically
	 *  calculated by FusionCharts based on the data provided by you. 
	 */
	public void setSYAxisMaxValue(String value) {
		setAttribute(PARAMETER_SYAXISMAXVALUE, value);
	}

	/**
	 * Type: Boolean 
	 * Range value: 0/1 
	 * Description :
	 * This attribute lets you set whether the y-axis lower limit would 
	 * be 0 (in case of all positive values on chart) or should the y-axis 
	 * lower limit adapt itself to a different figure based on values 
	 * provided to the chart. 
	 */
	public void setSetAdaptiveYMin(String value) {
		setAttribute(PARAMETER_SETADAPTIVEYMIN, value);
	}

	/**
	 * Type: Boolean 
	 * Range value: 0/1 
	 * Description :
	 * This attribute lets you set whether the secondary y-axis lower 
	 * limit would be 0 (in case of all positive values on chart) or should 
	 * the y-axis lower limit adapt itself to a different figure based on 
	 * values provided to the chart. 
	 */
	public void setSetAdaptiveSYMin(String value) {
		setAttribute(PARAMETER_SETADAPTIVESYMIN, value);
	}

	/**
	 * Type: Boolean 
	 * Range value: 0/1 
	 * Description :
	 * If you do not wish to rotate y-axis name, set this as 0. It 
	 * specifically comes to use when you've special characters (UTF8) in 
	 * your y-axis name that do not show up in rotated mode. 
	 */
	public void setRotateYAxisName(String value) {
		setAttribute(PARAMETER_ROTATEYAXISNAME, value);
	}

	/**
	 * Type: Number 
	 * Range value: (In Pixels) 
	 * Description :
	 * If you opt to not rotate y-axis name, you can choose a maximum 
	 * width that will be applied to primary y-axis name. 
	 */
	public void setPYAxisNameWidth(String value) {
		setAttribute(PARAMETER_PYAXISNAMEWIDTH, value);
	}

	/**
	 * Type: Number 
	 * Range value: (In Pixels) 
	 * Description :
	 * If you opt to not rotate y-axis name, you can choose a maximum 
	 * width that will be applied to secondary y-axis name.
	 */
	public void setSYAxisNameWidth(String value) {
		setAttribute(PARAMETER_SYAXISNAMEWIDTH, value);
	}

	/**
	 * Type: String 
	 * Range value: 
	 * Description :
	 * X-Axis Title of the Chart. 
	 */
	public void setXAxisName(String value) {
		setAttribute(PARAMETER_XAXISNAME, value);
	}

	/**
	 * Type: String 
	 * Range value: 
	 * Description :
	 * Primary Y-Axis title. 
	 */
	public void setPYAxisName(String value) {
		setAttribute(PARAMETER_PYAXISNAME, value);
	}

	/**
	 * Type: String 
	 * Range value: 
	 * Description :
	 * Secondary y-axis title
	 */
	public void setSYAXisName(String value) {
		setAttribute(PARAMETER_SYAXISNAME, value);
	}

	/**
	 * Type: Color 
	 * Range value: 
	 * Description :
	 * Sets Canvas background color. 
	 */
	public void setCanvasBgColor(String value) {
		setAttribute(PARAMETER_CANVASBGCOLOR, value);
	}

	/**
	 * Type: Number 
	 * Range value: 
	 * Description :
	 * Sets alpha for Canvas Background. 
	 */
	public void setCanvasBgAlpha(String value) {
		setAttribute(PARAMETER_CANVASBGALPHA, value);
	}

	/**
	 * Type: Color 
	 * Range value: 
	 * Description :
	 * Helps you specify the color for canvas base. 
	 */
	public void setCanvasBaseColor(String value) {
		setAttribute(PARAMETER_CANVASBASECOLOR, value);
	}

	/**
	 * Type: Boolean 
	 * Range value: 
	 * Description :
	 * Whether to show canvas background? 
	 */
	public void setShowCanvasBg(String value) {
		setAttribute(PARAMETER_SHOWCANVASBG, value);
	}

	/**
	 * Type: Boolean 
	 * Range value: 
	 * Description :
	 * Whether to show canvas base? 
	 */
	public void setShowCanvasBase(String value) {
		setAttribute(PARAMETER_SHOWCANVASBASE, value);
	}

	/**
	 * Type: Number 
	 * Range value: In Pixels 
	 * Description :
	 * Height of canvas base (in pixels) 
	 */
	public void setCanvasBaseDepth(String value) {
		setAttribute(PARAMETER_CANVASBASEDEPTH, value);
	}

	/**
	 * Type: Number 
	 * Range value: In Pixels 
	 * Description :
	 * Depth of Canvas Background
	 */
	public void setCanvasBgDepth(String value) {
		setAttribute(PARAMETER_CANVASBGDEPTH, value);
	}

	/**
	 * Type: Boolean 
	 * Range value: 
	 * Description :
	 * Whether to overlap columns over each other to give a richer 3D 
	 * look? If there are too many columns on the chart, it will 
	 * automatically overlap. 
	 */
	public void setOverlapColumns(String value) {
		setAttribute(PARAMETER_OVERLAPCOLUMNS, value);
	}

	/**
	 * Type: Boolean 
	 * Range value: 0/1 
	 * Description :
	 * Whether the column, area, pie etc. border would show up. 
	 */
	public void setShowPlotBorder(String value) {
		setAttribute(PARAMETER_SHOWPLOTBORDER, value);
	}

	/**
	 * Type: Color 
	 * Range value: 
	 * Description :
	 * Color for column, area, pie border 
	 */
	public void setPlotBorderColor(String value) {
		setAttribute(PARAMETER_PLOTBORDERCOLOR, value);
	}

	/**
	 * Type: Number 
	 * Range value: 0-100 
	 * Description :
	 * Alpha for column, area, pie border 
	 */
	public void setPlotBorderAlpha(String value) {
		setAttribute(PARAMETER_PLOTBORDERALPHA, value);
	}

	/**
	 * Type: Number 
	 * Range value: 0-100 
	 * Description :
	 * If you've opted to fill the plot (column, area etc.) as gradient, 
	 * this attribute lets you set the fill alpha for gradient. 
	 */
	public void setPlotFillAlpha(String value) {
		setAttribute(PARAMETER_PLOTFILLALPHA, value);
	}

	/**
	 * Type: Color 
	 * Range value: Hex Code 
	 * Description :
	 * Color using which the lines on the chart will be drawn. 
	 */
	public void setLineColor(String value) {
		setAttribute(PARAMETER_LINECOLOR, value);
	}

	/**
	 * Type: Number 
	 * Range value: In Pixels 
	 * Description :
	 * Thickness of the lines on the chart. 
	 */
	public void setLineThickness(String value) {
		setAttribute(PARAMETER_LINETHICKNESS, value);
	}

	/**
	 * Type: Number 
	 * Range value: 0-100 
	 * Description :
	 * Alpha of the lines on the chart. 
	 */
	public void setLineAlpha(String value) {
		setAttribute(PARAMETER_LINEALPHA, value);
	}

	/**
	 * Type: Boolean 
	 * Range value: 0/1 
	 * Description :
	 * Configuration whether to show the lines on the chart as dash. 
	 */
	public void setLineDashed(String value) {
		setAttribute(PARAMETER_LINEDASHED, value);
	}

	/**
	 * Type: Number 
	 * Range value: In Pixels 
	 * Description :
	 * If the lines are to be shown as dashes, this attribute defines the
	 *  length of dash. 
	 */
	public void setLineDashLen(String value) {
		setAttribute(PARAMETER_LINEDASHLEN, value);
	}

	/**
	 * Type: Number 
	 * Range value: In Pixels 
	 * Description :
	 * If the lines are to be shown as dashes, this attribute defines the
	 *  length of dash gap. 
	 */
	public void setLineDashGap(String value) {
		setAttribute(PARAMETER_LINEDASHGAP, value);
	}

	/**
	 * Type: Boolean 
	 * Range value: 0/1 
	 * Description :
	 * Whether to draw anchors on the chart? If the anchors are not 
	 * shown, then the tool tip and links won't work. 
	 */
	public void setDrawAnchors(String value) {
		setAttribute(PARAMETER_DRAWANCHORS, value);
	}

	/**
	 * Type: Number 
	 * Range value: 43891.0
	 * Description :
	 * This attribute sets the number of sides the anchor will have. For 
	 * e.g., an anchor with 3 sides would represent a triangle, with 4 it 
	 * would be a square and so on. 
	 */
	public void setAnchorSides(String value) {
		setAttribute(PARAMETER_ANCHORSIDES, value);
	}

	/**
	 * Type: Number 
	 * Range value: In Pixels 
	 * Description :
	 * This attribute sets the radius (in pixels) of the anchor. Greater 
	 * the radius, bigger would be the anchor size. 
	 */
	public void setAnchorRadius(String value) {
		setAttribute(PARAMETER_ANCHORRADIUS, value);
	}

	/**
	 * Type: Color 
	 * Range value: Hex Code 
	 * Description :
	 * Lets you set the border color of anchors. 
	 */
	public void setAnchorBorderColor(String value) {
		setAttribute(PARAMETER_ANCHORBORDERCOLOR, value);
	}

	/**
	 * Type: Number 
	 * Range value: In Pixels 
	 * Description :
	 * Helps you set border thickness of anchors. 
	 */
	public void setAnchorBorderThickness(String value) {
		setAttribute(PARAMETER_ANCHORBORDERTHICKNESS, value);
	}

	/**
	 * Type: Color 
	 * Range value: Hex Code 
	 * Description :
	 * Helps you set the background color of anchors. 
	 */
	public void setAnchorBgColor(String value) {
		setAttribute(PARAMETER_ANCHORBGCOLOR, value);
	}

	/**
	 * Type: Number 
	 * Range value: 0-100 
	 * Description :
	 * Helps you set the alpha of entire anchors. If you need to hide the
	 *  anchors on chart but still enable tool tips, set this as 0. 
	 */
	public void setAnchorAlpha(String value) {
		setAttribute(PARAMETER_ANCHORALPHA, value);
	}

	/**
	 * Type: Number 
	 * Range value: 0-100 
	 * Description :
	 * Helps you set the alpha of anchor background.
	 */
	public void setAnchorBgAlpha(String value) {
		setAttribute(PARAMETER_ANCHORBGALPHA, value);
	}

	/**
	 * Type: Number 
	 * Range value: Numeric value > 0 
	 * Description :
	 * Number of horizontal axis division lines that you want on the 
	 * chart. 
	 */
	public void setNumDivLines(String value) {
		setAttribute(PARAMETER_NUMDIVLINES, value);
	}

	/**
	 * Type: Color 
	 * Range value: 
	 * Description :
	 * Color for divisional lines 
	 */
	public void setDivLineColor(String value) {
		setAttribute(PARAMETER_DIVLINECOLOR, value);
	}

	/**
	 * Type: Number 
	 * Range value: 39203.0
	 * Description :
	 * Thickness of divisional lines 
	 */
	public void setDivLineThickness(String value) {
		setAttribute(PARAMETER_DIVLINETHICKNESS, value);
	}

	/**
	 * Type: Number 
	 * Range value: 0-100 
	 * Description :
	 * Alpha of divisional lines. 
	 */
	public void setDivLineAlpha(String value) {
		setAttribute(PARAMETER_DIVLINEALPHA, value);
	}

	/**
	 * Type: Boolean 
	 * Range value: 0/1 
	 * Description :
	 * Whether the divisional lines should display as dash? 
	 */
	public void setDivLineIsDashed(String value) {
		setAttribute(PARAMETER_DIVLINEISDASHED, value);
	}

	/**
	 * Type: Number 
	 * Range value: In Pixels 
	 * Description :
	 * If the divisional lines are to be displayed as dash, this 
	 * attribute lets you control the length of each dash. 
	 */
	public void setDivLineDashLen(String value) {
		setAttribute(PARAMETER_DIVLINEDASHLEN, value);
	}

	/**
	 * Type: Number 
	 * Range value: In Pixels 
	 * Description :
	 * If the divisional lines are to be displayed as dash, this 
	 * attribute lets you control the length of each gap between dash. 
	 */
	public void setDivLineDashGap(String value) {
		setAttribute(PARAMETER_DIVLINEDASHGAP, value);
	}

	/**
	 * Type: Color 
	 * Range value: 
	 * Description :
	 * Color for the Zero Plane. Zero Plane is the line/plane that 
	 * appears at 0 y-position on canvas, when negative data is being shown 
	 * on the chart. 
	 */
	public void setZeroPlaneColor(String value) {
		setAttribute(PARAMETER_ZEROPLANECOLOR, value);
	}

	/**
	 * Type: Number 
	 * Range value: 0-100 
	 * Description :
	 * Alpha of zero plane. 
	 */
	public void setZeroPlaneAlpha(String value) {
		setAttribute(PARAMETER_ZEROPLANEALPHA, value);
	}

	/**
	 * Type: Boolean 
	 * Range value: 
	 * Description :
	 * Whether to show border of zero plane? 
	 */
	public void setZeroPlaneShowBorder(String value) {
		setAttribute(PARAMETER_ZEROPLANESHOWBORDER, value);
	}

	/**
	 * Type: Color 
	 * Range value: 
	 * Description :
	 * Sets the border color of zero plane.
	 */
	public void setZeroPlaneBorderColor(String value) {
		setAttribute(PARAMETER_ZEROPLANEBORDERCOLOR, value);
	}

	/**
	 * Type: Boolean 
	 * Range value: 0/1 
	 * Description :
	 * Whether to show legend for the chart (only multi-series and 
	 * combination charts)? 
	 */
	public void setShowLegend(String value) {
		setAttribute(PARAMETER_SHOWLEGEND, value);
	}

	/**
	 * Type: String 
	 * Range value: BOTTOM or RIGHT 
	 * Description :
	 * The legend can be plotted at two positions on the chart - below 
	 * the chart (BOTTOM) and on the RIGHT side of the chart. 
	 */
	public void setLegendPosition(String value) {
		setAttribute(PARAMETER_LEGENDPOSITION, value);
	}

	/**
	 * Type: Color 
	 * Range value: Hex Code 
	 * Description :
	 * Background color for the legend. 
	 */
	public void setLegendBgColor(String value) {
		setAttribute(PARAMETER_LEGENDBGCOLOR, value);
	}

	/**
	 * Type: Number 
	 * Range value: 0-100 
	 * Description :
	 * Background alpha for the legend. 
	 */
	public void setLegendBgAlpha(String value) {
		setAttribute(PARAMETER_LEGENDBGALPHA, value);
	}

	/**
	 * Type: Color 
	 * Range value: Hex Code 
	 * Description :
	 * Border Color for the legend. 
	 */
	public void setLegendBorderColor(String value) {
		setAttribute(PARAMETER_LEGENDBORDERCOLOR, value);
	}

	/**
	 * Type: Number 
	 * Range value: In Pixels 
	 * Description :
	 * Border thickness for the legend. 
	 */
	public void setLegendBorderThickness(String value) {
		setAttribute(PARAMETER_LEGENDBORDERTHICKNESS, value);
	}

	/**
	 * Type: Number 
	 * Range value: 0-100 
	 * Description :
	 * Border alpha for the legend. 
	 */
	public void setLegendBorderAlpha(String value) {
		setAttribute(PARAMETER_LEGENDBORDERALPHA, value);
	}

	/**
	 * Type: Boolean 
	 * Range value: 0/1 
	 * Description :
	 * Whether to show a shadow for legend? 
	 */
	public void setLegendShadow(String value) {
		setAttribute(PARAMETER_LEGENDSHADOW, value);
	}

	/**
	 * Type: Boolean 
	 * Range value: 0/1 
	 * Description :
	 * The legend can be made drag-able by setting this attribute to 1. 
	 * End viewers of the chart can drag the legend around on the chart. 
	 */
	public void setLegendAllowDrag(String value) {
		setAttribute(PARAMETER_LEGENDALLOWDRAG, value);
	}

	/**
	 * Type: Color 
	 * Range value: Hex Code 
	 * Description :
	 * If you've too many items on the legend, a scroll bar shows up on 
	 * the same. This attribute lets you configure the background color of 
	 * the scroll bar. 
	 */
	public void setLegendScrollBgColor(String value) {
		setAttribute(PARAMETER_LEGENDSCROLLBGCOLOR, value);
	}

	/**
	 * Type: Color 
	 * Range value: Hex Code 
	 * Description :
	 * If you've too many items on the legend, a scroll bar shows up on 
	 * the same. This attribute lets you configure the bar color of the 
	 * scroll bar. 
	 */
	public void setLegendScrollBarColor(String value) {
		setAttribute(PARAMETER_LEGENDSCROLLBARCOLOR, value);
	}

	/**
	 * Type: Color 
	 * Range value: Hex Code 
	 * Description :
	 * If you've too many items on the legend, a scroll bar shows up on 
	 * the same. This attribute lets you configure the color of buttons of 
	 * the scroll bar.
	 */
	public void setLegendScrollBtnColor(String value) {
		setAttribute(PARAMETER_LEGENDSCROLLBTNCOLOR, value);
	}

	/**
	 * Type: Number 
	 * Range value: 0-10 
	 * Description :
	 * If you've opted to not adjust div lines, you can specify the div 
	 * line values decimal precision using this attribute. 
	 */
	public void setYAxisValueDecimals(String value) {
		setAttribute(PARAMETER_YAXISVALUEDECIMALS, value);
	}

	/**
	 * Type: Boolean 
	 * Range value: 0/1 
	 * Description :
	 * This configuration determines whether the numbers belonging to 
	 * secondary axis will be formatted using commas, e.g., 40,000 if 
	 * sFormatNumber='1' and 40000 if sFormatNumber='0 ' 
	 */
	public void setSFormatNumber(String value) {
		setAttribute(PARAMETER_SFORMATNUMBER, value);
	}

	/**
	 * Type: Boolean 
	 * Range value: 0/1 
	 * Description :
	 * Configuration whether to add K (thousands) and M (millions) to a 
	 * number belonging to secondary axis after truncating and rounding it - 
	 * e.g., if sFormatNumberScale is set to 1, 10434 would become 1.04K 
	 * (with decimalPrecision set to 2 places). Same with numbers in millions
	 *  - a M will added at the end. For more details, please see Advanced 
	 * Number Formatting section. 
	 */
	public void setSFormatNumberScale(String value) {
		setAttribute(PARAMETER_SFORMATNUMBERSCALE, value);
	}

	/**
	 * Type: String 
	 * Range value: 
	 * Description :
	 * The default unit of the numbers belonging to secondary axis. For 
	 * more details, please see Advanced Number Formatting section. 
	 */
	public void setSDefaultNumberScale(String value) {
		setAttribute(PARAMETER_SDEFAULTNUMBERSCALE, value);
	}

	/**
	 * Type: String 
	 * Range value: 
	 * Description :
	 * Unit of each block of the scale of secondary y-axis. For more 
	 * details, please see Advanced Number Formatting section. 
	 */
	public void setSNumberScaleUnit(String value) {
		setAttribute(PARAMETER_SNUMBERSCALEUNIT, value);
	}

	/**
	 * Type: String 
	 * Range value: 
	 * Description :
	 * Range of the various blocks that constitute the scale for 
	 * secondary y-axis. For more details, please see Advanced Number 
	 * Formatting section. 
	 */
	public void setSNumberScaleValue(String value) {
		setAttribute(PARAMETER_SNUMBERSCALEVALUE, value);
	}

	/**
	 * Type: String 
	 * Range value: Character 
	 * Description :
	 * Using this attribute, you could add prefix to all the numbers 
	 * belonging to secondary axis. For more details, please see Advanced 
	 * Number Formatting section. 
	 */
	public void setSNumberPrefix(String value) {
		setAttribute(PARAMETER_SNUMBERPREFIX, value);
	}

	/**
	 * Type: String 
	 * Range value: Character 
	 * Description :
	 * Using this attribute, you could add prefix to all the numbers 
	 * belonging to secondary axis. For more details, please see Advanced 
	 * Number Formatting section. 
	 */
	public void setSNumberSuffix(String value) {
		setAttribute(PARAMETER_SNUMBERSUFFIX, value);
	}

	/**
	 * Type: Number 
	 * Range value: 0-10 
	 * Description :
	 * Number of decimal places to which all numbers belonging to 
	 * secondary axis would be rounded to. 
	 */
	public void setSDecimals(String value) {
		setAttribute(PARAMETER_SDECIMALS, value);
	}

	/**
	 * Type: Number 
	 * Range value: 0-10 
	 * Description :
	 * If you've opted to not adjust div lines, you can specify the 
	 * secondary div line values decimal precision using this attribute.
	 */
	public void setSYAxisValueDecimals(String value) {
		setAttribute(PARAMETER_SYAXISVALUEDECIMALS, value);
	}

	/**
	 * Type: String 
	 * Range value: Font Name 
	 * Description :
	 * This attribute sets the base font family of the chart font which 
	 * lies outside the canvas i.e., all the values and the names in the 
	 * chart which lie outside the canvas will be displayed using the font 
	 * name provided here. 
	 */
	public void setOutCnvBaseFont(String value) {
		setAttribute(PARAMETER_OUTCNVBASEFONT, value);
	}

	/**
	 * Type: Number 
	 * Range value: 0-72 
	 * Description :
	 * This attribute sets the base font size of the chart i.e., all the 
	 * values and the names in the chart which lie outside the canvas will be
	 *  displayed using the font size provided here. 
	 */
	public void setOutCnvBaseFontSize(String value) {
		setAttribute(PARAMETER_OUTCNVBASEFONTSIZE, value);
	}

	/**
	 * Type: Color 
	 * Range value: 
	 * Description :
	 * This attribute sets the base font color of the chart i.e., all the
	 *  values and the names in the chart which lie outside the canvas will 
	 * be displayed using the font color provided here.
	 */
	public void setOutCnvBaseFontColor(String value) {
		setAttribute(PARAMETER_OUTCNVBASEFONTCOLOR, value);
	}

	/**
	 * Type: Boolean 
	 * Range value: 0/1 
	 * Description :
	 * For multi-series and combination charts, FusionCharts shows the 
	 * following information in tool tip (unless tool text is explicitly 
	 * defined): "Series Name, Category Name, Data Value". This attribute 
	 * lets you control whether series name would show up in tool tip or not?
	 */
	public void setSeriesNameInToolTip(String value) {
		setAttribute(PARAMETER_SERIESNAMEINTOOLTIP, value);
	}

	/**
	 * Type: Number 
	 * Range value: In Pixels 
	 * Description :
	 * Allows you to set empty space on the left and right side of 
	 * columns on the chart canvas 
	 */
	public void setCanvasPadding(String value) {
		setAttribute(PARAMETER_CANVASPADDING, value);
	}

	/**
	 * Type: Number 
	 * Range value: In Pixels 
	 * Description :
	 * Padding of legend from right/bottom side of canvas 
	 */
	public void setLegendPadding(String value) {
		setAttribute(PARAMETER_LEGENDPADDING, value);
	}

	/**
	 * Type: Number 
	 * Range value: In Pixels 
	 * Description :
	 * Using this, you can set the distance between the top end of x-axis
	 *  title and the bottom end of data labels (or canvas, if data labels 
	 * are not to be shown). 
	 */
	public void setXAxisNamePadding(String value) {
		setAttribute(PARAMETER_XAXISNAMEPADDING, value);
	}

	/**
	 * Type: Number 
	 * Range value: In Pixels 
	 * Description :
	 * Using this, you can set the distance between the right end of y-
	 * axis title and the start of y-axis values (or canvas, if the y-axis 
	 * values are not to be shown). 
	 */
	public void setYAxisNamePadding(String value) {
		setAttribute(PARAMETER_YAXISNAMEPADDING, value);
	}

	/**
	 * Type: Number 
	 * Range value: In Pixels 
	 * Description :
	 * This attribute helps you set the horizontal space between the 
	 * canvas left edge and the y-axis values or trend line values (on left/
	 * right side). This is particularly useful, when you want more space 
	 * between your canvas and y-axis values. 
	 */
	public void setYAxisValuesPadding(String value) {
		setAttribute(PARAMETER_YAXISVALUESPADDING, value);
	}

	/**
	 * Type: Number 
	 * Range value: In Pixels 
	 * Description :
	 * This attribute sets the vertical space between the labels and 
	 * canvas bottom edge. If you want more space between the canvas and the 
	 * x-axis labels, you can use this attribute to control it. 
	 */
	public void setLabelPadding(String value) {
		setAttribute(PARAMETER_LABELPADDING, value);
	}

	/**
	 * Type: Number 
	 * Range value: In Pixels 
	 * Description :
	 * It sets the vertical space between the end of columns and start of
	 *  value textboxes. This basically helps you control the space you want 
	 * between your columns/anchors and the value textboxes. 
	 */
	public void setValuePadding(String value) {
		setAttribute(PARAMETER_VALUEPADDING, value);
	}

	/**
	 * Type: Number 
	 * Range value: 0-80 (In Percent) 
	 * Description :
	 * On a column chart, there is spacing defined between two columns. 
	 * By default, the spacing is set to 20% of canvas width. If you intend 
	 * to increase or decrease the spacing between columns, you can do so 
	 * using this attribute. For example, if you wanted all columns to stick 
	 * to each other without any space in between, you can set 
	 * plotSpacePercent to 0. Similarly, if you want very thin columns, you 
	 * can set plotSpacePercent to its max value of 80. 
	 */
	public void setPlotSpacePercent(String value) {
		setAttribute(PARAMETER_PLOTSPACEPERCENT, value);
	}
        /**
         * @see com.raisepartner.chartfusion.api.mscolumn3dlinedy.Dataset
         */
        public Dataset createDatasetNode() {
                Dataset node = new Dataset();
		addNode(node);
		return node;
        }

        /**
         * @see com.raisepartner.chartfusion.api.mscolumn3dlinedy.Categories
         */
        public Categories createCategoriesNode() {
                Categories node = new Categories();
		addNode(node);
		return node;
        }

        /**
         * @see com.raisepartner.chartfusion.api.mscolumn3dlinedy.TrendLines
         */
        public TrendLines createTrendLinesNode() {
                TrendLines node = new TrendLines();
		addNode(node);
		return node;
        }

}
