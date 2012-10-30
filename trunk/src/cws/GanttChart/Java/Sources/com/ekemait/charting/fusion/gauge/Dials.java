package com.ekemait.charting.fusion.gauge;


/**
 * In an angular gauge, dials are used to point to the desired value. You can point to more than one value using 
 * multiple dials. Each dial can have its individual properties like color (border and background), width 
 * (both base and top), radius and value of the dial.
 *
 */
public class Dials extends com.raisepartner.chartfusion.api.Node 
{
	public Dials() 
	{
		super("dials");
	}
	
    public Dial createDialNode() 
    {
    	Dial node = new Dial();
        addNode(node);
        return node;
    }
}