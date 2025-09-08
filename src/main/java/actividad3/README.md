# Algoritmos Recursivos en Java

Este proyecto implementa tres programas en Java que muestran el uso de la recursividad y el backtracking en la resolución de problemas:

1. **Serie de Fibonacci Recursiva**  
2. **Problema de Subset Sum (Suma de subconjuntos)**  
3. **Resolución de Sudoku con Backtracking**

---

## 1. Explicación de los Algoritmos

### Serie de Fibonacci
- **Diseño:** La función se define recursivamente.  
- **Casos base:** `f(0) = 0`, `f(1) = 1`.  
- **Caso recursivo:** `f(n) = f(n-1) + f(n-2)`.  
- **Funcionamiento:** El problema se divide en dos subproblemas más pequeños hasta llegar a los casos base.

---

### 🔹 Subset Sum
- **Diseño:** Explora todas las combinaciones de números en un conjunto para verificar si alguno de sus subconjuntos suma al valor objetivo.  
- **Casos base:**  
  - Si el objetivo (`target`) es `0`, la respuesta es verdadera.  
  - Si no quedan elementos y el objetivo no es `0`, la respuesta es falsa.  
- **Caso recursivo:** El algoritmo decide recursivamente **incluir o no incluir** un elemento en el subconjunto.  
- **Funcionamiento:** Genera un árbol de decisiones que explora todas las posibles combinaciones.

---

### 🔹 Sudoku con Backtracking
- **Diseño:** Se resuelve celda por celda intentando valores posibles del 1 al 9.  
- **Caso base:** Si se completan todas las filas (`row == 9`), el Sudoku está resuelto.  
- **Funcionamiento:**  
  - Si un número es válido en una celda, se coloca provisionalmente.  
  - Si al continuar no se logra resolver, se deshace el movimiento (*backtracking*) y se prueba otro número.  
  - El proceso continúa hasta encontrar una solución válida.  

---

## 2. Reporte de Ejecución

### Fibonacci
- **Entrada:** `n = 10`  
- **Salida:** `55`

### Subset Sum
- **Entrada:** `[3, 34, 4, 12, 5, 2]`, objetivo `9`  
- **Salida:** `"Existe un subconjunto con suma 9"`

### Sudoku
- **Entrada:** Tablero con celdas vacías (representadas con ceros).  
- **Salida:** Tablero completamente resuelto.

Ejemplo de salida del Sudoku resuelto:

```

5 3 4 6 7 8 9 1 2
6 7 2 1 9 5 3 4 8
1 9 8 3 4 2 5 6 7
8 5 9 7 6 1 4 2 3
4 2 6 8 5 3 7 9 1
7 1 3 9 2 4 8 5 6
9 6 1 5 3 7 2 8 4
2 8 7 4 1 9 6 3 5
3 4 5 2 8 6 1 7 9

```

---

## Reflexión Final

La **recursividad** es una herramienta poderosa para resolver problemas que se definen en función de sí mismos, como Fibonacci o Subset Sum.  

Los algoritmos de **divide y vencerás** permiten descomponer problemas grandes en subproblemas más simples, resolviendo cada uno de manera independiente y luego combinando sus resultados.  

El **backtracking** es una extensión de la recursividad que permite explorar múltiples posibilidades, retrocediendo cuando una elección lleva a un callejón sin salida, como en el Sudoku.  

En conjunto, estas técnicas son fundamentales para abordar problemas complejos de forma estructurada, clara y eficiente.  
