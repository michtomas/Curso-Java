package ejemploherencia;

import java.util.Date;

public class Cliente extends Persona{
    private int idCliente;
    private Date fechaRegistro;
    private boolean vip;
    private static int contadorClientes;
    
    public Cliente(Date fechaRegistro, boolean vip){
        this.idCliente = ++contadorClientes;
        this.fechaRegistro = fechaRegistro;
        this.vip = vip;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public boolean isVip() {
        return vip;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public void setVip(boolean vip) {
        this.vip = vip;
    }

    public static void setContadorClientes(int contadorClientes) {
        Cliente.contadorClientes = contadorClientes;
    }

    @Override
    public String toString() {
        return super.toString() + "Cliente{" + "idCliente=" 
        + idCliente + ", fechaRegistro=" + fechaRegistro + ", vip=" + vip + '}';
    }
    
    
            
}
