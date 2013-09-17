
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package nicApp;

import org.joda.time.*;


/**
 *
 * @author Ruveni
 */
public class CalValues {
    private int year;
    private int month;
    private int day;
    private String gender;
    private boolean isVoter=false;
    
    public String calValue(String nic)throws NicException{
        DateTime date = new DateTime(2012, 1, 1, 0, 0, 0);
        try {
            setYear(1900 + Integer.parseInt(nic.substring(0, 2)));//Calculating year
            int genderVal = Integer.parseInt(nic.substring(2, 5));
            if (genderVal <= 500) {//Checking for gender
                setGender("Male");
            } else {
                genderVal = genderVal - 500;
                setGender("Female");
            }
            date = date.plusDays(genderVal - 1);
            setMonth(date.getMonthOfYear());//Calculating the month
            setDay(date.getDayOfMonth());//Calculating the day
            int qualify = 2012 - getYear();
            if (qualify >= 18) {//Checking whether a voter or not
                setIsVoter(true);
            } else {
                setIsVoter(false);
            }
        } catch (Exception e) {
            throw new NicException("Invalid NIC Number..Recheck!!!!");
        }
        String result="Birthday[year="+getYear()+", month="+getMonth()+", date="+getDay()+"] gender="+getGender().toUpperCase()+" isVoter="+isIsVoter()+"";
        return result;//Returns the data as a string
    }

    /**
     * @return the year
     */
    public int getYear() {
        return year;
    }

    /**
     * @param year the year to set
     */
    public void setYear(int year) {
        this.year = year;
    }

    /**
     * @return the month
     */
    public int getMonth() {
        return month;
    }

    /**
     * @param month the month to set
     */
    public void setMonth(int month) {
        this.month = month;
    }

    /**
     * @return the day
     */
    public int getDay() {
        return day;
    }

    /**
     * @param day the day to set
     */
    public void setDay(int day) {
        this.day = day;
    }

    /**
     * @return the gender
     */
    public String getGender() {
        return gender;
    }

    /**
     * @param gender the gender to set
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * @return the isVoter
     */
    public boolean isIsVoter() {
        return isVoter;
    }

    /**
     * @param isVoter the isVoter to set
     */
    public void setIsVoter(boolean isVoter) {
        this.isVoter = isVoter;
    }
}
