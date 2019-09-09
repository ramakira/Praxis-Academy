/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package functional;

/**
 *
 * @author Akira
 */
public class Calculator {
    static int sum(int a, int b){
        return a + b;
    }
    
    public static void main(String[] args){
        System.out.println("Hasil dari penjumlahan 10 + 10 = " + sum(10,10));
    }
}
