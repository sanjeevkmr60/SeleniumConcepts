package TestNGConcepts;

import org.testng.annotations.Test;

public class TestngAnatations {
   /* Annotation	Description
    @BeforeSuite   will run before the execution of all the test methods in the suite.
    @AfterSuite	  will run after the execution of all the test methods in the suite.
    @BeforeTest	 will be executed before the execution of all the test methods of available classes belonging to that folder.
    @AfterTest	will be executed after the execution of all the test methods of available classes belonging to that folder.
    @BeforeClass	will be executed before the first method of the current class is invoked.
    @AfterClass	 will be invoked after the execution of all the test methods of the current class.
    @BeforeMethod	The @BeforeMethod annotated method will be executed before each test method will run.
    @AfterMethod	 will run after the execution of each test method.
    @BeforeGroups	 run only once for a group before the execution of all test cases belonging to that group.
    @AfterGroups	 run only once for a group after the execution of all test cases belonging to that group.
*/
@Test
    public void testing(){
    System.out.println("TestngAnatations");
}


}
