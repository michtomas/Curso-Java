
package palabrareturntiposprimitivos;


public class PalabraReturnTiposPrimitivos {

   
    public static void main(String[] args) {
       //definimos nuevo metodo sumar sin retornar
       sumarSinRetornarValor(3, 6);
       
       //otro metodo sumar retornando valor
       int resultado = sumarRetornandoValor(8,0);
        System.out.println("el resultado de retornado valor: " + resultado);
    }

    private static void sumarSinRetornarValor(int a, int b) {
        System.out.println("el r"
                + "esultado de sumar sin retornar valor: " + (a+b));
        return; //opcional
        
    }

    private static int sumarRetornandoValor(int a, int b) {
        if(a==0 && b==0){
            System.out.println("Debe proporcionar valors distintos de cero");
            return 0;
        }
        return a+b;
    }
    
}
