package unit_test;

import Calculator.Calculator;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GroupTest extends BasedTest {
    private Calculator calculator = new Calculator();
    private final double FIRST_NUM = 10;
    private final double SECOND_NUM = 5;

    @Test
    public void checkAdd() {
        double expectedResult = FIRST_NUM + SECOND_NUM;
        double actualResult = calculator.add(FIRST_NUM, SECOND_NUM);

        Assert.assertEquals(actualResult, expectedResult, "The result is not correct for adding");

    }

    @Test(groups = "mult test")
    public void checkSecondMult() {
        double expectedResult = FIRST_NUM + SECOND_NUM;
        double actualResult = calculator.errorMult(FIRST_NUM, SECOND_NUM);

        Assert.assertEquals(actualResult, expectedResult, "The result is not correct for mult");
    }
    @Test(groups = "console tests", dependsOnMethods = "checkSecondMult", alwaysRun = true)
    public void checkSomthing () {
        System.out.println("Hello World");
    }
    @Test(description = "Проверить что-то", groups = "console tests", dependsOnMethods = "mult test")
    public void checkSome() {
        System.out.println("I am the test method");
    }
}
