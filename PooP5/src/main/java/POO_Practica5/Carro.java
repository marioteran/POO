/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POO_Practica5;

/**
 *
 * @author MarioTeran
 */
public class Carro {
    private String marca;
    private String modelo;
    private String color;
    private int anio;
    private int kilometraje;
    private boolean estandar;
    private Persona chofer;
    private Persona copiloto;
    private Persona pasajero1;
    private Persona pasajero2;
        
    public Carro() {
    }
    

    /*
    public void irLugar(String lugar){
        System.out.println("Estoy llendo a "+ lugar);
    }    
    public void vender(String comprador){
        System.out.println("Vendi mi coche y el nuevo dueño es: "+ comprador);
    }
    public void gasolina(int porcentaje){
        System.out.println("Tengo un "+porcentaje+" % de gas");
    }
    public void servicio(){
            if (kilometraje > 50000) {
                System.out.println("El carro necesita servicio");
            }else{
                System.out.println("Aun falta para ir a servicio");
            }
    }
    public void recorridoTiempo(float tiempoHoras){
        System.out.println("El tiempo del trayecto es de: "+tiempoHoras+" horas");
    }
    */
   
    
    public Carro(String marca, String modelo, String color, int anio, int kilometraje, boolean estandar) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.anio = anio;
        this.kilometraje = kilometraje;
        this.estandar = estandar;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public int getKilometraje() {
        return kilometraje;
    }

    public void setKilometraje(int kilometraje) {
        this.kilometraje = kilometraje;
    }

    public boolean isEstandar() {
        return estandar;
    }

    public void setEstandar(boolean estandar) {
        this.estandar = estandar;
    }
    public void lugares(Persona P1, Persona P2, Persona P3,Persona P4){
        this.chofer = P1;
        this.copiloto = P2;
        this.pasajero1 = P3;
        this.pasajero2= P4;
    }
     
    //Modo largo:

    public Persona getChofer() {
        return chofer;
    }

    public void setChofer(Persona chofer) {
        this.chofer = chofer;
    }

    public Persona getCopiloto() {
        return copiloto;
    }

    public void setCopiloto(Persona copiloto) {
        this.copiloto = copiloto;
    }

    public Persona getPasajero1() {
        return pasajero1;
    }

    public void setPasajero1(Persona pasajero1) {
        this.pasajero1 = pasajero1;
    }

    public Persona getPasajero2() {
        return pasajero2;
    }

    public void setPasajero2(Persona pasajero2) {
        this.pasajero2 = pasajero2;
    }
    public void impCarroLugares(){
        System.out.println("CARRO: Modelo: "+modelo+" Marca: "+marca+" Año: "+anio+" Color: "+color);
        System.out.println("\tTripulantes:");
        System.out.println("\tChofer: "+chofer.toStringCarr());
        System.out.println("\tCopiloto: "+copiloto.toStringCarr());
        System.out.println("\tPasajero 1: "+pasajero1.toStringCarr());
        System.out.println("\tPasajero 2: "+pasajero2.toStringCarr());
    }
    public void setMarcaModeloColorAnio(String marca, String modelo, String color, int anio){
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.anio = anio;
    }
    
}
