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
        
        //Operasi Aritmatika
        int variable1 = 5;
        int variable2 = 5;
        int hasil;
        
        //1. Penjumlahan
        hasil = variable1 + variable2;
        System.out.println(variable1 + " + " + variable2 + " = " + hasil);
        System.out.printf("%d + %d = %d \n", variable1, variable2, hasil);
        System.out.println("======================");
        
        //2. Pengurangan
        hasil = variable1 - variable2;
        System.out.println(variable1 + " - " + variable2 + " = " + hasil);
        System.out.printf("%d - %d = %d \n", variable1, variable2, hasil);
        System.out.println("======================");
        
        //3. Perkalian
        hasil = variable1 * variable2;
        System.out.println(variable1 + " * " + variable2 + " = " + hasil);
        System.out.printf("%d * %d = %d \n", variable1, variable2, hasil);
        System.out.println("======================");
        
        //4. Pembagian
        hasil = variable1 / variable2;
        System.out.println(variable1 + " : " + variable2 + " = " + hasil);
        System.out.printf("%d / %d = %d \n", variable1, variable2, hasil);
        System.out.println("======================");
        
        //5. Modulus
        hasil = variable1 % variable2;
        System.out.println(variable1 + " % " + variable2 + " = " + hasil);
        System.out.printf("%d %% %d = %d \n", variable1, variable2, hasil);
        System.out.println("======================");
    }
    
}
