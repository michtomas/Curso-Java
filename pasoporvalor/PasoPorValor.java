package pasoporvalor;


public class PasoPorValor {

    
    public static void main(String[] args) {
        int x = 10;
        System.out.println("x = " + x);
        
        
        //defino metodo
        cambiarValor(x);
        System.out.println("x = " + x);
    }

    private static void cambiarValor(int arg) {
        arg = 20;
        System.out.println("arg = " + arg);
    }
    //no cambiade valor en el programa prinncipal por paso de valor, ya que es
    // son solo valores locales dentro de su metodo
    
}
