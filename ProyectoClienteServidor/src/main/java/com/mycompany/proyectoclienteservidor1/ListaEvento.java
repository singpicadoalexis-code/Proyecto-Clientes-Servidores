package com.mycompany.proyectoclienteservidor1;

public class ListaEvento {
    
    private NodoEvento cabeza;

    public void agregar(Evento e) {

        NodoEvento nuevo = new NodoEvento(e);

        if (cabeza == null) {
            cabeza = nuevo;
        } else {
            NodoEvento nod = cabeza;

            while (nod.siguiente != null) {
                nod = nod.siguiente;
            }

            nod.siguiente = nuevo;
            nuevo.anterior = nod;
        }
    }

    public Evento buscar(int codigo) {

        NodoEvento nod = cabeza;

        while (nod != null) {
            if (nod.evento.getCodigo() == codigo)
                return nod.evento;

            nod = nod.siguiente;
        }

        return null;
    }
    
    public String mostrar() {

        String texto = "";
        NodoEvento nod = cabeza;

        while (nod != null) {
            texto += nod.evento.toString() + "\n";
            nod = nod.siguiente;
        }
        
        return texto;
    }
    
}
