/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tempomedic.modelo;

/**
 *
 * @author Santiago González
 */
public class Cita {
    private String especialidad;
    private String fecha;
    private String hora;
    private String centro;

    public Cita(String especialidad, String fecha, String hora, String centro) {
        this.especialidad = especialidad;
        this.fecha = fecha;
        this.hora = hora;
        this.centro = centro;
    }

    public String getEspecialidad() { 
        return especialidad; 
    }
    public void setEspecialidad(String especialidad) { 
        this.especialidad = especialidad; 
    }
    public String getFecha() { 
        return fecha; 
    }
    public void setFecha(String fecha) { 
        this.fecha = fecha; 
    }
    public String getHora() { 
        return hora; 
    }
    public void setHora(String hora) { 
        this.hora = hora; 
    }
    public String getCentro() { 
        return centro; 
    }
    public void setCentro(String centro) { 
        this.centro = centro; 
    }
}