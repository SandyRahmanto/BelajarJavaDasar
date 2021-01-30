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
        
        //Ternary operator        
        int data, data2, x, y;
        Scanner input = new Scanner(System.in);
        
        //Variable x = expresi ? statement_true : statemant_false
        //Sample 1
        System.out.print("Masukan data : ");
        data = input.nextInt();
        
        x = (data == 10) ? (data * data) : (data/2);
        System.out.println("Hasilnya " + x);
        System.out.println("===========");
        
        //Sample 2
        System.out.print("Masukan data2 : ");
        data2 = input.nextInt();
        
        y = (data2 == 5) ? (data2 * data2) : (data2/2);
        System.out.println("Hasilnya " + y);
        
    }
    
}
