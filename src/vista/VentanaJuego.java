package vista;

import javax.swing.JFrame;

public class VentanaJuego extends JFrame {

    public VentanaJuego() {

        setTitle("Juego de Memoria");

        setSize(600, 600);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setLocationRelativeTo(null);

        setVisible(true);
    }
}