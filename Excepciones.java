package clase7;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Excepciones {

    public static void main(String args[]) {
        System.out.println("HOLA");

        // String   vs   Int
        //  "3"       3
        //String edad = "3";
        //int edad = "hola!!!";


        try {
            int x = 3 / 0;
        } catch (ArithmeticException ex) {
            System.out.println("Ha ocurrido un error arimetico!!");
        } catch (Exception ex) {
            System.out.println("Ha ocurrido un error, contacte a su admin");
        }

        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese su edad");
        int edad = 0;

        try {
            edad = input.nextInt();
        } catch (InputMismatchException ex) {
            System.out.println("Se esperaba un numero entero!!");
            System.out.println("Se ha asigando el numero 18!");
            edad = 18;
        } catch (Exception ex) {
            System.out.println("Ha ocurrido un error, contactacte a su administrador");
        }


        int[] arreglo = new int[3];
        try {
            System.out.println(arreglo[45]);
        } catch (Exception ex) {
            System.out.println("Ha ocurrido una exception!! " + ex.getMessage());
        }


        int num = 0;
        int suma = 0;
        int contador = 0;
        System.out.println("Ingrese numeros hasta ingresar el -1");
        while (num != -1){
            System.out.println("Ingrese un numero");
            num = input.nextInt();
            if (num != -1){
                suma = suma + num;
                contador++;
            }
        }

        try {
            System.out.println("El promedio es :  " + (suma / contador));
        } catch (ArithmeticException ex) {
            System.out.println("El promedio es 0");
        } catch (Exception ex){
            System.out.println("Ha ocurrido un error, contacte a su administrador...");
        }

        System.out.println("FIN");


    }
}
