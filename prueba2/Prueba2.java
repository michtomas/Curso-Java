package prueba2;

import java.util.Scanner;

public class Prueba2 {

    
    public static void main(String[] args) {
        System.out.println("Introduzca su nombre de usuario: \n");
        Scanner nombre = new Scanner(System.in);
        
        String usuario = nombre.nextLine();
        
        
        
        String saludar = "Hola";
        System.out.println("Usuario: \n " + usuario);
        System.out.println("Usuario: \t " + usuario);
        System.out.println("Usuario: \b " + usuario);
        System.out.println(saludar);
        
        //solicitar info a la consola
        
        //variable boolean con bloque if
        
        boolean varLogica = false;
        
        if(varLogica == true){
            System.out.println("El valor es verdadero");
        }
        else{
            System.out.println("El valor es falso");
        }
           
        byte edad = 19;  
        boolean esAdulto = edad >= 18;
        System.out.println("Es adulto=" + esAdulto);
    }
    
}
