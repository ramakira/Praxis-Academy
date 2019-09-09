/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multigenerics;

/**
 *
 * @author Akira
 */
class MultiGenerics<M, G> {
    M obj1;
    G obj2;
    
    //constructor
    public MultiGenerics(M obj1, G obj2) {
        this.obj1 = obj1;
        this.obj2 = obj2;
    }
    
    public void print(){
        System.out.println(obj1);
        System.out.println(obj2);
    }
}

class Main {
    
    public static void main(String[] args){
        MultiGenerics<String, Integer> obj= 
        new MultiGenerics<String, Integer>("Tes Generics", 123);
        
        obj.print();
    }
}    
    

