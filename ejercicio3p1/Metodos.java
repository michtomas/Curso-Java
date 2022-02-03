package ejercicio3p1;

public class Metodos {
    double promedio=0.;
    public double calcularPromedio(int alturas[]){
        for(int i=0; i<15; i++){
            this.promedio+=alturas[i];    
        }
        this.promedio=this.promedio/(15);
        return this.promedio;
    }
    public int SupPromedio(int alturas[],double referencia){
        //calcula la cantidad de jugadores por encima del promedio
    int contador=0;
    for(int i =0;i<15; i++){
        if(alturas[i]>referencia){
            contador++;
        }
    }
    return contador;        
    }
}
