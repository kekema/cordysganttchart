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
package com.raisepartner.chartfusion.api.area2d;

public class Set extends com.raisepartner.chartfusion.api.Set {

	public final static String PARAMETER_LABEL = "label";
	public final static String PARAMETER_VALUE = "value";
	public final static String PARAMETER_COLOR = "color";
	public final static String PARAMETER_SHOWLABEL = "showLabel";
	public final static String PARAMETER_SHOWVALUE = "showValue";
	public final static String PARAMETER_DASHED = "dashed";
	public final static String PARAMETER_ALPHA = "alpha";
	public final static String PARAMETER_ANCHORSIDES = "anchorSides";
	public final static String PARAMETER_ANCHORRADIUS = "anchorRadius";
	public final static String PARAMETER_ANCHORBORDERCOLOR = "anchorBorderColor";
	public final static String PARAMETER_ANCHORBORDERTHICKNESS = "anchorBorderThickness";
	public final static String PARAMETER_ANCHORBGCOLOR = "anchorBgColor";
	public final static String PARAMETER_ANCHORALPHA = "anchorAlpha";
	public final static String PARAMETER_ANCHORBGALPHA = "anchorBgAlpha";

	public Set() {
	}

	/**
	 * Type: String 
	 * Range value: 
	 * Description :
	 * This attribute determines the label for the data item. The label 
	 * appears on the x-axis of chart. 
	 */
	public void setLabel(String value) {
		setAttribute(PARAMETER_LABEL, value);
	}

	/**
	 * Type: Number 
	 * Range value: 
	 * Description :
	 * Numerical value for the data item. This value would be plotted on 
	 * the chart. 
	 */
	public void setValue(String value) {
		setAttribute(PARAMETER_VALUE, value);
	}

	/**
	 * Type: Color 
	 * Range value: Hex Code 
	 * Description :
	 * If you want to define your own colors for the data items on chart,
	 *  use this attribute to specify color for the data item. This attribute
	 *  accepts hex color codes without #. 
	 */
	public void setColor(String value) {
		setAttribute(PARAMETER_COLOR, value);
	}

	/**
	 * Type: Boolean 
	 * Range value: 0/1 
	 * Description :
	 * You can individually opt to show/hide labels of individual data 
	 * items using this attribute. 
	 */
	public void setShowLabel(String value) {
		setAttribute(PARAMETER_SHOWLABEL, value);
	}

	/**
	 * Type: Boolean 
	 * Range value: 0/1 
	 * Description :
	 * You can individually opt to show/hide values of individual data 
	 * items using this attribute. 
	 */
	public void setShowValue(String value) {
		setAttribute(PARAMETER_SHOWVALUE, value);
	}

	/**
	 * Type: Boolean 
	 * Range value: 0/1 
	 * Description :
	 * Whether the border of this data item should appear as dashed? This
	 *  is particularly useful when you want to highlight a data (such as 
	 * forecast or trend etc.). 
	 */
	public void setDashed(String value) {
		setAttribute(PARAMETER_DASHED, value);
	}

	/**
	 * Type: Number 
	 * Range value: 0-100 
	 * Description :
	 * This attribute determines the transparency of a data item. The 
	 * range for this attribute is 0 to 100. 0 means complete transparency 
	 * (the data item won’t be shown on the graph) and 100 means opaque. 
	 */
	public void setAlpha(String value) {
		setAttribute(PARAMETER_ALPHA, value);
	}

	/**
	 * Type: Number 
	 * Range value: 3 or more 
	 * Description :
	 * If you want to configure data item specific anchor properties, 
	 * this attribute lets you define the number of sides for the anchor of 
	 * that particular data item. 
	 */
	public void setAnchorSides(String value) {
		setAttribute(PARAMETER_ANCHORSIDES, value);
	}

	/**
	 * Type: Number 
	 * Range value: In Pixels 
	 * Description :
	 * If you want to configure data item specific anchor properties, 
	 * this attribute lets you define the radius for the anchor of that 
	 * particular data item. 
	 */
	public void setAnchorRadius(String value) {
		setAttribute(PARAMETER_ANCHORRADIUS, value);
	}

	/**
	 * Type: Color 
	 * Range value: 0-100 
	 * Description :
	 * If you want to configure data item specific anchor properties, 
	 * this attribute lets you set the border color for the anchor of that 
	 * particular data item. 
	 */
	public void setAnchorBorderColor(String value) {
		setAttribute(PARAMETER_ANCHORBORDERCOLOR, value);
	}

	/**
	 * Type: Number 
	 * Range value: In Pixels 
	 * Description :
	 * If you want to configure data item specific anchor properties, 
	 * this attribute lets you set the border thickness for the anchor of 
	 * that particular data item. 
	 */
	public void setAnchorBorderThickness(String value) {
		setAttribute(PARAMETER_ANCHORBORDERTHICKNESS, value);
	}

	/**
	 * Type: Color 
	 * Range value: Hex Code 
	 * Description :
	 * If you want to configure data item specific anchor properties, 
	 * this attribute lets you set the background color for the anchor of 
	 * that particular data item. 
	 */
	public void setAnchorBgColor(String value) {
		setAttribute(PARAMETER_ANCHORBGCOLOR, value);
	}

	/**
	 * Type: Number 
	 * Range value: 0-100 
	 * Description :
	 * If you want to configure data item specific anchor properties, 
	 * this attribute lets you set the alpha for the anchor of that 
	 * particular data item. 
	 */
	public void setAnchorAlpha(String value) {
		setAttribute(PARAMETER_ANCHORALPHA, value);
	}

	/**
	 * Type: Number 
	 * Range value: 0-100 
	 * Description :
	 * If you want to configure data item specific anchor properties, 
	 * this attribute lets you set the background alpha for the anchor of 
	 * that particular data item.
	 */
	public void setAnchorBgAlpha(String value) {
		setAttribute(PARAMETER_ANCHORBGALPHA, value);
	}
}
