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
        
        //Pengelompokan operasi dengan ( )
        
        //Kesimpulan
        //perkalian atau pembagian akan dilakukan terlabeih dahulu
        
        //Jika dilakukan perlkalian dan pembagian, 
        //maka akan dilakukan operasinya dari kiri ke kanan
        int hasil;
        
        hasil = 3 + (5 - 2);
        System.out.println(hasil);
        System.out.println("");
        
        Scanner input = new Scanner(System.in);
        //Perhitungan persamaan kuadrat
        System.out.println("==== Menghitung Persamaan Kuadrat ====");
        
        int m, x, c, y;
        
        System.out.print("Nilai x = ");
        x = input.nextInt();
        System.out.print("Gradient m = ");
        m = input.nextInt();
        System.out.print("Bias c = ");
        c = input.nextInt();
        
        y = m * x * x + c;
        System.out.println("Nilai y = " + y);
    }
    
}
