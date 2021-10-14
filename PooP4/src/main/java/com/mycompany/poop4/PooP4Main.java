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
public class PooP4Main {
    public static void main(String[] args) {
        Punto p1 = new Punto();
        p1.imprimePunto();
        p1.x=9;
        p1.y=6;
        p1.imprimePunto();
        
        Punto p2 = new Punto(33, 88);
        p2.imprimePunto();
        
        System.out.println("#########");
        Estudiante estudiante1 = new Estudiante("Pedro", "Páramo", "Sexsto", 1437568436, 17);
        estudiante1.despertar();
        estudiante1.irAClase(4);
        estudiante1.hacerTarea(2);
        estudiante1.tratarDEDormir(50);
        estudiante1.estudiar();
        System.out.println(estudiante1);
        Estudiante estudiante2= new Estudiante("Joaquin", "Pheonix","Quinto", 15457836, 16);
        
        System.out.println("#########");
        Carro carro1 = new Carro("Chevrolet", "Sparc", "Negro", 2021, 1000, true);
        System.out.println(carro1);
        carro1.servicio();
        carro1.gasolina(50);
        carro1.irAUnLugar("CU");
        carro1.venderCarro("Raúl Jiménez");
        carro1.recorridoEnTiempo((float)2.5); // To cast ó casteo
        carro1.recorridoEnTiempo(3.6f); //Maneras diferentes de instancias un número flotante
        
        Carro carro2 = new Carro();
        carro2.kilometraje = 60_000;
        carro2.servicio();
        
        System.out.println("#########");
        TrianguloRect T1 = new TrianguloRect(4.0f,3.0f,5.0f);
        System.out.println("#1 "+T1.toString());
        System.out.println("Área: "+T1.area());
        System.out.println("Perímetro: "+T1.perimetro());
        System.out.println("Ángulo 1: "+(T1.angulo1())+"°");
        System.out.println("Ángulo 2: "+T1.angulo2()+"°");
        
        TrianguloRect T2 = new TrianguloRect(7.2f,9.4f,11.84f);
        System.out.println("#2 "+T2.toString());
        System.out.println("Área: "+T2.area());
        System.out.println("Perímetro: "+T2.perimetro());
        System.out.println("Ángulo 1: "+(T2.angulo1())+"°");
        System.out.println("Ángulo 2: "+T2.angulo2()+"°");
    }
}
