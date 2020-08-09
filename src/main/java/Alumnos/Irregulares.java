
 
package Alumnos;

import java.util.Scanner;

/**
 *
 * @author jesus
 */

public class Irregulares extends Alumnos {

    Scanner leer = new Scanner(System.in);
    private int Reprobadas;

    public Irregulares() {
    }

    public Irregulares(String Nombre, String Apellidos, String Genero, int Edad, long Matricula, String Grupo, String Carrera, int Reprobadas) {
        super(Nombre, Apellidos, Genero, Edad, Matricula, Grupo, Carrera);
        this.Reprobadas = Reprobadas;
    }

    @Override
    public String getNombre() {
        return Nombre;
    }

    @Override
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    @Override
    public String getApellidos() {
        return Apellidos;
    }

    @Override
    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }

    @Override
    public String getGenero() {
        return Genero;
    }

    @Override
    public void setGenero(String Genero) {
        this.Genero = Genero;
    }

    @Override
    public int getEdad() {
        return Edad;
    }

    @Override
    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    @Override
    public long getMatricula() {
        return Matricula;
    }

    @Override
    public void setMatricula(long Matricula) {
        this.Matricula = Matricula;
    }

    @Override
    public String getGrupo() {
        return Grupo;
    }

    @Override
    public void setGrupo(String Grupo) {
        this.Grupo = Grupo;
    }

    @Override
    public String getCarrera() {
        return Carrera;
    }

    @Override
    public void setCarrera(String Carrera) {
        this.Carrera = Carrera;
    }

    public int getMatReprobadas() {
        return Reprobadas;
    }

    public void setMatReprobadas(int MatReprobadas) {
        this.Reprobadas = MatReprobadas;
    }

    public Irregulares agregarAlumnoIrregular() {

        System.out.println(" nombre del alumno");
        Nombre = leer.nextLine();

        System.out.println("  apellidos del alumno");
        Apellidos = leer.nextLine();

        System.out.println("  genero del alumno");
        Genero = leer.nextLine();

        System.out.println(" edad del alumno");
        Edad = leer.nextInt();

        System.out.println("  matricula del alumno");
        Matricula = leer.nextLong();

        leer.nextLine();
        System.out.println("  grupo del alumno");
        Grupo = leer.nextLine();

        System.out.println("programa academico del alumno");
        Carrera = leer.nextLine();

        System.out.println(" reprobadas del alumno");
        Reprobadas = leer.nextInt();

        return new Irregulares(Nombre, Apellidos, Genero, Edad, Matricula, Grupo, Carrera, Reprobadas);
    }

    @Override
    public String toString() {
        return "Irregulares{" + super.toString() + "\nMaterias reprobadas: " + Reprobadas + '}';
    }

}