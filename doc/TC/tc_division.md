# TC Division

## Resumen de casos

| ID        | Entrada (a, b)    | Resultado esperado  | Tipo                      |
| --------- | ----------------- | ------------------- | ------------------------- |
| TC-DIV-01 | (8, 2)            | 4                   | Normal                    |
| TC-DIV-02 | (7, 2)            | 3                   | Truncamiento              |
| TC-DIV-03 | (0, 5)            | 0                   | Con cero                  |
| TC-DIV-04 | (0, -5)           | 0                   | Con cero                  |
| TC-DIV-05 | (8, -2)           | -4                  | Mixto                     |
| TC-DIV-06 | (-8, -2)          | 4                   | Negativos                 |
| TC-DIV-07 | (8, 0)            | ArithmeticException | Error (division por cero) |
| TC-DIV-08 | (-2147483648, -1) | ArithmeticException | Error (overflow)          |

---

## Caso TC-DIV-01: Division exacta de dos enteros positivos

**Dado** que tengo que dividir dos numeros enteros positivos.
**Cuando** ingreso los numeros 8 y 2.
**Entonces** espero que el resultado sea 4.

---

## Caso TC-DIV-02: Division de enteros con truncamiento

**Dado** que tengo que dividir dos numeros enteros con resto.
**Cuando** ingreso los numeros 7 y 2.
**Entonces** espero que el resultado sea 3.

---

## Caso TC-DIV-03: Division con dividendo cero y divisor positivo

**Dado** que tengo que dividir cero por un entero.
**Cuando** ingreso los numeros 0 y 5.
**Entonces** espero que el resultado sea 0.

---

## Caso TC-DIV-04: Division con dividendo cero y divisor negativo

**Dado** que tengo que dividir cero por un entero.
**Cuando** ingreso los numeros 0 y -5.
**Entonces** espero que el resultado sea 0.

---

## Caso TC-DIV-05: Division de positivo por negativo

**Dado** que tengo que dividir un numero positivo por uno negativo.
**Cuando** ingreso los numeros 8 y -2.
**Entonces** espero que el resultado sea -4.

---

## Caso TC-DIV-06: Division de dos enteros negativos

**Dado** que tengo que dividir dos numeros negativos.
**Cuando** ingreso los numeros -8 y -2.
**Entonces** espero que el resultado sea 4.

---

## Caso TC-DIV-07: Division por cero

**Dado** que tengo que dividir un numero por cero.
**Cuando** ingreso los numeros 8 y 0.
**Entonces** espero una excepcion ArithmeticException.

---

## Caso TC-DIV-08: Division en el limite inferior de int

**Dado** que tengo que dividir el valor minimo de int por -1.
**Cuando** ingreso los numeros -2147483648 y -1.
**Entonces** espero una excepcion ArithmeticException por overflow de int.
