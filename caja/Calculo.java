package caja;


public class Calculo {
    //atributos
    int ancho;
    int alto; 
    int profundo;
    
    //Constructor vacio, para que? pd: nombre clase = nombre constructor, sino F
    public Calculo(){
        System.out.println("Constructor vacio");
    }
    
    //Constructor con argumentos
    public Calculo(int a,int h,int p){
        System.out.println("Contructor con argumentos");
        this.alto = h;
        this.ancho = a;
        this.profundo = p;
                
    }
    
    //Hacemos el metodo para calcular el volumen
    public int Volumen(){
        System.out.println("Volumen");
        return ancho*alto*profundo;
    }
}
