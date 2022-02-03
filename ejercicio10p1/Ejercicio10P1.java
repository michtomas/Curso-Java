package ejercicio10p1;

import java.util.Scanner;

public class Ejercicio10P1 {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        String palabras[];
        palabras = new String[10];
        for(int i=0; i<10; i++){
            System.out.println("Ingrese la palabra numero " + (i+1));
            palabras[i] = lector.next();
        }
        int i =0;
        while(i!=10){
            System.out.println(palabras[i].charAt(0));
            i++;
        }
    }
    
}
