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

    /* Para la asignación vamos a agregar la racha actual y la mejor racha
    * a la hora de trabajar con los nombres y apellidos
    */
    // Número de interpretaciones correctas consecutivas.
    private int rachaActual;

    // Mayor cantidad de interpretaciones correctas consecutivas alcanzada.
    private int mejorRacha;

    public Contador() {
        correctas = 0;
        incorrectas = 0;
        //Agregamos las rachas al constructor
        rachaActual = 0;
        mejorRacha = 0;
    }

    public void incrementarCorrectas() {
        correctas++;

        //Incrementamos la rachaActual
        rachaActual++;

        // Actualizamos la mejor racha si la racha actual la supera.
        if (rachaActual > mejorRacha) {
            mejorRacha = rachaActual;
        }
    }

    public void incrementarIncorrectas() {
        incorrectas++;

        // Reiniciamos la racha actual cuando la interpretación es incorrecta.
        rachaActual = 0;
    }

    public int getCorrectas() {
        return correctas;
    }

    public int getIncorrectas() {
        return incorrectas;
    }

    //Se agregan los getters para rachaActual y mejorRacha
    public int getRachaActual() {
        return rachaActual;
    }

    public int getMejorRacha() {
        return mejorRacha;
    }
}
