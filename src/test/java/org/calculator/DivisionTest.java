package org.calculator;

import org.calculator.util.Retry;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;



public class DivisionTest extends BaseTest {


    @Test(priority = 1,dataProvider = "Entered dividend, divisor and quotient", description = "Деление двух чисел",
            retryAnalyzer = Retry.class, invocationCount = 1)
    public void verifyDivision(double dividend, double divisor, double quotient){
        System.out.println(dividend + " / " + divisor + " = " + calculator.divide(dividend,divisor) );
        Assert.assertEquals(calculator.divide(dividend,divisor), quotient);
    }

    @DataProvider(name="Entered dividend, divisor and quotient")
    public Object[][] dataForSubtraction() {
        return new Object[][]{
                {2,2, 1},
                {80,4, 20},
                {-3,4, -0.75},
                {3,6, 0.5},
                {0,8, 0},
                {0.3, 0.5, 0.6}
        };
    }

    @Test(priority = 2,dataProvider= "Divide by zero",description = "Деление на ноль", retryAnalyzer = Retry.class)
    public void verifyDivisionByZeroIsImpossible(int dividend, int divisor){
        System.out.println(dividend + " / " + divisor + " = " + calculator.divide(dividend,divisor) );
        Assert.assertEquals(calculator.divide(dividend,divisor), 0);
    }

    @DataProvider(name="Divide by zero")
    public Object[][] dataForZeroDivision() {
        return new Object[][]{
                {81,0},
                {3,0},
                {0,0}
        };
    }

}
