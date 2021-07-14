public class ArrayString {
    
    public static void main(String[] args) {
        // Un metodo estatico implica que no es necesario crear instancias de estos para usarlos
        //declaramos una cadena
        String cadena = "Hola Pepe";
        System.out.println("La cadena \"" + cadena + "\", tiene " + cadena.length() + " caracteres.");
        char array[] = {'H','o','l','a',' ','P','e','p','e'};
        String prueba = new String(array);
        System.out.println(prueba);
        //Declaramos un array
        //char pru = 'p'; // Un variable caracter, a diferencia de un objeto String, se define entre comillas simples y no dobles
        //Los objetos, variables, y metodos no deben llevar caracteres extraños con tildes, ñ, Ñ, ... ya que causan problemas.
        //Esto puesto que los nombres de variables solo toman en cuenta el alfabeto ingles el cual no contiene estos caracteres
        //"especiales"

        //char enye = 'ñ'; // Se inprime algo raro: ñ�
        //System.out.println(enye);
        char car1[] = new char[9]; //En java, los arreglos tambien son objetos
        // tambien existe una clase Character en java
        System.out.println(car1.length); // Al parecer length en un atributo (no un metodo) del objeto array car1
        
        //Llenamos el array con la cadena
        //car1 = cadena.toCharArray();
        //Otra forma de copiar cadena en car1
        cadena.getChars(0, 9, car1, 0); // indice de inicio, # de caracteres, arreglo destino, pega en el destino desde esta posicion
        System.out.println(car1.length);
        cadena.valueOf(car1, 5, 4);
        System.out.println("COPIA: " + cadena);
        cadena.copyValueOf(car1, 5, 4);
        System.out.println("COPIA: " + cadena);
        //Recorremos el array a nuestro antojo
        for(int i=0;i<car1.length/2;i++){ //length es un atributo (no un metodo) del objeto array car1
            System.out.println(car1[i]); 
        }
        for(int i=car1.length/2;i<car1.length;i++){
            System.out.print(car1[i]+" "); 
        }
        
        System.out.println(); 
    }
    public void prueba (int p) {

    }
}
