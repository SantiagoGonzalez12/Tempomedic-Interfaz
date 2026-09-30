/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tempomedic.modelo;

/**
 *
 * @author Santiago González
 */
public class Medicamento {
    private String nombre;
    private String dosis;
    private String frecuencia;
    private String primeraToma;
    private String estado; // "Pendiente" o "Tomada"

    public Medicamento(String nombre, String dosis, String frecuencia, String primeraToma, String estado) {
        this.nombre = nombre;
        this.dosis = dosis;
        this.frecuencia = frecuencia;
        this.primeraToma = primeraToma;
        this.estado = estado;
    }

    public String getNombre() { 
        return nombre; 
    }
    public void setNombre(String nombre) { 
        this.nombre = nombre; 
    }
    public String getDosis() { 
        return dosis; 
    }
    public void setDosis(String dosis) { 
        this.dosis = dosis; 
    }
    public String getFrecuencia() { 
        return frecuencia; 
    }
    public void setFrecuencia(String frecuencia) { 
        this.frecuencia = frecuencia; 
    }
    public String getPrimeraToma() { 
        return primeraToma; 
    }
    public void setPrimeraToma(String primeraToma) { 
        this.primeraToma = primeraToma; 
    }
    public String getEstado() { 
        return estado; 
    }
    public void setEstado(String estado) { 
        this.estado = estado; 
    }
}
