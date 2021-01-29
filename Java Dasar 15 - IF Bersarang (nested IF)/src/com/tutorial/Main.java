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
        int b = 10;
        System.out.println("Nilai a adalah " + a);
        
        //If bersarang atau nested if
        if (a == 5) {
            if (b == 10) {
                System.out.println("Ini adalah 1 == 5 dan b == 10");
            } else {
                System.out.println("Ini adalah a == 5 dan b bukan 10");
            }
        } else {
            System.out.println("Ini adalah a dan b salah");
        }
        
        System.out.println("Ini adalah akhir dari program");
    }
    
}
