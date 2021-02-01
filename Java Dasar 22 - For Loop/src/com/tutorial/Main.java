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
        
        System.out.println("Ini adalah awal program");
        
        System.out.println("Loop pertama");
        for (int nilai = 0; nilai <= 10; nilai++) {
            System.out.println("for lop ke " + nilai);
        }
        System.out.println("");
        
        System.out.println("Loop kedua");
        for (int nilai = 0; nilai < 10; nilai++) {
            System.out.println("for lop ke " + nilai);
        }
        System.out.println("");

        System.out.println("Loop ketiga");
        for (int nilai = 10; nilai >= 5; nilai--) {
            System.out.println("for lop ke " + nilai);
        }
        System.out.println("");
        
        int nilai = 0;
        System.out.println("Loop keempat");
        for (; nilai < 10;) {
            System.out.println("for lop ke " + nilai);
            nilai++;
        }
        System.out.println("");
        
        System.out.println("Ini adalah akhir program");
    }
    
}
