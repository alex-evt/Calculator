package org.calculator;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class AdditionTest extends BaseTest {


    @Test(priority = 1, dataProvider = "Positive numbers and sum", description = "Сложение положительных чисел",
             invocationCount = 2, threadPoolSize = 2)
    public void verifyAdditionOfPositiveNumbers(int firstAddend, int secondAddend, int sum){
        System.out.println(firstAddend + " + " + secondAddend + " = " + calculator.add(firstAddend,secondAddend) );
        Assert.assertEquals(calculator.add(firstAddend,secondAddend), sum);
    }

    @DataProvider(name="Positive numbers and sum")
    public Object[][] positiveData() {
            return new Object[][]{
                    {2,6, 8},
                    {5,6, 11},
                    {15,7, 22},
                    {35,76, 111}
            };
    }

    @Test(priority = 2, dataProvider = "Rational numbers and sum", description = "Сложение рациональных чисел")
    public void verifyAdditionOfRationalNumbers(double firstAddend, double secondAddend, double sum){
        System.out.println(firstAddend + " + " + secondAddend + " = " + calculator.add(firstAddend,secondAddend) );
        Assert.assertEquals(calculator.add(firstAddend,secondAddend), sum);
    }

    @DataProvider(name="Rational numbers and sum")
    public Object[][] rationalData() {
        return new Object[][]{
                {2.4,6, 8.4},
                {4.1,2.5, 6.6},
                {15.43,7, 22.43},
        };
    }

    @Test(priority = 3, dataProvider = "Negative numbers and sum", description = "Сложение отрицательных чисел")
    public void verifyAdditionOfNegativeNumbers(int firstAddend, int secondAddend, int sum){
        System.out.println(firstAddend + " + " + secondAddend + " = " + calculator.add(firstAddend,secondAddend) );
        Assert.assertEquals(calculator.add(firstAddend,secondAddend), sum);
    }

    @DataProvider(name="Negative numbers and sum")
    public Object[][] negativeData() {
        return new Object[][]{
                {-8, -6, -14},
                {-45,-2, -47},
        };
    }


}
