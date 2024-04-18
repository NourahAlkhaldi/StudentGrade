package studentgrade;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/* JUnit 4.10 */


public class StudentGradeTest {
    
    
    public StudentGradeTest() {
    }
    
    @Before
    public void startTest(){
        System.out.println("<<< Start Test >>>>");
    }

    @Test
    public void testGetGrade95() {
        System.out.println("getGrade 95");
        int mark = 95;
        String expResult = "A";
        String result = StudentGrade.getGrade(mark);
        Assert.assertEquals(expResult, result);
    }

    @Test
    public void testGetGrade85() {
        System.out.println("getGrade 85");
        int mark = 85;
        String expResult = "B";
        String result = StudentGrade.getGrade(mark);
        Assert.assertEquals(expResult, result);
    }
    
    @Test
    public void testGetGrade75() {
        System.out.println("getGrade 75");
        int mark = 75;
        String expResult = "F";
        String result = StudentGrade.getGrade(mark);
        Assert.assertEquals(expResult, result);
    }

}
