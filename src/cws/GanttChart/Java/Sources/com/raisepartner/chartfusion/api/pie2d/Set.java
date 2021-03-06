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
package com.raisepartner.chartfusion.api.pie2d;

public class Set extends com.raisepartner.chartfusion.api.Set {

	public final static String PARAMETER_BORDERCOLOR = "borderColor";
	public final static String PARAMETER_BORDERALPHA = "borderAlpha";
	public final static String PARAMETER_ISSLICED = "isSliced";
	public final static String PARAMETER_LABEL = "label";
	public final static String PARAMETER_VALUE = "value";
	public final static String PARAMETER_COLOR = "color";
	public final static String PARAMETER_DASHED = "dashed";
	public final static String PARAMETER_ALPHA = "alpha";

	public Set() {
	}

	/**
	 * Type: Color 
	 * Range value: Hex Code 
	 * Description :
	 * If you want to set border color of individual pie/doughnut data 
	 * items, you can specify using this attribute. 
	 */
	public void setBorderColor(String value) {
		setAttribute(PARAMETER_BORDERCOLOR, value);
	}

	/**
	 * Type: Color 
	 * Range value: Hex Code 
	 * Description :
	 * If you want to set border alpha of individual pie/doughnut data 
	 * items, you can specify using this attribute. 
	 */
	public void setBorderAlpha(String value) {
		setAttribute(PARAMETER_BORDERALPHA, value);
	}

	/**
	 * Type: Boolean 
	 * Range value: 0/1 
	 * Description :
	 * This attribute determines whether the pie appears as a part of the
	 *  total chart or is sliced out as an individual item. 
	 */
	public void setIsSliced(String value) {
		setAttribute(PARAMETER_ISSLICED, value);
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
}
