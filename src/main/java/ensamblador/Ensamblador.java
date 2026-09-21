/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ensamblador;

import controlador.Controlador;
import modelo.FachadaModeloNombres;
import vista.VistaIntentos;
import vista.VistaNombres;
import vista.VistaRacha;

public class Ensamblador {

    public void ensamblar() {

        // ========================================
        // 1. Crear los objetos
        // ========================================

        FachadaModeloNombres modelo =
                new FachadaModeloNombres();

        Controlador controlador =
                new Controlador();

        VistaNombres vistaNombres =
                new VistaNombres();

        VistaIntentos vistaIntentos =
                new VistaIntentos();

        //Creamos la nueva vista VistaRacha para mostrar las rachas
        VistaRacha vistaRacha =
                new VistaRacha();


        // ========================================
        // 2. Establecer las asociaciones
        // ========================================

        // Controlador -> Modelo
        controlador.setModelo(modelo);

        // VistaNombres -> Controlador
        vistaNombres.setControlador(controlador);

        // Vistas -> Modelo
        vistaNombres.setModelo(modelo);
        vistaIntentos.setModelo(modelo);

        //La nueva vista consulta los datos directamente del modelo
        vistaRacha.setModelo(modelo);

        // Modelo -> Observadores
        modelo.agregarObservador(vistaNombres);
        modelo.agregarObservador(vistaIntentos);
        
        //La registramos para que se actualice cuando cambie el modelo
        modelo.agregarObservador(vistaRacha);


        // ========================================
        // 3. Mostrar las vistas
        // ========================================

        vistaNombres.setVisible(true);
        vistaIntentos.setVisible(true);
        //Mostramos la nueva vista VistaRacha
        vistaRacha.setVisible(true);
    }
}