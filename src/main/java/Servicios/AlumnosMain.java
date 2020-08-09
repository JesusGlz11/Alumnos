
package Servicios;

import Archivo.*;
import Alumnos.*;
import java.util.Scanner;
import java.util.ArrayList;
import java.io.*;
import java.util.List;

/**
 *
 * @author jesus
 */
public class AlumnosMain {

    public static void main(String args[]) {
        Scanner leer = new Scanner(System.in);
        List<Alumnos> alumnos = new ArrayList<>();
        Archivo archivo = new Archivo();
        File file = new File("Alumnos");
      
        System.out.println(file.mkdir());
        String archivoRegular = "Alumnos/Regulares.txt";
        String archivoIrregular = "Alumnos/Irregulares.txt";
        String archivoEgresado = "Alumnos/Egresados.txt";

        int op;

        do {
            int op2 = 0, op3 = 0, op4 = 0;
            long matricula;
            System.out.println("    **Menu**\n");
            System.out.println("  Nuevo alumno");
            System.out.println("  Editar alumno");
            System.out.println("  Alumnos Inscritos");
            System.out.println("  Salir");
            op = leer.nextInt();

            switch (op) {

                case 1:
                    while (op2 < 4) {
                        System.out.println(" ^^Nuevo Alumno^^\n");
                        System.out.println("  Regular");
                        System.out.println("  Irregular");
                        System.out.println("  Egresado");
                        System.out.println("  Menu principal");
                        op2 = leer.nextInt();
                        leer.nextLine();
                        
                        switch (op2) {

                            case 1:
                                Regulares regular = new Regulares().agregarAlumnoRegular();
                                archivo.agregarAlumnoregular(regular, archivoRegular);
                                
                                break;

                            case 2:
                                Irregulares irregular = new Irregulares().agregarAlumnoIrregular();
                                archivo.agregarAlumnoIrregular(irregular, archivoIrregular);
                                
                                break;
                                
                            case 3:
                                Egresados egresado = new Egresados().agregarAlumnoEgresado();
                                archivo.agregarAlumnoEgresado(egresado, archivoEgresado);
                                
                                break;

                        }

                    }
                    break;

                case 2:
                    while (op3 < 4) {
                        System.out.println(" **Modificar Alumno**\n");
                        System.out.println("   Regular");
                        System.out.println("   Irregular");
                        System.out.println("   Egresado");
                        System.out.println("   Menu principal");
                        op3 = leer.nextInt();

                        switch (op3) {
                            case 1:

                                break;
                            case 2:

                                break;
                            case 3:

                                break;
                        }
                    }

                    break;

                case 3:
                    while (op4 < 4) {
                        System.out.println("  **Alumnos Inscritos**\n");
                        System.out.println("  Alumnos regulares");
                        System.out.println("  Alumnos irregulares");
                        System.out.println("  Alumnos egresados");
                        System.out.println("  Menu principal");
                        op4 = leer.nextInt();
                        
                        switch (op4) {

                            case 1:
                                archivo.validarArchivo(op4);
                                System.out.println(" Alumnos regulares");
                                archivo.cargarDatosAlumnos(archivoRegular);

                                break;

                            case 2:
                                archivo.validarArchivo(op4);
                                System.out.println(" Alumnos irregulares");
                                archivo.cargarDatosAlumnos(archivoIrregular);
                                break;

                            case 3:
                                archivo.validarArchivo(op4);
                                System.out.println(" Alumnos egresados");
                                archivo.cargarDatosAlumnos(archivoEgresado);
                                break;

                        }
                    }

                    break;
            }
        } while (op < 4);
    }

}