package ejercicio11p1;

public class Metodos {
    public boolean ganaRiver(String visitante, String local, int golesV, int golesL){
        boolean ganaRiver=false;
        if(local=="River" && golesL>golesV)
            ganaRiver=true;
        if("River".equals(visitante) && golesV>golesL)
            ganaRiver=true;
        return ganaRiver;
    }
    
    public int golesBocaLocal(String local,int golesL){
        int golesBoca=0;
        if("Boca"==local)
            golesBoca = golesL;
        return golesBoca;
    }  
    
    public boolean hayEmpate(int golesV,int golesL){
        boolean empate= false;
        if(golesV==golesL){
        empate=true;
        }
        return empate;
    }








}
