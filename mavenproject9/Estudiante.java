/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package com.mycompany.mavenproject9;

/**
 *
 * @author juanj
 */
class Estudiante extends Persona {
    String programa;
    double promedio;

    public Estudiante(String nombre, int edad, String documento, String programa, double promedio) {
        super(nombre, edad, documento);
        this.programa = programa;
        this.promedio = promedio;
    }

    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Programa: " + programa);
        System.out.println("Promedio: " + promedio);
    }
}