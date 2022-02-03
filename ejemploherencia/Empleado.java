package ejemploherencia;

public class Empleado extends Persona{
    private int idEmpleado;
    private double sueldo;
    private static int contadorEmpleado;
    //constructor:
    public Empleado(String nombre, double sueldo){
        super(nombre);
        this.idEmpleado = ++contadorEmpleado;
        this.sueldo = sueldo;
    }

    public double getSueldo() {
        return sueldo;
    }

    public static int getContadorEmpleado() {
        return contadorEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return super.toString() + "Empleado{" + "idEmpleado=" + idEmpleado 
                + ", sueldo=" + sueldo + '}';
    }
    
    
    
    
            
}
