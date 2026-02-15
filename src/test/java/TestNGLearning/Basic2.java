package TestNGLearning;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Basic2 {
    @Test(groups = "Smoke")
    public void test3() {
        System.out.println("This is a third test method.");
    }
    @BeforeTest
    public void precondition() {
        System.out.println("This is a precondition method.");
    }

}
