package TestNGLearning;

import org.testng.annotations.*;

public class Basic3 {
    @Test
    public void webloginHomeLoan() {
        System.out.println("This is a web login test method. for Home Loan.");
    }
    @Test(timeOut = 4000)
    public void timeOutHomeLoanPage(){
        System.out.println("This is a time out test method. for Home Loan.");
    }
    @Test(enabled = false)
    public void bugloginHomeLoan() {
        System.out.println("This is a bug login test method. for Home Loan.");
    }
    @Test(dependsOnMethods = {"webloginHomeLoan"})
    public void mobileloginHomeLoan() {
        System.out.println("This is a mobile login test method. for Home Loan.");
    }
    @Test(groups = "Smoke")
    public void loginAPIHomeLoan() {
        System.out.println("This is a login API test method. for Home Loan.");
    }

    @BeforeSuite
    public void startSuiteNumber1(){
        System.out.println("This is a method without Test Suite one. It will not be executed as a test.");
    }
    @AfterTest
    public void attheEnd() {
        System.out.println("This is a method without Suite @Test annotation. It will not be executed as a test.");
    }
    @AfterSuite
    public void endSuiteNumber1(){
        System.out.println("This is a method without Test Suoite end. It will not be executed as a test.");
    }
   @BeforeClass
    public void beforeClass(){
        System.out.println("This is a method without @BeforeClass annotation. It will not be executed as a test.");
    }
    @AfterClass
    public void afterClass(){
        System.out.println("This is a method without @AfterClass annotation. It will not be executed as a test.");
    }

}
