package com.ekemait.charting.fusion.annotations;

/**
 * Annotations let you create your own custom objects (shapes, images, text etc.) in the charts. You can create 
 * various shapes like polygons, rectangles, circles, arcs, etc., render annotation text at required positions and load 
 * external GIF/JPEG/PNG images or other Flash movies in the chart itself. . 
 *
 */
public class Annotations extends com.raisepartner.chartfusion.api.Node 
{
	public Annotations() 
	{
		super("annotations");
	}
	
    public AnnotationGroup createAnnotationGroup() 
    {
    	AnnotationGroup node = new AnnotationGroup();
        addNode(node);
        return node;
    }
}