package maestro;

public class Maestro {

    private String nombre;
    private String materia;
    private int añosExperiencia;

    public Maestro(String nombre, String materia, int experiencia) {
        this.nombre = nombre;
        this.materia = materia;
        this.añosExperiencia = experiencia;
    }

    public void enseñar() {
        System.out.println(nombre + " Esta enseñando " + materia);
    }

    public void calificar() {
        System.out.println(nombre + " Esta calificando los examenes. ");
    }

    public void descansar() {
        System.out.println(nombre + " Esta tomando un tiempo libre. ");
    }

    public void mostrarInfo() {
        System.out.println(" Nombre: " + nombre + " Materia: " + materia + " Años que tenga de experiencia: " + añosExperiencia);
    }

    public static void main(String[] args) {
        Maestro maestro1 = new Maestro(" Maria ", " Fisica ", 10);
        Maestro maestro2 = new Maestro(" Adrian ", " Contabilidad ", 8);

        maestro1.mostrarInfo();
        maestro1.enseñar();
        maestro1.descansar();

        maestro2.mostrarInfo();
        maestro2.enseñar();
        maestro2.descansar();
    }

}
