package unit_test;

import org.testng.annotations.Test;

public class FirstTest extends BasedTest {
    @Test(groups = "mult test")
    public void checkSomthing () {
        System.out.println("Hello World");
    }
    @Test
    public void checkSome() {
        System.out.println("I am the test method");
    }
}
