package ejercicio11p1;

import java.util.Scanner;

public class Ejercicio11P1 {

    public static void main(String[] args) {
        int ganadosRiver=0;
        int golesBoca=0;
        int empates=0;
        String local;
        String visitante;
        int gl;
        int gv;
        Partido p = new Partido();
        Scanner lector = new Scanner(System.in);
        Partido partidos[];
        partidos = new Partido[20];
        System.out.println("Ingrese el nombre del equipo local: ");
        local = lector.next();
        System.out.println("Ingrese los goles del local: ");
        gl=lector.nextInt();
        System.out.println("Ingrese el nombre del equipo visitante: ");
        visitante=lector.next();
        System.out.println("Ingrese los goles del visitante: ");
        gv=lector.nextInt();
        String cierre = "ZZZ";
        p.setVisitante(visitante);
        int totalPartidos=0;
        while(totalPartidos!=20 && !visitante.equals(cierre)){
            p.setLocal(local);
            p.setVisitante(visitante);
            p.setGolesL(gl);
            p.setGolesV(gv);
            partidos[totalPartidos]=p;
            totalPartidos++;
            System.out.println("Ingrese el nombre del equipo local: ");
            local = lector.next();
            System.out.println("Ingrese los goles del local: ");
            gl=lector.nextInt();
            System.out.println("Ingrese el nombre del equipo visitante: ");
            visitante=lector.next();
            System.out.println("Ingrese los goles del visitante: ");
            gv=lector.nextInt();
        }
        
        
        
        System.out.println("Partidos ganados de River: " + ganadosRiver);
        System.out.println("Goles de Boca locales: " + golesBoca);
        System.out.println("Cantidad de empates: " + empates);
        
    }
    
}
