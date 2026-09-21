/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author amacias
 */
public class Contador {

    private int correctas;
    private int incorrectas;

    /* Para esta asignación agregamos la racha actual y la mejor racha
     * para llevar el seguimiento de los aciertos consecutivos
     */
    //La racha que llevamos actualmente
    private int rachaActual;

    //La mejor racha que se ha conseguido
    private int mejorRacha;

    public Contador() {
        correctas = 0;
        incorrectas = 0;

        //Inicializamos las dos rachas en cero
        rachaActual = 0;
        mejorRacha = 0;
    }

    public void incrementarCorrectas() {
        correctas++;

        //Si fue correcto, también aumentamos la racha
        rachaActual++;

        //Si la racha actual supera a la mejor, guardamos el nuevo récord
        if (rachaActual > mejorRacha) {
            mejorRacha = rachaActual;
        }
    }

    public void incrementarIncorrectas() {
        incorrectas++;

        //Si falla la interpretación, se pierde la racha actual
        rachaActual = 0;
    }

    public int getCorrectas() {
        return correctas;
    }

    public int getIncorrectas() {
        return incorrectas;
    }

    //Agregamos los getters para poder consultar las rachas
    public int getRachaActual() {
        return rachaActual;
    }

    public int getMejorRacha() {
        return mejorRacha;
    }
}
