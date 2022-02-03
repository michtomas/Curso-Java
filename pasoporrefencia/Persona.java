package pasoporrefencia;

public class Persona {
    String nombre;
    //dos metodos
    //el primero
    public String obtenerNombre(){
        return this.nombre;
    }
    //el segundo
    public void cambiarNombre(String nuevoNombre){
        this.nombre = nuevoNombre;
    }
    
}
