package TestNGConcepts;

import org.testng.annotations.DataProvider;

public class TestNGDataProvider {
    @DataProvider
    public static Object[][] testdata(){
        String tool="Automation";
        String toolName="Selenium";

        Object data[][] = new Object[][]{{tool, toolName}};
        return data;
    }
}
