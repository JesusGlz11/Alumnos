
package Archivo;

import Alumnos.*;
import java.io.*;
import java.io.File;

/**
 *
 * @author jesus
 */
public class Archivo {
    
      public void validarArchivo(int valor) {
        switch (valor) {
            case 1:
                File file = new File("Alumnos/Regulares.txt");
                System.out.println("Validando existencia de datos...");
                if (file.exists() == true) {
                    System.out.println("Datos validados exitosamente\n");
                } else {
                    System.out.println("Los datos no existen\n");
                }
                break;

            case 2:
                File file2 = new File("Alumnos/Irregulares.txt");
                System.out.println("Validando existencia de datos...");
                if (file2.exists() == true) {
                    System.out.println("Datos validados exitosamente\n");
                } else {
                    System.out.println("Los datos no existen\n");
                }
                break;

            case 3:
                File file3 = new File("Alumnos/Egresados.txt");
                System.out.println("Validando existencia de datos...");
                if (file3.exists() == true) {
                    System.out.println("Datos validados exitosamente\n");
                } else {
                    System.out.println("Los datos no existen\n");
                }
                break;
        }

    }

    public void agregarAlumnoregular(Regulares regulares, String archivo) {
        try {
            try (FileWriter fileWriter = new FileWriter(archivo, true)) {
                fileWriter.write("\n\nNombre : " + regulares.getNombre() + "\nApellidos: " + regulares.getApellidos() + "\nGenero: " + regulares.getGenero()
                        + "\nEdad: " + regulares.getEdad() + "\nMatricula: " + regulares.getMatricula() + "\nGrupo: " + regulares.getGrupo() + "\nCarrera: " + regulares.getCarrera());
            }
            System.out.println("Datos almacenados exitosamente\n");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public void agregarAlumnoIrregular(Irregulares irregulares, String archivo) {
        try {
            try (FileWriter fileWriter = new FileWriter(archivo, true)) {
                fileWriter.write("\n\nNombre : " + irregulares.getNombre() + "\nApellidos: " + irregulares.getApellidos() + "\nGenero: " + irregulares.getGenero()
                        + "\nEdad: " + irregulares.getEdad() + "\nMatricula: " + irregulares.getMatricula() + "\nGrupo: " + irregulares.getGrupo() + "\nCarrera: " + irregulares.getCarrera() + "\nMaterias reprobadas: " + irregulares.getMatReprobadas());
            }
            System.out.println("Datos almacenados exitosamente\n");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public void agregarAlumnoEgresado(Egresados egresados, String archivo) {
        try {
            try (FileWriter fileWriter = new FileWriter(archivo, true)) {
                fileWriter.write("\n\nNombre : " + egresados.getNombre() + "\nApellidos: " + egresados.getApellidos() + "\nGenero: " + egresados.getGenero()
                        + "\nEdad: " + egresados.getEdad() + "\nMatricula: " + egresados.getMatricula() + "\nGrupo: " + egresados.getGrupo() + "\nCarrera: " + egresados.getCarrera());
            }
            System.out.println("Datos almacenados exitosamente\n");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public void cargarDatosAlumnos(String archivo) {
        try {
            FileReader fileReader = new FileReader(archivo);
            try (BufferedReader bufferedReader = new BufferedReader(fileReader)) {
                String linea = bufferedReader.readLine();
                while (linea != null) {
                    System.out.println(linea);
                    linea = bufferedReader.readLine();
                }
            }

            System.out.println("Datos cargados exitosamente\n");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}

