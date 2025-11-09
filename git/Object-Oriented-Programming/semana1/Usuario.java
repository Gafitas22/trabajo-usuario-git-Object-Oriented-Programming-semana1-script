package Semana1.script;

public class Usuario {

    private String nombre;
    private int id;
    private String password;

    public Usuario(String nombre, int id, String password) {
        this.nombre = nombre;
        this.id = id;
        this.password = password;
    }

    public String getNombre() {
        return nombre;
    }

    public int getId() {
        return id;
    }

    public String getPassword() {
        return password;
    }

    public void iniciarSesion() {
        System.out.println("El usuario " + nombre + " ha iniciado sesión.");
    }

    public void cerrarSesion() {
        System.out.println("El usuario " + nombre + " ha cerrado sesión.");
    }
}