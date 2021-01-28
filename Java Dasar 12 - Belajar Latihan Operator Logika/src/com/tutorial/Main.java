/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tutorial;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        
        //Membuat sebua objek untuk menangkap input dari user
        Scanner input = new Scanner(System.in);
        
        //Sebuah program sederhana untuk menembak sebuah angka
        int nilaiBenar = 6;
        int nilaiTebakan;
        boolean statusTebakan;
        
        System.out.print("Masukan nilai tebakan anda : ");
        nilaiTebakan = input.nextInt();
        System.out.println("Nilai tebakan anda adalah : " + nilaiTebakan);
        
        //Operasi logika
        statusTebakan = (nilaiTebakan == nilaiBenar);
        System.out.println("Tebakan anda : " + statusTebakan);
        
        //Operasi aljabar boolean (and / or)
        System.out.print("Masukan nilai diantara 4 dan 9 : ");
        nilaiTebakan = input.nextInt();
        statusTebakan = (nilaiTebakan > 4) && (nilaiTebakan < 9);
        System.out.println("Tebakan anda : " + statusTebakan);
        
    }
    
}
