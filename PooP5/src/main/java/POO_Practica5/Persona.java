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
public class Persona {
    private String nombre;
    private String apellido;
    private Fecha fNacimiento;

    public Persona() {
    }

    public Persona(String nombre, String apellido, Fecha fNacimiento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fNacimiento = fNacimiento;
    }

    public Persona(String nombre, String apellido, int dia ,int mes ,int anio) {
        this.nombre = nombre;
        this.apellido = apellido;
        //Opcion 1
        //Fecha f3 = new Fecha(dia,mes,anio);
        //this.fNacimiento = f3;
        //Opcion2
        //fNacimiento = new Fecha();  
        //fNacimiento.setDia(dia);
        //fNacimiento.setMes(mes);
        //fNacimiento.setAnio(anio);
        
        //Opcion3
        fNacimiento = new Fecha(dia,mes,anio);
    }
 

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Fecha getfNacimiento() {
        return fNacimiento;
    }

    public void setfNacimiento(Fecha fNacimiento) {
        this.fNacimiento = fNacimiento;
    }

    @Override
    public String toString() {
        return "Persona{" + "Nombre: " + nombre + " Apellido: " + apellido + "Fecha de nacimiento: " + fNacimiento+"}";
    }
    
    public String toStringCarr() {
        return  "Nombre: " + nombre + " Apellido: " + apellido + 
                "\n\t\tFecha de nacimiento: " + fNacimiento+"\n";
    }
    
    
}
