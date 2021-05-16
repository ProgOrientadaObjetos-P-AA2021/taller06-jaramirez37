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
public class Enfermero {
    private String nombre;
    private String tipoContrato;
    private double sueldoMensual;

    public Enfermero(String nombre, String tipoContrato, double sueldoMensual) {
        this.nombre = nombre;
        this.tipoContrato = tipoContrato;
        this.sueldoMensual = sueldoMensual;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipoContrato() {
        return tipoContrato;
    }

    public void setTipoContrato(String tipoContrato) {
        this.tipoContrato = tipoContrato;
    }

    public double getSueldoMensual() {
        return sueldoMensual;
    }

    public void setSueldoMensual(double sueldoMensual) {
        this.sueldoMensual = sueldoMensual;
    }
    public String toString() {
        return " / " + nombre + " / Tipo Contrato: " + tipoContrato
                + " / sueldo: " + sueldoMensual + "\n";
    }
}
