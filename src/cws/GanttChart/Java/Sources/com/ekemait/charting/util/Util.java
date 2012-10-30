package com.ekemait.charting.util;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Util
{
	
    /**
     * Holds the format of a Cordys Date String
     */    
	public static final String CORDYS_DATE_FORMAT = "yyyy-MM-dd'T'HH:mm:ss";
	
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
    
    /**
     * Return the earlier date out of two dates
     * 
     * @param date1
     * @param date2
     * 
     * @return Date
     */
	public static Date minimumDate(Date date1, Date date2)
	{
		Date result = null;
		if (date1 == null)
		{
			result = date2;
		}
		else if (date2 == null)
		{
			result = date1;
		}
		else if (date1.getTime() < date2.getTime())
		{
			result = date1;
		}
		else
		{
			result = date2;
		}
		return result;
	}
	
    /**
     * Return the later date out of two dates
     * 
     * @param date1
     * @param date2
     * 
     * @return Date
     */
	public static Date maximumDate(Date date1, Date date2)
	{
		Date result = null;
		if (date1 == null)
		{
			result = date2;
		}
		else if (date2 == null)
		{
			result = date1;
		}
		else if (date1.getTime() > date2.getTime())
		{
			result = date1;
		}
		else
		{
			result = date2;
		}
		return result;
	}
	
	/**
	 * Determine the number of dates between two dates
	 * (so this is different from 'days' in between)
	 * 
	 * @param startDate
	 * @param endDate
	 * @return
	 */
	public static int datesBetween(Date startDate, Date endDate) 
	{   
		int datesBetween = 0;
		if ((startDate != null) && (endDate != null) && (startDate.getTime() < endDate.getTime()))
		{
			// use calendar as to be accurate towards daylight savings
			Calendar date1 = Calendar.getInstance();
			date1.setTime(startDate);
			date1.set(Calendar.HOUR_OF_DAY, 0);
			date1.set(Calendar.MINUTE, 0);
			date1.set(Calendar.SECOND, 0);
			Calendar date2 = Calendar.getInstance();
			date2.setTime(endDate);
			date2.set(Calendar.HOUR_OF_DAY, 0);
			date2.set(Calendar.MINUTE, 0);
			date2.set(Calendar.SECOND, 0);
			while (date1.before(date2)) 
			{   
				date1.add(Calendar.DAY_OF_MONTH, 1);   
				datesBetween++;   
			}  
		}
		return datesBetween;   
	}  
	
    /**
     * Converts a Cordys date string to a regular java date
     *
     * @param   cordysDate	string value with format yyyy-MM-dd'T'HH:mm:ss
     *
     * @return 	corresponding java date
     */    
    public static Date convertCordysDate(String cordysDate)
    {
    	Date resultDate = null;
    	if (isSet(cordysDate))
    	{
			SimpleDateFormat sdf = new SimpleDateFormat(CORDYS_DATE_FORMAT);
			try
			{
				resultDate = sdf.parse(cordysDate);
			} 
			catch (Exception e)
			{
				// 
			}   
    	}
    	return resultDate;
    }
}