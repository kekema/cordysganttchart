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

public class Bubble extends com.raisepartner.chartfusion.api.Graph {

	public final static String PARAMETER_CLIPBUBBLES = "clipBubbles";
	public final static String PARAMETER_NEGATIVECOLOR = "negativeColor";
	public final static String PARAMETER_USE3DLIGHTING = "use3DLighting";
	public final static String PARAMETER_BUBBLESCALE = "bubbleScale";
	public final static String PARAMETER_SHOWPLOTBORDER = "showPlotBorder";
	public final static String PARAMETER_PLOTBORDERCOLOR = "plotBorderColor";
	public final static String PARAMETER_PLOTBORDERTHICKNESS = "plotBorderThickness";
	public final static String PARAMETER_PLOTBORDERALPHA = "plotBorderAlpha";
	public final static String PARAMETER_PLOTFILLALPHA = "plotFillAlpha";

	public Bubble() {
	}

	/**
	 * Type: Boolean 
	 * Range value: 0/1 
	 * Description :
	 * If bigger bubbles are placed on the edges of the chart, they might
	 *  extend beyond the canvas. However, you can opt to clip those bubble 
	 * edges so that they are contained within the canvas by setting this 
	 * attribute to 1.
	 */
	public void setClipBubbles(String value) {
		setAttribute(PARAMETER_CLIPBUBBLES, value);
	}

	/**
	 * Type: Color 
	 * Range value: Hex Code 
	 * Description :
	 * You can opt to color all bubbles with a negative Z value on the 
	 * chart with a single color, which can be specified for this attribute.
	 */
	public void setNegativeColor(String value) {
		setAttribute(PARAMETER_NEGATIVECOLOR, value);
	}

	/**
	 * Type: Boolean 
	 * Range value: 0/1 
	 * Description :
	 * Whether to use 3D Bubbles or 2D Bubbles?
	 */
	public void setUse3DLighting(String value) {
		setAttribute(PARAMETER_USE3DLIGHTING, value);
	}

	/**
	 * Type: Number 
	 * Range value: 0-2 
	 * Description :
	 * If you want to proportionately increase/decrease size of all the 
	 * bubbles on the chart, you can use this attribute. A value of less than
	 *  1 (but greater than 0) would decrease all the bubble sizes and vice 
	 * versa.
	 */
	public void setBubbleScale(String value) {
		setAttribute(PARAMETER_BUBBLESCALE, value);
	}

	/**
	 * Type:   Boolean   
	 * Range value:   0/1   
	 * Description :
	 *   Whether the column, area, pie etc. border would show up.
	 */
	public void setShowPlotBorder(String value) {
		setAttribute(PARAMETER_SHOWPLOTBORDER, value);
	}

	/**
	 * Type: Color 
	 * Range value: 
	 * Description :
	 * Color for column, area, pie border
	 */
	public void setPlotBorderColor(String value) {
		setAttribute(PARAMETER_PLOTBORDERCOLOR, value);
	}

	/**
	 * Type: Number 
	 * Range value: 0-5 (Pixels) 
	 * Description :
	 * Thickness for column, area, pie border
	 */
	public void setPlotBorderThickness(String value) {
		setAttribute(PARAMETER_PLOTBORDERTHICKNESS, value);
	}

	/**
	 * Type: Number 
	 * Range value: 0-100 
	 * Description :
	 * Alpha for column, area, pie border
	 */
	public void setPlotBorderAlpha(String value) {
		setAttribute(PARAMETER_PLOTBORDERALPHA, value);
	}

	/**
	 * Type: Number 
	 * Range value: 0-100 
	 * Description :
	 * If you've opted to fill the plot (column, area etc.) as gradient, 
	 * this attribute lets you set the fill alpha for gradient.
	 */
	public void setPlotFillAlpha(String value) {
		setAttribute(PARAMETER_PLOTFILLALPHA, value);
	}
        /**
         * @see com.raisepartner.chartfusion.api.bubble.Set
         */
        public Set createSetNode() {
                Set node = new Set();
		addNode(node);
		return node;
        }

        /**
         * @see com.raisepartner.chartfusion.api.bubble.TrendLines
         */
        public TrendLines createTrendLinesNode() {
                TrendLines node = new TrendLines();
		addNode(node);
		return node;
        }

        /**
         * @see com.raisepartner.chartfusion.api.bubble.VTrendLines
         */
        public VTrendLines createVTrendLinesNode() {
                VTrendLines node = new VTrendLines();
		addNode(node);
		return node;
        }

        /**
         * @see com.raisepartner.chartfusion.api.bubble.Categories
         */
        public Categories createCategoriesNode() {
                Categories node = new Categories();
		addNode(node);
		return node;
        }

}
