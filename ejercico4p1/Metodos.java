package ejercico4p1;

import java.util.Scanner;

public class Metodos {
    int suma; 
    public int metodo1(int numeros[][]){
        for(int i=1; i<9; i++){
            for(int j =0; j<3; j++){
                this.suma += numeros[i][j];
            }
        }
        return this.suma;
    }
    
    int sumaColumnas[];
    
    public int[] metodo2(int numeros[][]){
        this.sumaColumnas = new int[10];
        for(int j=0; j<10; j++){
            for(int i=0; i<10; i++){
                this.sumaColumnas[j] +=numeros[i][j];
            }
        }
        return this.sumaColumnas;
    }
    
    
   
    
    String frase = "No se encontro el elemento";
    public String metodo3(int numeros[][],int numero){
    
        for(int i=0; i<10; i++){
            for(int j=0; j<10; j++){
                if(numeros[i][j]==numero){
                    this.frase="Se encontro el numero en la posicion: " 
                            + "(" + i+ ","+ j + ")";
                    return this.frase;
                }
            }
        }    
        return this.frase;
    }
}

    

    