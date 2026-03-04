package com.mycompany.proyectoclienteservidor1;

public abstract class Evento {
    
    protected int codigo;
    protected String nombre;
    protected double precio;

    public Evento(int codigo, String nombre, double precio) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
    }
    
    @Override
    public String toString() {
        return codigo + " - " + nombre + " - ₡" + calcularPrecioFinal();
    }

    public abstract double calcularPrecioFinal();

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
}
