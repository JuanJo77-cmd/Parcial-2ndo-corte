/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package com.mycompany.mavenproject9;

/**
 *
 * @author juanj
 */
class Profesor extends Persona {
    String area;
    double salarioBase;
    int horasCatedra;

    public Profesor(String nombre, int edad, String documento, String area, double salarioBase, int horasCatedra) {
        super(nombre, edad, documento);
        this.area = area;
        this.salarioBase = salarioBase;
        this.horasCatedra = horasCatedra;
    }

    public double calcularSalario() {
        return salarioBase + (horasCatedra * 20000);
    }

    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Area: " + area);
        System.out.println("Salario Total: " + calcularSalario());
    }
}
