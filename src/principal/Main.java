package principal;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        //Creacion de Objetos y de la lista para añadir los objetos
        ArrayList<Persona> lista = new ArrayList<>();
        Persona persona1 = new Persona(18, 53, 1.69, "Alfredo", "78132935T", genero.H );
        Persona persona2 = new Persona(34, 63, 1.75, "Bernardo", "46132575F", genero.O );
        Persona persona3 = new Persona(26, 57, 1.82, "Cecilia", "79546890F", genero.M );
        //añadir los objetos a la lista existente
        lista.add(persona1);
        lista.add(persona2);
        lista.add(persona3);

        System.out.println(persona1.IMC());
        persona1.mayor();
        //mostrar la lista por el orden de nombre.
        Collections.sort(lista);
        for (Persona o : lista){
            System.out.println(o.getNombre());
        }
    }
}
