package Semana1.script;
public class Profesor {

    String nombre;
    String materia;
    double nota;

    public Profesor(String nombre, String materia, double nota) {
        this.nombre = nombre;
        this.materia = materia;
        this.nota = nota;
    }

    public void crearNota() {
        System.out.println("Nota creada en " + materia + ": " + nota);
    }

    public void editarNota() {
        System.out.println("La nota en la materia " + materia + " ha sido editada.");
    }

    public void borrarNota() {
        System.out.println("La nota en la materia " + materia + " ha sido eliminada.");
    }

    public void administrarNotas() {
        System.out.println("El profesor está administrando las notas" + materia + ".");
    }
}
