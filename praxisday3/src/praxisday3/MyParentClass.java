/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praxisday3;

/**
 *
 * @author Akira
 */
class MyParentClass {
    
    /**
     * Mendefinisikan variabel message pada parameter agar
     * nantinya bisa digunakan pada class child
     * 
     * @author Akira 
     */
    public void displayMethod(String message){
        System.out.println(message);
    }
    
}

class myChildClass extends MyParentClass 
{
    @Override 
    public void displayMethod(String message){
        System.out.println("Pesannya adalah.." + message);
    }
    
    public static void main (String args[]) {
        myChildClass obj = new myChildClass();
        obj.displayMethod("Mantap!");
    }
}