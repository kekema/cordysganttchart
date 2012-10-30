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
package com.raisepartner.chartfusion.api.mscolumnline3d;

public class Dataset extends com.raisepartner.chartfusion.api.Dataset {

	public final static String PARAMETER_RENDERAS = "renderAs";
	public final static String PARAMETER_PARENTYAXIS = "parentYAxis";
	public final static String PARAMETER_DRAWANCHORS = "drawAnchors";
	public final static String PARAMETER_ANCHORSIDES = "anchorSides";
	public final static String PARAMETER_ANCHORRADIUS = "anchorRadius";
	public final static String PARAMETER_ANCHORBORDERCOLOR = "anchorBorderColor";
	public final static String PARAMETER_ANCHORBORDERTHICKNESS = "anchorBorderThickness";
	public final static String PARAMETER_ANCHORBGCOLOR = "anchorBgColor";
	public final static String PARAMETER_ANCHORALPHA = "anchorAlpha";
	public final static String PARAMETER_ANCHORBGALPHA = "anchorBgAlpha";
	public final static String PARAMETER_LINETHICKNESS = "lineThickness";
	public final static String PARAMETER_DASHED = "dashed";
	public final static String PARAMETER_LINEDASHLEN = "lineDashLen";
	public final static String PARAMETER_LINEDASHGAP = "lineDashGap";

	public Dataset() {
	}

	/**
	 * Type: String 
	 * Range value: COLUMN or LINE 
	 * Description :
	 * This attribute defines what the particular data-set will be 
	 * plotted as. Valid values are COLUMN or LINE. 
	 */
	public void setRenderAs(String value) {
		setAttribute(PARAMETER_RENDERAS, value);
	}

	/**
	 * Type: String 
	 * Range value: P or S 
	 * Description :
	 * renderAs attribute over-rides this attribute in FusionCharts v3 
	 * for Single Y Combination Charts. This attribute allows you to set the 
	 * parent axis of the dataset - P (primary) or S (secondary). Primary 
	 * data-sets are drawn as Columns and secondary data-sets as lines. 
	 */
	public void setParentYAxis(String value) {
		setAttribute(PARAMETER_PARENTYAXIS, value);
	}

	/**
	 * Type: Boolean 
	 * Range value: 0/1 
	 * Description :
	 * Whether to draw anchors for the particular data-set? If the 
	 * anchors are not shown, then the tool tip and links won't work for the 
	 * data-set. 
	 */
	public void setDrawAnchors(String value) {
		setAttribute(PARAMETER_DRAWANCHORS, value);
	}

	/**
	 * Type: Number 
	 * Range value: 43891.0
	 * Description :
	 * Sets the number of sides that the anchors of the particular data-
	 * set will have. For e.g., an anchor with 3 sides would represent a 
	 * triangle, with 4 it would be a square and so on. 
	 */
	public void setAnchorSides(String value) {
		setAttribute(PARAMETER_ANCHORSIDES, value);
	}

	/**
	 * Type: Number 
	 * Range value: In Pixels 
	 * Description :
	 * This attribute sets the radius (in pixels) of the anchors of the 
	 * particular data-set. Greater the radius, bigger would be the anchor 
	 * size. 
	 */
	public void setAnchorRadius(String value) {
		setAttribute(PARAMETER_ANCHORRADIUS, value);
	}

	/**
	 * Type: Color 
	 * Range value: Hex Code 
	 * Description :
	 * Lets you set the border color of anchors of the particular data-
	 * set. 
	 */
	public void setAnchorBorderColor(String value) {
		setAttribute(PARAMETER_ANCHORBORDERCOLOR, value);
	}

	/**
	 * Type: Number 
	 * Range value: In Pixels 
	 * Description :
	 * Helps you set border thickness of anchors of the particular data-
	 * set. 
	 */
	public void setAnchorBorderThickness(String value) {
		setAttribute(PARAMETER_ANCHORBORDERTHICKNESS, value);
	}

	/**
	 * Type: Color 
	 * Range value: Hex Code 
	 * Description :
	 * Helps you set the background color of anchors of the particular 
	 * data-set. 
	 */
	public void setAnchorBgColor(String value) {
		setAttribute(PARAMETER_ANCHORBGCOLOR, value);
	}

	/**
	 * Type: Number 
	 * Range value: 0-100 
	 * Description :
	 * Helps you set the alpha of entire anchors of the particular data-
	 * set. If you need to hide the anchors for the data-set but still enable
	 *  tool tips, set this as 0. 
	 */
	public void setAnchorAlpha(String value) {
		setAttribute(PARAMETER_ANCHORALPHA, value);
	}

	/**
	 * Type: Number 
	 * Range value: 0-100 
	 * Description :
	 * Helps you set the alpha of anchor background of the particular 
	 * data-set. 
	 */
	public void setAnchorBgAlpha(String value) {
		setAttribute(PARAMETER_ANCHORBGALPHA, value);
	}

	/**
	 * Type: Number 
	 * Range value: In Pixels 
	 * Description :
	 * Thickness of the lines for the particular data-set. 
	 */
	public void setLineThickness(String value) {
		setAttribute(PARAMETER_LINETHICKNESS, value);
	}

	/**
	 * Type: Boolean 
	 * Range value: 0/1 
	 * Description :
	 * Whether this data-set would appear as dashed? 
	 */
	public void setDashed(String value) {
		setAttribute(PARAMETER_DASHED, value);
	}

	/**
	 * Type: Number 
	 * Range value: In Pixels 
	 * Description :
	 * If the lines are to be shown as dash for the particular data-set, 
	 * this attribute defines the length of dash. 
	 */
	public void setLineDashLen(String value) {
		setAttribute(PARAMETER_LINEDASHLEN, value);
	}

	/**
	 * Type: Number 
	 * Range value: In Pixels 
	 * Description :
	 * If the lines are to be shown as dash for the particular data-set, 
	 * this attribute defines the length of dash gap.
	 */
	public void setLineDashGap(String value) {
		setAttribute(PARAMETER_LINEDASHGAP, value);
	}
        /**
         * @see com.raisepartner.chartfusion.api.mscolumnline3d.Set
         */
        public Set createSetNode() {
                Set node = new Set();
		addNode(node);
		return node;
        }

}
