package org.App.InterfazUsuario;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import org.App.CultivoBacterias.*;

public class Interfaz extends JFrame {

    private Experimento experimentoActual;
    private JTextArea poblacionesTextArea;

    public Interfaz() {
            super("Gestión de Experimentos");

            // Componentes de la interfaz
            JPanel panel = new JPanel();
            panel.setLayout(new GridLayout(0, 1));
            JButton abrirArchivoBtn = new JButton("Abrir archivo");
            JButton nuevoExperimentoBtn = new JButton("Nuevo experimento");
            JButton nuevaPoblacionBtn = new JButton("Nueva población de bacterias");
            JButton borrarPoblacionBtn = new JButton("Borrar población de bacterias");
            JButton verDetallesBtn = new JButton("Ver detalles de población");
            JButton guardarBtn = new JButton("Guardar");
            JButton guardarComoBtn = new JButton("Guardar como");

            poblacionesTextArea = new JTextArea(10, 30);
            JScrollPane scrollPane = new JScrollPane(poblacionesTextArea);
            poblacionesTextArea.setEditable(false);

            panel.add(abrirArchivoBtn);
            panel.add(nuevoExperimentoBtn);
            panel.add(nuevaPoblacionBtn);
            panel.add(borrarPoblacionBtn);
            panel.add(verDetallesBtn);
            panel.add(scrollPane);
            panel.add(guardarBtn);
            panel.add(guardarComoBtn);

            add(panel);

            // Acción de los botones
            abrirArchivoBtn.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    // Lógica para abrir un archivo
                }
            });

            nuevoExperimentoBtn.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    // Lógica para crear un nuevo experimento
                }
            });

            nuevaPoblacionBtn.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    // Lógica para crear una nueva población de bacterias y añadirla al experimento actual
                }
            });

            borrarPoblacionBtn.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    // Lógica para borrar una población de bacterias del experimento actual
                }
            });

            verDetallesBtn.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    // Lógica para ver información detallada de una población de bacterias del experimento actual
                }
            });

            guardarBtn.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    // Lógica para guardar el experimento actual
                }
            });

            guardarComoBtn.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    // Lógica para guardar el experimento actual como un nuevo archivo
                }
            });

            // Configuración de la ventana
            setSize(400, 400);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Interfaz();
            }
        });
    }
}





