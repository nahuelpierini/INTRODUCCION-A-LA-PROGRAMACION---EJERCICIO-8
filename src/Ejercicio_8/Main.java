package Ejercicio_8;

public class Main {
    public static void main(String[] args) {

        Persona persona = new Persona();
        persona.setNombre("Anonimo");
        persona.setEdad(30);
        persona.setTelefono(123456789);

        System.out.println(persona.getNombre() + " " +  persona.getEdad() + " " +  persona.getTelefono());


    }
}
