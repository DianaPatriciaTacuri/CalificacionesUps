/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.clases;

/**
 * HistorialCalificaciones
 * 
 * clase donde se declara variables que nos permite obteber y leer los atributos
 * declarados
 * 
 * @version 1.0
 * @since 2019
 * @author Diana Peña
 * @see http://ups.edu.ec
 */
public class HistorialCalificaciones {
    private Materia materia;
    private Estudiante estudiante;
    private int aprovechamiento;
    private int examen1;
    private int aprovechamiento1;
    private int examen2;

    public Materia getMateria() {
        return materia;
    }

    public void setMateria(Materia materia) {
        this.materia = materia;
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }

    public int getAprovechamiento() {
        return aprovechamiento;
    }

    public void setAprovechamiento(int aprovechamiento) {
        this.aprovechamiento = aprovechamiento;
    }

    public int getExamen1() {
        return examen1;
    }

    public void setExamen1(int examen1) {
        this.examen1 = examen1;
    }

    public int getAprovechamiento1() {
        return aprovechamiento1;
    }

    public void setAprovechamiento1(int aprovechamiento1) {
        this.aprovechamiento1 = aprovechamiento1;
    }

    public int getExamen2() {
        return examen2;
    }

    public void setExamen2(int examen2) {
        this.examen2 = examen2;
    }

    @Override
    public String toString() {
        return "HistorialCalificaciones{" + "materia=" + materia + ", estudiante=" + estudiante + ", aprovechamiento=" + aprovechamiento + ", examen1=" + examen1 + ", aprovechamiento1=" + aprovechamiento1 + ", examen2=" + examen2 + '}';
    }
    

    
}
