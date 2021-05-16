/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author josep
 */
public class Medico {
    
    private String nombreDoctor;
    private String especialidad;
    private double sueldoMensual;

    public Medico(String nombreDoctor, String especialidad, double sueldoMensual) {
        this.nombreDoctor = nombreDoctor;
        this.especialidad = especialidad;
        this.sueldoMensual = sueldoMensual;
    }

    public String getNombreDoctor() {
        return nombreDoctor;
    }

    public void setNombreDoctor(String nombreDoctor) {
        this.nombreDoctor = nombreDoctor;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public double getSueldoMensual() {
        return sueldoMensual;
    }

    public void setSueldoMensual(double sueldoMensual) {
        this.sueldoMensual = sueldoMensual;
    }
    
    public String toString() {
        return " / " + nombreDoctor + " / especialidad: " + especialidad
                + " / sueldo: " + sueldoMensual + "\n";
    }
}
