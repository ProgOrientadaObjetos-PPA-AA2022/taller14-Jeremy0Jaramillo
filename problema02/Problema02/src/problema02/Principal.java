/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema02;

import java.util.ArrayList;

/**
 *
 * @author fabri
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Libreta> lib = new ArrayList<>();
        
        Estudiante e1 = new Estudiante("René", "Elizalde");
        Libreta l1 = new Libreta(e1,9.2,10.0,7.5);
        l1.calcularPromedio();
        lib.add(l1);
        
        Estudiante e2 = new Estudiante("José","Mora");
        Libreta l2 = new Libreta(e2, 8.1, 9.1, 5.5);
        l2.calcularPromedio();
        lib.add(l2);
        
        Estudiante e3 = new Estudiante("Luis", "Suarez");
        Libreta l3 = new Libreta(e3,9.2,10.0,7.5);
        l3.calcularPromedio();
        lib.add(l3);
        
        Estudiante e4 = new Estudiante("Sara","Diaz");
        Libreta l4 = new Libreta(e4, 8.1, 9.1, 5.5);
        l4.calcularPromedio();
        lib.add(l4);
        
        Estudiante e5 = new Estudiante("Marco", "Salinas");
        Libreta l5 = new Libreta(e5,9.2,10.0,7.5);
        l5.calcularPromedio();
        lib.add(l5);
        
        Estudiante e6 = new Estudiante("Juan","Silva");
        Libreta l6 = new Libreta(e6, 8.1, 9.1, 5.5);
        l6.calcularPromedio();
        lib.add(l6);
        
        Estudiante e7 = new Estudiante("Rosa","Jara");
        Libreta l7 = new Libreta(e7, 8.1, 9.1, 5.5);
        l7.calcularPromedio();
        lib.add(l7);
        
        for (int i = 0; i < lib.size(); i++) {
            System.out.println(lib.get(i));
        }
    }
    
}
