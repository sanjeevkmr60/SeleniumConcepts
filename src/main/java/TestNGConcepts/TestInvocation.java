package TestNGConcepts;

import org.testng.annotations.Test;

public class TestInvocation {
    @Test(invocationCount = 10)
    public void testCase1(){
        System.out.println ("Hello" );
    }
}
