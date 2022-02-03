package ejercicio7p1;

public class Persona {
    //atributos de la clase
    String nombre;
    int DNI;
    int edad;

    public String getNombre() {
        return nombre;
    }

    public int getDNI() {
        return DNI;
    }

    public int getEdad() {
        return edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Mi nombre es " + nombre + ", mi DNI es " + DNI 
                 + " y tengo " + edad + " años.";
    }
    
    
}
