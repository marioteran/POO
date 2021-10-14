/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.poop4;

import java.text.DecimalFormat;

/**
 *
 * @author MarioTeran
 */
public class TrianguloRect {
    float ca;
    float co;
    float h;

    public TrianguloRect() {
    }

    public TrianguloRect(float ca, float co, float h) {
        this.ca = ca;
        this.co = co;
        this.h = h;
    }
    public String area(){
        DecimalFormat df = new DecimalFormat("#.00");
        return df.format((ca*co)/2);
    }
    public String perimetro (){
        DecimalFormat df = new DecimalFormat("#.00");
        return df.format(co+ca+h);
    }
    public String angulo1(){
        DecimalFormat df = new DecimalFormat("#.00");
        return df.format(Math.toDegrees(Math.asin(co/h)));
    }
    public String angulo2(){
        DecimalFormat df = new DecimalFormat("#.00");
        return df.format(Math.toDegrees(Math.asin(ca/h)));
    }

    @Override
    public String toString() {
        return "Triangulo Rectangulo: {" + "ca=" + ca + ", co=" + co + ", h=" + h + '}';
    }
    
    
}
