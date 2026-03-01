package com.mycompany.proyectoclienteservidor;

public class ListaUsuario {
   
    private FilaUsuario cabeza;

    public void agregar(Usuario usuario) {
        
        FilaUsuario nuevo = new FilaUsuario(usuario);

        if (cabeza == null) {
            cabeza = nuevo;
            cabeza.siguiente = cabeza;
        } else {
            FilaUsuario fila = cabeza;

            while (fila.siguiente != cabeza) {
                fila = fila.siguiente;
            }

            fila.siguiente = nuevo;
            nuevo.siguiente = cabeza;
        }
    }

    public Usuario buscar(String nickname) {
        if (cabeza == null) {
            return null;
        }

        FilaUsuario fila = cabeza;

        do {
            if (fila.usuario.getNickname().equals(nickname)) {
                return fila.usuario;
            }
            fila = fila.siguiente;
        } while (fila != cabeza);

        return null;
    }

    public boolean login(String nickname, String contrasena) {
        Usuario u = buscar(nickname);

        if (u != null && u.getContrasena().equals(contrasena) && u.getActivo()) {
            return true;
        }

        return false;
    }
    
}
