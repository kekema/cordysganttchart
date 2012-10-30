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
package com.raisepartner.chartfusion.api.stackedarea2d;

public class Set extends com.raisepartner.chartfusion.api.Set {

	public final static String PARAMETER_LABEL = "label";
	public final static String PARAMETER_VALUE = "value";

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
}