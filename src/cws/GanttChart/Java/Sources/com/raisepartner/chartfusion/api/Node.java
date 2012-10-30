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
package com.raisepartner.chartfusion.api;

import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.Map.Entry;

/**
 * Represents and xml node.
 * 
 * @author S.Chassande-Barrioz
 */
public class Node {

    /**
     * The node name
     */
	public String name;
	
    /**
     * The list of subnodes
     */
	public final List<Node> subnodes = new ArrayList<Node>();

    /**
     * The attributes of the node.
     */
	public final Properties attributes = new Properties();
	
    /**
     * Builds a node
     * @param name is the name of the node
     */
	public Node(String name) {
		this.name = name;
	}
    /**
     * Add a subnode.
     * @param n is the new subnode
     */
	public void addNode(Node n) {
		subnodes.add(n);
	}
    /**
     * Defines an attribute. If the value is null, the attribute is removed.
     * @param name is the attribute name
     * @param value is the attribute value
     */
	public void setAttribute(String name, String value) {
		if (value == null) {
			attributes.remove(name);
		} else {
			attributes.setProperty(name, value);
		}
	}

    /**
     * Build the xml using the default representation of the node.
     * @see #toString
     */
    public String getDataUrl() {
        return this.toString();
    }

    /**
     * Replaces all <i>&amp;</i> with <i>%26</i>, in order to be
     * compatable with the <i>setDataXml</i> function in the FusionCharts.js.
     */
    public String getDataXMl() {
        String xml = this.toString();
        return xml.replaceAll("&", "%26");
    }

    /**
     * Builds the XML representation of the node.
     */
	@Override
	public String toString() {
		return toString(new StringBuffer(), "").toString(); 
	}
    /**
     * Recursive method building XML representation of the node
     * @param sb is the StringBuffer to fill with the representation of the 
     * current node. Must not be null.
     * @param tab is the tabulation prefix to insert at each line begin. Must 
     * not be null. 
     * @return the tab parameter.
     */
	private StringBuffer toString(StringBuffer sb, String tab) {
		final String innerTab = tab + "\t";
		sb.append(tab).append("<").append(name);
		for (Entry<Object, Object> me : attributes.entrySet()) {
			if (me.getValue() != null) {
				sb.append(" ").append((String) me.getKey());
				sb.append("='").append(encodeAttribute((String) me.getValue())).append("'");
			}
		}
		if (attributes.size() == 0) {
			sb.append(" ");
		}
		if (subnodes.isEmpty()) {
			sb.append("/>\n");
		} else {
			sb.append(">\n");
			for (Object element : subnodes) {
				Node n = (Node) element;
				n.toString(sb, innerTab);
			}
			sb.append(tab).append("</").append(name).append(">\n");
		}
		return sb;
	}
	
	/**
	 * Encode an attribute's value so that the XML is well-formed (avoid quotes for instance)
	 * @param attributeValue
	 * @return
	 */
	private String encodeAttribute(String attributeValue) {
		return attributeValue.replaceAll("'", "&apos;");
	}
}
