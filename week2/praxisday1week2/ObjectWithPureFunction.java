/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package functional;

import java.util.Scanner;

/**
 *
 * @author Akira
 */
public class ObjectWithPureFunction {
    
    static int sum(int a, int b){
        return a + b;
    }
    
    public static void main(String[] args){
        System.out.println("Hasil dari a + b adalah  = " +sum(10,19));
//        int sum = input.nextInt();
    }
}
