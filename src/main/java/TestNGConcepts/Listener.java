package TestNGConcepts;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listener implements ITestListener {
    public void onTestStart(final ITestResult result) {
        System.out.println("Test Started->"+result.getName());
    }

    public void onTestSuccess(final ITestResult result) {
        System.out.println("Success of test cases and its details are : "+result.getName());
    }

    public void onTestFailure(final ITestResult result) {
        System.out.println("Failure of test cases and its details are : "+result.getName());
    }

    public void onTestSkipped(final ITestResult result) {
        System.out.println("Skip of test cases and its details are : "+result.getName());
    }

    public void onTestFailedButWithinSuccessPercentage(final ITestResult iTestResult) {

    }

    public void onStart(final ITestContext arg0) {
        System.out.println("Start Of Execution(TEST)->"+arg0.getName());
    }

    public void onFinish(final ITestContext arg0) {
        System.out.println("END Of Execution(TEST)->"+arg0.getName());
    }
}
