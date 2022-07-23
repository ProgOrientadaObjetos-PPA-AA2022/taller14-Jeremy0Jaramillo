/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problema02;

/**
 *
 * @author fabri
 */
public class Estudiante {
    String nombre;
    String apellido;
    
    public Estudiante(String n, String m){
        nombre = n;
        apellido = m;
    }

    public void establecerNombre(String n) {
        nombre = n;
    }

    public void establecerApellido(String n) {
        apellido = n;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public String obtenerApellido() {
        return apellido;
    }

    @Override
    public String toString() {
        String cadena = String.format("%s %s\n",
                nombre,
                apellido);

        return cadena;
    }

}
