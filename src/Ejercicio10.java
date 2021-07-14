/**
 * Verifica si el tiempo militar ingresado corresponde a una hora valida
 * @author FredyAlexHoyosAriza
 * @version 1.0
 */
import java.util.Scanner;

public class Ejercicio10 {

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        System.out.println("Por favor ingrese tres enteros, que correspondan a un tiempo militar valido, en horas, minutos y segundos, en eso orden de ingreso: ");
        int H = sc.nextInt();
        int M = sc.nextInt();
        int S = sc.nextInt();
        sc.close();
        if (H < 0 || H > 23  || M < 0 || M > 59 || S < 0 || S > 59) {
            System.out.println("La hora militar ingresada en invalida");
        } else {
            System.out.println("La hora militar ingresada es valida");
        }

    }

}
