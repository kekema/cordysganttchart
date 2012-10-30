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

public class Set extends com.raisepartner.chartfusion.api.Set {

	public final static String PARAMETER_X = "x";
	public final static String PARAMETER_Y = "y";
	public final static String PARAMETER_Z = "z";
	public final static String PARAMETER_NAME = "name";
	public final static String PARAMETER_COLOR = "color";
	public final static String PARAMETER_SHOWVALUE = "showValue";
	public final static String PARAMETER_ALPHA = "alpha";

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
	 * Type: Number 
	 * Range value: Numeric Value 
	 * Description :
	 * Z-axis numerical value for the set of data. The size of bubble 
	 * would depend on this value (with respect to z values of other bubbles 
	 * on the chart).
	 */
	public void setZ(String value) {
		setAttribute(PARAMETER_Z, value);
	}

	/**
	 * Type: String 
	 * Range value: 
	 * Description :
	 * This attribute helps you set the name of this bubble, which would 
	 * be displayed over the bubble.
	 */
	public void setName(String value) {
		setAttribute(PARAMETER_NAME, value);
	}

	/**
	 * Type: Color 
	 * Range value: Hex Code 
	 * Description :
	 * For multi-series and combination charts, you can define the color 
	 * of data-sets at dataset level. However, if you wish to highlight a 
	 * particular data element, you can specify it's color at "set" level 
	 * using this attribute. This attribute accepts hex color codes without #
	 * .
	 */
	public void setColor(String value) {
		setAttribute(PARAMETER_COLOR, value);
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

	/**
	 * Type: Number 
	 * Range value: 0-100 
	 * Description :
	 * For multi-series and combination charts, you can define the alpha 
	 * of data-sets at dataset level. However, if you wish to highlight a 
	 * particular data element, you can specify it's alpha at "set" level 
	 * using this attribute.
	 */
	public void setAlpha(String value) {
		setAttribute(PARAMETER_ALPHA, value);
	}
}
