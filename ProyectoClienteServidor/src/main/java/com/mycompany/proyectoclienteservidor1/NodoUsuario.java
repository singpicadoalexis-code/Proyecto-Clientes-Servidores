package com.mycompany.proyectoclienteservidor1;

public class NodoUsuario {
    
    public Usuario usuario;
    public NodoUsuario siguiente;

    public NodoUsuario(Usuario usuario) {
        this.usuario = usuario;
        this.siguiente = null;
    }
    
}
