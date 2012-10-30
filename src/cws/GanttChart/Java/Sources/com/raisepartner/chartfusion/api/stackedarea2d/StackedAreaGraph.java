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

public class StackedAreaGraph extends com.raisepartner.chartfusion.api.Graph {

    public final static String PARAMETER_SHOWGRIDBG = "showgridbg";
    public final static String PARAMETER_AREAALPHA = "areaAlpha";
    public final static String PARAMETER_SHOWAREABORDER = "showAreaBorder";


    public StackedAreaGraph() {
		super();
	}

	/**
	 * Type:   Number
	 * Range value:   Numeric value > 0
	 * Description :
	 *   Number of horizontal axis division lines that you want on the
	 * chart.
	 */
	public void setShowGridBg(String value) {
		setAttribute(PARAMETER_SHOWGRIDBG, value);
	}	    

    /**
	 * Type: Number
	 * Range value: 0-100
	 * Description :
	 * Transparency of the area fill.
	 */
	public void setAreaAlpha(String value) {
		setAttribute(PARAMETER_AREAALPHA, value);
	}

    /**
	 * Type: Number
	 * Range value: 0/1
	 * Description :
	 * Configuration whether the border over the area would be shown or not.
	 */
	public void setshowAreaBorder(String value) {
		setAttribute(PARAMETER_SHOWAREABORDER, value);
	}


}