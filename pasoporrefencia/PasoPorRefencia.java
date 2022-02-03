package pasoporrefencia;
public class PasoPorRefencia {

    public static void main(String[] args) {
        //defino obj de tipo persona
        Persona p = new Persona();
        p.cambiarNombre("Juan");
        System.out.println("nombre= " + p.obtenerNombre());
        //con paso por de referencia podemos modificar el valor
        modificarPersona(p);
        
        System.out.println("valor del nombre modificado = " +
                p.obtenerNombre());
    }

    private static void modificarPersona(Persona pArg) {
        //pARG porque es variable local, distinta a p mejor
        pArg.cambiarNombre("Carlos");
        
    }
    
    
}
