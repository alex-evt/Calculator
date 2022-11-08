package org.calculator;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MultiplicationTest extends BaseTest {
    @Test(dataProvider = "Entered first factor,second factor and product", description = "Умножение двух целых чисел")
    public void verifyMultiplication(int firstFactor, int secondFactor, int product){
        System.out.println(firstFactor + " * " + secondFactor + " = " + calculator.multiply(firstFactor,secondFactor) );
        Assert.assertEquals(calculator.multiply(firstFactor,secondFactor), product);
    }

    @DataProvider(name="Entered first factor,second factor and product")
    public Object[][] dataForMultiplication() {
        return new Object[][]{
                {6,5, 30},
                {2,2, 4},
                {18,7, 126},
                {2,70, 140},
                {-3,4, -12},
                {5,6, 30},
                {0,0, 0}
        };
    }

    @Test(dataProvider = "Entered first factor,second factor, third factor and product", description = "Умножение трех целых чисел")
    public void verifyMultiplicationThree(int firstFactor, int secondFactor, int thirdFactor, int product){
        System.out.println(firstFactor + " * " + secondFactor + " * " + thirdFactor + " = " +
                calculator.multiply(calculator.multiply(firstFactor,secondFactor), thirdFactor) );
        Assert.assertEquals(calculator.multiply(calculator.multiply(firstFactor,secondFactor), thirdFactor), product );
    }

    @DataProvider(name="Entered first factor,second factor, third factor and product")
    public Object[][] dataForMultiplicationThreeNumbers() {
        return new Object[][]{
                {4,7,7, 196},
                {-2,47,155, -14570}
        };
    }
}
