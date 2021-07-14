/**
 * Lee un caracter y determina si este es una letra mayuscula o minuscula
 * @author FredyAlexHoyosAriza
 * @version 1.0
 */

import java.util.Scanner;
public class Ejercicio7 {
    public static void main(String[] args) throws Exception {
        System.out.println("Igrese un caracter: ");
        Scanner sc = new Scanner(System.in);
        char ch = sc.nextLine().charAt(0);
        sc.close();
        if (Character.isUpperCase(ch)) {
            System.out.println("El caracter ingresado es una letra mayuscula " );
        } else {
            System.out.println("El caracter ingresado es una letra minuscula ");
        }
        
    }

}