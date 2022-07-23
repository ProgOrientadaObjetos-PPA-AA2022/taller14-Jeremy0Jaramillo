/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problema02;

/**
 *
 * @author fabri
 */
public class Libreta {
    Estudiante estudiante;
    double calificacion1;
    double calificacion2;
    double calificacion3;
    double promedio;
    
    public Libreta(Estudiante n, double m, double c, double v){
        estudiante = n;
        calificacion1 = m;
        calificacion2 = c;
        calificacion3 = v;
    }

    public void establecerEstudiante(Estudiante n) {
        estudiante = n;
    }

    public void establecerCalificacion1(double n) {
        calificacion1 = n;
    }

    public void establecerCalificacion2(double n) {
        calificacion2 = n;
    }

    public void establecerCalificacion3(double n) {
        calificacion3 = n;
    }

    public void calcularPromedio() {
        promedio = (calificacion1 + calificacion2 + calificacion3) / 3;
    }

    public Estudiante obtenerEstudiante() {
        return estudiante;
    }

    public double obtenerCalificacion1() {
        return calificacion1;
    }

    public double obtenerCalificacion2() {
        return calificacion2;
    }

    public double obtenerCalificacion3() {
        return calificacion3;
    }

    public double obtenerPromedio() {
        return promedio;
    }

    @Override
    public String toString() {
        String cadena = String.format("%s  ", obtenerEstudiante());

        cadena = String.format("%sCalificaciones:\n  "
                + "%.1f\n  "
                + "%.1f\n  "
                + "%.1f\n  "
                + "Promedio %.1f\n",
                cadena,
                obtenerCalificacion1(),
                obtenerCalificacion2(),
                obtenerCalificacion3(),
                obtenerPromedio());

        return cadena;
    }

}
