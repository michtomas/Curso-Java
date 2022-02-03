package ejercico4p1;

import java.util.Scanner;

public class Ejercico4P1 {

    public static void main(String[] args) {
        int numeros[][];
        numeros = new int[10][10];
        //inicializamos la matriz con numeros aleatorios
        System.out.println("Matriz de numeros aleatorios: ");
        for(int i=0; i<10; i++){
            for(int j=0; j<10; j++){
                numeros[i][j]=(int) (Math.random()*200+0);
                System.out.println(numeros[i][j]);
            }
        }
        //creamos un objeto tipo metodos
        Metodos obj = new Metodos();
        //uso de los metodos
        //llamamos al metodo1
        System.out.println("Suma de los elementos entre las filas 2 y 9 "
                + "y las columnas 0 y 3: " + obj.metodo1(numeros) );
        //llamamos al metodo2
        
        System.out.println("Vector de la suma de columnas: " );
        System.out.println(obj.metodo2(numeros));
        
        
        
        Scanner reader = new Scanner(System.in);
        System.out.println("Ingrese el numero que desea buscar en la matriz: ");
        int r=reader.nextInt();
        System.out.println("El numero ingresado fue: " + r);
        System.out.println(obj.metodo3(numeros, r));
    }
    
}
