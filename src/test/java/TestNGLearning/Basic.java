package TestNGLearning;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class Basic {

    @Test
    public void test1() {
        System.out.println("Hello, World!");
    }
    @Test
    public void test2() {
        System.out.println("This is a second test method.");
    }
    @BeforeMethod
    public void methodFirst(){
        System.out.println("I am no 1 ,method in Basic class");
    }
    @AfterMethod
    public void methodLast(){
        System.out.println("I am no 2 ,method in Basic class");
    }

}
