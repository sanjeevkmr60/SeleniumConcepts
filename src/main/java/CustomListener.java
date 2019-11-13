import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class CustomListener extends Base implements ITestListener {

    public void onTestStart(final ITestResult iTestResult) {

    }

    public void onTestSuccess(final ITestResult iTestResult) {

    }

    public void onTestFailure(final ITestResult iTestResult) {
        System.out.println("FAILED TEST");
        failed(iTestResult.getMethod().getMethodName());
    }

    public void onTestSkipped(final ITestResult iTestResult) {

    }

    public void onTestFailedButWithinSuccessPercentage(final ITestResult iTestResult) {

    }

    public void onStart(final ITestContext iTestContext) {

    }

    public void onFinish(final ITestContext iTestContext) {

    }
}
