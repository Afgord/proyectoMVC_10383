/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package modelo;

/**
 *
 * @author amacias
 */
public interface IConsultaModelo {

    Resultado getResultado();

    int getCorrectas();

    int getIncorrectas();

    // Permite consultar la racha actual de interpretaciones correctas.
    int getRachaActual();

    // Permite consultar la mejor racha alcanzada.
    int getMejorRacha();

}