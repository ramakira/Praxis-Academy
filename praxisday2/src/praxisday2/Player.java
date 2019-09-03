/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praxisday2;

/**
 *
 * @author Akira
 */
public class Player {
 
    String name,type;
    int speed;
    int healthPoint;
    
    void run(){
        System.out.println(name + " is running.. ");
        System.out.println("Speed player " + speed);
        System.out.println("Tipe Player " + type);
    }
    
    boolean isDead(){
        if(healthPoint <=0 ) return true;
        return false;
    }
}
