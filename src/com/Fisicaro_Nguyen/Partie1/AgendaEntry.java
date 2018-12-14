package com.Fisicaro_Nguyen.Partie1;

import java.util.Date;

public class AgendaEntry {

    private Date DateStartTime;
    private Date DateEndTime;
    private float HoursStarTime;
    private float HoursEndTime;

    public AgendaEntry(Date dateStartTime, Date dateEndTime, float hoursStarTime, float hoursEndTime) {
        DateStartTime = dateStartTime;
        DateEndTime = dateEndTime;
        HoursStarTime = hoursStarTime;
        HoursEndTime = hoursEndTime;
    }

    public Date getDateStartTime() {
        return DateStartTime;
    }

    public Date getDateEndTime() {
        return DateEndTime;
    }

    public float getHoursStarTime() {
        return HoursStarTime;
    }

    public float getHoursEndTime() {
        return HoursEndTime;
    }
}
