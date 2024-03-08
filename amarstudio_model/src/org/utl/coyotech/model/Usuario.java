package org.utl.coyotech.model;

/**
 *
 * @author Coyotech
 */
public class Usuario {
    
    private int idUsuario;
    private String nombreUsuario;
    private String contrasenia;
    private String token;
    
    
    public Usuario() {
    
    }

    public Usuario(String nombreUsuario, String contrasenia, String token) {
        this.nombreUsuario = nombreUsuario;
        this.contrasenia = contrasenia;
        this.token = token;
    }

    public Usuario(int idUsuario, String nombreUsuario, String contrasenia, String token) {
        this.idUsuario = idUsuario;
        this.nombreUsuario = nombreUsuario;
        this.contrasenia = contrasenia;
        this.token = token;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Usuario{");
        sb.append("idUsuario=").append(idUsuario);
        sb.append(", nombreUsuario=").append(nombreUsuario);
        sb.append(", contrasenia=").append(contrasenia);
        sb.append(", token=").append(token);
        sb.append('}');
        return sb.toString();
    }
    
    
}
