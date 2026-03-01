package com.mycompany.proyectoclienteservidor;

public abstract class Persona {
    
    protected String nombreCompleto;

    public Persona(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public abstract String mostrarInformacion();
    
}
