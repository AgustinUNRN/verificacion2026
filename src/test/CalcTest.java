package test;

import org.junit.*;

import main.Calc;

public class CalcTest {

    @Test
    public void testSumar() {
        Calc calc = new Calc();
        Assert.assertEquals(4, calc.sumar(2, 2));
        Assert.assertEquals(12, calc.sumar(5, 7));

    }

}
