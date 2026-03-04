package com.mycompany.proyectoclienteservidor1;

public class EventoVirtual extends Evento{
    
    private String plataforma;

    public EventoVirtual(int codigo, String nombre,
                         double precio, String plataforma) {

        super(codigo, nombre, precio);
        this.plataforma = plataforma;
    }

    @Override
    public double calcularPrecioFinal() {
        return precio * 0.10; //
    }

    public String getPlataforma() { 
        return plataforma; 
    }
    
}
