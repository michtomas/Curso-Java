package ejercicio3p1;

import java.util.Scanner;

public class Ejercicio3P1 {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in); //reader para leer las alturas
        //vector de alturas:
        //definimos e instanciamos
        int alturas[] = new int[15]; 
        //leemos la matriz con un for
        for(int i=0; i<15; i++){
            System.out.println("Ingrese la altura del jugador en centimetros");
            System.out.println("elemento:" + i);
            alturas[i]=reader.nextInt();
        }
        //Mostramos la matriz
        System.out.println("vector de alturas ingresado");
        for(int i=0; i<15; i++){
            System.out.println(alturas[i]);
        }
        //creamos el obj tipo Metodos
        Metodos obj = new Metodos();
        //llamamos un metodo que calcule le promedio
        System.out.println("Promedio de alturas: " 
                + obj.calcularPromedio(alturas));
        //llamamos un metodo que calcule cuantos superan el proemdio}
        System.out.println("Jugadores por encima del promedio: " 
                + obj.SupPromedio(alturas, obj.calcularPromedio(alturas)));
    }
    
    
}
