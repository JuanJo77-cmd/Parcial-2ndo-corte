/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject9;

import java.util.Scanner;

/**
 *
 * @author juanj
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

      
        System.out.println(" DATOS ESTUDIANTE");
        System.out.print("Nombre: "); String nomE = sc.nextLine();
        System.out.print("Edad: "); int edE = sc.nextInt(); sc.nextLine();
        System.out.print("Documento: "); String docE = sc.nextLine();
        System.out.print("Programa: "); String progE = sc.nextLine();
        System.out.print("Promedio: "); double promE = sc.nextDouble(); sc.nextLine();

        Estudiante est = new Estudiante(nomE, edE, docE, progE, promE);

        
        System.out.println("\n DATOS PROFESOR");
        System.out.print("Nombre: "); String nomP = sc.nextLine();
        System.out.print("Edad: "); int edP = sc.nextInt(); sc.nextLine();
        System.out.print("Documento: "); String docP = sc.nextLine();
        System.out.print("Area: "); String areaP = sc.nextLine();
        System.out.print("Salario Base: "); double salP = sc.nextDouble();
        System.out.print("Horas Catedra: "); int horasP = sc.nextInt();

        Profesor prof = new Profesor(nomP, edP, docP, areaP, salP, horasP);

        System.out.println("\n RESULTADO ESTUDIANTE ");
        est.mostrarInfo();

        System.out.println("\nRESULTADO PROFESOR");
        prof.mostrarInfo();

        sc.close();
    }
}