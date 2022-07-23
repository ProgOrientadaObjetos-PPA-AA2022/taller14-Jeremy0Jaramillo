/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema01;

import java.util.Scanner;

/**
 *
 * @author fabri
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);

        String sal;
        boolean flag = true;
        int valor = 1;

        System.out.println("Ingreso de datos sobre Trabajadores.");

        do {
            System.out.printf("Ingrese el nombre del trabajador #%d:",
                    valor);
            String nom = entry.nextLine();
            
            System.out.printf("Ingrese la cédula del trabajador #%d:",
                    valor);
            String ced = entry.nextLine();

            System.out.printf("Ingrese el correo del trabajador #%d:",
                    valor);
            String cor = entry.nextLine();

            System.out.printf("Ingrese el sueldo del trabajador #%d:",
                    valor);
            double sue = entry.nextDouble();

            System.out.printf("Ingrese el sueldo en el mes"
                    + " del trabajador #%d:",
                    valor);
            double sueM = entry.nextDouble();

            Trabajador t = new Trabajador();
            t.establecerCedula(ced);
            t.establecerNombres(nom);
            t.establecerCorreo(cor);
            t.establecerSueldo(sue);
            t.establecerMesSueldo(sueM);

            entry.nextLine();

            Enlace c = new Enlace();
            c.insertarTrabajador(t);

            System.out.println("Ingrese 's' para salir.");
            sal = entry.nextLine();
            if ("s".equals(sal)) {
                flag = false;
            }
            
            valor = valor + 1;

        } while (flag);
    }
    
}
