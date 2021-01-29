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
        
        int a = 5;
        System.out.println("Nilai a adalah " + a);
        
        //If else if statement
        if (a == 5) {
            System.out.println("Masuk Jalur 1");
        } else if (a == 10) {
            System.out.println("Masuk Jalur 2");
        } else {
            System.out.println("Jalur default");
        }
        
        //Jika else if nilainya sama
        //tetep yang di eskusi jalur pertama
        if (a == 5) {
            System.out.println("Masuk Jalur 1 ya");
        } else if (a == 5) {
            System.out.println("Masuk Jalur 2 ya");
        } else {
            System.out.println("Jalur default ya");
        }
        
    }
    
}
