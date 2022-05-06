/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ejercicio01_02;

/**
 *
 * @author user
 */
public class Ejercicio01_02 {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        //EMPLEADO 1
        var empleado1=new Empleado();
        empleado1.nombre="Jhonny";
        empleado1.horasTrabajadas=100;
        empleado1.costoHora=6;
        empleado1.anioIngreso=2010;
        
        System.out.println("El nombre del empleado 1 es:"+empleado1.nombre+
              "\nLas horas trabajadas son:"+empleado1.horasTrabajadas+
              "\nEl costo hora:"+empleado1.costoHora+
              "\nEl Año de ingreso:"+empleado1.anioIngreso);
        var ingresos=empleado1.calcularingresos(2022);
        System.out.println("El Valor de Ingreso es:"+ingresos);
        var bono=empleado1.calcularBonoExtras(150);
        System.out.println("El valor del bono es:"+bono);
        var impuestos=empleado1.calculoImpuestos(500, 1000, 2000);
        System.out.println("El impuesto es:"+empleado1.calculoImpuestos(500, 1000, 2000));
        var resta=ingresos+bono-impuestos;
        System.out.println("El valor total a pagar es:"+resta);
          
        
        //EMPLEADO 2
        var empleado2=new Empleado();
        empleado2.nombre="Angelo";
        empleado2.horasTrabajadas=200;
        empleado2.costoHora=5;
        empleado2.anioIngreso=2020;
        
        System.out.println("\nEl nombre del empleado 2 es:"+empleado2.nombre+
              "\nLas horas trabajadas son:"+empleado2.horasTrabajadas+
              "\n El costo hora:"+empleado2.costoHora+
              "\n El Año de ingreso:"+empleado2.anioIngreso);
        var ingresos2=empleado2.calcularingresos(2022);
        System.out.println("El Valor de Ingreso es:"+ingresos);
        var bono2=empleado2.calcularBonoExtras(150);
        System.out.println("El valor del bono es:"+bono2);
        var impuestos2=empleado2.calculoImpuestos(500, 1000, 2000);
        System.out.println("El impuesto es:"+empleado2.calculoImpuestos(500, 1000, 2000));
        var resta2=ingresos2+bono-impuestos2;
        System.out.println("El valor total a pagar es:"+resta2);
        
        
        //EMPLEADO 3
        var empleado3=new Empleado();
        empleado3.nombre="Julio";
        empleado3.horasTrabajadas=150;
        empleado3.costoHora=8;
        empleado3.anioIngreso=2018;
        
        System.out.println("\nEl nombre del empleado 3 es:"+empleado3.nombre+
              "\nLas horas trabajadas son:"+empleado3.horasTrabajadas+
              "\nEl costo hora:"+empleado3.costoHora+
              "\nEl Año de ingreso:"+empleado3.anioIngreso);
        
        var ingresos3=empleado3.calcularingresos(2022);
        System.out.println("El Valor de Ingreso es:"+ingresos);
        var bono3=empleado3.calcularBonoExtras(150);
        System.out.println("El valor del bono es:"+bono3);
        var impuestos3=empleado3.calculoImpuestos(500, 1000, 2000);
        System.out.println("El impuesto es:"+empleado3.calculoImpuestos(500, 1000, 2000));
        var resta3=ingresos3+bono-impuestos3;
        System.out.println("El valor total a pagar es:"+resta3);
        
    }
}
