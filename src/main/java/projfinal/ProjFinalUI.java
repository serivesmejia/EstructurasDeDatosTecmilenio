package projfinal;

import avanceproj.Department;
import avanceproj.Task;
import avanceproj.TaskSystem;

import javax.swing.*;
import java.awt.*;

public class ProjFinalUI extends JFrame {
    private final TaskSystem sistema;
    private final JTextArea salida;

    public ProjFinalUI() {
        sistema = new TaskSystem();
        salida = new JTextArea(12, 50);
        salida.setEditable(false);
        salida.setFont(new Font("Consolas", Font.PLAIN, 13));
        salida.setBackground(new Color(30, 30, 30));
        salida.setForeground(new Color(200, 200, 200));

        setTitle("Sistema de Gestión de Tareas");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout(10, 10));

        // Panel de título
        JLabel titulo = new JLabel("Sistema de Gestión de Tareas", SwingConstants.CENTER);
        titulo.setFont(new Font("Segoe UI", Font.BOLD, 20));
        titulo.setOpaque(true);
        titulo.setBackground(new Color(70, 130, 180));
        titulo.setForeground(Color.WHITE);
        titulo.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        add(titulo, BorderLayout.NORTH);

        // Panel de botones
        JPanel panelBotones = new JPanel(new GridLayout(0, 2, 10, 10));
        panelBotones.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        panelBotones.setBackground(new Color(245, 245, 245));

        agregarBoton(panelBotones, "Agregar tarea urgente (Pila)", new Color(220, 20, 60), () -> {
            String desc = pedirDescripcion("tarea urgente");
            Department depto = seleccionarDepartamento();
            if (desc != null && depto != null) {
                sistema.agregarTareaPila(new Task(desc, depto));
                mostrar("Tarea urgente agregada.");
            }
        });

        agregarBoton(panelBotones, "Atender tarea urgente (Pop)", new Color(50, 205, 50), () -> {
            Task t = sistema.atenderTareaPila();
            mostrar(t == null ? "No hay tareas urgentes." : "Atendiendo: " + t);
        });

        agregarBoton(panelBotones, "Ver próxima tarea urgente", new Color(255, 140, 0), () -> {
            Task t = sistema.verProximaPila();
            mostrar(t == null ? "No hay tareas urgentes." : "Próxima tarea: " + t);
        });

        agregarBoton(panelBotones, "Agregar tarea regular (Cola)", new Color(65, 105, 225), () -> {
            String desc = pedirDescripcion("tarea regular");
            Department depto = seleccionarDepartamento();
            if (desc != null && depto != null) {
                sistema.agregarTareaCola(new Task(desc, depto));
                mostrar("Tarea regular agregada.");
            }
        });

        agregarBoton(panelBotones, "Atender tarea regular (Dequeue)", new Color(46, 139, 87), () -> {
            Task t = sistema.atenderTareaCola();
            mostrar(t == null ? "No hay tareas regulares." : "Atendiendo: " + t);
        });

        agregarBoton(panelBotones, "Ver próxima tarea regular", new Color(255, 165, 0), () -> {
            Task t = sistema.verProximaCola();
            mostrar(t == null ? "No hay tareas regulares." : "Próxima tarea: " + t);
        });

        agregarBoton(panelBotones, "Agregar tarea por departamento (Lista)", new Color(123, 104, 238), () -> {
            String desc = pedirDescripcion("tarea");
            Department depto = seleccionarDepartamento();
            if (desc != null && depto != null) {
                sistema.agregarTareaLista(new Task(desc, depto));
                mostrar("Tarea agregada a lista.");
            }
        });

        agregarBoton(panelBotones, "Buscar tarea por departamento", new Color(70, 130, 180), () -> {
            Department depto = seleccionarDepartamento();
            if (depto != null) {
                Task[] tareas = sistema.buscarTareaLista(depto);
                if (tareas.length == 0) {
                    mostrar("No hay tareas para " + depto);
                } else {
                    StringBuilder sb = new StringBuilder("Tareas en " + depto + ":\n");
                    for (Task t : tareas) {
                        sb.append("- ").append(t).append("\n");
                    }
                    mostrar(sb.toString());
                }
            }
        });

        agregarBoton(panelBotones, "Eliminar tarea por departamento", new Color(178, 34, 34), () -> {
            Department depto = seleccionarDepartamento();
            if (depto != null) {
                sistema.eliminarTareaLista(depto);
                mostrar("Tareas eliminadas del depto " + depto);
            }
        });

        agregarBoton(panelBotones, "Ver todas las tareas pendientes", new Color(105, 105, 105), () -> {
            mostrar("\nMostrando todas las tareas pendientes:");

            mostrar("\n--- Tareas Urgentes (Pila) ---");
            for (Task t : sistema.pilaUrgentes) mostrar(t.toString());

            mostrar("\n--- Tareas Regulares (Cola) ---");
            for (Task t : sistema.colaRegulares) mostrar(t.toString());

            mostrar("\n--- Tareas por Departamento (Lista) ---");
            for (Task t : sistema.listaDepartamentos) mostrar(t.toString());
        });

        add(panelBotones, BorderLayout.CENTER);

        // Panel de salida
        JScrollPane scroll = new JScrollPane(salida);
        scroll.setBorder(BorderFactory.createTitledBorder("Registro de acciones"));
        add(scroll, BorderLayout.SOUTH);

        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void agregarBoton(JPanel panel, String texto, Color color, Runnable accion) {
        JButton boton = new JButton(texto);
        boton.setFocusPainted(false);
        boton.setBackground(color);
        boton.setForeground(Color.WHITE);
        boton.setFont(new Font("Segoe UI", Font.BOLD, 13));
        boton.addActionListener(e -> accion.run());
        panel.add(boton);
    }

    private void mostrar(String msg) {
        salida.append(msg + "\n");
    }

    private String pedirDescripcion(String tipo) {
        return JOptionPane.showInputDialog(this, "Descripción de la " + tipo + ":");
    }

    private Department seleccionarDepartamento() {
        Department[] values = Department.values();
        return (Department) JOptionPane.showInputDialog(
                this,
                "Selecciona un departamento:",
                "Departamento",
                JOptionPane.QUESTION_MESSAGE,
                null,
                values,
                values[0]);
    }

    public static void main(String[] args) {
        System.setProperty("sun.java2d.d3d", "false");

        try {
            // Look & Feel moderno (Nimbus)
            UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
        } catch (Exception ignored) {}
        SwingUtilities.invokeLater(ProjFinalUI::new);
    }
}
