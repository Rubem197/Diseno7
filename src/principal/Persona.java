package principal;

import java.util.ArrayList;

enum Genero {H, M, O}

public class Persona implements Comparable<Persona> {
    /**
     * Programa para estudiar diseño de persona, calcular IMC y saber si es mayor de edad
     * Atributos:
     * entero:
     * edad
     * peso
     * altura.
     * cadena:
     * Nombre
     * DNI
     * genero (Enum)
     */

    private int edad;
    private double peso;
    private double altura;
    private String nombre;
    private String DNI;
    private Genero genero;

    /**
     * Constructor por defecto
     */
    public Persona() {
    }

    /**
     * @param edad años numero entero
     * @param peso   en Kg
     * @param altura en cm
     * @param nombre no puede contener numeros
     * @param DNI    8 números y una letra al final en mayúscula
     * @param genero controlado por enum tiene que ser H, M, O
     */
    public Persona(int edad, double peso, double altura, String nombre, String DNI,Genero genero) {
        this.edad = edad;
        this.peso = peso;
        this.altura = altura;
        this.nombre = nombre;
        this.DNI = DNI;
        this.genero = genero;
    }

    /**
     *
     * @param persona
     */
    public Persona(Persona persona) {
        this.edad = persona.edad;
        this.peso = persona.peso;
        this.altura = persona.altura;
        this.nombre = persona.nombre;
        this.DNI = persona.DNI;
        this.genero = persona.genero;
    }


    /**
     * Metodo engargado de calcular el imc con peso y altura y devolviendo -1 si esta con peso insuficiente 0 si es
     * normopeso y 1 si tiene sobrepeso.
     *
     * @return imc de la persona
     */
    public int IMC() {
        int IMC;
        if (this.peso / (Math.pow(this.altura, 2)) < 18.5) {
            IMC = -1;
        } else if (this.peso / (Math.pow(this.altura, 2)) > 18.5 && this.peso / (Math.pow(this.altura, 2)) < 24.9) {
            IMC = 0;
        } else {
            IMC = 1;
        }
        return IMC;
    }

    /**
     * Metodo para calcular si una pesona es mayor de edad comparando su edad con 18.
     */
    public void mayor() {
        if (this.edad < 18) {
            System.out.println("Es menor de edad");
        } else {
            System.out.println("Es mayor de edad");
        }
    }
    public static void pesoMedio (ArrayList<Persona> lista){

        double pesoMedio =0;
        for (Persona o : lista){
            pesoMedio=pesoMedio+o.getPeso();
        }
        pesoMedio=pesoMedio/lista.size();
        System.out.println("El peso medio de las personas introducidas es: " + pesoMedio);
    }
    public static void alturaMedia (ArrayList<Persona> lista){
        double alturaMedia =0;
        for (Persona o : lista){
            alturaMedia=alturaMedia+o.getAltura();
        }
        alturaMedia=alturaMedia/lista.size();
        System.out.println("La altira media de las personas introducidas es: " + alturaMedia);
    }
    public  static void edadMedia (ArrayList<Persona> lista){
        double edadMedia =0;
        for (Persona o : lista){
            edadMedia=edadMedia+o.getEdad();
        }
        edadMedia=edadMedia/lista.size();
        System.out.println("La edad media de las personas introducidas es: " + edadMedia);

    }
    public static void obtenerGenero(ArrayList<Persona> lista){
        int H=0;
        int M=0;
       for (Persona o: lista)
       {
           if (o.getGenero() == Genero.H){
               H++;
           }
           else if (o.getGenero() == Genero.M){
               M++;
           }
       }
        System.out.println("Hay " + H + " hombres" );
        System.out.println("Hay " + M + " mujeres" );

    }

    public int getEdad() {
        return edad;
    }

    public double getPeso() {
        return peso;
    }

    public double getAltura() {
        return altura;
    }

    public Genero getGenero() {
        return genero;
    }


    public String getNombre() {
        return nombre;
    }

    @Override
    public int compareTo(Persona o) {
        if (this.nombre.compareTo(o.getNombre()) < 0) {
            return -1;
        } else if (this.nombre.compareTo(o.getNombre()) == 0) {
            return 0;
        } else {
            return 1;
        }
    }
}
