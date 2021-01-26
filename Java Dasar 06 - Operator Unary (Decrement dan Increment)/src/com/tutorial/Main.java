/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tutorial;

/**
 *
 * @author IT010318
 */
public class Main {

    public static void main(String[] args) {
        
        //Unary = operasi yang dilakukan pada satu operasi
        
        //ini adalah unary + (plus) dan - (minus)
        int angka = 1;
        System.out.println("===UNARY PLUS dan MINUS===");
        System.out.printf("Unary '-', %d menjadi %d \n", angka, -angka);
        System.out.printf("Unary '+', %d menjadi %d \n", angka, +angka);
        System.out.println("");
        
        //Unary decrement dan incrementt
        
        //ini increment
        int angka2 = 10;
        angka2++;
        angka2++;
        System.out.println("===UNARY INCREMENT===");
        System.out.println("nilai dengan '++' menjadi = " + angka2);
        
        int a = 5;
        a++;
        ++a;
        System.out.println("nilai dengan '++' menjadi = " + a);
        
        int b = 5;
        System.out.printf("nilai dengan '++' prefix menjadi = %d \n", ++b);
        int c = 5;
        System.out.printf("nilai dengan '++' postfix menjadi = %d \n", c++);
        System.out.printf("nilai hasil dari postfix menjadi = %d \n", c);
        System.out.println("");
        
        //ini decrement
        int angka3 = 10;
        angka3--;
        System.out.println("===UNARY DECREMENT===");
        System.out.println("nilai dengan '--' menjadi = " + angka3 + "\n");
        
        //Unary boolean dengan ! untuk nagasi
        boolean test = true;
        System.out.println("===UNARY BOOLEAN===");
        System.out.println("nilai boolean = " + !test);
                
    }
    
}
