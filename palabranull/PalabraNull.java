package palabranull;

public class PalabraNull {

    public static void main(String[] args) {
        //creamos obj de tipo persona
        Persona persona1 = new Persona("Juan");
        System.out.println("persona1: " + persona1.obtenerNombre());
        Persona persona2 = persona1;
        System.out.println("persona2: " + persona2.obtenerNombre());
        persona1 = null;
        if(persona1 != null)
            System.out.println("persona1: " + persona1.obtenerNombre());
        else
            System.out.println("La variable persona no apunta a ningun obj");
        persona2 =null;
        System.gc();
        
    }
    
}
//creamos otra clase 
class Persona{
    String nombre;
    Persona(String nombre){
        this.nombre = nombre;
    }
    //metodo obt nombre
    public String obtenerNombre(){
        return this.nombre;
    }
}