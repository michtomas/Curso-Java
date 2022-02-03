package palabrathis;
public class PalabraThis {
    public static void main(String[] args) {
        //creamos el obj de tipo persona
        Persona persona = new Persona("juan");
        
    }
    
}
//creamos dos clases
class Persona{
    String nombre;
    //constructor
    Persona(String nombre){
        this.nombre = nombre; //this apunta al obj de tipo persona
        System.out.println("Impresion del operador thisen clase persona:" 
                + this );
        //llamo al metodo imprimir
        Imprimir imprimir = new Imprimir();
        imprimir.imprimir(this); //this cont una referecnia al obj persona
    }
}
class Imprimir{
    //metodo
    public void imprimir(Persona p){
        System.out.println("impresion argumento persona: " + p);
        System.out.println("impresion del obj actual (this" + this);
    }
}