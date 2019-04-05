/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.clases;

/**
 *
 * Estudiante
 * 
 * clase donde se declara variables que nos permite obteber y leer los atributos
 * declarados,y obtener los atributos de la clase persona.
 * 
 * @version 1.0
 * @since 2019
 * @author Diana Peña
 * @see http://ups.edu.ec
 */
public class Estudiante extends Persona{
    private Carrera carrera;

    public Carrera getCarrera() {
        return carrera; 
    }

    public void setCarrera(Carrera carrera) {
        this.carrera = carrera;
    }

    @Override
    public String toString() {
        return "Estudiante{" + "carrera=" + carrera + '}';
    }
    
    
}
