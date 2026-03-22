package main;

public class Calc {
    private static final String ERROR_OVERFLOW_MAX = "El resultado supera el máximo valor numérico permitido por el lenguaje.";
    private static final String ERROR_OVERFLOW_MIN = "El resultado supera el mínimo valor numérico permitido por el lenguaje.";
    private static final String ERROR_DIVISION_POR_CERO = "No se puede dividir por 0 (cero).";
    private static final String ERROR_POTENCIA_NEGATIVA = "No se puede elevar a una potencia negativa.";
    private static final String ERROR_POTENCIA_CERO_CERO = "No se puede elevar 0 a la potencia de 0.";

    public int sumar(int a, int b) {
        long resultado = (long) a + (long) b;

        if (resultado > Integer.MAX_VALUE) { // evaluamos que no se produzca un overflow positivo
            throw new ArithmeticException(
                    ERROR_OVERFLOW_MAX);
        }
        if (resultado < Integer.MIN_VALUE) { // evaluamos que no se produzca un overflow negativo
            throw new ArithmeticException(
                    ERROR_OVERFLOW_MIN);
        }
        return (int) resultado;
    }

    // ------------------------------------------------------------------------------------

    public int restar(int a, int b) {
        long resultado = (long) a - (long) b;

        if (resultado > Integer.MAX_VALUE) { // evaluamos que no se produzca un overflow positivo
            throw new ArithmeticException(
                    ERROR_OVERFLOW_MAX);
        }
        if (resultado < Integer.MIN_VALUE) { // evaluamos que no se produzca un overflow negativo
            throw new ArithmeticException(
                    ERROR_OVERFLOW_MIN);
        }

        return (int) resultado;
    }

    // ------------------------------------------------------------------------------------

    public int multiplicar(int a, int b) {
        long resultado = (long) a * (long) b;

        if (resultado > Integer.MAX_VALUE) { // evaluamos que no se produzca un overflow positivo
            throw new ArithmeticException(
                    ERROR_OVERFLOW_MAX);
        }
        if (resultado < Integer.MIN_VALUE) { // evaluamos que no se produzca un overflow negativo
            throw new ArithmeticException(
                    ERROR_OVERFLOW_MIN);
        }

        return (int) resultado;
    }

    // ------------------------------------------------------------------------------------

    public int dividir(int a, int b) throws ArithmeticException {
        if (b == 0) { // no se puede dividir por 0 (cero)
            throw new ArithmeticException(ERROR_DIVISION_POR_CERO);
        }

        long resultado = (long) a / (long) b;

        if (resultado > Integer.MAX_VALUE) { // evaluamos que no se produzca un overflow positivo
            throw new ArithmeticException(
                    ERROR_OVERFLOW_MAX);
        }
        if (resultado < Integer.MIN_VALUE) { // evaluamos que no se produzca un overflow negativo
            throw new ArithmeticException(
                    ERROR_OVERFLOW_MIN);
        }

        return (int) resultado;
    }

    // ------------------------------------------------------------------------------------

    public int potencia(int a, int b) throws ArithmeticException {
        if (b < 0) // no se puede elevar a una potencia negativa
            throw new ArithmeticException(ERROR_POTENCIA_NEGATIVA);
        if (a == 0 && b == 0) // no se puede elevar 0 a la potencia de 0
            throw new ArithmeticException(ERROR_POTENCIA_CERO_CERO);
        int resultado = 1;
        for (int i = 0; i < b; i++) {
            resultado = multiplicar(resultado, a);
        }
        return resultado;
    }

}
