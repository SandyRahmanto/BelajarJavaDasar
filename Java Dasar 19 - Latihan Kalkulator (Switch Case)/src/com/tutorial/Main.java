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
        
        float a, b, hasil;
        String operator;
        
        System.out.print("Nilai a = ");
        a = input.nextFloat();
        System.out.print("Operator = ");
        operator = input.next();
        System.out.print("Nilai b = ");
        b = input.nextFloat();
        
        switch (operator){
            case "+":
                //penjumlahan
                hasil = a + b;
                System.out.println("Hasil penjumlahan : " + hasil);
                break;
            case "-":
                //pengurangan
                hasil = a - b;
                System.out.println("Hasil Pengurangan : " + hasil);
                break;
            case "*":
                //perkalian
                hasil = a * b;
                System.out.println("Hasil perkalian : " + hasil);
                break;
            case "/":
                //pembagian
                hasil = a / b;
                System.out.println("Hasil pembagian : " + hasil);
                break;
            default:
                System.out.println("Operator " + operator + " tidak ditemukan");
        }
    }
    
}
