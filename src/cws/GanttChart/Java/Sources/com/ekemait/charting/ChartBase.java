/*  
 *	Copyright 2012 Ekema IT   
 * 
 *  This file is part of Charting Java API   
 *   
 *  Licensed under the Apache License, Version 2.0 (the "License");  
 *  you may not use this file except in compliance with the License.  
 *  You may obtain a copy of the License at  
 *  
 *  http://www.apache.org/licenses/LICENSE-2.0  
 *  
 *  Unless required by applicable law or agreed to in writing, software  
 *  distributed under the License is distributed on an "AS IS" BASIS,  
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.  
 *  See the License for the specific language governing permissions and  
 *  limitations under the License. 
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
