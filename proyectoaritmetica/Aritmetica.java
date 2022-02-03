package proyectoaritmetica;
    //el constructor inicia los atributos de una clase
    
public class Aritmetica {
    //atrubitus de la clase:
    int a;
    int b;
    //constructor:
    public Aritmetica(){
        System.out.println("Ejecutnado el constructor vacio"); // asi me avisa
        
    }
    
    
    //otro consutrcutir con argmentos
    public Aritmetica(int a, int b){
        this.a = a;
        this.b = b;
        System.out.println("Ejecutnado constructor de 2 arg");
                
    }
    
    
    //Haremos un metodo 
    //tipo nombreMetodo(lista de argumentos){}
    //entre llaves cuerpo del metodo que se ejecuta cuando lo llame
    public int sumar(){
        return a + b;
        //int resultado = a + b; //se utlizan los atrubits de la clase
        //return resultado; //return con la palabra que devolvemos a la clase
        //que la llama
    }
    
    //nuevo metodo
    public int restar(){
     return a - b;   
    }
    
    //mas metodos
    public int multiplicar(){
        return a*b;
    }
    
    public int dividir(){
        return a/b;
    }
    
    
    
    
}
