package com.ekemait.charting.fusion.annotations;

/**
 * Annotations let you create your own custom objects (shapes, images, text etc.) in the charts. You can create 
 * various shapes like polygons, rectangles, circles, arcs, etc., render annotation text at required positions and load 
 * external GIF/JPEG/PNG images or other Flash movies in the chart itself. . 
 *
 */
public class AnnotationGroup extends com.raisepartner.chartfusion.api.Node 
{
	public final static String PARAMETER_ID = "id";
	public final static String PARAMETER_SHOWBELOW = "showBelow";
	public final static String PARAMETER_SHOWSHADOW = "showShadow";
	public final static String PARAMETER_VISIBLE = "visible";

	public AnnotationGroup() 
	{
		super("annotationGroup");
	}
	
	/**
	 * Type: String 
	 * 
	 * The ID of the annotation group. Each annotation group needs to have a unique ID. 
	 * This allows the group to be referred using: Styles, Alert Manager and JavaScript API.
	 */
	public void setId(String value) 
	{
		setAttribute(PARAMETER_ID, value);
	}
	
	/**
	 * Type: Boolean (0/1) 
	 * 
	 * Whether the annotation group will be shown above the chart or below it. 
	 */
	public void setShowBelow(String value) 
	{
		setAttribute(PARAMETER_SHOWBELOW, value);
	}
	
	/**
	 * Type: Boolean (0/1) 
	 * 
	 * Whether to show shadow.
	 */
	public void setShowShadow(String value) 
	{
		setAttribute(PARAMETER_SHOWSHADOW, value);
	}
	
	/**
	 * Type: Boolean (0/1) 
	 * 
	 * Whether the annotation group will be visible on the chart or not. 
	 */
	public void setVisible(String value) 
	{
		setAttribute(PARAMETER_VISIBLE, value);
	}
	
    public Annotation createAnnotation() 
    {
    	Annotation node = new Annotation();
        addNode(node);
        return node;
    }
}