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
public class Ciudad {
    
    private String nombreCiudad;
    private String provinciaCiudad;

    public Ciudad(String nombreCiudad, String provinciaCiudad) {
        
        this.nombreCiudad = nombreCiudad;
        this.provinciaCiudad = provinciaCiudad;
    }
    
    public String getNombreCiudad() {
        return nombreCiudad;
    }

    public void setNombreCiudad(String nombreCiudad) {
        this.nombreCiudad = nombreCiudad;
    }

    public String getProvinciaCiudad() {
        return provinciaCiudad;
    }

    public void setProvinciaCiudad(String provinciaCiudad) {
        this.provinciaCiudad = provinciaCiudad;
    }
}
