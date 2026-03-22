# TC Suma

## Resumen de casos

| ID        | Entrada (a, b) | Resultado esperado | Tipo      |
| --------- | -------------- | ------------------ | --------- |
| TC-SUM-01 | (2, 2)         | 4                  | Normal    |
| TC-SUM-02 | (5, 7)         | 12                 | Normal    |
| TC-SUM-03 | (9, 0)         | 9                  | Con cero  |
| TC-SUM-03 | (0, -4)        | -4                 | Con cero  |
| TC-SUM-04 | (-1, 1)        | 0                  | Mixto     |
| TC-SUM-05 | (-3, -8)       | -11                | Negativos |

---

## Caso TC-SUM-01: Suma de dos enteros positivos

**Dado** que tengo que sumar dos numeros enteros positivos.
**Cuando** ingreso los numeros 2 y 2.
**Entonces** espero que el resultado sea 4.

---

## Caso TC-SUM-02: Suma de dos enteros positivos distintos

**Dado** que tengo que sumar dos numeros enteros positivos distintos.
**Cuando** ingreso los numeros 5 y 7.
**Entonces** espero que el resultado sea 12.

---

## Caso TC-SUM-03: Suma con cero segundo

**Dado** que tengo que sumar un numero con cero.
**Cuando** ingreso los numeros 9 y 0.
**Entonces** espero que el resultado sea 9.

---

## Caso TC-SUM-04: Suma con cero primero

**Dado** que tengo que sumar un numero con cero.
**Cuando** ingreso los numeros 0 y -4.
**Entonces** espero que el resultado sea -4.

---

## Caso TC-SUM-05: Suma de un negativo con un positivo

**Dado** que tengo que sumar un numero negativo con un numero positivo.
**Cuando** ingreso los numeros -1 y 1.
**Entonces** espero que el resultado sea 0.

---

## Caso TC-SUM-06: Suma de dos enteros negativos

**Dado** que tengo que sumar dos numeros negativos.
**Cuando** ingreso los numeros -3 y -8.
**Entonces** espero que el resultado sea -11.
