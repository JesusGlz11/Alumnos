
package Alumnos;

/**
 *
 * @author jesus
 */
public class Alumnos {
     protected String Nombre;
    protected String Apellidos;
    protected String Genero;
    protected int Edad;
    protected long Matricula;
    protected String Grupo;
    protected String Carrera;

    public Alumnos() {
    }

    public Alumnos(String Nombre, String Apellidos, String Genero, int Edad, long Matricula, String Grupo, String Carrera) {
        this.Nombre = Nombre;
        this.Apellidos = Apellidos;
        this.Genero = Genero;
        this.Edad = Edad;
        this.Matricula = Matricula;
        this.Grupo = Grupo;
        this.Carrera = Carrera;
    }


    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }

    public String getGenero() {
        return Genero;
    }

    public void setGenero(String Genero) {
        this.Genero = Genero;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public long getMatricula() {
        return Matricula;
    }

    public void setMatricula(long Matricula) {
        this.Matricula = Matricula;
    }

    public String getGrupo() {
        return Grupo;
    }

    public void setGrupo(String Grupo) {
        this.Grupo = Grupo;
    }

    public String getCarrera() {
        return Carrera;
    }

    public void setCarrera(String Carrera) {
        this.Carrera = Carrera;
    }

    @Override
    public String toString() {
        return "Alumno{\n" + "Nombre: " + Nombre + "\nApellidos: " + Apellidos + "\nGenero: " + Genero + "\nEdad: " + Edad
                + "\nMatricula: " + Matricula + "\nGrupo: " + Grupo + "\nPrograma academico:" + Carrera + '}';
    }

}

