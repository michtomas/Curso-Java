package practica1;

import java.util.Scanner;

public class Practica1 {


    public static void main(String[] args) {
        System.out.println("Este programa calcula el factorial de un entero "
                + "mayor a cero");
        Scanner dato = new Scanner(System.in);
        System.out.println("Ingrese el entero que desea calcular:");
        int n = dato.nextInt();
        while(n<=0){
            System.out.println("Ingrese un valor valido para n");
            n = dato.nextInt();
        }
        int f = n;
        while(n!=1)
            f=f*(--n);
        
        System.out.println("El valor del factorial es = " + f);
    //prgorama 2, factorial del 1 al 9
        int x=1;
        int y=1; //resultado
        while(x<=9){
            System.out.println("El factorial de " + x + " es: " + y);
            y=y*(++x);
        } 
    //solo para imapares
        int x1=1;
        int y1=1; //resultado
        while(x1<=9){
            if(x1 % 2 ==1){
                System.out.println("El factorial de " + x1 + " es: " + y1);
            }
            y1=y1*(++x1);
        }
        
        //ciclo for(contador;condicion;incremento)
        for(int i=0;i<=3;i++){
            System.out.println("i = " + i);
            
                
         }
    
            
               
    }
    
}
