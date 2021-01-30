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
        
        int a = 0;
        boolean kondisi = true;
        
        System.out.println("Awal program");
        while (kondisi) {            
            System.out.println("while loop ke - " + a);
            
            if (a == 10) {
                kondisi = false;
            }
            a++;
        }
        
        System.out.println("Akhir pemrogramman");
    }
    
}
