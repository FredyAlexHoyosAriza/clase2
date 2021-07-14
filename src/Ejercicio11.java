/**
 * Ingresando el numero de mes (entero entre 1 y 12), se muestra el mes y el numero de dias en este.
 * @author FredyAlexHoyosAriza
 * @version 1.0
 */
import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        int M;
        do {
            System.out.println("A partir de un entero entre 1 y 12, seleccione uno de los meses de un año comun, para el retorno de su cantidad de dias: ");
            M = sc.nextInt();
        } while (M < 1 || M > 12);
        sc.close();

        String month;
        int days;
        switch (M) {
            case 1:
                month = "Enero"; days = 31;
                break;
                
            case 2:
                month = "Febrero"; days = 28;
                break;

            case 3:
                month = "Marzo"; days = 31;
                break;
                
            case 4:
                month = "Abril"; days = 30;
                break;

            case 5:
                month = "Mayo"; days = 31;
                break;
                
            case 6:
                month = "Junio"; days = 30;
                break;

            case 7:
                month = "Julio"; days = 31;
                break;
                
            case 8:
                month = "Agosto"; days = 30;
                break;

            case 9:
                month = "Septiembre"; days = 30;
                break;
                
            case 10:
                month = "Octubre"; days = 31;
                break;

            case 11:
                month = "Noviembre"; days = 30;
                break;
                
            default:
                month = "Diciembre"; days = 31;
                break;
        }

        System.out.println("El mes de " + month + " (" + M + ") tiene " + days + " dias");

    }

}
