# Trabajo Practico Nro. 2-1 - Calculadora con TDD

Este repositorio contiene la evolucion de una calculadora en Java desarrollada con enfoque TDD (Test-Driven Development), partiendo de una implementacion inicial de suma y agregando nuevas funcionalidades de forma incremental.

## Enunciado

1. El programa Calc.java implementa una funcion que suma dos enteros.
2. Utilizar TDD para agregar las siguientes funcionalidades:
   a. Restar dos enteros.
   b. Multiplicar dos enteros.
   c. Dividir dos enteros.
3. Utilizando TDD, crear una funcionalidad potencia que reciba dos enteros (n: numero, e: exponente) y retorne n elevado a e, utilizando la funcion multiplicar.

Notas del enunciado:

- Primero se disenan los casos de prueba.
- Se crean las pruebas de error para cada funcionalidad.
- Se modifica la clase hasta superar las pruebas.
- Se refactoriza cuando corresponde.
- Las pruebas definen requisitos de comportamiento (por ejemplo, decisiones sobre division entera o manejo de errores).

## Funcionalidades implementadas

La clase principal implementada es src/main/Calc.java.

- Suma de enteros con validacion de overflow positivo y negativo.
- Resta de enteros con validacion de overflow positivo y negativo.
- Multiplicacion de enteros con validacion de overflow positivo y negativo.
- Division entera de enteros (con truncamiento) con validacion de:
  - division por cero.
  - overflow en el caso limite de int.
- Potencia de enteros usando multiplicar, con validacion de:
  - exponente negativo.
  - indeterminacion 0^0.
  - overflow.

## Pruebas automatizadas

La suite de pruebas se encuentra en src/test/CalcTest.java.

Cobertura de pruebas:

- Casos nominales.
- Casos con cero.
- Casos con negativos.
- Casos limite de int.
- Casos de error esperados con ArithmeticException.

Estado actual verificado:

- 27 pruebas encontradas.
- 27 pruebas exitosas.
- 0 fallas.

## Evidencia del proceso TDD por commits

En la rama TP-2-1 se registra el proceso incremental. Cada commit representa un paso de evolucion de funcionalidad o robustez de pruebas:

1. c6e1acd - primeros casos de prueba para la suma.
2. 2ab6f51 - evaluacion de casos de overflow (fallan inicialmente).
3. 1e9468d - implementacion para superar overflow en suma.
4. c22e395 - agrega resta con manejo de overflow y pruebas.
5. af8e593 - agrega multiplicacion con manejo de overflow y pruebas.
6. 62bed0b - agrega division con manejo de overflow, division por cero y pruebas.
7. 85178f6 - agrega potencia con manejo de overflow y pruebas.
8. 58d39fc - agrega validaciones en potencia para exponente negativo y 0^0.

## Estructura del proyecto

- src/main/Calc.java: implementacion de la calculadora.
- src/test/CalcTest.java: pruebas unitarias con JUnit.
- doc/TC/: documentacion de casos de prueba por operacion.
- lib/junit-platform-console-standalone-1.13.0-M2.jar: dependencia para ejecutar pruebas.
- bin/: salida de compilacion.

## Documentacion de casos de prueba

Se incluyen especificaciones detalladas (formato dado/cuando/entonces) en:

- doc/TC/tc_suma.md
- doc/TC/tc_resta.md
- doc/TC/tc_multiplicacion.md
- doc/TC/tc_division.md
- doc/TC/tc_potencia.md

## Como compilar y ejecutar pruebas

Requisitos:

- Java JDK instalado.

Desde la raiz del proyecto:

```bash
mkdir -p bin/main bin/test
javac -d bin/main src/main/Calc.java
javac -cp "bin/main:lib/junit-platform-console-standalone-1.13.0-M2.jar" -d bin/test src/test/CalcTest.java
java -jar lib/junit-platform-console-standalone-1.13.0-M2.jar execute --class-path "bin/main:bin/test" --scan-class-path
```
