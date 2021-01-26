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
        
        //Program untuk konversi data
        int nilaiInt = 450; //32 bit
        System.out.println("nilai int = " + nilaiInt);
        
        //Memperluas rentang ke tipe data yg lebih besar
        long nilaiLong = nilaiInt;
        System.out.println("nilai long = " + nilaiLong);
        
        //Memperkecil rentang ke tipe data yg lebih kecil
        byte nilaibyte = (byte)nilaiInt;
        System.out.println("nilai byte = " + nilaibyte);
        System.out.println("nilai max byte = " + Byte.MAX_VALUE);
        System.out.println("nilai max byte = " + Byte.MIN_VALUE);
        
        //Casting pembagian
        float a = 10;
        int b = 4;
        
        float c = a / b;
        System.out.printf("%f / %d = %f \n", a, b, c);
        
        System.out.println("===============");
        
        int x = 10;
        int y = 4;
        
        float z = (float)x / y;
        System.out.printf("%d / %d = %f", x, y, z);
        System.out.println("");
        
    }
    
}
