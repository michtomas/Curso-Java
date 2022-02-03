package ejemplopalabrafinal;
//public class ClaseFinal{
    //esta la hacemos para usar extend
public final class ClaseFinal {
    //no puede tener clases hijas, es la ultima
    //Variables marcadas como final
    public final int varNumero = 10;
    //en este caso funciona como una constante
    
    //constante de verdad
    public static final int VAR_PRIMITIVO = 15;
    //la direferencia con la otra variable la diferencia es como accerder a ella
    //las constantes se usan mayus usualmente
    
    //con objetos: variable tipo obj
    public static final Persona VAR_PERSONA = new Persona();
    //esta variable ya no podra apuntar a otro objeto pero si sus valores
    
    //final para un metodo
    public final void metodoFinal(){
        
    }
}    
//class ClaseHija extends ClaseFinal{
    //public final void metodoFinal(){
    //error porque no pede ser sobbrescrito porque puyse final en 
    //laclase anterior            
   // }
            
//}
