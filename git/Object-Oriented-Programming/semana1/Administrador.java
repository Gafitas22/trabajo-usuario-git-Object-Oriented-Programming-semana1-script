package Semana1.script;

public class Administrador extends Usuario {

    private String horarioTrabajo;

    public Administrador(String nombre, int id, String password) {
        super(nombre, id, password);
    }

    public void setHorarioTrabajo(String horarioTrabajo) {
        this.horarioTrabajo = horarioTrabajo;
    }

    public String getHorarioTrabajo() {
        return horarioTrabajo;
    }

    public void asignarPermisos() {
        System.out.println("Asignar permisos de administrador...");
    }

    public void editarNotas() {
        System.out.println("Editando notas...");
    }

    public void eliminarNota() {
        System.out.println("Eliminando nota...");
    }

    public void crearNota() {
        System.out.println("Creando nota...");
    }}
