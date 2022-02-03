package ejercicio6p1;

import java.util.Scanner;

public class Ejercicio6P1 {

    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        int operaciones[];
        operaciones = new int[5];
        
        System.out.println("Indique, con un numero, que operacion "
                + "desea realizar: ");
        System.out.println("Ingrese 0 si desea realizar la operacion Cobre de cheque" 
            + "\n Ingrese 1 si desea realizar la operacion Deposito/Extraccion en cuenta" 
            + "\n Ingrese 2 si desea realizar la operacion Pago de impuestos o servicios" 
            + "\n Ingrese 3 si desea realizar la operacion Cobro de jubilacion" 
            + "\n Ingrese 4 si desea realizar la operacion Cobro de planes");  
        int operacion = n.nextInt();
        while(operacion != 5){
            operaciones[operacion] = ++operaciones[operacion];
            System.out.println("Ingrese el numero de operacion que desea realizar:");
            operacion=n.nextInt();
        }
        System.out.println("Cantidad de Cobro de cheques: " + operaciones[0]
        + "\n Cantidad de Depositos/extracciones: " + operaciones[1] 
        + "\n Camtidad de Pagos en impuestos o servicioes: " + operaciones[2]
        + "\n Cantidad de Cobros por jubilacion: " + operaciones[3]
        + "\n Cantidad de Cobros por plan: " + operaciones[4]);
        
    }
    
}
