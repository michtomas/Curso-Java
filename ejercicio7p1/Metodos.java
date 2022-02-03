package ejercicio7p1;

public class Metodos {
    public int cantidad(Persona personas[]){
        int contador = 0;
        for(int i=0; i<3; i++){
            int edad = personas[i].getEdad();
            if(edad>65)
                contador++;
        }
        return contador ;
    }
    public String menor(Persona personas[]){
        String menor = null;
        for(int i=0; i<3; i++){
            int dni = personas[i].getDNI();
            if(dni>=dni){
                menor=personas[i].toString();
            }
        }
        return menor;
    }
    
    
}
    