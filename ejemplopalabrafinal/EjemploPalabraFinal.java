package ejemplopalabrafinal;

public class EjemploPalabraFinal {

    public static void main(String[] args) {
        //tratamos modificar un atributo marcado como final
        //ClaseFinal.VAR_PRIMITIVO = 20; no se pudo modificar
        
        //Modificar la  referencia de un atributo de tipo objetc
        //ClaseFinal.VAR_PERSONA = new Persona(); no se pudo modificar tampoco
        
        //veremos que si podremos modificar su valor, pero no su referencia.
        ClaseFinal.VAR_PERSONA.setNombre("Juan");
        System.out.println(ClaseFinal.VAR_PERSONA.getNombre());
        
        ClaseFinal.VAR_PERSONA.setNombre("Carlos");
        System.out.println(ClaseFinal.VAR_PERSONA.getNombre());
    }
    
}
