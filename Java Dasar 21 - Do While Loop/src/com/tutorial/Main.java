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
        
        System.out.println("Awal program");
        
        int a = 0;
        boolean kondisi = true;
        
        do {
            a++;
            System.out.println("do while " + a);
            if (a == 1) {
                kondisi = false;
            }
        } while (kondisi);
        
        System.out.println("Akhir program");
    }
    
}
