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
package com.raisepartner.chartfusion.api.bubble;

public class Categories extends com.raisepartner.chartfusion.api.Categories {

	public final static String PARAMETER_VERTICALLINECOLOR = "verticalLineColor";
	public final static String PARAMETER_VERTICALLINETHICKNESS = "verticalLineThickness";
	public final static String PARAMETER_VERTICALLINEALPHA = "verticalLineAlpha";
	public final static String PARAMETER_VERTICALLINEDASHED = "verticalLineDashed";
	public final static String PARAMETER_VERTICALLINEDASHLEN = "verticalLineDashLen";
	public final static String PARAMETER_VERTICALLINEDASHGAP = "verticalLineDashGap";

	public Categories() {
	}

	/**
	 * Type: Color 
	 * Range value: Hex Code 
	 * Description :
	 * In the bubble/scatter chart, you can opt to show vertical lines 
	 * for each category label. This attribute lets you set the color for all
	 *  of them.
	 */
	public void setVerticalLineColor(String value) {
		setAttribute(PARAMETER_VERTICALLINECOLOR, value);
	}

	/**
	 * Type: Number 
	 * Range value: In Pixels 
	 * Description :
	 * Lets you set the thickness for category lines.
	 */
	public void setVerticalLineThickness(String value) {
		setAttribute(PARAMETER_VERTICALLINETHICKNESS, value);
	}

	/**
	 * Type: Number 
	 * Range value: 0-100 
	 * Description :
	 * Lets you set the alpha for category lines.
	 */
	public void setVerticalLineAlpha(String value) {
		setAttribute(PARAMETER_VERTICALLINEALPHA, value);
	}

	/**
	 * Type: Boolean 
	 * Range value: 0/1 
	 * Description :
	 * Whether the category lines should appear as dashed?
	 */
	public void setVerticalLineDashed(String value) {
		setAttribute(PARAMETER_VERTICALLINEDASHED, value);
	}

	/**
	 * Type: Number 
	 * Range value: In Pixels 
	 * Description :
	 * If the category lines are to appear as dash, this attribute 
	 * defines the length of dash.
	 */
	public void setVerticalLineDashLen(String value) {
		setAttribute(PARAMETER_VERTICALLINEDASHLEN, value);
	}

	/**
	 * Type: Number 
	 * Range value: In Pixels 
	 * Description :
	 * If the category lines are to appear as dash, this attribute 
	 * defines the length of gap between two consecutive dashes.
	 */
	public void setVerticalLineDashGap(String value) {
		setAttribute(PARAMETER_VERTICALLINEDASHGAP, value);
	}
}
