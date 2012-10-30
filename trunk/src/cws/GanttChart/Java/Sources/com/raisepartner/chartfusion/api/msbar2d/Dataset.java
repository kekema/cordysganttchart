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
package com.raisepartner.chartfusion.api.msbar2d;

public class Dataset extends com.raisepartner.chartfusion.api.Dataset {

	public final static String PARAMETER_RATIO = "ratio";
	public final static String PARAMETER_DASHED = "dashed";

	public Dataset() {
	}

	/**
	 * Type: String 
	 * Range value: Comma separated list of ratios 
	 * Description :
	 * If you've opted to show columns as gradients, this attribute lets 
	 * you control the ratio of each color. Please see Gradients under 
	 * Advanced Charting Section to get more information. 
	 */
	public void setRatio(String value) {
		setAttribute(PARAMETER_RATIO, value);
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
         * @see com.raisepartner.chartfusion.api.msbar2d.Set
         */
        public Set createSetNode() {
                Set node = new Set();
		addNode(node);
		return node;
        }

}
