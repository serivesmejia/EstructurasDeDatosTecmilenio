# Actividad 4 – Árbol Binario

## Descripción
En esta actividad se desarrolló un programa en Java que implementa un árbol binario de búsqueda con operaciones de inserción, búsqueda y recorridos (inorden, preorden y postorden).
El programa permite almacenar y consultar datos de manera ordenada y eficiente.

## Funcionamiento del programa
1. **Inserción:**  
   Los nodos se insertan de forma recursiva. Si el valor es menor que el nodo actual se coloca a la izquierda, y si es mayor se coloca a la derecha.

2. **Búsqueda:**  
   La búsqueda recorre el árbol comparando el valor buscado con el nodo actual. Si se encuentra, devuelve verdadero; en caso contrario continúa en el subárbol correspondiente hasta terminar.

3. **Recorridos:**  
   - **Inorden:** Recorre primero el subárbol izquierdo, luego la raíz y finalmente el subárbol derecho. Muestra los valores en orden ascendente.  
   - **Preorden:** Recorre primero la raíz, después el subárbol izquierdo y por último el derecho.  
   - **Postorden:** Recorre primero el subárbol izquierdo, luego el derecho y al final la raíz.

## Evidencias de ejecución
Ejemplo de salida al insertar los valores `50, 30, 70, 20, 40, 60, 80`:

```

Recorrido INORDEN:
20 30 40 50 60 70 80

Recorrido PREORDEN:
50 30 20 40 70 60 80

Recorrido POSTORDEN:
20 40 30 60 80 70 50

¿Existe 40? true
¿Existe 100? false

```

## Reflexión
Los árboles binarios son estructuras de datos muy útiles porque permiten realizar operaciones de búsqueda, inserción y eliminación de manera más eficiente que una lista lineal.  
Su capacidad de mantener los datos ordenados automáticamente los hace fundamentales en múltiples aplicaciones, como índices de bases de datos, compiladores, gestores de memoria y sistemas de archivos.  
Además, los árboles binarios de búsqueda son la base de estructuras más avanzadas como los árboles balanceados (AVL, Red-Black Trees) y los heaps, que se utilizan en problemas donde la eficiencia es crítica.