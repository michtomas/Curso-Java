package ejercicio7p1;

import java.util.Scanner;

public class Ejercicio7P1 {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        //creacion del obj persona
        Persona p = new Persona();
        Persona personas[];
        personas = new Persona[3];
        for(int i=0; i<3; i++){
            System.out.println("Ingrese su nombre: ");
            String nombre = lector.next();
            p.setNombre(nombre);
            System.out.println("Ingrese su DNI: ");
            int dni = lector.nextInt();
            p.setDNI(dni);
            System.out.println("Ingrese su edad: ");
            int edad = lector.nextInt();
            p.setEdad(edad);
            personas[i]=p;
        }
        System.out.println("Personas registradas: ");
        for(int i=0; i<3; i++){
            System.out.println(personas[i].toString());
        }
        //si o si tengo que crear un obj para usar los metodos?
        Metodos metodos = new Metodos();
        
        System.out.println("Personas mayores de 65 años: " 
                + metodos.cantidad(personas) );
        
        System.out.println("Persona con menor DNI: " + metodos.menor(personas));
    }
    
}
