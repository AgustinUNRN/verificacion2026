# TC Potencia

## Resumen de casos

| ID        | Entrada (base, exponente) | Resultado esperado  | Tipo                           |
| --------- | ------------------------- | ------------------- | ------------------------------ |
| TC-POT-01 | (2, 3)                    | 8                   | Normal                         |
| TC-POT-02 | (5, 0)                    | 1                   | Exponente cero                 |
| TC-POT-03 | (7, 1)                    | 7                   | Exponente uno                  |
| TC-POT-04 | (0, 4)                    | 0                   | Base cero                      |
| TC-POT-05 | (-2, 4)                   | 16                  | Base negativa, exponente par   |
| TC-POT-06 | (-2, 3)                   | -8                  | Base negativa, exponente impar |
| TC-POT-07 | (10, 6)                   | 1000000             | Limite valido                  |
| TC-POT-08 | (2, -1)                   | ArithmeticException | Error (exponente negativo)     |
| TC-POT-09 | (0, 0)                    | ArithmeticException | Error (indeterminacion)        |
| TC-POT-10 | (-1, 3)                   | -1                  | Caso especial                  |
| TC-POT-11 | (-1, 4)                   | 1                   | Caso especial                  |
| TC-POT-12 | (2, 31)                   | ArithmeticException | Error (overflow max)           |
| TC-POT-13 | (-2, 31)                  | -2147483648         | Limite inferior int            |

---

## Caso TC-POT-01: Potencia de base positiva y exponente positivo

**Dado** que tengo que calcular una potencia con base y exponente positivos.
**Cuando** ingreso los numeros 2 y 3.
**Entonces** espero que el resultado sea 8.

---

## Caso TC-POT-02: Potencia con exponente cero

**Dado** que tengo que calcular una potencia con exponente cero.
**Cuando** ingreso los numeros 5 y 0.
**Entonces** espero que el resultado sea 1.

---

## Caso TC-POT-03: Potencia con exponente uno

**Dado** que tengo que calcular una potencia con exponente uno.
**Cuando** ingreso los numeros 7 y 1.
**Entonces** espero que el resultado sea 7.

---

## Caso TC-POT-04: Potencia con base cero y exponente positivo

**Dado** que tengo que calcular una potencia con base cero y exponente positivo.
**Cuando** ingreso los numeros 0 y 4.
**Entonces** espero que el resultado sea 0.

---

## Caso TC-POT-05: Potencia con base negativa y exponente par

**Dado** que tengo que calcular una potencia con base negativa y exponente par.
**Cuando** ingreso los numeros -2 y 4.
**Entonces** espero que el resultado sea 16.

---

## Caso TC-POT-06: Potencia con base negativa y exponente impar

**Dado** que tengo que calcular una potencia con base negativa y exponente impar.
**Cuando** ingreso los numeros -2 y 3.
**Entonces** espero que el resultado sea -8.

---

## Caso TC-POT-07: Potencia de valores grandes sin overflow

**Dado** que tengo que calcular una potencia de enteros grandes sin overflow.
**Cuando** ingreso los numeros 10 y 6.
**Entonces** espero que el resultado sea 1000000.

---

## Caso TC-POT-08: Potencia con exponente negativo

**Dado** que tengo que calcular una potencia con exponente negativo.
**Cuando** ingreso los numeros 2 y -1.
**Entonces** espero una excepcion ArithmeticException.

---

## Caso TC-POT-09: Potencia con base cero y exponente cero

**Dado** que tengo que calcular una potencia con base cero y exponente cero.
**Cuando** ingreso los numeros 0 y 0.
**Entonces** espero una excepcion ArithmeticException.

---

## Caso TC-POT-10: Potencia con base -1 y exponente impar

**Dado** que tengo que calcular una potencia con base -1 y exponente impar.
**Cuando** ingreso los numeros -1 y 3.
**Entonces** espero que el resultado sea -1.

---

## Caso TC-POT-11: Potencia con base -1 y exponente par

**Dado** que tengo que calcular una potencia con base -1 y exponente par.
**Cuando** ingreso los numeros -1 y 4.
**Entonces** espero que el resultado sea 1.

---

## Caso TC-POT-12: Potencia con overflow positivo de int

**Dado** que tengo que calcular una potencia cuyo resultado supera el maximo de int.
**Cuando** ingreso los numeros 2 y 31.
**Entonces** espero una excepcion ArithmeticException por overflow de int.

---

## Caso TC-POT-13: Potencia en el limite inferior de int

**Dado** que tengo que calcular una potencia con base negativa que llega al minimo de int.
**Cuando** ingreso los numeros -2 y 31.
**Entonces** espero que el resultado sea -2147483648.
