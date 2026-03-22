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

    @Test
    public void testSumarConCero() {
        Calc calc = new Calc();
        Assert.assertEquals(9, calc.sumar(9, 0));
        Assert.assertEquals(-4, calc.sumar(0, -4));
    }

    @Test
    public void testSumarConNegativos() {
        Calc calc = new Calc();
        Assert.assertEquals(0, calc.sumar(-1, 1));
        Assert.assertEquals(-11, calc.sumar(-3, -8));
    }

    @Test(expected = ArithmeticException.class)
    public void testSumarOverflowPositivoInt() {
        Calc calc = new Calc();
        calc.sumar(1, 2147483647);
    }

    @Test(expected = ArithmeticException.class)
    public void testSumarOverflowNegativoInt() {
        Calc calc = new Calc();
        calc.sumar(-1, -2147483648);
    }

}
