# Documento Técnico y de Pruebas

## 1. Descripción Técnica de la Implementación

### 🔹 Estructura base: `LinkedList<T>`

Se desarrolló una lista ligada genérica que soporta variantes **simple, doble y circular**.
Las operaciones principales son:

* **`addFirst(T data)`** → Inserta al inicio.
* **`add(T data)`** → Inserta al final.
* **`removeFirst()`** → Elimina el primer nodo.
* **`removeLast()`** → Elimina el último nodo.
* **`peekFirst()`** → Devuelve el primer elemento.
* **`peekLast()`** → Devuelve el último elemento.

Esta lista se utiliza como base para construir las estructuras **Stack** y **Queue**.

---

### 🔹 Stack (`Stack<T>`)

Implementación basada en **LinkedList**, con operaciones **LIFO (Last In, First Out)**:

* **`push(T data)`** → Inserta un elemento en la cima (usa `addFirst`).
* **`pop()`** → Elimina el elemento de la cima (usa `removeFirst`).
* **`peek()`** → Devuelve el elemento de la cima sin eliminarlo.

Ejemplo de uso en gestión de tareas:

* Guardar comandos del sistema en una pila para permitir **deshacer acciones (undo)**.

---

### 🔹 Queue (`Queue<T>`)

Implementación basada en **LinkedList**, con operaciones **FIFO (First In, First Out)**:

* **`enqueue(T data)`** → Inserta un elemento al final (usa `add`).
* **`dequeue()`** → Elimina el primer elemento (usa `removeFirst`).
* **`peek()`** → Devuelve el primer elemento sin eliminarlo.

Ejemplo de uso en gestión de procesos:

* Simular **planificación de tareas en un sistema operativo**, donde los procesos se atienden en orden de llegada.

---

## 2. Documento de Prueba de Ejecución

### 🔹 Casos de Prueba para **Stack**

```java
Stack<String> stack = new Stack<>();
stack.push("Tarea A");
stack.push("Tarea B");
stack.push("Tarea C");

System.out.println(stack.peek()); // Esperado: "Tarea C"
System.out.println(stack.pop());  // Esperado: "Tarea C"
System.out.println(stack.peek()); // Esperado: "Tarea B"
```

**Resultados esperados:**

```
Peek inicial: Tarea C
Pop ejecutado: Tarea C
Nuevo Peek: Tarea B
```

**Resultados de ejecución real:**

```
--- PRUEBA DE STACK ---
Tope stack: C
Pop: C
Nuevo tope: B
```

---

### 🔹 Casos de Prueba para **Queue**

```java
Queue<Integer> queue = new Queue<>();
queue.enqueue(1);
queue.enqueue(2);
queue.enqueue(3);

System.out.println(queue.peek());   // Esperado: 1
System.out.println(queue.dequeue()); // Esperado: 1
System.out.println(queue.peek());   // Esperado: 2
```

**Resultados esperados:**

```
Peek inicial: 1
Dequeue ejecutado: 1
Nuevo Peek: 2
```

**Resultados de ejecución real:**

```
--- PRUEBA DE QUEUE ---
Frente queue: 1
Dequeue: 1
Nuevo frente: 2
```

---

## 3. Conclusiones

* La **Stack** permite un control tipo **LIFO**, útil en manejo de tareas de retroceso o ejecución de comandos recientes.
* La **Queue** implementa el comportamiento **FIFO**, ideal para la gestión de procesos en orden de llegada.
* Ambas estructuras funcionan correctamente sobre la implementación de la `LinkedList<T>`.

---