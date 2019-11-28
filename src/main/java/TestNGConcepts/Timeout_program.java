package TestNGConcepts;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
//@Listeners(value=Reporter.class)
public class Timeout_program {

    @Test(timeOut=200)
    public void testcase1() throws InterruptedException
    {
        Thread.sleep(500);
        System.out.println("This is testcase1");
    }
    @Test
    public void testcaes2()
    {
        System.out.println("This is testcase2");
    }
    @Test
    public void testcase3()
    {
        System.out.println("This is testcase3");
    }

    @Test
    public void testtofail()
    {
        System.out.println("Test case has been failed");
        Assert.assertTrue(false);
    }
}
