public class convToString {
    public static void main(String[] args) {
        
        //Declaración de variables
        double d = 858.48;
        int i = 20;
        byte b =19;        
        String cad1,cad2,cad3;        
        
        //Convertimos a String cada variable usando toString
        cad1 = Double.toString (d);
        cad2 = Integer.toString (i);
        cad3 = Byte.toString(b);
        
        
        //Sumamos 1 detrás de cad1 
        System.out.println ("Aquí se realiza una concatenación de ("+cad1+" + 1) con resultado: ("+ (cad1 + 1)+") ");
        
                
        //Sumamos 1 delante de cad1 
        System.out.println ("Aquí se realiza una concatenación de (1 + "+cad1+") con resultado: ("+ (1 + cad1)+") ");
        
        //Sumamos 1 a la variable double "d"
        System.out.println ("Aquí se realiza una suma de 1 + "+d+" con resultado: "+ (1 + d));
          
        //Concatenamos cad2 y cad3
        System.out.println ("Aquí se realiza una concatenación de cad2 + cad3 con resultado: "+ (cad2 + cad3 + "  "));

        
        String nombre, apellido, domicilio, callePaseo;
 
        //inicializamos los String
        nombre="Pepe";
        apellido="Gotera";
        callePaseo="la calle";
        domicilio="Villabotijos de Abajo";
        
        // El metodo concat de la clase String, no es un metodo estatico, para usarlo se debe hacer desde un objeto String
        System.out.println("Me llamo ".concat(nombre) + " ".concat(apellido).concat(" y vivo en ").concat(callePaseo) + " ".concat(domicilio));
        
        System.out.println ("15 y 35 concatenados: " + 15 + 35);
        System.out.println ("15 y 35 sumados: " + (15+35));
        int j = 15;
        
        System.out.println ("15 y 20 concatenados: " + j + i);
        System.out.println ("15 y 20 sumados: " + (j+i));
    }
}
