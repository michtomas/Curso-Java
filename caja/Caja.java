package caja;

public class Caja {
    
   
    
    public static void main(String[] args) {
       //Ahora enviamos los valores de los atributos e imprimir resultados
       //variables locales, deben estar inicializadas
       int a=3;
       int b=4;
       int c=6;
       Calculo Tomas = new Calculo(a, b, c);
       
       //Imprimos resultados
        System.out.println("Volumen de la caja = " + Tomas.Volumen());
        System.out.println("Imprimos los valores de variables");
        System.out.println("Valor del alto = " + Tomas.alto);
        System.out.println("Valor del ancho = " + Tomas.ancho);
        System.out.println("Valor de profundo = "+ Tomas.profundo);
    }
    
}
