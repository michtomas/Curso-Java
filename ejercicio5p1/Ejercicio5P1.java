package ejercicio5p1;

import java.util.Scanner;

public class Ejercicio5P1 {

    public static void main(String[] args) {
        
        Scanner n = new Scanner(System.in);
        //matriz piso * oficina
        int informacion[][];
        informacion = new int[8][4];
        //leemos los datos
        System.out.println("Ingreso el numero de piso: ");
        int piso= n.nextInt();
        while(piso != 9){
            if(piso<8 && piso>=0){
                System.out.println("Ingrese el numero de oficina: ");
                int oficina=n.nextInt();
                if(oficina<4 && oficina>=0){
                    
                    informacion[piso][oficina] = ++informacion[piso][oficina];
                    System.out.println("Ingrese el numero de piso: ");
                    piso = n.nextInt();
                }
                else{
                    System.out.println("Ingreso un valor de oficina no valido, "
                            + "vuelva a ingresar los datos");
                }
            }
            else{
                System.out.println("Ingrese un numero valido de piso: ");
                piso=n.nextInt();
            }
        }
    for(int i=0; i<8; i++){
        for(int j=0; j<4; j++){
            System.out.println("Cantidad de personas en la oficina " 
                    + j + ", del piso " + i + ": " + informacion[i][j]); 
        }
    }    
    }
    
}
