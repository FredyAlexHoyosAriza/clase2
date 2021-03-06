/**
 * Muestra el numero de la suerte correspondeinte a la fecha ingresada
 * @author FredyAlexHoyosAriza
 * @version 1.0
 */
import java.util.Scanner;
public class Ejercicio1 {
    public static void main(String[] args) throws Exception {

        //Ejemplo declaracion de constante
        // Las dependencias que faltan para declarar constantes maiven las completa. Al no ser este un proyecto MAIVEN se marca un error
        // public static final int CONSTANTE = 100;
        System.out.println("Por favor ingrese su dia, mes y año de nacimiento: ");
        Scanner sc = new Scanner(System.in);
        int [] birthday= {sc.nextInt(), sc.nextInt(), sc.nextInt()}; // birthday: {day, month, year}
        // String bd = sc.nextLine(); // birthday
        // String[] dayMonthYear = bd.split("/", 5);
        // int day = Integer.parseInt(dayMonthYear[0]);
        // int month = Integer.parseInt(dayMonthYear[1]);
        // int year = Integer.parseInt(dayMonthYear[2]);
        // String dateSum = Integer.toString(day+month+year);
        // // String dateSum = day+month+year+""; // Otra forma de convertir a String
        // int lN = 0; //luckyNumber
        // for(int i=0; i<dateSum.length(); i++) {
        //     lN += Character.getNumericValue(dateSum.charAt(i));
        // }
        sc.close();
        int ln = luckynumber(birthday);
        System.out.println("Su numero de la suerte es: " + ln);

    }

    public static int luckynumber(int [] birthday) {
        
        // Verificacion muy simple
        if (birthday[0] < 1 || birthday[0] > 31 || birthday[1] < 1 || birthday[1] > 12 || birthday[2] < 0 || birthday[2] > 2021) {
            System.out.println("La fecha ingresada no corresponde a una fecha real");
        }
        int bs = birthday[0] + birthday[1] + birthday[2]; // birthday sum
        // System.out.println(bs);
        // int fd = bs > 2000 ? 2 : 1;
        int md = bs/1000; // milenios
        bs -= 1000*md;
        int cd = bs/100; // centenas
        bs -= 100*cd;
        int dd = bs/10; // decenas
        int ud = bs - 10*dd; // unidades
        return md + cd + dd + ud;
    }
}
