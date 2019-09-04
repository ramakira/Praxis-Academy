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
public class praxisday3<A, B, C> {
    
    A obj1; //Inisialisasi objek A
    B obj2; //Inisialisasi objek B
    C obj3; //Inisialisasi objek C
    
    //Constructor 
    public praxisday3(A obj1, B obj2, C obj3) {
        this.obj1 = obj1;
        this.obj2 = obj2;
        this.obj3 = obj3;
    }
    
    //Print masing-masing objek
    public void print(){
        System.out.println(obj1);
        System.out.println(obj2);
        System.out.println(obj3);
    }
     public static void main(String[] args)
    {
        praxisday3<String, String, Integer> obj = 
                new praxisday3<String, String, Integer>("I", "Love You", 3000);
        
        obj.print();
    }
}


   


