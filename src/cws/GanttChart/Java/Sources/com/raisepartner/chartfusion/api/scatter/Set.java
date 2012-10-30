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

public class Set extends com.raisepartner.chartfusion.api.Set {

	public final static String PARAMETER_X = "x";
	public final static String PARAMETER_Y = "y";
	public final static String PARAMETER_SHOWVALUE = "showValue";

	public Set() {
	}

	/**
	 * Type:   Number   
	 * Range value:   Numeric Value   
	 * Description :
	 *   X-axis value for the set. The bubble/scatter point will be 
	 * placed horizontally on the x-axis based on this value.
	 */
	public void setX(String value) {
		setAttribute(PARAMETER_X, value);
	}

	/**
	 * Type: Number 
	 * Range value: Numeric Value 
	 * Description :
	 * Y-axis value for the set. The bubble/scatter point will be placed 
	 * vertically on the y-axis based on this value.
	 */
	public void setY(String value) {
		setAttribute(PARAMETER_Y, value);
	}

	/**
	 * Type: Boolean 
	 * Range value: 0/1 
	 * Description :
	 * You can individually opt to show/hide values of individual data 
	 * items using this attribute. This value over-rides the data-set level 
	 * value.
	 */
	public void setShowValue(String value) {
		setAttribute(PARAMETER_SHOWVALUE, value);
	}
}
