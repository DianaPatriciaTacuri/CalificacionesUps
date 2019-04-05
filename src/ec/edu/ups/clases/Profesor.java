/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.clases;

/**
 * Profesor
 * 
 * clase donde se declara variables que nos permite obteber y leer los atributos
 * declarados,y obtener os atributos de la clase persona
 * 
 * @version 1.0
 * @since 2019
 * @author Diana Peña
 * @see http://ups.edu.ec
 */
public class Profesor extends Persona{
    private String titulo;
    private String cargo;
    private double sueldo;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return "Profesor{" + "titulo=" + titulo + ", cargo=" + cargo + ", sueldo=" + sueldo + '}';
    }
    
    

    
}
