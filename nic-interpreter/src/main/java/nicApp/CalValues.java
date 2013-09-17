
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
            year = 1900 + Integer.parseInt(nic.substring(0, 2));//Calculating year
            int genderVal = Integer.parseInt(nic.substring(2, 5));
            if (genderVal <= 500) {//Checking for gender
                gender = "Male";
            } else {
                genderVal = genderVal - 500;
                gender = "Female";
            }
            date = date.plusDays(genderVal - 1);
            month = date.getMonthOfYear();//Calculating the month
            day = date.getDayOfMonth();//Calculating the day
            int qualify = 2012 - year;
            if (qualify >= 18) {//Checking whether a voter or not
                isVoter = true;
            } else {
                isVoter = false;
            }
        } catch (Exception e) {
            throw new NicException("Invalid NIC Number..Recheck!!!!");
        }
        String result="Birthday[year="+year+", month="+month+", date="+day+"] gender="+gender.toUpperCase()+" isVoter="+isVoter+"";
        return result;//Returns the data as a string
    }
}
