package palabrareturnobject;
public class PalabraReturnObject {
    public static void main(String[] args) {
        //creamos el obj de tipo suma
        Suma s = creaObjetoSuma();
        System.out.println("resultado de llamar el metodo sumar: " + s.sumar());
    }
    //metodo para crear obj suma
    private static Suma creaObjetoSuma(){
        Suma pp = new Suma(4,6);
        return pp;
    }
            
}

//haremos una clase dentro del programa pricipal sin abrir una nueva
//solo pueden ser privadas
class Suma{
    int a;
    int b;
    //haremos un constructor
    public Suma(int a, int b){
        this.a = a;
        this.b = b;
    }
    
    //metodo para sumar
    public int sumar(){
        return this.a + this.b;
    }
}