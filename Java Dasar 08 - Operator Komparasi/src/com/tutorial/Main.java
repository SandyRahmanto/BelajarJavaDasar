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
        
        //Operator komparasi.. ini akan menghasilkan dalam bentuk boolean
        
        int a, b;
        boolean hasilKomparasi;
        
        //Operator equal atau persamaan
        System.out.println("===PERSAMAAN===");
        a = 10;
        b = 10;
        hasilKomparasi = (a == b);
        System.out.printf("%d == %d --> %s \n", a, b, hasilKomparasi);
        
        a = 12;
        b = 10;
        hasilKomparasi = (a == b);
        System.out.printf("%d == %d --> %s \n", a, b, hasilKomparasi);
        System.out.println("");
        
        //Operator not equal atau tidak persamaan
        System.out.println("===PERSAMAAN===");
        a = 10;
        b = 10;
        hasilKomparasi = (a != b);
        System.out.printf("%d != %d --> %s \n", a, b, hasilKomparasi);
        
        a = 12;
        b = 10;
        hasilKomparasi = (a != b);
        System.out.printf("%d != %d --> %s \n", a, b, hasilKomparasi);
        System.out.println("");
        
        //Operator less than atau kurang dari
        System.out.println("===KURANG DARI===");
        a = 9;
        b = 10;
        hasilKomparasi = (a < b);
        System.out.printf("%d < %d --> %s \n", a, b, hasilKomparasi);
        
        a = 12;
        b = 10;
        hasilKomparasi = (a < b);
        System.out.printf("%d < %d --> %s \n", a, b, hasilKomparasi);
        System.out.println("");
        
        //Operator greater than atau lebih dari
        System.out.println("===LEBIH DARI===");
        a = 9;
        b = 10;
        hasilKomparasi = (a > b);
        System.out.printf("%d > %d --> %s \n", a, b, hasilKomparasi);
        
        a = 12;
        b = 10;
        hasilKomparasi = (a > b);
        System.out.printf("%d > %d --> %s \n", a, b, hasilKomparasi);
        System.out.println("");
        
        //Operator less than equal atau kurang dari sama dengan
        System.out.println("===KURANG DARI SAMA DENGAN===");
        a = 9;
        b = 10;
        hasilKomparasi = (a <= b);
        System.out.printf("%d <= %d --> %s \n", a, b, hasilKomparasi);
        
        a = 10;
        b = 10;
        hasilKomparasi = (a <= b);
        System.out.printf("%d <= %d --> %s \n", a, b, hasilKomparasi);
        
        a = 12;
        b = 10;
        hasilKomparasi = (a <= b);
        System.out.printf("%d <= %d --> %s \n", a, b, hasilKomparasi);
        System.out.println("");
        
        //Operator greater than equal atau lebih dari sama dengan
        System.out.println("===LEBIH DARI SAMA DENGAN===");
        a = 9;
        b = 10;
        hasilKomparasi = (a >= b);
        System.out.printf("%d >= %d --> %s \n", a, b, hasilKomparasi);
        
        a = 10;
        b = 10;
        hasilKomparasi = (a >= b);
        System.out.printf("%d >= %d --> %s \n", a, b, hasilKomparasi);
        
        a = 12;
        b = 10;
        hasilKomparasi = (a >= b);
        System.out.printf("%d >= %d --> %s \n", a, b, hasilKomparasi);
        System.out.println("");
    }
    
}