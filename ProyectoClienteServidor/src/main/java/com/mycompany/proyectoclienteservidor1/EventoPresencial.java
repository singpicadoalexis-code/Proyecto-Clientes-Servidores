package com.mycompany.proyectoclienteservidor1;

public class EventoPresencial extends Evento {
    
    private String ubicacion;

    public EventoPresencial(int codigo, String nombre, double precio, String ubicacion) {

        super(codigo, nombre, precio);
        this.ubicacion = ubicacion;
    }

    @Override
    public double calcularPrecioFinal() {
        return precio;
    }

    public String getUbicacion() { 
        return ubicacion; 
    }
    
}
