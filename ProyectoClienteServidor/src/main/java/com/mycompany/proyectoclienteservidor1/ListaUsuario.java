package com.mycompany.proyectoclienteservidor1;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ListaUsuario {
    
    private NodoUsuario cabeza;

    public void agregar(Usuario u) {

        NodoUsuario nuevo = new NodoUsuario(u);

        if (cabeza == null) {
            cabeza = nuevo;
            cabeza.siguiente = cabeza;
        } else {
            NodoUsuario nod = cabeza;

            while (nod.siguiente != cabeza) {
                nod = nod.siguiente;
            }

            nod.siguiente = nuevo;
            nuevo.siguiente = cabeza;
        }
    }

    public boolean login(String nickname, String contraseña) {

        if (cabeza == null) return false;

        NodoUsuario actual = cabeza;

        do {
            if (actual.usuario.getNickname().equals(nickname)
                    && actual.usuario.getContraseña().equals(contraseña)
                    && actual.usuario.isActivo()) {
                return true;
            }
            actual = actual.siguiente;
        } while (actual != cabeza);

        return false;
    }

    public void guardarArchivo(Usuario u) {

        try (DataOutputStream dos =
                new DataOutputStream(
                        new FileOutputStream("usuarios.dat"))) {

            dos.writeUTF(u.getNombre());
            dos.writeUTF(u.getApellido1());
            dos.writeUTF(u.getApellido2());
            dos.writeInt(u.getEdad());
            dos.writeUTF(u.getId());
            dos.writeUTF(u.getNickname());
            dos.writeUTF(u.getContraseña());
            dos.writeBoolean(u.isActivo());

        } catch (IOException e) {
            System.out.println("Error guardando usuario");
        }
    }

    public void cargarArchivo() {

        try (DataInputStream dis =
                new DataInputStream(
                        new FileInputStream("usuarios.dat"))) {

            while (true) {

                Usuario u = new Usuario(
                        dis.readUTF(),
                        dis.readUTF(),
                        dis.readUTF(),
                        dis.readInt(),
                        dis.readUTF(),
                        dis.readUTF(),
                        dis.readUTF()
                );

                u.setActivo(dis.readBoolean());
                agregar(u);
            }

        } catch (EOFException e) {
        } catch (IOException e) {
            System.out.println("No hay archivo usuarios.dat aún.");
        }
    }
    
}
