package principal;

enum genero {H, M, O}

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
    private genero genero;

    /**
     * Constructor por defecto
     */
    public Persona() {
    }

    /**
     * @param edad
     * @param peso   en Kg
     * @param altura en cm
     * @param nombre no puede contener numeros
     * @param DNI    8 números y una letra al final en mayúscula
     * @param genero controlado por enum tiene que ser H, M, O
     */
    public Persona(int edad, double peso, double altura, String nombre, String DNI, genero genero) {
        this.edad = edad;
        this.peso = peso;
        this.altura = altura;
        this.nombre = nombre;
        this.DNI = DNI;
        this.genero = genero;
    }

    /**
     * Metodo engargado de calcular el imc con peso y altura y devolviendo -1 si esta con peso insuficiente 0 si es
     * normopeso y 1 si tiene sobrepeso.
     *
     * @return
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

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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
