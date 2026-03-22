# TC Multiplicacion

## Resumen de casos

| ID        | Entrada (a, b)    | Resultado esperado  | Tipo                 |
| --------- | ----------------- | ------------------- | -------------------- |
| TC-MUL-01 | (3, 4)            | 12                  | Normal               |
| TC-MUL-02 | (9, 1)            | 9                   | Identidad            |
| TC-MUL-03 | (9, 0)            | 0                   | Con cero             |
| TC-MUL-04 | (0, -4)           | 0                   | Con cero             |
| TC-MUL-05 | (5, -1)           | -5                  | Mixto                |
| TC-MUL-06 | (-3, -8)          | 24                  | Negativos            |
| TC-MUL-07 | (2147483647, 2)   | ArithmeticException | Error (overflow max) |
| TC-MUL-08 | (-2147483648, -1) | ArithmeticException | Error (overflow min) |

---

## Caso TC-MUL-01: Multiplicacion de dos enteros positivos

**Dado** que tengo que multiplicar dos numeros enteros positivos.
**Cuando** ingreso los numeros 3 y 4.
**Entonces** espero que el resultado sea 12.

---

## Caso TC-MUL-02: Multiplicacion con uno

**Dado** que tengo que multiplicar un numero por uno.
**Cuando** ingreso los numeros 9 y 1.
**Entonces** espero que el resultado sea 9.

---

## Caso TC-MUL-03: Multiplicacion por cero

**Dado** que tengo que multiplicar un numero por cero.
**Cuando** ingreso los numeros 9 y 0.
**Entonces** espero que el resultado sea 0.

---

## Caso TC-MUL-04: Multiplicacion de cero por un negativo

**Dado** que tengo que multiplicar cero por un numero negativo.
**Cuando** ingreso los numeros 0 y -4.
**Entonces** espero que el resultado sea 0.

---

## Caso TC-MUL-05: Multiplicacion de un positivo por un negativo

**Dado** que tengo que multiplicar un numero positivo por un numero negativo.
**Cuando** ingreso los numeros 5 y -1.
**Entonces** espero que el resultado sea -5.

---

## Caso TC-MUL-06: Multiplicacion de dos enteros negativos

**Dado** que tengo que multiplicar dos numeros negativos.
**Cuando** ingreso los numeros -3 y -8.
**Entonces** espero que el resultado sea 24.

---

## Caso TC-MUL-07: Multiplicacion con overflow positivo de int

**Dado** que tengo que multiplicar un numero por un factor que supera el maximo de int.
**Cuando** ingreso los numeros 2147483647 y 2.
**Entonces** espero una excepcion ArithmeticException por overflow de int.

---

## Caso TC-MUL-08: Multiplicacion con overflow negativo de int

**Dado** que tengo que multiplicar el valor minimo de int por -1.
**Cuando** ingreso los numeros -2147483648 y -1.
**Entonces** espero una excepcion ArithmeticException por overflow de int.
