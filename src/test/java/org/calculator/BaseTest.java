package org.calculator;

import org.calculator.util.Listener;
import org.testng.annotations.*;

@Listeners(Listener.class)
public class BaseTest {

    Calculator calculator = new Calculator();

    @BeforeMethod
    public void startMethod(){
        System.out.println("======================================== METHOD STARTED ========================================");
    }

    @AfterMethod
    public void finishMethod(){
        System.out.println("======================================== METHOD FINISHED ========================================");
    }
}
