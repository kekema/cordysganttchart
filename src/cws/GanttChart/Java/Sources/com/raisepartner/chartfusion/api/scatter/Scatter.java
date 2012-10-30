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
package com.raisepartner.chartfusion.api.scatter;

public class Scatter extends com.raisepartner.chartfusion.api.Graph {

	public final static String PARAMETER_ROTATEVALUES = "rotateValues";
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
	public final static String PARAMETER_VALUEPADDING = "valuePadding";

	public Scatter() {
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
	 * Type:   Number   
	 * Range value:   In Pixels   
	 * Description :
	 *   Thickness of the lines on the chart.
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
	 * Type:   Boolean   
	 * Range value:   0/1   
	 * Description :
	 *   Whether to draw anchors on the chart? If the anchors are not 
	 * shown, then the tool tip and links won't work.
	 */
	public void setDrawAnchors(String value) {
		setAttribute(PARAMETER_DRAWANCHORS, value);
	}

	/**
	 * Type: Number 
	 * Range value: 3-20 
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
         * @see com.raisepartner.chartfusion.api.scatter.Categories
         */
        public Categories createCategoriesNode() {
                Categories node = new Categories();
		addNode(node);
		return node;
        }

        /**
         * @see com.raisepartner.chartfusion.api.scatter.Dataset
         */
        public Dataset createDatasetNode() {
                Dataset node = new Dataset();
		addNode(node);
		return node;
        }

        /**
         * @see com.raisepartner.chartfusion.api.scatter.TrendLines
         */
        public TrendLines createTrendLinesNode() {
                TrendLines node = new TrendLines();
		addNode(node);
		return node;
        }

        /**
         * @see com.raisepartner.chartfusion.api.scatter.VTrendLines
         */
        public VTrendLines createVTrendLinesNode() {
                VTrendLines node = new VTrendLines();
		addNode(node);
		return node;
        }

}
