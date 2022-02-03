package creacionclaseobjeto;


public class CreacionClaseObjeto {

   
    public static void main(String[] args) {
         //utlizamos la plantilla que creamos. clase de persona
        //creacion de un ojeto de tipo personas
        //definimos la variable de tipo persona
        Persona persona1;
        //creandoo un obje de la clase persona
        new Persona();
        //la palabra new crea e obj de tipo persona
        //queremos que la variable persona uno apunte al obj que creamos
        persona1 = new Persona();
        //creamos el obj persona?
        //accedemos al objeto persona y llamamos al metodo desplegarnombre
        
        persona1.desplegarNombres(); //esto myestra los nombrs por consola pero
        // aun no los cargue por eso sale null
        // en los parentesis pide info pero no lo necfesito ahora
        
        //modificamos los valores de los atrinutos del obj persona
        persona1.nombre = "Juan";
        persona1.apellido = "Perez";
        
        //volvamos a imprimos los valores
        System.out.println("");
        persona1.desplegarNombres();
        
        //creamos un segundo objeto
        
        Persona persona2 = new Persona(); //objeto creado
        //new = crear objeto
        persona2.apellido = "Gomez";
        persona2.nombre = "Karla";
        System.out.println("");
        persona2.desplegarNombres();
               
        
    }
    
}
