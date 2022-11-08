package org.calculator;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SubtractionTest extends BaseTest {
    @Test(dataProvider = "Entered minuend, subtrahend and difference", description = "Вычитание двух чисел")
    public void test(int minuend, int subtrahend, int difference){
        System.out.println(minuend + " - " + subtrahend + " = " + calculator.subtract(minuend,subtrahend) );
        Assert.assertEquals(calculator.subtract(minuend,subtrahend), difference);
    }

    @DataProvider(name="Entered minuend, subtrahend and difference")
    public Object[][] dataForSubtraction() {
        return new Object[][]{
                {6,5, 1},
                {2,2, 0},
                {18,7, 11},
                {2,70, -68},
                {-3,4, -7},
                {5,6, -1},
                {0,0, 0}
        };
    }
}
