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
public class ObjectWithNonPureFunction {
    static int value = 10;
    
    static int add(int nextValue) {
        ObjectWithNonPureFunction.value += nextValue;
        return ObjectWithNonPureFunction.value;
    }
    
    public static void main(String[] args){
        System.out.println("Test" + +add(10));
    }
}
