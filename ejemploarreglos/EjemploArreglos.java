package ejemploarreglos;

public class EjemploArreglos {

    public static void main(String[] args) {
      //variable arreglo
      int edades[] ;
      //instanciamos el arreglo de tipo int
      edades = new int[3];
      //inicializar valores del arreglo
      edades[0]=30;
      edades[1]=15;
      edades[2]=20;
      //imprimir valores
       System.out.println("arreglo de enteros indice 0: " + edades[0]);
       System.out.println("arreglo de enteros indice 1: " + edades[1]);
       System.out.println("arreglo de enteros indice 2: " + edades[2]);
       
       //arreglos de tipo obj. declaramos e instanciamos
       Persona personas[] = new Persona[4];
       //inicializamos los valores
       personas[0]= new Persona("Juan");
       personas[2]= new Persona("Karla");
       System.out.println("personas = " + personas[0]);
        
       //notacion simplificada de arregos
       String nombres[]={"Sara", "Laura", "Carlos", "Carmen"};
       //recooremos los elementos con for y contador
       for(int i=0; i< nombres.length ; i++){
           System.out.println("Arreglo String indice: " + i + ": " 
                   + nombres[i]);
       }
       
    }
    
}
