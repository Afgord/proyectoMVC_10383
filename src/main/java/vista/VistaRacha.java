package vista;

import modelo.IConsultaModelo;
import utilerias.Observador;

import javax.swing.*;
import java.awt.*;

public class VistaRacha extends JFrame implements Observador {

    private IConsultaModelo modelo;

    private JLabel lblRachaActual;
    private JLabel lblMejorRacha;

    //Agregamos una barra de progreso para que la racha sea más visual
    private JProgressBar barraRacha;

    public VistaRacha() {

        setTitle("Racha de aciertos");
        setSize(350, 180);

        // Al cerrar esta ventana NO termina la aplicación
        setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        setLocationRelativeTo(null);

        crearComponentes();
    }

    private void crearComponentes() {

        JPanel panel = new JPanel(
                new GridLayout(3, 2, 10, 10)
        );

        panel.setBorder(
                BorderFactory.createTitledBorder(
                        "Racha de interpretaciones correctas"
                )
        );

        lblRachaActual = new JLabel("0");
        lblMejorRacha = new JLabel("0");

        // Creamos el componente barra de progreso para la racha
        barraRacha = new JProgressBar();
        barraRacha.setMinimum(0);
        barraRacha.setMaximum(1);
        barraRacha.setValue(0);
        barraRacha.setStringPainted(true);
        barraRacha.setString("0 / 0");

        panel.add(new JLabel("Racha actual:"));
        panel.add(lblRachaActual);

        panel.add(new JLabel("Mejor racha:"));
        panel.add(lblMejorRacha);

        // Agregamos la barra al panel
        panel.add(new JLabel("Progreso de racha:"));
        panel.add(barraRacha);

        add(panel);
    }

    // -------------------------
    // Asociación con el modelo
    // -------------------------

    public void setModelo(IConsultaModelo modelo) {
        this.modelo = modelo;
    }

    // -------------------------
    // Observer
    // -------------------------

    @Override
    public void actualizar() {

        int rachaActual = modelo.getRachaActual();
        int mejorRacha = modelo.getMejorRacha();

        lblRachaActual.setText(
                String.valueOf(rachaActual)
        );

        lblMejorRacha.setText(
                String.valueOf(mejorRacha)
        );

        /*
         * La barra solo representa visualmente los datos
         * que ya vienen del modelo.
         */
        barraRacha.setMaximum(
                Math.max(mejorRacha, 1)
        );

        barraRacha.setValue(
                rachaActual
        );

        barraRacha.setString(
                rachaActual + " / " + mejorRacha
        );
    }
}