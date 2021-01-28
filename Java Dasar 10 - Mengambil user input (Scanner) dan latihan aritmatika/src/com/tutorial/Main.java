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
        
        //Membuat perhitungan luas persegi panjang
        //Luas = Panjang x Lebar
        int panjang, lebar, luas, tinggi, volume;
        
        System.out.println("Menghitung luas");
        
        System.out.print("Panjang = ");
        panjang = input.nextInt();
        System.out.print("Lebar = ");
        lebar = input.nextInt();
        
        luas = panjang * lebar;
        System.out.println("Luas nya adalah " + luas );
        System.out.println("");
        
        System.out.println("Menghitung volume");
        System.out.print("Tinggi = ");
        tinggi = input.nextInt();
        volume = luas * tinggi;
        System.out.println("Volume nya adalah = " + volume);
                
        
    }
    
}
