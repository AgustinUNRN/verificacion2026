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

    // ------------------------------------------------------------------------------------

    @Test
    public void testRestarPositivos() {
        Calc calc = new Calc();
        Assert.assertEquals(4, calc.restar(7, 3));
        Assert.assertEquals(-4, calc.restar(3, 7));
    }

    @Test
    public void testRestarConCero() {
        Calc calc = new Calc();
        Assert.assertEquals(9, calc.restar(9, 0));
        Assert.assertEquals(-4, calc.restar(0, 4));
    }

    @Test
    public void testRestarConNegativos() {
        Calc calc = new Calc();
        Assert.assertEquals(7, calc.restar(5, -2));
        Assert.assertEquals(5, calc.restar(-3, -8));
    }

    @Test(expected = ArithmeticException.class)
    public void testRestarOverflowPositivoInt() {
        Calc calc = new Calc();
        calc.restar(2147483647, -1);
    }

    @Test(expected = ArithmeticException.class)
    public void testRestarOverflowNegativoInt() {
        Calc calc = new Calc();
        calc.restar(-2147483648, 1);
    }

    // ------------------------------------------------------------------------------------

    @Test
    public void testMultiplicarPositivos() {
        Calc calc = new Calc();
        Assert.assertEquals(12, calc.multiplicar(3, 4));
        Assert.assertEquals(9, calc.multiplicar(9, 1));
    }

    @Test
    public void testMultiplicarConCero() {
        Calc calc = new Calc();
        Assert.assertEquals(0, calc.multiplicar(9, 0));
    }

    @Test
    public void testMultiplicarCeroPorNegativo() {
        Calc calc = new Calc();
        Assert.assertEquals(0, calc.multiplicar(0, -4));
    }

    @Test
    public void testMultiplicarConNegativos() {
        Calc calc = new Calc();
        Assert.assertEquals(-5, calc.multiplicar(5, -1));
        Assert.assertEquals(24, calc.multiplicar(-3, -8));
    }

    @Test(expected = ArithmeticException.class)
    public void testMultiplicarOverflowPositivoInt() {
        Calc calc = new Calc();
        calc.multiplicar(2147483647, 2);
    }

    @Test(expected = ArithmeticException.class)
    public void testMultiplicarOverflowNegativoInt() {
        Calc calc = new Calc();
        calc.multiplicar(-2147483648, -1);
    }

    // ------------------------------------------------------------------------------------

    @Test
    public void testDividirPositivos() {
        Calc calc = new Calc();
        Assert.assertEquals(4, calc.dividir(8, 2));
        Assert.assertEquals(3, calc.dividir(7, 2));
    }

    @Test
    public void testDividirConCeroYNegativos() {
        Calc calc = new Calc();
        Assert.assertEquals(0, calc.dividir(0, 5));
        Assert.assertEquals(0, calc.dividir(0, -5));
        Assert.assertEquals(-4, calc.dividir(8, -2));
        Assert.assertEquals(4, calc.dividir(-8, -2));
    }

    @Test(expected = ArithmeticException.class)
    public void testDividirPorCero() {
        Calc calc = new Calc();
        calc.dividir(8, 0);
    }

    @Test(expected = ArithmeticException.class)
    public void testDividirLimiteInferiorInt() {
        Calc calc = new Calc();
        calc.dividir(-2147483648, -1);
    }

    // ------------------------------------------------------------------------------------

    @Test
    public void testPotenciaPositivos() {
        Calc calc = new Calc();
        Assert.assertEquals(8, calc.potencia(2, 3));
        Assert.assertEquals(1, calc.potencia(5, 0));
        Assert.assertEquals(7, calc.potencia(7, 1));
    }

    @Test
    public void testPotenciaConCeroYNegativos() {
        Calc calc = new Calc();
        Assert.assertEquals(0, calc.potencia(0, 4));
        Assert.assertEquals(16, calc.potencia(-2, 4));
        Assert.assertEquals(-8, calc.potencia(-2, 3));
        Assert.assertEquals(-1, calc.potencia(-1, 3));
        Assert.assertEquals(1, calc.potencia(-1, 4));
    }

    @Test
    public void testPotenciaValoresGrandes() {
        Calc calc = new Calc();
        Assert.assertEquals(1000000, calc.potencia(10, 6));
    }

    @Test(expected = ArithmeticException.class)
    public void testPotenciaOverflowPositivoInt() {
        Calc calc = new Calc();
        calc.potencia(2, 31);
    }

    @Test(expected = ArithmeticException.class)
    public void testPotenciaExponenteNegativo() {
        Calc calc = new Calc();
        calc.potencia(2, -1);
    }

    @Test(expected = ArithmeticException.class)
    public void testPotenciaBaseCeroExponenteCero() {
        Calc calc = new Calc();
        calc.potencia(0, 0);
    }

    @Test
    public void testPotenciaLimiteInferiorInt() {
        Calc calc = new Calc();
        Assert.assertEquals(-2147483648, calc.potencia(-2, 31));
    }
}
