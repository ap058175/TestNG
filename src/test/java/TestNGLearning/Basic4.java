package TestNGLearning;

import org.testng.annotations.Test;

public class Basic4 {
    @Test(groups = "Smoke")
    public void webloginCarLoan() {
        System.out.println("This is a web login test method.. for Car Loan.");
    }
    @Test
    public void mobileloginCarLoan() {
        System.out.println("This is a mobile login test method. for Car Loan.");
    }
    @Test
    public void mobileloginAPICarLoan() {
        System.out.println("This is a login API test method. for Car Loan.");
    }
}
