package ejemploestatico;

public class Persona {
    //atributos:
    private int idPersona;//asociados a objetos
    private String nombre;
    private static int contadorPersonas;//asociados a la clase (static)
    //constructor
    public Persona(String nombre){
        this.idPersona = ++contadorPersonas;
        this.nombre = nombre;
    }
    //metodos get y set
    public int getIdPersona(){
        return this.idPersona;
    }
//    public void setIdPersona(int idPersona){
//        this.idPersona = idPersona;
//    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public static int getContadorPersonas() {
        return contadorPersonas;
    }

    @Override
    public String toString() {
        return "Id persona:" + idPersona + ", nombre: " + nombre 
                + ", contadorPersonas: " + contadorPersonas;
    }
    
}