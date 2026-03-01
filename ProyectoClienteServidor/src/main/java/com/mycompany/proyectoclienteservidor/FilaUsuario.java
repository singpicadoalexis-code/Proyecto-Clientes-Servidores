package com.mycompany.proyectoclienteservidor;

public class FilaUsuario {
    
    public Usuario usuario;
    public FilaUsuario siguiente;

    public FilaUsuario(Usuario usuario) {
        this.usuario = usuario;
        this.siguiente = null;
    }
    
}
