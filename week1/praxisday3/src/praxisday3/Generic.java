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
class Generic <G> {
    
    //Deklarasi variabel G
    G obj;
    
    //Constructor
    Generic(G obj) { this.obj = obj; }
    public G getObject() { return this.obj; }
}

class Main 
{
    public static void main (String[] args)
    {
        //Test untuk String Type
        Generic<String> SObj = new Generic<String>("MANTAP");
        System.out.println(SObj.getObject());
        
        //Test untuk Integer Type
        Generic<Integer> IObj = new Generic<Integer>(20000);
        System.out.println(IObj.getObject());
    }
}
