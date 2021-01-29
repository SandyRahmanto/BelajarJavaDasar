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
        String data;
        String data2;
        String data3;
        
        System.out.print("Panggil nama : ");
        data = input.next();
        
        //Switch case
        //Ekspresi berupa satuan (int, long, byte, short), string, atau enum
        switch (data) {
            case "Shakeil":
                System.out.println("Benar nama saya Shakeil");
                break;
            case "Sandy":
                System.out.println("Benar nama saya Sandy");
                break;
            default:
                System.out.println("Itu bukan nama saya");
        } 
        System.out.println("Program selesai");
        System.out.println("==============");
        
        //Jika tidak menggunakan break:
        //Maka semua akan di jalan kan
        //Karena case yg tidak menggunakan break; dianggap true
        System.out.print("Panggil nama ke 2 : ");
        data2 = input.next();
        
        switch (data2) {
            case "Shakeil":
                System.out.println("Benar nama saya Shakeil");
            case "Sandy":
                System.out.println("Benar nama saya Sandy");
            case "Sendy":
                System.out.println("Benar nama saya Sendy");
            default:
                System.out.println("Itu bukan nama saya");
        } 
        System.out.println("Program selesai");
        System.out.println("==============");
        
        //Jika salah satu case tidak menggunakan break:
        //Maka case dibawahnya akan di jalan kan
        //Karena case yg tidak menggunakan break; dianggap true
        System.out.print("Panggil nama ke 3 : ");
        data3 = input.next();
        
        switch (data3) {
            case "Shakeil":
                System.out.println("Benar nama saya Shakeil");
            case "Sandy":
                System.out.println("Benar nama saya Sandy");
                break;
            case "Sendy":
                System.out.println("Benar nama saya Sendy");
                break;
            default:
                System.out.println("Itu bukan nama saya");
        } 
        System.out.println("Program selesai");
    }
    
}
