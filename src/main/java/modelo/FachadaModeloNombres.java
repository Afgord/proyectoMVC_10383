/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import utilerias.Observador;
import utilerias.SujetoObservado;
import java.util.ArrayList;
import java.util.List;

public class FachadaModeloNombres extends SujetoObservado
        implements IOperacionesModelo, IConsultaModelo {

    private final ControlNombres control;
    

    public FachadaModeloNombres() {
        control = new ControlNombres();
    }

    // Operaciones del modelo

    @Override
    public void procesarNombre(String cadena) {

        control.procesarNombre(cadena);

        notificarObservadores();
    }

    // Consultas al modelo

    @Override
    public Resultado getResultado() {
        return control.getResultado();
    }

    @Override
    public int getCorrectas() {
        return control.getCorrectas();
    }

    @Override
    public int getIncorrectas() {
        return control.getIncorrectas();
    }

    @Override
    //Obtenemos la racha actual desde ControlNombres
    public int getRachaActual() {
        return control.getRachaActual();
    }

    @Override
    //Obtenemos la mejor racha desde ControlNombres
    public int getMejorRacha() {
        return control.getMejorRacha();
    }

    // Administración de observadores

   
}
