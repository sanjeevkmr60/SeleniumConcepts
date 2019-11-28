package TestNGConcepts;

import org.testng.annotations.Test;

public class DataProviderConcept {
    @Test(description="Passing data with @dataprovider",dataProviderClass = TestNGDataProvider.class,dataProvider =
            "testdata")
    public void test(String tool,String name){
        System.out.println(tool);
        System.out.println(name);
    }
}
