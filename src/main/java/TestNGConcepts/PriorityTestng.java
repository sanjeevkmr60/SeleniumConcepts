package TestNGConcepts;

import org.testng.annotations.Test;



public class PriorityTestng {
    @Test(priority=0)
    public void method1() {
        System.out.println("method1");
    }
    @Test(priority=0)
    public void method2() {
        System.out.println("method2");
    }
    @Test(priority=0)
    public void method3() {
        System.out.println("method3");
    }
    @Test(enabled=false)
    public void jira()
    {
        System.out.println("JIRA is a testing tool");
    }
    @Test(enabled=true)
    public void Rally()
    {
        System.out.println("Rally is a testing tool");
    }

}
