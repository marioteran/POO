package com.mycompany.poop4;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MarioTeran
 */
public class Punto {
    //Seccion de atributos
    int x, y;
    //Sección de constructores

    public Punto() {
    }
    public Punto(int x, int y) {
        this.x = x;
        this.y = y;
    }
    //Sección de métodos
    public void imprimePunto(){
        System.out.println("Punto [x="+x+" y="+y+"]");
    }    
}
