/**
 * Se muestra el mayor de los 3 numeros enteros que se ingresen
 * @author FredyAlexHoyosAriza
 * @version 1.0
 */
import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        System.out.println("Igrese tres numeros enteros, para establecer el mayor de estos: ");
        int val1 = sc.nextInt();
        int val2 = sc.nextInt();
        int val3 = sc.nextInt();
        sc.close();

        if (val1 >= val2) {
            if (val2 >= val3 || val1 >= val3) {
                System.out.println("El primer valor ingresado (" + val1 + ") es el mayor");
            } else {
                System.out.println("El tercer valor ingresado (" + val3 + ") es el mayor");
            }
        } else {
            if (val1 >= val3 || val2 >= val3) {
                System.out.println("El segundo valor ingresado (" + val2 + ") es el mayor");
            } else {
                System.out.println("El tercer valor ingresado (" + val3 + ") es el mayor");
            }
        }

    }

}
