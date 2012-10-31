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

package com.ekemait.charting.util;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Charting util class.
 * 
 * @author kekema
 * 
 */
public class Util
{
	/**
	 * Checks if the given string is unequal to empty string
	 * 
	 * @param string
	 * @return boolean
	 */
    public static boolean isSet(String string)
    {
    	return (string != null && !string.equals(""));
    }

    /**
     * Formats the date as specified in the target pattern.
     *
     * @param   date to format
     * @param   date format pattern (eg. "YYYY/MM/DD")
     *
     * @return The input date formatted using the format pattern
     */
    public static String formatDate(Date inputDate, String formatPattern)
    {
        String returnValue = null;

        if ((inputDate != null) && (formatPattern != null))
        {
            SimpleDateFormat targetFormat = new SimpleDateFormat(formatPattern);
            returnValue = targetFormat.format(inputDate);
        }

        return returnValue;
    }
    
    /**
     * Set date to start of day
     * 
     * @param aDate
     * @return Date
     */
    public static Date startOfDay(Date aDate)
    {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(aDate);
		calendar.set(Calendar.HOUR_OF_DAY, 0);
		calendar.set(Calendar.MINUTE, 0);
		calendar.set(Calendar.SECOND, 0);
		return calendar.getTime();
    }
    
    /**
     * Set date to end of day
     * 
     * @param aDate
     * @return Date
     */
    public static Date endOfDay(Date aDate)
    {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(aDate);
		calendar.set(Calendar.HOUR_OF_DAY, 23);
		calendar.set(Calendar.MINUTE, 59);
		calendar.set(Calendar.SECOND, 59);
		return calendar.getTime();
    }
    
}