/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package nicApp;

import static junit.framework.Assert.assertEquals;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author gallelaptop.lk
 */
public class CalValuesTest {
    
    public CalValuesTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of calValue method, of class CalValues.
     */
    @Test
    public void testYear() throws Exception {
        System.out.println("Year");
        String nic="918301119V";
        CalValues instance = new CalValues();
        String expResult = "1991";
        String temp = instance.calValue(nic);
        String result=instance.getYear()+"";
        assertEquals(expResult, result);
    }

    public void testMonth() throws Exception {
        System.out.println("Month");
        String nic="918301119V";
        CalValues instance = new CalValues();
        String expResult = "11";
        String temp = instance.calValue(nic);
        String result=instance.getMonth()+"";
        assertEquals(expResult, result);
    }

    public void testDate() throws Exception {
        System.out.println("Day");
        String nic="918301119V";
        CalValues instance = new CalValues();
        String expResult = "25";
        String temp = instance.calValue(nic);
        String result=instance.getDay()+"";
        assertEquals(expResult, result);
    }

    public void testGender() throws Exception {
        System.out.println("Gender");
        String nic="918301119V";
        CalValues instance = new CalValues();
        String expResult = "female";
        String temp = instance.calValue(nic);
        String result=instance.getGender()+"";
        assertEquals(expResult, result);
    }

    public void testIsVoter() throws Exception {
        System.out.println("IsVoter");
        String nic="918301119V";
        CalValues instance = new CalValues();
        String expResult = true+"";
        String temp = instance.calValue(nic);
        String result=instance.getMonth()+"";
        assertEquals(expResult, result);
    }
}