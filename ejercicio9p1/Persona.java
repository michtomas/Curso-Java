package ejercicio9p1;

public class Persona {
    //atributos de la clase
    String nombre;
    int edad;
    int dni;
  

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public int getDni() {
        return dni;
    }

    public void setNombre(String nombre) {

        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    
    @Override
    public String toString() {
        return "Nombre=" + nombre + ", edad=" + edad + ", dni=" + dni;
    }
    
    
            
}
