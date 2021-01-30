/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tutorial;

import java.util.Scanner;

/**
 *
 * @author IT010318
 */
public class Main {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        //a operator b
        float a, b, hasil;
        char operator;
        
        System.out.print("Nilai a = ");
        a = input.nextFloat();
        System.out.print("Operator = ");
        operator = input.next().charAt(0);
        System.out.print("Nilai b = ");
        b = input.nextFloat();
        
        System.out.println("Input User : " + a + " " + operator + " " + b);
        System.out.println("");
        
        //Operator tersedia * / + -
        System.out.println("==== Kalkulator ====");
        
        if (operator == '+') {
            //Penjumlahan
            hasil = a + b;
            System.out.println("Hasil = " + hasil);
        } else if (operator == '-') {
            //Pengurangan
            hasil = a - b;
            System.out.println("Hasil = " + hasil);
        } else if (operator == '*') {
            //Perkalian
            hasil = a * b;
            System.out.println("Hasil = " + hasil);
        } else if (operator == '/') {
            //Pembagian
            if (b == 0) {
                System.out.println("Pembagi nol menghasilkan tak hingga");
            } else {
                hasil = a / b;
                System.out.println("Hasil = " + hasil);
            }
        } else {
            System.out.println("Operator tidak ditemukan");
        }
        
    }
    
}
