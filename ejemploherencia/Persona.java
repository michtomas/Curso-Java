package ejemploherencia;

public class Persona {
    private String nombre;
    private char genero;
    private int edad;
    private String direccion;
    
    //cons vacio
    public Persona(){
        
    }
    public Persona(String nombre){
        this.nombre = nombre;
    } 
    public Persona(String nombre, char genero, int edad, String direccion){
        this.direccion = direccion;
        this.edad = edad;
        this.genero = genero;
        this.nombre = nombre;
    }
    
    //mnetodos get y set

    public String getNombre() {
        return nombre;
    }

    public char getGenero() {
        return genero;
    }

    public int getEdad() {
        return edad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", genero=" + genero 
                + ", edad=" + edad + ", direccion=" + direccion + '}';
    }
    
}
