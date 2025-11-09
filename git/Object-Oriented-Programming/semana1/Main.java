package Semana1.script;

public class Main {

    public static void main(String[] args) {

        
        Administrador admin = new Administrador("Kevin", 01, "admin123");
        System.out.println("ID del administrador: " + admin.getId());
        admin.asignarPermisos();
        admin.crearNota();
        admin.editarNotas();
        admin.eliminarNota();


        
        Profesor profesor = new Profesor("Fabiana", "paradigma orientado", 4.8);
        System.out.println("profesor: " + profesor.nombre);
        System.out.println("Materia: " + profesor.materia);
        profesor.crearNota();
        profesor.editarNota();
        profesor.borrarNota();
        profesor.administrarNotas();


        
        Usuario usuario = new Usuario("Andrey", 2025, "clave123");
        System.out.println("usuario: " + usuario.getNombre());
        usuario.iniciarSesion();
        usuario.cerrarSesion();
    }
}
