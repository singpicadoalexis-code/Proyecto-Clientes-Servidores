package com.mycompany.proyectoclienteservidor;

public class Usuario extends Persona{
    
    private String nickname;
    private String contrasena;
    private boolean activo;

    public Usuario(String nombreCompleto, String nickname, String contrasena) {
        
        super(nombreCompleto);
        this.nickname = nickname;
        this.contrasena = contrasena;
        this.activo = true;
    }

    public String getNickname() {
        return nickname;
    }

    public String getContrasena() {
        return contrasena;
    }

    public boolean getActivo() {
        return activo;
    }

    public void inactivar() {
        this.activo = false;
    }

    @Override
    public String mostrarInformacion() {
        return nombreCompleto + " - " + nickname + " - " + (activo ? "Activo" : "Inactivo");
    }
    
}
