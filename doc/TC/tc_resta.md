# TC Resta

## Resumen de casos

| ID        | Entrada (a, b)   | Resultado esperado  | Tipo                 |
| --------- | ---------------- | ------------------- | -------------------- |
| TC-RES-01 | (7, 3)           | 4                   | Normal               |
| TC-RES-02 | (3, 7)           | -4                  | Normal               |
| TC-RES-03 | (9, 0)           | 9                   | Con cero             |
| TC-RES-04 | (0, 4)           | -4                  | Con cero             |
| TC-RES-05 | (5, -2)          | 7                   | Mixto                |
| TC-RES-06 | (-3, -8)         | 5                   | Negativos            |
| TC-RES-07 | (2147483647, -1) | ArithmeticException | Error (overflow max) |
| TC-RES-08 | (-2147483648, 1) | ArithmeticException | Error (overflow min) |

---

## Caso TC-RES-01: Resta de dos enteros positivos

**Dado** que tengo que restar dos numeros enteros positivos.
**Cuando** ingreso los numeros 7 y 3.
**Entonces** espero que el resultado sea 4.

---

## Caso TC-RES-02: Resta de dos enteros positivos con resultado negativo

**Dado** que tengo que restar un numero menor a uno mayor.
**Cuando** ingreso los numeros 3 y 7.
**Entonces** espero que el resultado sea -4.

---

## Caso TC-RES-03: Resta con cero

**Dado** que tengo que restar un numero con cero.
**Cuando** ingreso los numeros 9 y 0.
**Entonces** espero que el resultado sea 9.

---

## Caso TC-RES-04: Resta de cero menos un entero

**Dado** que tengo que restar un entero a cero.
**Cuando** ingreso los numeros 0 y 4.
**Entonces** espero que el resultado sea -4.

---

## Caso TC-RES-05: Resta de un negativo a un positivo

**Dado** que tengo que restar un numero negativo a un numero positivo.
**Cuando** ingreso los numeros 5 y -2.
**Entonces** espero que el resultado sea 7.

---

## Caso TC-RES-06: Resta de dos enteros negativos

**Dado** que tengo que restar dos numeros negativos.
**Cuando** ingreso los numeros -3 y -8.
**Entonces** espero que el resultado sea 5.

---

## Caso TC-RES-07: Resta con overflow positivo de int

**Dado** que tengo que restar un numero negativo al valor maximo permitido por Java.
**Cuando** ingreso los numeros 2147483647 y -1.
**Entonces** espero una excepcion ArithmeticException por overflow de int.

---

## Caso TC-RES-08: Resta con overflow negativo de int

**Dado** que tengo que restar un entero positivo al valor minimo permitido por Java.
**Cuando** ingreso los numeros -2147483648 y 1.
**Entonces** espero una excepcion ArithmeticException por overflow de int.
