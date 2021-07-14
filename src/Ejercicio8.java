/**
 * Lee un caracter y determina si este es una letra mayuscula o minuscula
 * @author FredyAlexHoyosAriza
 * @version 1.0
 */

//import java.text.DecimalFormat;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;
public class Ejercicio8 {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        System.out.println("Igrese un dividendo: ");
        double num = sc.nextDouble();
        double den = 0;

        do {
            System.out.println("Igrese un divisor diferente de 0: ");
            den = sc.nextDouble();
        } while (den == 0);
        sc.close();

        //Utilizando la clase DecimalFormat (Aqui el parecer se debe instalar la libreria -> no funciona)
        //DecimalFormat df = new DecimalFormat("#.0000"); // Se define el nuemro de decimales en el objeto
        //System.out.println("El resultado de la division es: " + df.format(num/den));
        
        // Utilizando String format
        // System.out.println("El resultado de la division es: " + String.format("%.4f", num/den)); // Solo se muestran los primeros 4 decimales

        // Utilizando el metodo round de la clase Math
        //System.out.println("El resultado de la division es: " + (double) Math.round(num/den * 100) / 100);
        
        //Ahora combinemos los dos metodos anteriores
        System.out.println("El resultado de la division es: " + String.format("%.4f", (double) Math.round(num/den * 1000000000000000d) / 1000000000000000d)); // Este es un redondeo bueno

        //Utilizando la clase big decimal
        BigDecimal bd = new BigDecimal(num/den);
        bd = bd.setScale(4, RoundingMode.HALF_EVEN);
        System.out.println("El resultado de la division es: " + bd.doubleValue());
        //Se usa la clase big decimal y tambien el motodo format de la clase String
        System.out.println("El resultado de la division es: " + String.format("%.4f", bd.doubleValue()));
        System.out.printf("El resultado de la division es: %.4f \n" , num/den); // Al parecer \n = %n (salto de linea)

        String cad1 = "  El amor en los tiempos del colera  ";
        String cad2 = "el amor en los tiempos del colera      ";
        System.out.println(cad1.trim().compareTo(cad2.trim())); // retorna -32, ya que: "E" < "e"
        System.out.println(cad1.trim().toLowerCase().compareTo(cad2.trim().toLowerCase()));
        // compareTo retorna un entero si las cadenas son iguales el entero es 0
        System.out.println(cad1.trim().compareToIgnoreCase(cad2.trim())); // Esta sentencia es equivalente a la anterior
        // compareToIgnoreCae compatra sin distinguir entre mayusculas y minusculas

        if (cad1.trim().equalsIgnoreCase(cad2.trim())) {
            System.out.print("Las cadenas dicen lo mismo ");
            if (cad1 == cad2) { // == es una sobrecarga del metodo: cad1.equals(cad2)
                System.out.println("y son iguales");
            } else {
                System.out.println("pero no son iguales");
            }
        } else {
            System.out.println("Las cadenas no son iguales");
        }


    }
}
