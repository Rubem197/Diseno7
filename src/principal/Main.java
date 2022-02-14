package principal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import static principal.Persona.*;

public class Main {

    public static void main(String[] args) {
        //Creacion de Objetos y de la lista para añadir los objetos
        ArrayList<Persona> lista = new ArrayList<>();
        Scanner sc = new Scanner (System.in);
        Persona persona1 = new Persona(18, 53, 1.69, "Alfredo", "78132935T", Genero.H);
        Persona persona2 = new Persona(34, 63, 1.75, "Bernardo", "46132575F", Genero.H);
        Persona persona3 = new Persona(26, 57, 1.82, "Cecilia", "79546890F", Genero.M);
        //añadir los objetos a la lista existente
        lista.add(persona1);
        lista.add(persona2);
        lista.add(persona3);

        System.out.println(persona1.IMC());
        persona1.mayor();
        //mostrar la lista por el orden de nombre.
        Collections.sort(lista);
        for (Persona o : lista) {
            System.out.println(o.getNombre());
        }
        int opc=0;
        while (opc != 5) {
            System.out.println("Peso medio");
            System.out.println("Altura media");
            System.out.println("Edad media");
            System.out.println("cuantos hay de cada sexo");
            System.out.println("Salir");
            System.out.println("Introduzca una opcion");
            opc = sc.nextInt();
            switch (opc) {
                case 1:
                    pesoMedio(lista);
                    break;
                case 2:
                    alturaMedia(lista);
                    break;
                case 3:
                    edadMedia(lista);
                    break;
                case 4:
                    obtenerGenero(lista);
                    break;
            }
        }
    }
}
