package clase7;

import clase6.Alumno;
import clase6.Profesor;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class ColegioSecundario {

    public static List<Alumno> LISTA_ALUMNOS = new ArrayList<>();

    public static Scanner INPUT = new Scanner(System.in);

    public static void main(String args[]){

        System.out.println("Ingrese la cantidad de alumnos a registrar");
        int cantidad = INPUT.nextInt();

        cargarAlumnosPorDefecto();

        for (int i = 0; i < cantidad; i++){
            Alumno alumno = crearAlumno();
            agregarAlumnoAlSistema(alumno);
        }

        imprimirListaAlumnos();

        System.out.println("Desea ver todos los alumnos? (SI/NO)");
        String opc = INPUT.next();
            // SI  sI  Si  si  ==> toLowerCase ==> si
            // SI  sI  Si  si  ==> toUpperCase ==> SI

        if (opc.toLowerCase().equals("si")){
            imprimirListaAlumnos();
        } else {
            System.out.println("Desea buscar un alumno? (SI/NO) ");
            String buscarAlumno = INPUT.next();

            if (buscarAlumno.toLowerCase().equals("si")){
                System.out.println("Buscar alumno por DNI:");
                System.out.println("Ingrese el DNI a buscar:");
                int dniABuscar = INPUT.nextInt();

                boolean encontroAlumno = false;

                for (Alumno alumno : LISTA_ALUMNOS){
                    if (alumno.getCedula() == dniABuscar){
                        encontroAlumno = true;
                    }
                }

                if (encontroAlumno == true){
                    System.out.println("El alumno está en el Sistema!!");
                } else {
                    System.out.println("El alumno " + dniABuscar + " no esta registrado");
                    imprimirListaAlumnos();
                }
            }
        }

        /*List<Profesor> listaProfes = new ArrayList<>();

        Profesor profe1 = new Profesor("Jose Martinez", 9000, 22500);
        Profesor profe2 = new Profesor("Josefina Perez", 899, 33000);

        listaProfes.add(profe1);
        listaProfes.add(profe2);

        System.out.println("**** LISTA PROFESORES ****");
        for (Profesor profe : listaProfes){
         //   System.out.println(profe);
        }*/
    }


    public static void cargarAlumnosPorDefecto(){
        Alumno a1 = new Alumno("Juan Lopez", 2222, "segundo");
        Alumno a2 = new Alumno("Ana Rodriguez", 111, "cuarto");
        Alumno a3 = new Alumno("Ana Marquez", 443, "cuarto");
        LISTA_ALUMNOS.add(a1);
        LISTA_ALUMNOS.add(a2);
        LISTA_ALUMNOS.add(a3);
    }

    public static Alumno crearAlumno(){
        Alumno alumno = new Alumno();

        System.out.println("Ingrese el nombre del alumno ");
        String nombre = INPUT.next();
        alumno.setNombre(nombre);

        System.out.println("Ingrese el DNI del alumno");
        int dni = INPUT.nextInt();
        alumno.setCedula(dni);

        System.out.println("Ingrese el grado del alumno");
        String grado = INPUT.next();
        alumno.setGrado(grado);
        return alumno;
    }


    public static void agregarAlumnoAlSistema(Alumno a){
        LISTA_ALUMNOS.add(a);
        System.out.println("Se ha ingresado al alumno " + a.getNombre());
    }

    public static void imprimirListaAlumnos(){
        System.out.println("******* LISTA DE ALUMNOS *******");
        for (Alumno alu : LISTA_ALUMNOS){
            System.out.println(alu);
        }
        System.out.println("***********************");
        System.out.println("");
    }

}
