package TestNGConcepts;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.IRetryAnalyzer;
import org.testng.annotations.ITestAnnotation;

public class RetryListenerClass implements IAnnotationTransformer {

    public void transform(
            final ITestAnnotation iTestAnnotation, final Class aClass, final Constructor constructor,
            final Method method) {
        IRetryAnalyzer retry=iTestAnnotation.getRetryAnalyzer();
        if(retry==null){
            iTestAnnotation.setRetryAnalyzer(RetryFailedTestCases.class);
        }

    }
}
