package com.mycompany.proyectoclienteservidor1;

public class NodoEvento {
    
    public Evento evento;
    public NodoEvento siguiente;
    public NodoEvento anterior;

    public NodoEvento(Evento evento) {
        this.evento = evento;
        this.siguiente = null;
        this.anterior = null;
    }
    
}
