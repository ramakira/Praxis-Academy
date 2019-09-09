/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generics;

/**
 *
 * @author Akira
 */
class Generics<G> 
    {
    G obj; //deklarasi objek G
    Generics(G obj) {this.obj = obj; } //constructor
    public G getObject() {return this.obj; }
    }

class Main
{
    public static void main (String[] args){
        
        Generics <Integer> iObj = new Generics<Integer>(15);
        System.out.println(iObj.getObject());
        
        Generics <String> sObj = new Generics<String>("Mantap");
        System.out.println(sObj.getObject());
    }
}

