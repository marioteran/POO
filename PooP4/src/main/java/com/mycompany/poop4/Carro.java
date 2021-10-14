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
public class Carro {
    String marca;
    String modelo;
    String color;
    int anio;
    int kilometraje;
    boolean estandar;

    public Carro() {
    }

    public Carro(String marca, String modelo, String color, int anio, int kilometraje, boolean estandar) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.anio = anio;
        this.kilometraje = kilometraje;
        this.estandar = estandar;
    }
    
    public void irAUnLugar(String lugar){
        System.out.println("Estoy llendo a "+lugar);
    }
    
    public void venderCarro(String comprador){
        System.out.println("Vendí mi coche a "+comprador);
    }
    public void gasolina(int porcentaje){
        System.out.println("Tengo "+porcentaje+"%porcenaje de gasolina");
    }
    public void servicio(){
        if (kilometraje>50_000) 
            System.out.println("El carro necesita servicio");
        else
            System.out.println("Aun falta para el servicio, no problem B)");
    }
    public void recorridoEnTiempo(float tiempoHoras){
        System.out.println("El tiempo del trayecto es "+tiempoHoras);
    }

    @Override
    public String toString() {
        return "Carro{" + "marca=" + marca + ", modelo=" + modelo + ", color=" + color + ", anio=" + anio + ", kilometraje=" + kilometraje + ", estandar=" + estandar + '}';
    }
    
}
