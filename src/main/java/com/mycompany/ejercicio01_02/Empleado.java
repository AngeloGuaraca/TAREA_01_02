/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio01_02;

/**
 *
 * Integrantes:Jhonny Aguilar, Angelo Guaraca
 */
public class Empleado {
    
    public String nombre;
    public int horasTrabajadas;
    public double costoHora;
    public int anioIngreso;
    
    public double calcularingresos(int anioActual){
        var retorno= 10000d;
        if(this.anioIngreso<anioActual){
            retorno=(this.costoHora*horasTrabajadas)*((anioActual-
                    this.anioIngreso)*0.02)+(this.costoHora*this.horasTrabajadas);
        }else{
            retorno=(this.costoHora*this.horasTrabajadas);
        }
        
         return retorno;
    
    }
    
    public double calcularBonoExtras(int maximoHorasTrabajadas){
        var retorno=1000000d;
        if (this.horasTrabajadas>=maximoHorasTrabajadas){
            retorno=(this.horasTrabajadas-maximoHorasTrabajadas)*(this.costoHora*2);
        }else{
            retorno=0;
        }
        return retorno;
    }
    
    
    public double calculoImpuestos(int limite1, int limite2, int limite3){
        var retorno=100000d;
        double r;
        r=this.costoHora*this.horasTrabajadas;
        if(r>0 && r<limite1){
            retorno=0;
        }else{
            if(r>limite1 && r<limite2){
                retorno=this.costoHora*this.horasTrabajadas*0.05;
            }else{
                if(r>=limite2 && r<=limite3){
                    retorno=this.costoHora*this.horasTrabajadas*0.12;
                }else{
                    if(r>limite3){
                        retorno=this.costoHora*this.horasTrabajadas*0.25;
                    }
                }
            }
        }
        return retorno;
    }
}
