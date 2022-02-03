package ejemplomatrices;

public class EjemploMatrices {

    public static void main(String[] args) {
        //definimos matriz de tipo int
        int edades[][];
        //instanciamos
        edades = new int[3][2];
        //inicializamos
        edades[0][0]=2;
        edades[0][1]=5;
        edades[1][0]=3;
        edades[2][1]=9;
        System.out.println("Primer elemento: " + edades[0][0]);
        System.out.println("Elemnto nulo: " + edades[2][0]);
        
        //matriz de obj de tipo persona, declaramos e instanciamos
        Persona personas[][] = new Persona[1][2];
        //inicializamos valores
        personas[0][0]= new Persona("Juan");
        personas[0][1]= new Persona("Karla");
        //imprimo
        System.out.println("Primer elemento: " + personas[0][0]);
        System.out.println("Segundo elemento: " + personas[0][1]);
        
        //recorrer matrices con dos ciclos for
        for(int renglon =0; renglon < personas.length; renglon++){
            for(int columna=0; columna < personas[renglon].length; columna++){
                //Imprimimos cada elemento
                System.out.println("Matrices de personas en el indice: " 
                        + renglon + " " + columna + " : " 
                        + personas[renglon][columna]);
            }
        }
        
    }
    
}
