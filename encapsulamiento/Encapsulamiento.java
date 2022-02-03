package encapsulamiento;

public class Encapsulamiento {
   
    public static void main(String[] args) {
        //obj 
        Persona persona = new Persona("Juan", 5000, false);
        System.out.println("persona: " + persona);
        persona.setNombre("Carlos");
        persona.setSueldo(10000);
        persona.setEliminado(true);
        System.out.println("persona: " + persona.toString());
    }
    
}
