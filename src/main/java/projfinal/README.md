# Proyect FInal - Sistema de Gestión de Tareas

## Introducción

Este proyecto es un sistema de gestión de tareas hecho en **Java** con una interfaz en **Swing**. La idea es tener un programa sencillo pero funcional para manejar diferentes tipos de tareas y al mismo tiempo aplicar varias estructuras de datos que vimos en clase.

En lugar de hacerlo solo con consola, se optó por una interfaz gráfica para que sea más cómodo de usar. Con esto se puede ver de manera práctica cómo funcionan cosas como pilas, colas, listas, tablas hash, árboles y hasta grafos dentro de un mismo sistema.

---

## Desarrollo

* **Pila (Stack):** aquí se guardan las tareas urgentes. Como es LIFO, siempre se atiende primero la última que se agregó.
* **Cola (Queue):** se usa para las tareas regulares. Es FIFO, así que se respeta el orden en que entran.
* **Listas:** permiten organizar las tareas por departamento y buscarlas o eliminarlas fácilmente.
* **Árboles binarios:** sirven para organizar y buscar tareas de forma más eficiente cuando se maneja mucha información.
* **Recursividad:** aplicada en algunos cálculos, por ejemplo para estadísticas de tareas o tiempos estimados.
* **Métodos de ordenamiento y búsqueda:** permiten organizar tareas por prioridad, fecha o encontrarlas más fácil.

---

## Funcionamiento del Programa

## Funcionamiento del Programa

El programa implementa un sistema de gestión de tareas que utiliza diferentes estructuras de datos para organizar y atender actividades según su tipo y prioridad. A través de una interfaz gráfica hecha en **Java Swing**, el usuario puede interactuar con botones que representan las distintas operaciones del sistema.

A continuación, se describe cómo funciona cada sección:

1. **Tareas Urgentes (Pila)**

    * Se administran mediante una **pila (Stack)**, ya que las tareas más recientes son las primeras en atenderse (LIFO).
    * Opciones disponibles:

        * Agregar tarea urgente.
        * Atender tarea urgente (se extrae de la pila).
        * Ver la próxima tarea urgente (peek).

2. **Tareas Regulares (Cola)**
    * Se gestionan con una **cola (Queue)**, atendiendo las tareas en el mismo orden en que fueron agregadas (FIFO).
    * Opciones disponibles:
        * Agregar tarea regular.
        * Atender tarea regular (dequeue).
        * Ver la próxima tarea regular (front).

3. **Tareas por Departamento (Lista / Árbol Binario)**

    * Se organizan por **departamento** para facilitar la búsqueda.
    * Se utilizan listas enlazadas y estructuras jerárquicas para mantener las tareas asociadas a cada área.
    * Opciones disponibles:
        * Agregar tarea en un departamento específico.
        * Buscar tareas de un departamento.
        * Eliminar todas las tareas de un departamento.

4. **Visualización General**
    * Existe una opción para **ver todas las tareas pendientes**, sin importar si son urgentes, regulares o por departamento.
    * La salida se muestra en un área de texto dentro de la interfaz gráfica.

5. **Selección de Departamentos**
    * Cada vez que se agrega, busca o elimina una tarea, el usuario puede seleccionar el **departamento** correspondiente mediante un cuadro de diálogo.

6. **Interfaz Gráfica (Swing)**
    * El programa utiliza botones agrupados en un panel con diseño de cuadrícula (GridLayout).
    * Los resultados de las operaciones se muestran en un área de texto en la parte inferior.
    * Esto hace que el sistema sea más intuitivo y fácil de usar en comparación con una consola de texto.

En conjunto, el programa combina pilas, colas, listas, tablas hash, árboles y grafos para representar diferentes aspectos de la gestión de tareas. Esto demuestra cómo distintas estructuras de datos pueden integrarse en un solo proyecto para resolver problemas de organización y eficiencia.

## Conclusión
Este proyecto me permitió aplicar en un caso práctico muchos de los temas que vimos en clase sobre estructuras de datos. Al principio parecía que solo era cuestión de programar pilas y colas, pero al ir avanzando me di cuenta de que se podían integrar varias estructuras dentro de un mismo sistema para resolver diferentes necesidades.

Por ejemplo, las pilas y colas resultan muy intuitivas para manejar las tareas urgentes y regulares porque se entiende fácilmente cómo funciona su orden. En cambio, al trabajar con listas y árboles ya se ve más el lado de la eficiencia, porque ayudan a organizar la información y buscarla más rápido cuando empieza a crecer. También, el uso de tablas hash facilitó mucho el acceso inmediato a datos sin tener que recorrer toda la colección.

Otro punto interesante fue implementar grafos para representar dependencias entre tareas. Ahí es donde se nota que estas estructuras no son solo teoría, sino que tienen aplicaciones muy claras en proyectos reales donde no todas las actividades son independientes.

La parte gráfica con Swing hizo que el sistema se sintiera más completo y mucho más cómodo de usar. En lugar de depender de menús de texto, tener botones y ventanas de selección hace que sea más claro lo que el sistema está haciendo y que sea más fácil probar cada función.

En general, el proyecto no solo me sirvió para reforzar los conceptos teóricos, sino también para darme cuenta de cómo se pueden combinar varias estructuras y algoritmos en un mismo programa. Al final, más allá de cumplir con el objetivo académico, quedó un sistema que refleja cómo la programación puede ayudar a organizar procesos de forma eficiente y práctica.