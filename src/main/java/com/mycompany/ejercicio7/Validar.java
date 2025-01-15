/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio7;


public class Validar {
    double a;
    double b;
    
    public static String Validar(double a, double b){
        if (a>b){
           return "A es mayor que B";
         }
        else if (a == b){
            return "A es igual a B";
         }
        else {
            return "A es menor que B";
         } 
    }
    public static String Limpiar_campo(){
             return ""; 
         }
}

