package vista;

import modelo.IConsultaModelo;
import utilerias.Observador;

import javax.swing.*;
import java.awt.*;

public class VistaRacha extends JFrame implements Observador {

    private IConsultaModelo modelo;

    private JLabel lblRachaActual;
    private JLabel lblMejorRacha;

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
                new GridLayout(2, 2, 10, 10)
        );

        panel.setBorder(
                BorderFactory.createTitledBorder(
                        "Racha de interpretaciones correctas"
                )
        );

        lblRachaActual = new JLabel("0");
        lblMejorRacha = new JLabel("0");

        panel.add(new JLabel("Racha actual:"));
        panel.add(lblRachaActual);

        panel.add(new JLabel("Mejor racha:"));
        panel.add(lblMejorRacha);

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

        lblRachaActual.setText(
                String.valueOf(modelo.getRachaActual())
        );

        lblMejorRacha.setText(
                String.valueOf(modelo.getMejorRacha())
        );
    }
}