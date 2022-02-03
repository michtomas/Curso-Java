package encapsulamiento;

public class Persona {
    //atributos
    private String nombre;
    private boolean eliminado;
    private double sueldo;
    //cons:
    public Persona(String nombre, double sueldo, boolean eliminado){
        this.nombre = nombre;
        this.eliminado = eliminado;
        this.sueldo = sueldo;
    }
    
    //como ahora los atributos estan encapsulados no podemos usar persona.nombre
    //ahremos dos metodos un set (poner/modificar) y un get(obtener)
    public String getNombre(){
        return this.nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public boolean isEliminado() {
        return eliminado;
    }

    public void setEliminado(boolean eliminado) {
        this.eliminado = eliminado;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
    //metodo to string
    /*
    public String toString(){
        return "nombre: " + nombre + ", sueldo = " + sueldo + ", eliminado? "
                + eliminado;
    }
    */

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", eliminado=" + eliminado + ", sueldo=" + sueldo + '}';
    }
    
}