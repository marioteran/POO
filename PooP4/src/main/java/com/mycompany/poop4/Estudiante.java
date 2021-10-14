/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.poop4;

/**
 *
 * @author MarioTeran
 */
public class Estudiante {
    String nombre;
    String apellido;
    String grado;
    long numCuenta;
    int edad;

    public Estudiante() {
    }

    public Estudiante(String nombre, String apellido, String grado, long numCuenta, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.grado = grado;
        this.numCuenta = numCuenta;
        this.edad = edad;
    }
    
    public void estudiar(){
        System.out.println("Soy el estudiante: "+nombre+" y estoy estudiando");; 
    }
    public void tratarDEDormir(int minutos){
        System.out.println("Voy a tratar de dormir "+minutos+" minutos");
    }
    public void hacerTarea(int cantidadDeTarea){
        System.out.println("Voy a hacer "+cantidadDeTarea+" tareas");
    }
    public void despertar(){
        System.out.println("Estoy desepertando");
    }
    public void irAClase(int numMaterias){
        System.out.println("Estoy en "+grado+" grado y tengo "+numMaterias+" materias");
    }

    @Override
    public String toString() {
        return "Estudiante{" + "nombre=" + nombre + ", apellido=" + apellido + ", grado=" + grado + ", numCuenta=" + numCuenta + ", edad=" + edad + '}';
    }
    
}
