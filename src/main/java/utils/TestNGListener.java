package utils;

import org.apache.log4j.Logger;
import org.testng.*;
import org.testng.xml.XmlSuite;

import java.util.List;

public class TestNGListener implements ITestListener, IReporter {
    private static final Logger LOG = Logger.getLogger(TestNGListener.class);

    @Override
    public void onTestStart(ITestResult result) {
        Reporter.log("Test start" + result.getTestName());
        LOG.info("on Test Start");
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        Reporter.log("Congratulation test is successful" + result.getTestName());
    }

    @Override
    public void onTestFailure(ITestResult result) {
        Reporter.log("Smth went wrong :(" + result.getTestName());
        LOG.info("Test was failed" + result);
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        LOG.info("Test skipped" + result);
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

    }

    @Override
    public void onStart(ITestContext context) {
        Reporter.log("Start");
        LOG.info("Start!!!" + context.getName());
    }

    @Override
    public void onFinish(ITestContext context) {
        LOG.info("Finish!!!" + context.getName());
    }

    @Override
    public void generateReport(List<XmlSuite> xmlSuites, List<ISuite> suites, String outputDirectory) {

    }
}