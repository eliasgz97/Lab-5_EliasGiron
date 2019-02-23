package lab5_eliasgiron;

import java.awt.Color;
import java.util.Date;

public class Usuario {
 //Nombre, Apellido, Nombre de Usuario, Contraseña, Fecha de Nacimiento, Edad (Calculada con la fecha de nacimiento), Color Favorito, 3 Mazos.
   private String nombre;
   private String apellido;
   private String nombreusuario;
   private String contraseña;
   private Date fecha;
   private Color favorito;
   private int mazos;
   private long edad;

    public long getEdad() {
        return edad;
    }

    public void setEdad(long edad) {
        this.edad = edad;
    }
    public Usuario(String nombre, String apellido, String nombreusuario, String contraseña, Date fecha, Color favorito, int mazos, long edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.nombreusuario = nombreusuario;
        this.contraseña = contraseña;
        this.fecha = fecha;
        this.favorito = favorito;
        this.mazos = mazos;
        this.edad = edad;
    }

    public Usuario() {
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombreusuario() {
        return nombreusuario;
    }

    public void setNombreusuario(String nombreusuario) {
        this.nombreusuario = nombreusuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Color getFavorito() {
        return favorito;
    }

    public void setFavorito(Color favorito) {
        this.favorito = favorito;
    }

    public int getMazos() {
        return mazos;
    }

    public void setMazos(int mazos) {
        this.mazos = mazos;
    }

    @Override
    public String toString() {
        return  nombre;
    }
    
}
