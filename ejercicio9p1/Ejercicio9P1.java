package ejercicio9p1;

import java.util.Scanner;

public class Ejercicio9P1 {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        Persona p  = new Persona();
        String cierre= "ZZZ";
        Persona matriz[][];
        matriz = new Persona[5][8];
        int turno=0;
        int dia=0;
        int totalCupos=0;
        p.setNombre(" ");
        while(totalCupos!=40 && !p.getNombre().equals(cierre)){
            if(turno == 8){
                System.out.println("Se agotaron los turnos para el dia " + dia);
                turno=0;
                dia++;
                System.out.println("Nuevo dia" + dia);
            }else{
                System.out.println("Ingrese el nombre de la persona:");
                p.setNombre(lector.next());
                if(p.getNombre().equals(cierre)){
                    System.out.println("Se cierran las inscripciones");
                }else{
                    System.out.println("Ahora ingrese la edad:");
                    p.setEdad(lector.nextInt());
                    System.out.println("Por ultimo ingrese su DNI:");
                    p.setDni(lector.nextInt());
                    System.out.println("Inscripto el dia " + dia + " turno " + turno);
                    matriz[dia][turno]=p;
                    turno++;
                    totalCupos++;
                }
                }
            }
        for(int i=0; i<dia; i++){
            for(int j=0; j<turno; j++){
                System.out.println("Dia" + i + ", turno" + j);
                System.out.println(matriz[i][j].toString());
            }
        }
            
    }
}   
    

