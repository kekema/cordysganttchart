/*
  This class has been generated by the Code Generator
*/

package com.ekemait.charting;

import com.cordys.cpc.bsf.busobject.BusObjectConfig;
import com.cordys.cpc.bsf.classinfo.AttributeInfo;
import com.cordys.cpc.bsf.classinfo.ClassInfo;


public abstract class ChartBase extends com.cordys.cpc.bsf.busobject.CustomBusObject
{
    // tags used in the XML document
    public final static String ATTR_ChartXML = "ChartXML";
    private static ClassInfo s_classInfo = null;
    public static ClassInfo _getClassInfo()//NOPMD framework ensures this is thread safe
    {
        if ( s_classInfo == null )//NOPMD
        {
            s_classInfo = newClassInfo(Chart.class);
            s_classInfo.setUIDElements(new String[]{});
            {
                AttributeInfo ai = new AttributeInfo(ATTR_ChartXML);
                ai.setJavaName(ATTR_ChartXML);
                ai.setAttributeClass(String.class);
                s_classInfo.addAttributeInfo(ai);
            }
        }
        return s_classInfo;
    }

    public ChartBase(BusObjectConfig config)
    {
        super(config);
    }

    public String getChartXML()
    {
        return getStringProperty(ATTR_ChartXML);
    }

    public void setChartXML(String value)
    {
        setProperty(ATTR_ChartXML, value, 0);
    }


}
