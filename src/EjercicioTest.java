import java.util.Scanner;
public class EjercicioTest {
    public static void main (String [] args) {
        String pablo = "0123pablito clavo un clavito en la cabeza de un calvito   ";
        System.out.println(pablo);
        System.out.println(pablo.trim()); // Metodo trim: Elimina espacios en blanco al principio final de la cadena
        System.out.println(pablo.substring(0, 3)); // Inprime cadena de la posicion 0 a la 3-1
        int a = 4, b = 5;
        Scanner sc = new Scanner(System.in);
        System.out.println("-----Inicio prueba-----");
        System.out.println("Esta es la suma de las variables a y b: " + a + b);
        String prueba = sc.nextLine();
        System.out.println(prueba);
        sc.close();


    }
    
}
