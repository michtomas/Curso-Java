package prueba;

public class Prueba {
/**
 * 
 * @param args
 * @
 */
    public static void main(String[] args) {
        //comentario de una linea 
        
        /*
        Comentario multilinea
        Se completa solo
        Este lenguaje distingue mayusculas de minusculas
        */
        
        /**
         * Comentario javadoc
         * Otro comentario javadoc
         * La diferencia es que el multilinea es para comentar ayudas
         * Este pone etiquetas y se adjunta al codigo fuente proyevcto y
         * documentacion
         * 
         */
        
        //constane, siempre en mayus
        final int C=3;
        //variable, siempre en minus, salvo que sea doble
        int x=2;
        
        //variables
        //Tipos primitivos
        //Boleean (logica falso/verdad
        boolean valorLogico = true;
        //Char=sirve para guardar un caracter. El valor se puede ver en ASCII
        char valorCaracter = 'A';
        //Texto el string (no primitivo, es un objeto)
        String texto="Sin solucion";
        //Datos enteros, difiera en su maximo numero posible para ahorrar memory
        byte ent1= 127;
        short ent2 = 5555;
        int ent3 = 0;
        long ent4 =0L;
        //Datos reales
        float real1= 0.0f;
        double real2=0.0;
        
        
        //Mostrar las variable por consola
        System.out.println(valorLogico);
        System.out.println(texto);
        System.out.println("El valor es " + real1);
        
        
        //Casting. convertir datos
        //decimal a entero y al reves
        int alfa = 20;
        float beta =23.5f;
        beta = alfa;
        alfa = (int) beta;
        System.out.println(alfa + beta);
        // ahora ponemes un caracter a un entero
        alfa = (char) 'b';
        System.out.println(alfa);
        char palabra = (char) alfa;
        System.out.println(palabra);
        
        int numero = Integer.parseInt("10"); //cadena a numero
        System.out.println(numero * 3);
        String cadena = Integer.toString(10); //numero a cadena
        System.out.println(cadena);
        
       
                
                
                        
    }
    
}
