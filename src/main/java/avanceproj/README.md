## Introducción
La empresa se llama **TechSolutions MX**, una pequeña compañía dedicada a brindar **servicios de soporte técnico y desarrollo de software a pymes**.

Debido al crecimiento de clientes, la empresa necesita un sistema sencillo que le permita **gestionar tareas internas** como:
- Atender solicitudes urgentes de clientes (fallas críticas en sistemas).
- Programar mantenimientos regulares de equipos.
- Registrar y consultar tareas de cada departamento (soporte, desarrollo y administración).

Para resolver esta necesidad, se diseñó un **programa en Java** que utiliza diferentes **estructuras de datos** (pila, cola y lista) para organizar las tareas según su tipo y urgencia.

- **Tareas urgentes (Pila):** reportes de fallas críticas que deben resolverse de inmediato.
- **Tareas regulares (Cola):** mantenimientos programados y seguimientos rutinarios.
- **Tareas por departamento (Lista):** actividades asignadas a soporte, desarrollo o administración.

Este sistema ayuda a la empresa a **priorizar adecuadamente el trabajo**, mejorar la organización interna y ofrecer un mejor servicio a sus clientes.  

## Explicación del uso de estructuras de datos  

En este programa se implementan tres estructuras de datos principales (**pila, cola y lista**) para simular la gestión de tareas en la empresa **TechSolutions MX**.  

### 1. Pila (Stack)  
- **Uso:** se emplea para manejar las **tareas urgentes**.  
- **Razón:** una pila funciona con el principio **LIFO (Last In, First Out)**, lo que significa que la última tarea registrada es la primera en ser atendida.  
- **Justificación:** esto es ideal para situaciones críticas, donde lo más reciente suele tener mayor prioridad de resolución.  

### 2. Cola (Queue)  
- **Uso:** se utiliza para las **tareas regulares** o rutinarias.  
- **Razón:** una cola trabaja bajo el principio **FIFO (First In, First Out)**, donde la primera tarea en entrar es la primera en salir.  
- **Justificación:** es adecuada para tareas programadas o repetitivas que deben atenderse en el orden en que fueron solicitadas.  

### 3. Lista (ArrayList)  
- **Uso:** se destina a las **tareas por departamento**.  
- **Razón:** una lista permite almacenar y acceder a los elementos de manera flexible, pudiendo **insertar, buscar o eliminar** según un criterio.  
- **Justificación:** es la mejor opción para organizar las tareas de cada área (Soporte, Desarrollo, Administración), ya que se pueden consultar o eliminar en cualquier momento sin importar el orden de inserción.  

## Capturas

### Menu principal
<img width="415" height="413" alt="image" src="https://github.com/user-attachments/assets/d52d4696-05c6-4d3c-8e23-16ea778f32c7" />

### Agregar tareas
<img width="733" height="244" alt="image" src="https://github.com/user-attachments/assets/7c219238-7a58-4979-aa5d-41ab038aaae0" />

### Consultar tareas
<img width="757" height="94" alt="image" src="https://github.com/user-attachments/assets/f415b173-cad2-4d8d-ad3d-9e9e63919b5d" />

### Consultar lista de todas las tareas
<img width="699" height="279" alt="image" src="https://github.com/user-attachments/assets/ecf2eaeb-c7e9-445c-a0f5-de6ae8a6879f" />

### Eliminar tareas
<img width="421" height="244" alt="image" src="https://github.com/user-attachments/assets/47b7460c-b0ae-491f-8cc7-e10b59df6b5b" />
