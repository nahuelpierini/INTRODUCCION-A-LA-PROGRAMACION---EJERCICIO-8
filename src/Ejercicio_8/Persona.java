package Ejercicio_8;

public class Persona {

    private String nombre;
    private int edad;
    private int telefono;

    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setEdad(int edad){
        this.edad = edad;
    }
    public void setTelefono(int telefono){
        this.telefono = telefono;
    }

    public String getNombre(){
        return this.nombre;
    }
    public int getEdad(){
        return this.edad;
    }
    public int getTelefono(){
        return this.telefono;
    }

}
