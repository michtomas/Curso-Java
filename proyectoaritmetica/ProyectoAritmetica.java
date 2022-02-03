
package proyectoaritmetica;

//para utilizar el metodo necestios crear un objeto de esta clase
public class ProyectoAritmetica {
    //creamos el obj
    public static void main(String[] args){
        //creamos un obj de tipo aritmetica
        //tipo nommbre = new plantilla
//        Aritmetica aritmetica = new Aritmetica();
//        //obj creado
//        //llamamos al metodo sumar
//        aritmetica.a = 10;
//        aritmetica.b = 6;
//        int resultado = aritmetica.sumar();
//        System.out.println("resultado: " + resultado);
//        
//        //creaacion de un segundo objeto de aritmetica
//        
//        Aritmetica aritmetica2 = new Aritmetica(4, 2);
//        System.out.println("aritmetica2 = " + aritmetica2.sumar() );
        
    //variable local
    int operandoA = 6;
    int operandoB = 2;
    //creamo un obj de la clase aritmetica enviando los arguemntos respectibos
    Aritmetica objeto1 = new Aritmetica(operandoA, operandoB);
    //imprimos el valor de los operando
        System.out.println("operandoA = " + operandoA);
        System.out.println("operandoB = " + operandoB);
        
        //reutlados
        System.out.println("\nResultado de la suma: " + objeto1.sumar());
        System.out.println("\nResultado de la resta: " + objeto1.restar());
        System.out.println("\nResultado de la producto: " + 
                objeto1.multiplicar());
        System.out.println("\nResultado de la division: " + objeto1.dividir());
    }
    
    //public void otroMetodo(){
        //System.out.println(operandoA);
        //nopuedo acceder a operandoA desde otro metodo, salvo que las defina 
        //en la clse
    //}
}
